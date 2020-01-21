package typings.nodeRed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeRed.nodeRedStrings.red
  - typings.nodeRed.nodeRedStrings.green
  - typings.nodeRed.nodeRedStrings.yellow
  - typings.nodeRed.nodeRedStrings.blue
  - typings.nodeRed.nodeRedStrings.grey
*/
trait StatusFill extends js.Object

object StatusFill {
  @scala.inline
  def blue: typings.nodeRed.nodeRedStrings.blue = this.cast("blue")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def green: typings.nodeRed.nodeRedStrings.green = this.cast("green")
  @scala.inline
  def grey: typings.nodeRed.nodeRedStrings.grey = this.cast("grey")
  @scala.inline
  def red: typings.nodeRed.nodeRedStrings.red = this.cast("red")
  @scala.inline
  def yellow: typings.nodeRed.nodeRedStrings.yellow = this.cast("yellow")
}

