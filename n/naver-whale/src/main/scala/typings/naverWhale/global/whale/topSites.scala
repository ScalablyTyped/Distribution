package typings.naverWhale.global.whale

import typings.naverWhale.whale.topSites.MostVisitedURL
import typings.naverWhale.whale.topSites.MostVisitedURL2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topSites {
  
  @JSGlobal("whale.topSites")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("whale.topSites.add")
  @js.native
  def add(url: String, title: String): Unit = js.native
  @JSGlobal("whale.topSites.add")
  @js.native
  def add(url: String, title: String, callback: js.Function1[/* status */ Boolean, Unit]): Unit = js.native
  
  @JSGlobal("whale.topSites.block")
  @js.native
  def block(url: String): Unit = js.native
  
  /**
    * 자주 가는 사이트에서 해당 url을 삭제합니다.
    * @param url 삭제할 url
    */
  @JSGlobal("whale.topSites._delete")
  @js.native
  def delete: js.Function1[/* url */ String, Unit] = js.native
  
  @scala.inline
  def delete_=(x: js.Function1[/* url */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_delete")(x.asInstanceOf[js.Any])
  
  @JSGlobal("whale.topSites.get")
  @js.native
  def get(callback: js.Function1[/* data */ js.Array[MostVisitedURL], Unit]): Unit = js.native
  
  @JSGlobal("whale.topSites.isBlocked")
  @js.native
  def isBlocked(url: String, callback: js.Function1[/* status */ Boolean, Unit]): Unit = js.native
  
  @JSGlobal("whale.topSites.search")
  @js.native
  def search(term: String, count: Double): Unit = js.native
  @JSGlobal("whale.topSites.search")
  @js.native
  def search(term: String, count: Double, callback: js.Function1[/* result */ js.Array[MostVisitedURL2], Unit]): Unit = js.native
  
  @JSGlobal("whale.topSites.unblock")
  @js.native
  def unblock(url: String): Unit = js.native
  
  @JSGlobal("whale.topSites.update")
  @js.native
  def update(urls: js.Array[MostVisitedURL2]): js.Any = js.native
}
