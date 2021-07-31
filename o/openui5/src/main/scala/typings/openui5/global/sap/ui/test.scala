package typings.openui5.global.sap.ui

import typings.openui5.sap.ui.base.Metadata
import typings.openui5.sap.ui.core.Element
import typings.openui5.sap.ui.core.mvc.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object test {
  
  @JSGlobal("sap.ui.test.Opa")
  @js.native
  class Opa protected ()
    extends StObject
       with typings.openui5.sap.ui.test.Opa {
    /**
      * This class will help you write acceptance tests in one page or single page applications.You can wait
      * for certain conditions to be met.
      * @param extensionObject An object containing properties and functions. The newly created Opa will be
      * extended by these properties and functions using jQuery.extend.
      */
    def this(extensionObject: js.Any) = this()
  }
  
  @JSGlobal("sap.ui.test.Opa5")
  @js.native
  /**
    * Helps you when writing tests for UI5 applications.Provides convenience to wait and retrieve for UI5
    * controls without relying on global IDs.Makes it easy to wait until your UI is in the state you need
    * for testing, e.g.: waiting for backend data.
    */
  class Opa5 ()
    extends StObject
       with typings.openui5.sap.ui.test.Opa5
  
  @JSGlobal("sap.ui.test.OpaPlugin")
  @js.native
  class OpaPlugin ()
    extends StObject
       with typings.openui5.sap.ui.test.OpaPlugin {
    
    /**
      * Gets all the controls of a certain type that are currently instantiated.If the control type is
      * omitted, nothing is returned.
      * @param fnConstructorType the control type, e.g: sap.m.CheckBox
      * @returns an array of the found controls (can be empty)
      */
    /* CompleteClass */
    override def getAllControls(fnConstructorType: js.Any): js.Array[js.Any] = js.native
    
    /**
      * Returns a control by its idaccepts an object with an ID property the ID can bewill check a control
      * type also, if defined<ul>    <li>a single string - function will return the control instance or
      * undefined</li>    <li>an array of strings - function will return an array of found controls or an empty
      * array</li>    <li>a regexp - function will return an array of found controls or an empty
      * array</li></ul>
      * @param oOptions should contain an ID property. It can be of the type string or regex. If contains
      * controlType property, will check it as well
      * @returns all controls matched by the regex or the control matched by the string or null
      */
    /* CompleteClass */
    override def getControlByGlobalId(oOptions: js.Any): js.Array[Element] = js.native
    
    /**
      * Gets the constructor function of a certain controlType
      * @param sControlType the name of the type eg: "sap.m.Button"
      * @returns When the type is loaded, the contstructor is returned, if it is a lazy stub or not yet
      * loaded, null will be returned and there will be a log entry.
      */
    /* CompleteClass */
    override def getControlConstructor(sControlType: String): js.Any = js.native
    
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
    /* CompleteClass */
    override def getControlInView(oOptions: js.Any): Element | js.Array[Element] | js.Any = js.native
    
    /**
      * Tries to find a control depending on the options provided.
      * @param oOptions a map of options used to describe the control you are looking for.
      * @returns <ul>    <li>an array of found Controls depending on the options</li>    <li>an empty array
      * if no id was given</li>    <li>the found control/element when an id as a string is specified</li>   
      * <li>null if an id as string was specified</li></ul>
      */
    /* CompleteClass */
    override def getMatchingControls(oOptions: js.Any): Element | js.Array[Element] | js.Any = js.native
    
    /**
      * Returns a metadata object for class sap.ui.test.OpaPlugin.
      * @returns Metadata object describing this class
      */
    /* CompleteClass */
    override def getMetadata(): Metadata = js.native
    
    /**
      * Returns the view with a specific name - if there are multiple views with that name only the first
      * one is returned.
      * @param sViewName the name of the view
      * @returns or undefined
      */
    /* CompleteClass */
    override def getView(sViewName: String): View = js.native
  }
  
  @JSGlobal("sap.ui.test.PageObjectFactory")
  @js.native
  class PageObjectFactory ()
    extends StObject
       with typings.openui5.sap.ui.test.PageObjectFactory
  
  object actions {
    
    @JSGlobal("sap.ui.test.actions.Action")
    @js.native
    /**
      * Accepts an object literal <code>mSettings</code> that defines initialproperty values, aggregated and
      * associated objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a
      * general description of the syntax of the settings object.
      */
    abstract class Action ()
      extends StObject
         with typings.openui5.sap.ui.test.actions.Action
    
    @JSGlobal("sap.ui.test.actions.EnterText")
    @js.native
    /**
      * The EnterText action is used to simulate a user entering texts to inputs.EnterText will be executed
      * on a control's focus dom ref.Supported controls are (for other controls this action still might
      * work):<ul>    <li>sap.m.Input</li>    <li>sap.m.SearchField</li>   
      * <li>sap.m.TextArea</li></ul>Accepts an object literal <code>mSettings</code> that defines
      * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
      * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
      * object.
      */
    class EnterText ()
      extends StObject
         with typings.openui5.sap.ui.test.actions.EnterText
    
    @JSGlobal("sap.ui.test.actions.Press")
    @js.native
    /**
      * The Press action is used to simulate a press interaction on a Control's dom ref.This will work out
      * of the box for most of the controls (even custom controls).Here is a List of supported controls
      * (some controls will trigger the press on a specific region):<ul>    <li>sap.m.Button</li>   
      * <li>sap.m.Link</li>    <li>sap.m.StandardListItem</li>    <li>sap.m.IconTabFilter</li>   
      * <li>sap.m.SearchField - Search Button</li>    <li>sap.m.Page - Back Button</li>   
      * <li>sap.m.semantic.FullscreenPage - Back Button</li>    <li>sap.m.semantic.DetailPage - Back
      * Button</li>    <li>sap.m.List - More Button</li>    <li>sap.m.Table - More Button</li>   
      * <li>sap.m.StandardTile</li></ul>
      */
    class Press ()
      extends StObject
         with typings.openui5.sap.ui.test.actions.Press
  }
  
  object gherkin {
    
    @JSGlobal("sap.ui.test.gherkin.StepDefinitions")
    @js.native
    /**
      * A Gherkin feature file is human-readable, and the computer does not know how to execute its steps.
      * ThisStepDefinitions class provides the interface between human and machine. It defines what each
      * step in the Gherkinfeature file will actually do when it is executed.Meant to be
      * implemented/overridden by a child object. Specifically, the functions 'init' and
      * 'closeApplication'need to be overridden.
      */
    abstract class StepDefinitions ()
      extends StObject
         with typings.openui5.sap.ui.test.gherkin.StepDefinitions
    
    object dataTableUtils {
      
      @JSGlobal("sap.ui.test.gherkin.dataTableUtils")
      @js.native
      val ^ : js.Any = js.native
      
      object normalization {
        
        @JSGlobal("sap.ui.test.gherkin.dataTableUtils.normalization")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * e.g. "First Name" -> "firstName"
          * @param sString the string to normalize
          * @returns the input string with all words after the first capitalized and all spaces removed
          */
        @scala.inline
        def camelCase(sString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelCase")(sString.asInstanceOf[js.Any]).asInstanceOf[String]
        
        /**
          * e.g. "First Name" -> "first-name"
          * @param sString the string to normalize
          * @returns the input string trimmed, changed to lower case and with space between words               
          *   replaced by a hyphen ('-')
          */
        @scala.inline
        def hyphenated(sString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hyphenated")(sString.asInstanceOf[js.Any]).asInstanceOf[String]
        
        /**
          * e.g. "First Name" -> "First Name"
          * @param sString the string to normalize
          * @returns the original unchanged input string
          */
        @scala.inline
        def none(sString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("none")(sString.asInstanceOf[js.Any]).asInstanceOf[String]
        
        /**
          * e.g. "first name" -> "FirstName"
          * @param sString the string to normalize
          * @returns the input string with all words capitalized and all spaces removed
          */
        @scala.inline
        def pascalCase(sString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pascalCase")(sString.asInstanceOf[js.Any]).asInstanceOf[String]
        
        /**
          * e.g. "first name" -> "First Name"
          * @param sString the string to normalize
          * @returns the input string trimmed and with all words capitalized
          */
        @scala.inline
        def titleCase(sString: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("titleCase")(sString.asInstanceOf[js.Any]).asInstanceOf[String]
      }
      
      /**
        * Takes the inputed 2D list 'aData' and returns an equivalent object. Each row of data is expected
        * tobe a property-value pair. To create nested objects, add extra columns to the data. E.g.<pre> [  
        * ['Name', 'Alice'],   ['Mass', '135 lbs'],   ['Telephone Number', 'Home', '123-456-7890'],  
        * ['Telephone Number', 'Work', '123-456-0987'] ]</pre>For each data row, the right-most element
        * becomes a property value, and everything else is a propertyname. The property names get normalized
        * according to the strategy defined by the parameter 'oNorm'.E.g. using camelCase strategy<pre>  {   
        * name: 'Alice',    mass: '135 lbs',    telephoneNumber: {      home: '123-456-7890',      work:
        * '123-456-0987'    }  }</pre>
        * @param aData the input data to be converted
        * @param oNorm the normalization function to use to normalize property                                
        *             names. Can also be a string with values 'titleCase', 'pascalCase',                      
        *                       'camelCase', 'hyphenated' or 'none'.
        * @returns - an object equivalent to the input data, with property names normalized
        */
      @scala.inline
      def toObject(aData: js.Array[js.Array[String]]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(aData.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      @scala.inline
      def toObject(aData: js.Array[js.Array[String]], oNorm: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(aData.asInstanceOf[js.Any], oNorm.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      @scala.inline
      def toObject(aData: js.Array[js.Array[String]], oNorm: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(aData.asInstanceOf[js.Any], oNorm.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      /**
        * Takes the inputed 2D list 'aData' and returns an equivalent list of objects. The data is expected
        * tohave a header row, with each subsequent row being an entity, and each column being a property of
        * thatentity. E.g.<pre>  [    ["Their Name",  "Their Age"],    ["Alice",       "16"],    ["Bob",      
        *   "22"]  ]</pre>The data's column headers become the returned objects' property names. The property
        * names get normalizedaccording to the strategy defined by the parameter 'oNorm'. E.g. using
        * hyphenation strategy this is returned:<pre>  [    {their-name: "Alice", their-age: "16"},   
        * {their-name: "Bob", their-age: "22"}  ]</pre>
        * @param aData the input data to be converted, with a header row
        * @param oNorm the normalization function to use to normalize property                                
        *             names. Can also be a String with values 'titleCase', 'pascalCase',                      
        *                       'camelCase', 'hyphenated' or 'none'.
        * @returns - a list of objects equivalent to the input data, with property names normalized
        */
      @scala.inline
      def toTable(aData: js.Array[js.Array[String]]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toTable")(aData.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
      @scala.inline
      def toTable(aData: js.Array[js.Array[String]], oNorm: String): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTable")(aData.asInstanceOf[js.Any], oNorm.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
      @scala.inline
      def toTable(aData: js.Array[js.Array[String]], oNorm: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toTable")(aData.asInstanceOf[js.Any], oNorm.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
    }
    
    object opa5TestHarness {
      
      @JSGlobal("sap.ui.test.gherkin.opa5TestHarness")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Dynamically generates Opa5 testsIf a test step is missing and args.generateMissingSteps is true then
        * the  Gherkin step will be converted into OpaPage Object code and executed. The text will be
        * converted to camelCase and have any non-alphanumeric characterremoved. Here are two pertinent
        * examples:(1) The simple step "Given I start my app" will be converted into the call
        * "Given.iStartMyApp();"(2) The step "Then on page 1: I should see the page 1 text" will become the
        * call    "Then.onPage1.iShouldSeeThePage1Text();"Chaining function calls, such as
        * "Then.iStartMyApp().and.iCloseMyApp()" is not possible at this time.
        * @param args the arguments to the function
        */
      @scala.inline
      def test(args: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    object qUnitTestHarness {
      
      @JSGlobal("sap.ui.test.gherkin.qUnitTestHarness")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Dynamically generates and executes QUnit tests
        * @param args the arguments to the function
        */
      @scala.inline
      def test(args: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
  }
  
  object matchers {
    
    @JSGlobal("sap.ui.test.matchers.AggregationContainsPropertyEqual")
    @js.native
    class AggregationContainsPropertyEqual protected ()
      extends StObject
         with typings.openui5.sap.ui.test.matchers.AggregationContainsPropertyEqual {
      /**
        * AggregationContainsPropertyEqual - checks if an aggregation contains at least one item that has a
        * Property set to a certain value.Accepts an object literal <code>mSettings</code> that defines
        * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
        * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
        * object.
        * @param mSettings optional map/JSON-object with initial settings for the new
        * AggregationContainsPropertyEqualMatcher
        */
      def this(mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.test.matchers.AggregationFilled")
    @js.native
    class AggregationFilled protected ()
      extends StObject
         with typings.openui5.sap.ui.test.matchers.AggregationFilled {
      /**
        * AggregationFilled - checks if an aggregation contains at least one entry.Accepts an object literal
        * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
        * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
        * of the syntax of the settings object.
        * @param mSettings optional map/JSON-object with initial settings for the new AggregationFilledMatcher
        */
      def this(mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.test.matchers.AggregationLengthEquals")
    @js.native
    class AggregationLengthEquals protected ()
      extends StObject
         with typings.openui5.sap.ui.test.matchers.AggregationLengthEquals {
      /**
        * AggregationLengthEquals - checks if an aggregation contains at least one entry.Accepts an object
        * literal <code>mSettings</code> that defines initialproperty values, aggregated and associated
        * objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general
        * description of the syntax of the settings object.
        * @param mSettings optional map/JSON-object with initial settings for the new
        * AggregationLengthEqualsMatcher
        */
      def this(mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.test.matchers.Ancestor")
    @js.native
    class Ancestor protected ()
      extends StObject
         with typings.openui5.sap.ui.test.matchers.Ancestor {
      def this(oAncestorControl: js.Any) = this()
      def this(oAncestorControl: js.Any, bDirect: Boolean) = this()
    }
    
    @JSGlobal("sap.ui.test.matchers.BindingPath")
    @js.native
    class BindingPath protected ()
      extends StObject
         with typings.openui5.sap.ui.test.matchers.BindingPath {
      /**
        * BindingPath - checks if a control has a binding context with the exact same binding path.Accepts an
        * object literal <code>mSettings</code> that defines initialproperty values, aggregated and associated
        * objects as well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general
        * description of the syntax of the settings object.
        * @param mSettings Map/JSON-object with initial settings for the new BindingPath.
        */
      def this(mSettings: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.test.matchers.Interactable")
    @js.native
    class Interactable ()
      extends StObject
         with typings.openui5.sap.ui.test.matchers.Interactable
    
    @JSGlobal("sap.ui.test.matchers.Matcher")
    @js.native
    abstract class Matcher ()
      extends StObject
         with typings.openui5.sap.ui.test.matchers.Matcher
    
    @JSGlobal("sap.ui.test.matchers.Properties")
    @js.native
    class Properties protected ()
      extends StObject
         with typings.openui5.sap.ui.test.matchers.Properties {
      def this(oProperties: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.test.matchers.PropertyStrictEquals")
    @js.native
    class PropertyStrictEquals protected ()
      extends StObject
         with typings.openui5.sap.ui.test.matchers.PropertyStrictEquals {
      /**
        * PropertyStrictEquals - checks if a property has the exact same value.Accepts an object literal
        * <code>mSettings</code> that defines initialproperty values, aggregated and associated objects as
        * well as event handlers.See {@link sap.ui.base.ManagedObject#constructor} for a general description
        * of the syntax of the settings object.
        * @param mSettings optional map/JSON-object with initial settings for the new PropertyStrictEquals
        */
      def this(mSettings: js.Any) = this()
    }
  }
}
