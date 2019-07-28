package typings.naverDashWhale

import typings.naverDashWhale.whaleNs.topSitesNs.MostVisitedURL
import typings.naverDashWhale.whaleNs.topSitesNs.MostVisitedURL2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeoftopSites extends js.Object {
  /**
    * 자주 가는 사이트에서 해당 url을 삭제합니다.
    * @param url 삭제할 url
    */
  @JSName("_delete")
  var _delete_Original: js.Function1[/* url */ String, Unit] = js.native
  /**
    * 자주 가는 사이트에서 해당 url을 삭제합니다.
    * @param url 삭제할 url
    */
  def _delete(url: String): Unit = js.native
  def add(url: String, title: String): Unit = js.native
  def add(url: String, title: String, callback: js.Function1[/* status */ Boolean, Unit]): Unit = js.native
  def block(url: String): Unit = js.native
  def get(callback: js.Function1[/* data */ js.Array[MostVisitedURL], Unit]): Unit = js.native
  def isBlocked(url: String, callback: js.Function1[/* status */ Boolean, Unit]): Unit = js.native
  def search(term: String, count: Double): Unit = js.native
  def search(term: String, count: Double, callback: js.Function1[/* result */ js.Array[MostVisitedURL2], Unit]): Unit = js.native
  def unblock(url: String): Unit = js.native
  def update(urls: js.Array[MostVisitedURL2]): js.Any = js.native
}

