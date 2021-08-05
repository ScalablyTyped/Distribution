package typings.naverWhale.global.whale

import typings.naverWhale.whale.topSites.MostVisitedURL
import typings.naverWhale.whale.topSites.MostVisitedURL2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object topSites {
  
  @JSGlobal("whale.topSites")
  @js.native
  val ^ : js.Any = js.native
  
  inline def add(url: String, title: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def add(url: String, title: String, callback: js.Function1[/* status */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(url.asInstanceOf[js.Any], title.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def block(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("block")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * 자주 가는 사이트에서 해당 url을 삭제합니다.
    * @param url 삭제할 url
    */
  @JSGlobal("whale.topSites._delete")
  @js.native
  def delete: js.Function1[/* url */ String, Unit] = js.native
  
  inline def delete_=(x: js.Function1[/* url */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_delete")(x.asInstanceOf[js.Any])
  
  inline def get(callback: js.Function1[/* data */ js.Array[MostVisitedURL], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isBlocked(url: String, callback: js.Function1[/* status */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("isBlocked")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def search(term: String, count: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def search(term: String, count: Double, callback: js.Function1[/* result */ js.Array[MostVisitedURL2], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(term.asInstanceOf[js.Any], count.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def unblock(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unblock")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def update(urls: js.Array[MostVisitedURL2]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(urls.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
