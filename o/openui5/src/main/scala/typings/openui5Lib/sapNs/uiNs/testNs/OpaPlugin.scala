package typings
package openui5Lib.sapNs.uiNs.testNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.test.OpaPlugin")
@js.native
class OpaPlugin () extends js.Object {
  /**
           * Gets all the controls of a certain type that are currently instantiated.If the control type is
           * omitted, nothing is returned.
           * @param fnConstructorType the control type, e.g: sap.m.CheckBox
           * @returns an array of the found controls (can be empty)
          */
  def getAllControls(fnConstructorType: js.Any): js.Array[_] = js.native
  /**
           * Returns a control by its idaccepts an object with an ID property the ID can bewill check a control
           * type also, if defined<ul>	<li>a single string - function will return the control instance or
           * undefined</li>	<li>an array of strings - function will return an array of found controls or an empty
           * array</li>	<li>a regexp - function will return an array of found controls or an empty
           * array</li></ul>
           * @param oOptions should contain an ID property. It can be of the type string or regex. If contains
           * controlType property, will check it as well
           * @returns all controls matched by the regex or the control matched by the string or null
          */
  def getControlByGlobalId(oOptions: js.Any): js.Array[openui5Lib.sapNs.uiNs.coreNs.Element] = js.native
  /**
           * Gets the constructor function of a certain controlType
           * @param sControlType the name of the type eg: "sap.m.Button"
           * @returns When the type is loaded, the contstructor is returned, if it is a lazy stub or not yet
           * loaded, null will be returned and there will be a log entry.
          */
  def getControlConstructor(sControlType: java.lang.String): js.Any = js.native
  /**
           * Gets a control inside of the view (same as calling oView.byId)If no ID is provided, it will return
           * all the controls inside of a view (also nested views and their children).<br/>eg : { id : "foo" }
           * will search globally for a control with the ID foo<br/>eg : { id : "foo" , viewName : "bar" } will
           * search for a control with the ID foo inside the view with the name bar<br/>eg : { viewName : "bar" }
           * will return all the controls inside the view with the name bar<br/>eg : { viewName : "bar",
           * controlType : sap.m.Button } will return all the Buttons inside a view with the name bar<br/>eg : {
           * viewName : "bar", viewNamespace : "baz." } will return all the Controls in the view with the name
           * baz.bar<br/>
           * @param oOptions that may contain a viewName, id, viewNamespace and controlType properties.
           * @returns If the passed id is a string it returns the found control or null.Else an array of matching
           * controls, if the view is not found or no control is found for multiple ids an empty array is
           * returned.
          */
  def getControlInView(oOptions: js.Any): openui5Lib.sapNs.uiNs.coreNs.Element | js.Array[openui5Lib.sapNs.uiNs.coreNs.Element] | js.Any = js.native
  /**
           * Tries to find a control depending on the options provided.
           * @param oOptions a map of options used to describe the control you are looking for.
           * @returns <ul>    <li>an array of found Controls depending on the options</li>    <li>an empty array
           * if no id was given</li>    <li>the found control/element when an id as a string is specified</li>   
           * <li>null if an id as string was specified</li></ul>
          */
  def getMatchingControls(oOptions: js.Any): openui5Lib.sapNs.uiNs.coreNs.Element | js.Array[openui5Lib.sapNs.uiNs.coreNs.Element] | js.Any = js.native
  /**
           * Returns a metadata object for class sap.ui.test.OpaPlugin.
           * @returns Metadata object describing this class
          */
  def getMetadata(): openui5Lib.sapNs.uiNs.baseNs.Metadata = js.native
  /**
           * Returns the view with a specific name - if there are multiple views with that name only the first
           * one is returned.
           * @param sViewName the name of the view
           * @returns or undefined
          */
  def getView(sViewName: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.mvcNs.View = js.native
}

