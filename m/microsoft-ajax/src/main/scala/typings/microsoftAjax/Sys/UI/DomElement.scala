package typings.microsoftAjax.Sys.UI

import typings.microsoftAjax.Sys.EventArgs
import typings.microsoftAjax.anon.Height
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines static methods and properties that provide helper APIs for manipulating and inspecting DOM elements.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb383788(v=vs.100).aspx}
  */
@js.native
trait DomElement extends js.Object {
  
  //#region Constructors
  //#endregion
  //#region Methods
  /**
    * Adds a CSS class to a DOM element if the class is not already part of the DOM element. This member is static and can be invoked without creating an instance of the class.
    * If the element does not support a CSS class, no change is made to the element.
    * @param element
    *             The HTMLElement object to add the CSS class to.
    * @param className
    *             The name of the CSS class to add.
    */
  def addCssClass(element: HTMLElement, className: String): Unit = js.native
  
  /**
    * Gets a value that indicates whether the DOM element contains the specified CSS class. This member is static and can be invoked without creating an instance of the class.
    * @param element
    *          The HTMLElement object to test for the CSS class.
    * @param className
    *          The name of the CSS class to test for.
    * @return
    *          true if the element contains the specified CSS class; otherwise, false.
    */
  def containsCssClass(element: HTMLElement, className: String): Boolean = js.native
  
  /**
    * Gets a set of integer coordinates that represent the position, width, and height of a DOM element. This member is static and can be invoked without creating an instance of the class.
    *
    * @param element
    *          The HTMLElement instance to get the coordinates of.
    * @return
    *      An object of the JavaScript type Object that contains the x-coordinate and y-coordinate of the upper-left corner, the width, and the height of the element in pixels.
    */
  def getBounds(element: HTMLElement): Height = js.native
  
  /**
    * @param id
    *      The ID of the element to find.
    * @param element
    *      (optional) The parent element to search in. The default is the document element.
    */
  def getElementById(id: String): HTMLElement = js.native
  def getElementById(id: String, element: js.Any): js.Any = js.native
  def getElementById(id: String, element: HTMLElement): HTMLElement = js.native
  
  /**
    * Gets the absolute position of a DOM element relative to the upper-left corner of the owner frame or window. This member is static and can be invoked without creating an instance of the class.             *
    * @param element
    *      The target element.             *
    * @return
    *      An object of the JavaScript type Object that contains the x-coordinate and y-coordinate of the element in pixels.
    */
  def getLocation(element: HTMLElement): Point = js.native
  
  /*
    * Returns a value that represents the layout characteristics of a DOM element when it is hidden by invoking the HTMLElement.setVisible method. This member is static and can be invoked without creating an instance of the class.
    * @param element
    *      The target DOM element.
    * @return
    *    A Sys.UI.VisibilityMode enumeration value that indicates the layout characteristics of element when it is hidden by invoking the setVisible method.
    */
  def getVisibilityMode(element: HTMLElement): VisibilityMode = js.native
  
  /**
    * Gets a value that indicates whether a DOM element is currently visible on the Web page. This member is static and can be invoked without creating an instance of the class.
    * @param element
    *      The target DOM element.
    * @return
    *      true if element is visible on the Web page; otherwise, false
    */
  def getVisible(element: js.Any): Boolean = js.native
  
  /**
    * Determines whether the specified object is a DOM element.
    * @param obj
    *      An object
    * @return
    *      true if the object is a DOM element; otherwise, false.
    */
  def isDomElement(obj: js.Any): Boolean = js.native
  
  /**
    * Raises a bubble event. A bubble event causes an event to be raised and then propagated up the control hierarchy until it is handled.
    * @param source
    *      The DOM element that triggers the event.
    * @param args
    *      The event arguments
    */
  def raiseBubbleEvent(source: HTMLElement, args: EventArgs): Unit = js.native
  
  def removeCssClass(element: js.Any, className: String): Unit = js.native
  /**
    * Removes a CSS class from a DOM element. This member is static and can be invoked without creating an instance of the class. If the element does not include a CSS class, no change is made to the element.
    * @param element
    *          The HTMLElement object to remove the CSS class from.
    * @param className
    *          The name of the CSS class to remove.
    */
  def removeCssClass(element: HTMLElement, className: String): Unit = js.native
  
  /**
    * Returns the element that has either the specified ID in the specified container, or is the specified element itself.
    * The resolveElement method is used to verify that an ID or an object can be resolved as an element.             *
    * @param elementOrElementId
    *          The element to resolve, or the ID of the element to resolve. This parameter can be null.
    * @param containerElement
    *          (Optional) The specified container.
    * @return
    *      A DOM element.
    */
  def resolveElement(elementOrElementId: String): HTMLElement = js.native
  def resolveElement(elementOrElementId: String, containerElement: HTMLElement): HTMLElement = js.native
  def resolveElement(elementOrElementId: HTMLElement): HTMLElement = js.native
  def resolveElement(elementOrElementId: HTMLElement, containerElement: HTMLElement): HTMLElement = js.native
  
  /**
    * Sets the position of a DOM element. This member is static and can be invoked without creating an instance of the class.
    * The left and top style attributes (upper-left corner) of an element specify the relative position of an element.
    * The actual position will depend on the offsetParent property of the target element and the positioning mode of the element.             *
    * @param element The target element.
    * @param x The x-coordinate in pixels.
    * @param y The y-coordinate in pixels.
    */
  def setLocation(element: HTMLElement, x: Double, y: Double): Unit = js.native
  
  /**
    * Sets the layout characteristics of a DOM element when it is hidden by invoking the HTMLElement.setVisible method.
    * This member is static and can be invoked without creating an instance of the class.
    *
    * Use the setVisibilityMode method to set the layout characteristics of a DOM element when it is hidden by invoking the HTMLElement.setVisible method.
    * For example, if value is set to Sys.UI.VisibilityMode.collapse, the element uses no space on the page when the setVisible method is called to hide the element.
    *
    * @param element
    *          The target DOM element.
    * @param value
    *          A Sys.UI.VisibilityMode enumeration value.
    */
  def setVisibilityMode(element: HTMLElement, value: VisibilityMode): Unit = js.native
  
  /**
    * Sets a DOM element to be visible or hidden. This member is static and can be invoked without creating an instance of the class.
    *
    * Use the setVisible method to set a DOM element as visible or hidden on the Web page.
    * If you invoke this method with value set to false for an element whose visibility mode is set to "hide," the element will not be visible.
    * However, it will occupy space on the page. If the element's visibility mode is set to "collapse," the element will occupy no space in the page.
    * For more information about how to set the layout characteristics of hidden DOM elements, see HTMLElement setVisibilityMode Method.
    *
    * @param element
    *      The target DOM element.
    * @param value
    *      true to make element visible on the Web page; false to hide element.
    */
  def setVisible(element: HTMLElement, value: Boolean): Unit = js.native
  
  /**
    * Toggles a CSS class in a DOM element. This member is static and can be invoked without creating an instance of the class.
    * Use the toggleCssClass method to hide a CSS class of an element if it is shown, or to show a CSS class of an element if it is hidden.
    *
    * @param element
    *          The HTMLElement object to toggle.
    * @param className
    *          The name of the CSS class to toggle.
    */
  def toggleCssClass(element: HTMLElement, className: String): Unit = js.native
}
