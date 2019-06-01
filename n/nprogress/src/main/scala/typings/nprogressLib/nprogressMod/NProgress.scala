package typings
package nprogressLib.nprogressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NProgress extends js.Object {
  var settings: NProgressOptions = js.native
  var status: scala.Double | scala.Null = js.native
  var version: java.lang.String = js.native
  def configure(options: stdLib.Partial[NProgressOptions]): NProgress = js.native
  def done(): NProgress = js.native
  def done(force: scala.Boolean): NProgress = js.native
  def getPositioningCSS(): nprogressLib.nprogressLibStrings.translate3d | nprogressLib.nprogressLibStrings.translate | nprogressLib.nprogressLibStrings.margin = js.native
  def inc(): NProgress = js.native
  def inc(amount: scala.Double): NProgress = js.native
  def isRendered(): scala.Boolean = js.native
  def isStarted(): scala.Boolean = js.native
  def remove(): scala.Unit = js.native
  /* Internal */
  def render(): stdLib.HTMLDivElement = js.native
  def render(fromStart: scala.Boolean): stdLib.HTMLDivElement = js.native
  def set(number: scala.Double): NProgress = js.native
  def start(): NProgress = js.native
  def trickle(): NProgress = js.native
}

