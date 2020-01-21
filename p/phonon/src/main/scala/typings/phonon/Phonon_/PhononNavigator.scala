package typings.phonon.Phonon_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Navigation ***/
@js.native
trait PhononNavigator extends js.Object {
  var currentPage: String = js.native
  var previousPage: String = js.native
  def changePage(pageName: String): Unit = js.native
  def changePage(pageName: String, parameter: String): Unit = js.native
  def on(page: PhononPageObject): Unit = js.native
  def on(page: PhononPageObject, callback: js.Function1[/* activity */ PhononActivity, Unit]): Unit = js.native
  def onPage(page: String): PhononPageEventObject = js.native
  def start(): Unit = js.native
}

