package typings.nativeFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.urlMod.URL_
import typings.std.BodyInit
import typings.std.Headers
import typings.std.HeadersInit
import typings.std.Request
import typings.std.Response
import typings.std.ResponseInit
import typings.std.URL
import typings.undici.typesFetchMod.RequestInfo
import typings.undici.typesFetchMod.RequestInit
import typings.undici.typesFetchMod.ResponseRedirectStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Error
    extends StObject
       with Instantiable0[Response]
       with Instantiable1[/* body */ BodyInit, Response]
       with Instantiable2[
          (/* body */ BodyInit) | (/* body */ Null) | (/* body */ Unit), 
          /* init */ ResponseInit, 
          Response
        ] {
    
    def error(): Response = js.native
    
    def redirect(url: String): Response = js.native
    def redirect(url: String, status: Double): Response = js.native
    def redirect(url: URL): Response = js.native
    def redirect(url: URL, status: Double): Response = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: RequestInfo): js.Promise[typings.undici.typesFetchMod.Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[typings.undici.typesFetchMod.Response] = js.native
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[Headers]
       with Instantiable1[/* init */ HeadersInit, Headers]
  
  @js.native
  trait InstantiableRequest
    extends StObject
       with Instantiable1[/* input */ typings.std.RequestInfo, Request]
       with Instantiable2[/* input */ typings.std.RequestInfo, /* init */ typings.std.RequestInit, Request]
  
  @js.native
  trait TypeofResponse
    extends StObject
       with Instantiable0[typings.undici.mod.Response] {
    
    def error(): typings.undici.typesFetchMod.Response = js.native
    
    def json(data: Any): typings.undici.typesFetchMod.Response = js.native
    def json(data: Any, init: typings.undici.typesFetchMod.ResponseInit): typings.undici.typesFetchMod.Response = js.native
    
    def redirect(url: String, status: ResponseRedirectStatus): typings.undici.typesFetchMod.Response = js.native
    def redirect(url: URL_, status: ResponseRedirectStatus): typings.undici.typesFetchMod.Response = js.native
  }
}
