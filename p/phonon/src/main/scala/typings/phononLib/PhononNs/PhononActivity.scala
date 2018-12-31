package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhononActivity extends js.Object {
  def onClose(): scala.Unit = js.native
  def onClose(callback: js.Function1[/* self */ PhononOnCloseObject, scala.Unit]): scala.Unit = js.native
  def onCreate(): scala.Unit = js.native
  def onCreate(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def onHashChanged(): scala.Unit = js.native
  def onHashChanged(callback: js.Function1[/* repeated */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def onHidden(): scala.Unit = js.native
  def onHidden(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def onReady(): scala.Unit = js.native
  def onReady(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def onTabChanged(): scala.Unit = js.native
  def onTabChanged(callback: js.Function1[/* tabNumber */ scala.Double, scala.Unit]): scala.Unit = js.native
  def onTransitionEnd(): scala.Unit = js.native
  def onTransitionEnd(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

