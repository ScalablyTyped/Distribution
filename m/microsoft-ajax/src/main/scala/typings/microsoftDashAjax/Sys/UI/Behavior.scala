package typings.microsoftDashAjax.Sys.UI

import typings.microsoftDashAjax.Sys.Component
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a base class for all ASP.NET AJAX client behaviors.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311020(v=vs.100).aspx}
  */
@JSGlobal("Sys.UI.Behavior")
@js.native
class Behavior () extends Component {
  //#endregion
  //#region Properties
  /**
    * Gets the HTML Document Object Model (DOM) element that the current Sys.UI.Behavior object is associated with.
    * @return The DOM element that the current Behavior object is associated with.
    */
  def get_element(): HTMLElement = js.native
  /**
    * Gets or sets the name of the Sys.UI.Behavior object.
    */
  def get_name(): java.lang.String = js.native
  /*
    * Gets or sets the name of the Sys.UI.Behavior object.
    * If you do not explicitly set the name property, getting the property value sets it to its default value, which is equal to the type of the Behavior object. The name property remains null until it is accessed.
    * @param value
    *           A string value to use as the name.
    */
  def set_name(value: java.lang.String): Unit = js.native
}

/* static members */
@JSGlobal("Sys.UI.Behavior")
@js.native
object Behavior extends js.Object {
  //#region Methods
  /**
    * Gets a Sys.UI.Behavior instance with the specified name property from the specified HTML Document Object Model (DOM) element. This member a static member and can be invoked without creating an instance of the class.
    * @return The specified Behavior object, if found; otherwise, null.
    */
  def getBehaviorByName(element: HTMLElement, name: java.lang.String): Behavior = js.native
  /**
    * Gets the Sys.UI.Behavior objects that are associated with the specified HTML Document Object Model (DOM) element. This member is static and can be invoked without creating an instance of the class.
    * @param element
    *           The HTMLElement object to search.
    * @return An array of references to Behavior objects, or null if no references exist.
    */
  def getBehaviors(element: DomElement): js.Array[Behavior] = js.native
  /**
    * Gets an array of Sys.UI.Behavior objects that are of the specified type from the specified HTML Document Object Model (DOM) element. This method is static and can be invoked without creating an instance of the class.
    * @return An array of all Behavior objects of the specified type that are associated with the specified DOM element, if found; otherwise, an empty array.
    */
  def getBehaviorsByType(element: HTMLElement, `type`: Behavior): js.Array[Behavior] = js.native
}

