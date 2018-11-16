package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IMouseEvent extends js.Object {
  val altKey: scala.Boolean
  val browserEvent: stdLib.MouseEvent
  val ctrlKey: scala.Boolean
  val detail: scala.Double
  val leftButton: scala.Boolean
  val metaKey: scala.Boolean
  val middleButton: scala.Boolean
  val posx: scala.Double
  val posy: scala.Double
  val rightButton: scala.Boolean
  val shiftKey: scala.Boolean
  val target: stdLib.HTMLElement
  val timestamp: scala.Double
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

