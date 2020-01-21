package typings.phonon.Phonon_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhononActivity extends js.Object {
  def onClose(): Unit = js.native
  def onClose(callback: js.Function1[/* self */ PhononOnCloseObject, Unit]): Unit = js.native
  def onCreate(): Unit = js.native
  def onCreate(callback: js.Function0[Unit]): Unit = js.native
  def onHashChanged(): Unit = js.native
  def onHashChanged(callback: js.Function1[/* repeated */ String, Unit]): Unit = js.native
  def onHidden(): Unit = js.native
  def onHidden(callback: js.Function0[Unit]): Unit = js.native
  def onReady(): Unit = js.native
  def onReady(callback: js.Function0[Unit]): Unit = js.native
  def onTabChanged(): Unit = js.native
  def onTabChanged(callback: js.Function1[/* tabNumber */ Double, Unit]): Unit = js.native
  def onTransitionEnd(): Unit = js.native
  def onTransitionEnd(callback: js.Function0[Unit]): Unit = js.native
}

