package typings.next

import typings.next.loadCustomRoutesMod.RouteType
import typings.next.routerMod.HistoryMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextStrings {
  
  @js.native
  sealed trait blocking extends StObject
  inline def blocking: blocking = "blocking".asInstanceOf[blocking]
  
  @js.native
  sealed trait development extends StObject
  inline def development: development = "development".asInstanceOf[development]
  
  @js.native
  sealed trait header
    extends StObject
       with RouteType
  inline def header: header = "header".asInstanceOf[header]
  
  @js.native
  sealed trait hybrid extends StObject
  inline def hybrid: hybrid = "hybrid".asInstanceOf[hybrid]
  
  @js.native
  sealed trait production extends StObject
  inline def production: production = "production".asInstanceOf[production]
  
  @js.native
  sealed trait pushState
    extends StObject
       with HistoryMethod
  inline def pushState: pushState = "pushState".asInstanceOf[pushState]
  
  @js.native
  sealed trait redirect
    extends StObject
       with RouteType
  inline def redirect: redirect = "redirect".asInstanceOf[redirect]
  
  @js.native
  sealed trait replaceState
    extends StObject
       with HistoryMethod
  inline def replaceState: replaceState = "replaceState".asInstanceOf[replaceState]
  
  @js.native
  sealed trait rewrite
    extends StObject
       with RouteType
  inline def rewrite: rewrite = "rewrite".asInstanceOf[rewrite]
  
  @js.native
  sealed trait static extends StObject
  inline def static: static = "static".asInstanceOf[static]
  
  @js.native
  sealed trait test extends StObject
  inline def test: test = "test".asInstanceOf[test]
}
