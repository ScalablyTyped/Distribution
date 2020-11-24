package typings.next

import typings.next.loadCustomRoutesMod.RouteType
import typings.next.routerMod.HistoryMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextStrings {
  
  @scala.inline
  def blocking: blocking = "blocking".asInstanceOf[blocking]
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @scala.inline
  def development: development = "development".asInstanceOf[development]
  
  @scala.inline
  def drain: drain = "drain".asInstanceOf[drain]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  
  @scala.inline
  def header: header = "header".asInstanceOf[header]
  
  @scala.inline
  def hybrid: hybrid = "hybrid".asInstanceOf[hybrid]
  
  @scala.inline
  def pipe: pipe = "pipe".asInstanceOf[pipe]
  
  @scala.inline
  def production: production = "production".asInstanceOf[production]
  
  @scala.inline
  def pushState: pushState = "pushState".asInstanceOf[pushState]
  
  @scala.inline
  def redirect: redirect = "redirect".asInstanceOf[redirect]
  
  @scala.inline
  def replaceState: replaceState = "replaceState".asInstanceOf[replaceState]
  
  @scala.inline
  def rewrite: rewrite = "rewrite".asInstanceOf[rewrite]
  
  @scala.inline
  def static: static = "static".asInstanceOf[static]
  
  @scala.inline
  def test: test = "test".asInstanceOf[test]
  
  @scala.inline
  def unpipe: unpipe = "unpipe".asInstanceOf[unpipe]
  
  @js.native
  sealed trait blocking extends js.Object
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait development extends js.Object
  
  @js.native
  sealed trait drain extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait finish extends js.Object
  
  @js.native
  sealed trait header extends RouteType
  
  @js.native
  sealed trait hybrid extends js.Object
  
  @js.native
  sealed trait pipe extends js.Object
  
  @js.native
  sealed trait production extends js.Object
  
  @js.native
  sealed trait pushState extends HistoryMethod
  
  @js.native
  sealed trait redirect extends RouteType
  
  @js.native
  sealed trait replaceState extends HistoryMethod
  
  @js.native
  sealed trait rewrite extends RouteType
  
  @js.native
  sealed trait static extends js.Object
  
  @js.native
  sealed trait test extends js.Object
  
  @js.native
  sealed trait unpipe extends js.Object
}
