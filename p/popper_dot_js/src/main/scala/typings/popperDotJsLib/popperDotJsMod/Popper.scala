package typings
package popperDotJsLib.popperDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Popper extends js.Object {
  var options: PopperOptions
  def destroy(): scala.Unit
  def disableEventListeners(): scala.Unit
  def enableEventListeners(): scala.Unit
  def scheduleUpdate(): scala.Unit
  def update(): scala.Unit
}

