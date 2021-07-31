package typings.onsenui.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description Utility methods for modifier attributes
  */
object modifier {
  
  @JSImport("onsenui", "modifier")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @description Add the specified modifiers to the element if they are not already included.
    * @param {HTMLElemenet} element Target element.
    * @param {String} modifier Name of the modifier.
    */
  @scala.inline
  def add(element: HTMLElement, modifier: String*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(element.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @description Check whether the specified modifier is included in the element.
    * @param {HTMLElemenet} element Target element.
    * @param {String} modifier Name of the modifier.
    * @return {Boolean} 'true' when the specified modifier is found in the element's 'modifier' attribute. 'false' otherwise.
    */
  @scala.inline
  def contains(element: HTMLElement, modifier: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(element.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * @description Remove the specified modifiers from the element if they are included.
    * @param {HTMLElemenet} element Target element.
    * @param {String} modifier Name of the modifier.
    */
  @scala.inline
  def remove(element: HTMLElement, modifier: String*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(element.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @description Toggle the specified modifier.
    * @param {HTMLElemenet} element Target element.
    * @param {String} modifier Name of the modifier.
    * @param {Boolean} force If it evaluates to true, add specified modifier value, and if it evaluates to false, remove it.
    */
  @scala.inline
  def toggle(element: HTMLElement, modifier: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def toggle(element: HTMLElement, modifier: String, force: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggle")(element.asInstanceOf[js.Any], modifier.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
