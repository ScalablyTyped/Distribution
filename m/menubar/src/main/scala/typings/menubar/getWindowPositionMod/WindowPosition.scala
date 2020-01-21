package typings.menubar.getWindowPositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.menubar.menubarStrings.trayCenter
  - typings.menubar.menubarStrings.topRight
  - typings.menubar.menubarStrings.trayBottomCenter
  - typings.menubar.menubarStrings.trayBottomLeft
  - typings.menubar.menubarStrings.bottomRight
*/
trait WindowPosition extends js.Object

object WindowPosition {
  @scala.inline
  def bottomRight: typings.menubar.menubarStrings.bottomRight = this.cast("bottomRight")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def topRight: typings.menubar.menubarStrings.topRight = this.cast("topRight")
  @scala.inline
  def trayBottomCenter: typings.menubar.menubarStrings.trayBottomCenter = this.cast("trayBottomCenter")
  @scala.inline
  def trayBottomLeft: typings.menubar.menubarStrings.trayBottomLeft = this.cast("trayBottomLeft")
  @scala.inline
  def trayCenter: typings.menubar.menubarStrings.trayCenter = this.cast("trayCenter")
}

