package typings.onsenui.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description Utility methods for modifier attributes
  */
object modifier {
  
  /**
    * @description Add the specified modifiers to the element if they are not already included.
    * @param {HTMLElemenet} element Target element.
    * @param {String} modifier Name of the modifier.
    */
  @JSImport("onsenui", "modifier.add")
  @js.native
  def add(element: HTMLElement, modifier: String*): Unit = js.native
  
  /**
    * @description Check whether the specified modifier is included in the element.
    * @param {HTMLElemenet} element Target element.
    * @param {String} modifier Name of the modifier.
    * @return {Boolean} 'true' when the specified modifier is found in the element's 'modifier' attribute. 'false' otherwise.
    */
  @JSImport("onsenui", "modifier.contains")
  @js.native
  def contains(element: HTMLElement, modifier: String): Boolean = js.native
  
  /**
    * @description Remove the specified modifiers from the element if they are included.
    * @param {HTMLElemenet} element Target element.
    * @param {String} modifier Name of the modifier.
    */
  @JSImport("onsenui", "modifier.remove")
  @js.native
  def remove(element: HTMLElement, modifier: String*): Unit = js.native
  
  /**
    * @description Toggle the specified modifier.
    * @param {HTMLElemenet} element Target element.
    * @param {String} modifier Name of the modifier.
    * @param {Boolean} force If it evaluates to true, add specified modifier value, and if it evaluates to false, remove it.
    */
  @JSImport("onsenui", "modifier.toggle")
  @js.native
  def toggle(element: HTMLElement, modifier: String): Unit = js.native
  @JSImport("onsenui", "modifier.toggle")
  @js.native
  def toggle(element: HTMLElement, modifier: String, force: Boolean): Unit = js.native
}
