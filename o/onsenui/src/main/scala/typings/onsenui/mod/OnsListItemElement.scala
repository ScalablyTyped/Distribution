package typings.onsenui.mod

import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnsListItemElement
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  
  /**
    * @description The animation used when showing and hiding the expandable content. Can be either `"default"` or `"none"`.
    **/
  var animation: String = js.native
  
  /**
    * @description Whether the list item is expandable or not.
    **/
  var expandable: Boolean = js.native
  
  /**
    * @description For expandable list items, specifies whether the expandable content is expanded or not.
    **/
  var expanded: Boolean = js.native
  
  /**
    * @description Hide the expandable content if element is expandable
    */
  def hideExpansion(): Unit = js.native
  
  /**
    * @description Prevent vertical scrolling when the user drags horizontally.
    **/
  var lockOnDrag: Boolean = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
  
  /**
    * @description Show the expandable content if element is expandable
    */
  def showExpansion(): Unit = js.native
  
  /**
    * @description Changes the background color when tapped. For this to work, the attribute "tappable" needs to be set. The default color is "#d9d9d9". It will display as a ripple effect on Android.
    **/
  var tapBackgroundColor: String = js.native
  
  /**
    * @description Makes the element react to taps.
    **/
  var tappable: Boolean = js.native
}
