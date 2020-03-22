package typings.pixiJs.PIXI.interaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pixiJs.pixiJsStrings.touchstart
  - typings.pixiJs.pixiJsStrings.touchcancel
  - typings.pixiJs.pixiJsStrings.touchend
  - typings.pixiJs.pixiJsStrings.touchendoutside
  - typings.pixiJs.pixiJsStrings.touchmove
  - typings.pixiJs.pixiJsStrings.tap
*/
trait InteractionTouchEvents extends js.Object

object InteractionTouchEvents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tap: typings.pixiJs.pixiJsStrings.tap = this.cast("tap")
  @scala.inline
  def touchcancel: typings.pixiJs.pixiJsStrings.touchcancel = this.cast("touchcancel")
  @scala.inline
  def touchend: typings.pixiJs.pixiJsStrings.touchend = this.cast("touchend")
  @scala.inline
  def touchendoutside: typings.pixiJs.pixiJsStrings.touchendoutside = this.cast("touchendoutside")
  @scala.inline
  def touchmove: typings.pixiJs.pixiJsStrings.touchmove = this.cast("touchmove")
  @scala.inline
  def touchstart: typings.pixiJs.pixiJsStrings.touchstart = this.cast("touchstart")
}

