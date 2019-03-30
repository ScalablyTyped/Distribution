package typings
package naverDashWhaleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Add extends js.Object {
  /**
    * 자주 가는 사이트에서 해당 url을 삭제합니다.
    * @param url 삭제할 url
    */
  @JSName("_delete")
  var _delete_Original: js.Function1[/* url */ java.lang.String, scala.Unit] = js.native
  /**
    * 자주 가는 사이트에서 해당 url을 삭제합니다.
    * @param url 삭제할 url
    */
  def _delete(url: java.lang.String): scala.Unit = js.native
  def add(url: java.lang.String, title: java.lang.String): scala.Unit = js.native
  def add(
    url: java.lang.String,
    title: java.lang.String,
    callback: js.Function1[/* status */ scala.Boolean, scala.Unit]
  ): scala.Unit = js.native
  def block(url: java.lang.String): scala.Unit = js.native
  def get(
    callback: js.Function1[
      /* data */ js.Array[naverDashWhaleLib.whaleNs.topSitesNs.MostVisitedURL], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def isBlocked(url: java.lang.String, callback: js.Function1[/* status */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def search(term: java.lang.String, count: scala.Double): scala.Unit = js.native
  def search(
    term: java.lang.String,
    count: scala.Double,
    callback: js.Function1[
      /* result */ js.Array[naverDashWhaleLib.whaleNs.topSitesNs.MostVisitedURL2], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def unblock(url: java.lang.String): scala.Unit = js.native
  def update(urls: js.Array[naverDashWhaleLib.whaleNs.topSitesNs.MostVisitedURL2]): js.Any = js.native
}

