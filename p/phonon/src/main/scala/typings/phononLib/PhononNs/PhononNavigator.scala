package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*** Navigation ***/
@js.native
trait PhononNavigator extends js.Object {
  var currentPage: java.lang.String = js.native
  var previousPage: java.lang.String = js.native
  def changePage(pageName: java.lang.String): scala.Unit = js.native
  def changePage(pageName: java.lang.String, parameter: java.lang.String): scala.Unit = js.native
  def on(page: PhononPageObject): scala.Unit = js.native
  def on(page: PhononPageObject, callback: js.Function1[/* activity */ PhononActivity, scala.Unit]): scala.Unit = js.native
  def onPage(page: java.lang.String): PhononPageEventObject = js.native
  def start(): scala.Unit = js.native
}

