package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @description Utility methods for modifier attributes
  */
@JSImport("onsenui", "modifier")
@js.native
object modifierNs extends js.Object {
  /**
    * @description Add the specified modifiers to the element if they are not already included.
    * @param {HTMLElemenet} element Target element.
    * @param {String} modifier Name of the modifier.
    */
  def add(element: stdLib.HTMLElement, modifier: java.lang.String*): scala.Unit = js.native
  /**
    * @description Check whether the specified modifier is included in the element.
    * @param {HTMLElemenet} element Target element.
    * @param {String} modifier Name of the modifier.
    * @return {Boolean} 'true' when the specified modifier is found in the element's 'modifier' attribute. 'false' otherwise.
    */
  def contains(element: stdLib.HTMLElement, modifier: java.lang.String): scala.Boolean = js.native
  /**
    * @description Remove the specified modifiers from the element if they are included.
    * @param {HTMLElemenet} element Target element.
    * @param {String} modifier Name of the modifier.
    */
  def remove(element: stdLib.HTMLElement, modifier: java.lang.String*): scala.Unit = js.native
  /**
    * @description Toggle the specified modifier.
    * @param {HTMLElemenet} element Target element.
    * @param {String} modifier Name of the modifier.
    * @param {Boolean} force If it evaluates to true, add specified modifier value, and if it evaluates to false, remove it.
    */
  def toggle(element: stdLib.HTMLElement, modifier: java.lang.String): scala.Unit = js.native
  def toggle(element: stdLib.HTMLElement, modifier: java.lang.String, force: scala.Boolean): scala.Unit = js.native
}

