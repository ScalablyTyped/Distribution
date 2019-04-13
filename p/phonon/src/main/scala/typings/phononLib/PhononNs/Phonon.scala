package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Main object ***/
@js.native
trait Phonon extends js.Object {
  var browser: PhononBrowserObject = js.native
  var device: PhononDeviceObject = js.native
  var event: PhononEventObject = js.native
  def ajax(request: PhononAjaxObject): PhononAjaxReturnObject = js.native
  def alert(text: java.lang.String): PhononDialogComponent = js.native
  def alert(text: java.lang.String, title: java.lang.String): PhononDialogComponent = js.native
  def alert(text: java.lang.String, title: java.lang.String, cancelable: scala.Boolean): PhononDialogComponent = js.native
  def alert(
    text: java.lang.String,
    title: java.lang.String,
    cancelable: scala.Boolean,
    textOk: java.lang.String
  ): PhononDialogComponent = js.native
  def autocomplete(input: java.lang.String): js.Any = js.native
  def autocomplete(input: java.lang.String, o: awesompleteLib.awesompleteMod.Options): js.Any = js.native
  def autocomplete(input: phononLib.Element): js.Any = js.native
  def autocomplete(input: phononLib.Element, o: awesompleteLib.awesompleteMod.Options): js.Any = js.native
  def autocomplete(input: stdLib.HTMLElement): js.Any = js.native
  def autocomplete(input: stdLib.HTMLElement, o: awesompleteLib.awesompleteMod.Options): js.Any = js.native
  def confirm(text: java.lang.String): PhononDialogComponent = js.native
  def confirm(text: java.lang.String, title: java.lang.String): PhononDialogComponent = js.native
  def confirm(text: java.lang.String, title: java.lang.String, cancelable: scala.Boolean): PhononDialogComponent = js.native
  def confirm(
    text: java.lang.String,
    title: java.lang.String,
    cancelable: scala.Boolean,
    textOk: java.lang.String
  ): PhononDialogComponent = js.native
  def confirm(
    text: java.lang.String,
    title: java.lang.String,
    cancelable: scala.Boolean,
    textOk: java.lang.String,
    textCancel: java.lang.String
  ): PhononDialogComponent = js.native
  def dialog(id: java.lang.String): PhononCustomDialogComponent = js.native
  def i18n(): PhononI18n = js.native
  def indicator(title: java.lang.String): PhononIndicatorComponent = js.native
  def indicator(title: java.lang.String, cancelable: scala.Boolean): PhononIndicatorComponent = js.native
  def navigator(): PhononNavigator = js.native
  def notif(textOrId: java.lang.String): PhononNotifComponent = js.native
  def notif(textOrId: java.lang.String, timeout: scala.Double): PhononNotifComponent = js.native
  def notif(textOrId: java.lang.String, timeout: scala.Double, showButton: scala.Boolean): PhononNotifComponent = js.native
  def notif(
    textOrId: java.lang.String,
    timeout: scala.Double,
    showButton: scala.Boolean,
    textButton: java.lang.String
  ): PhononNotifComponent = js.native
  def onReady(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def options(options: PhononOptions): scala.Unit = js.native
  def panel(id: java.lang.String): PhononPanelComponent = js.native
  def popover(): PhononPopoverComponent = js.native
  def popover(id: java.lang.String): PhononPopoverComponent = js.native
  def preloader(element: java.lang.String): PhononPreloaderComponent = js.native
  def preloader(element: phononLib.Element): PhononPreloaderComponent = js.native
  def prompt(text: java.lang.String): PhononDialogComponent = js.native
  def prompt(text: java.lang.String, title: java.lang.String): PhononDialogComponent = js.native
  def prompt(text: java.lang.String, title: java.lang.String, cancelable: scala.Boolean): PhononDialogComponent = js.native
  def prompt(
    text: java.lang.String,
    title: java.lang.String,
    cancelable: scala.Boolean,
    textOk: java.lang.String
  ): PhononDialogComponent = js.native
  def prompt(
    text: java.lang.String,
    title: java.lang.String,
    cancelable: scala.Boolean,
    textOk: java.lang.String,
    textCancel: java.lang.String
  ): PhononDialogComponent = js.native
  def sidePanel(id: java.lang.String): PhononSidePanelComponent = js.native
  def tab(): PhononTabComponent = js.native
  def updateLocale(language: java.lang.String): scala.Unit = js.native
}

