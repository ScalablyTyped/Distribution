package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IKeyboardEvent extends js.Object {
  val altKey: scala.Boolean
  val browserEvent: stdLib.KeyboardEvent
  val code: java.lang.String
  val ctrlKey: scala.Boolean
  val keyCode: KeyCode
  val metaKey: scala.Boolean
  val shiftKey: scala.Boolean
  val target: stdLib.HTMLElement
  def equals(keybinding: scala.Double): scala.Boolean
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

