package typings.microsoftAjax.Sys.UI

import typings.microsoftAjax.Sys.Component
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a base class for all ASP.NET AJAX client behaviors.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb311020(v=vs.100).aspx}
  */
trait Behavior
  extends StObject
     with Component {
  
  //#endregion
  //#region Properties
  /**
    * Gets the HTML Document Object Model (DOM) element that the current Sys.UI.Behavior object is associated with.
    * @return The DOM element that the current Behavior object is associated with.
    */
  def get_element(): HTMLElement
  
  /**
    * Gets or sets the name of the Sys.UI.Behavior object.
    */
  def get_name(): String
  
  /*
    * Gets or sets the name of the Sys.UI.Behavior object.
    * If you do not explicitly set the name property, getting the property value sets it to its default value, which is equal to the type of the Behavior object. The name property remains null until it is accessed.
    * @param value
    *           A string value to use as the name.
    */
  def set_name(value: String): Unit
}
object Behavior {
  
  inline def apply(
    add_disposing: js.Function => Unit,
    add_propertyChanged: js.Function => Unit,
    beginUpdate: () => Unit,
    dispose: () => Unit,
    endUpdate: () => Unit,
    get_element: () => HTMLElement,
    get_events: () => Any,
    get_id: () => String,
    get_isInitialized: () => Boolean,
    get_isUpdating: () => Boolean,
    get_name: () => String,
    initialize: () => Unit,
    raisePropertyChanged: String => Unit,
    remove_disposing: js.Function => Unit,
    remove_propertyChanged: js.Function => Unit,
    set_id: String => Unit,
    set_name: String => Unit,
    updated: () => Unit
  ): Behavior = {
    val __obj = js.Dynamic.literal(add_disposing = js.Any.fromFunction1(add_disposing), add_propertyChanged = js.Any.fromFunction1(add_propertyChanged), beginUpdate = js.Any.fromFunction0(beginUpdate), dispose = js.Any.fromFunction0(dispose), endUpdate = js.Any.fromFunction0(endUpdate), get_element = js.Any.fromFunction0(get_element), get_events = js.Any.fromFunction0(get_events), get_id = js.Any.fromFunction0(get_id), get_isInitialized = js.Any.fromFunction0(get_isInitialized), get_isUpdating = js.Any.fromFunction0(get_isUpdating), get_name = js.Any.fromFunction0(get_name), initialize = js.Any.fromFunction0(initialize), raisePropertyChanged = js.Any.fromFunction1(raisePropertyChanged), remove_disposing = js.Any.fromFunction1(remove_disposing), remove_propertyChanged = js.Any.fromFunction1(remove_propertyChanged), set_id = js.Any.fromFunction1(set_id), set_name = js.Any.fromFunction1(set_name), updated = js.Any.fromFunction0(updated))
    __obj.asInstanceOf[Behavior]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Behavior] (val x: Self) extends AnyVal {
    
    inline def setGet_element(value: () => HTMLElement): Self = StObject.set(x, "get_element", js.Any.fromFunction0(value))
    
    inline def setGet_name(value: () => String): Self = StObject.set(x, "get_name", js.Any.fromFunction0(value))
    
    inline def setSet_name(value: String => Unit): Self = StObject.set(x, "set_name", js.Any.fromFunction1(value))
  }
}
