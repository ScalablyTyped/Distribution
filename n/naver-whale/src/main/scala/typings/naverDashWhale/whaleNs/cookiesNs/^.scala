package typings.naverDashWhale.whaleNs.cookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cookies")
@js.native
object ^ extends js.Object {
  var onChanged: typings.chrome.chromeNs.cookiesNs.CookieChangedEvent = js.native
  def get(
    details: typings.chrome.chromeNs.cookiesNs.Details,
    callback: js.Function1[/* cookie */ typings.chrome.chromeNs.cookiesNs.Cookie | Null, Unit]
  ): Unit = js.native
  def getAll(
    details: typings.chrome.chromeNs.cookiesNs.GetAllDetails,
    callback: js.Function1[/* cookies */ js.Array[typings.chrome.chromeNs.cookiesNs.Cookie], Unit]
  ): Unit = js.native
  def getAllCookieStores(
    callback: js.Function1[/* cookieStores */ js.Array[typings.chrome.chromeNs.cookiesNs.CookieStore], Unit]
  ): Unit = js.native
  def remove(details: typings.chrome.chromeNs.cookiesNs.Details): Unit = js.native
  def remove(
    details: typings.chrome.chromeNs.cookiesNs.Details,
    callback: js.Function1[/* details */ typings.chrome.chromeNs.cookiesNs.Details, Unit]
  ): Unit = js.native
  def set(details: typings.chrome.chromeNs.cookiesNs.SetDetails): Unit = js.native
  def set(
    details: typings.chrome.chromeNs.cookiesNs.SetDetails,
    callback: js.Function1[/* cookie */ typings.chrome.chromeNs.cookiesNs.Cookie | Null, Unit]
  ): Unit = js.native
}

