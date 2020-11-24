package typings.next.pageLoaderMod

import typings.next.nextBooleans.`false`
import typings.next.routeLoaderMod.RouteLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageLoader extends js.Object {
  
  /**
    * @param {string} href the route href (file-system path)
    */
  def _isSsg(href: String): js.Promise[Boolean] = js.native
  
  var assetPrefix: js.Any = js.native
  
  var buildId: js.Any = js.native
  
  /**
    * @param {string} href the route href (file-system path)
    * @param {string} asPath the URL as shown in browser (virtual path); used for dynamic routes
    */
  def getDataHref(href: String, asPath: String, ssg: Boolean): String = js.native
  def getDataHref(href: String, asPath: String, ssg: Boolean, locale: String): String = js.native
  @JSName("getDataHref")
  def getDataHref_false(href: String, asPath: String, ssg: Boolean, locale: `false`): String = js.native
  
  def getPageList(): js.Any = js.native
  
  def loadPage(route: String): js.Promise[GoodPageCache] = js.native
  
  def prefetch(route: String): js.Promise[Unit] = js.native
  
  var promisedDevPagesManifest: js.Any = js.native
  
  var promisedSsgManifest: js.Any = js.native
  
  var routeLoader: RouteLoader = js.native
}
