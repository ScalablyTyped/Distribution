package typings.nginstackEngine

import typings.nginstackEngine.anon.Debug
import typings.nginstackEngine.libHttpMediaTypeMod.MediaType
import typings.nginstackEngine.libHttpStatusMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRouterRouteResultMod {
  
  inline def apply(opt_base: RouteResult): typings.nginstackEngine.libRouterRouteResultMod.^ = ^.asInstanceOf[js.Dynamic].apply(opt_base.asInstanceOf[js.Any]).asInstanceOf[typings.nginstackEngine.libRouterRouteResultMod.^]
  
  @JSImport("@nginstack/engine/lib/router/RouteResult", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with RouteResult {
    def this(opt_base: RouteResult) = this()
  }
  @JSImport("@nginstack/engine/lib/router/RouteResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/engine/lib/router/RouteResult", "MAX_BASE_CHAIN")
  @js.native
  def MAX_BASE_CHAIN: Double = js.native
  inline def MAX_BASE_CHAIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_BASE_CHAIN")(x.asInstanceOf[js.Any])
  
  inline def addTransform(
    transformer: js.Function2[/* arg0 */ RouteResult, /* arg1 */ typings.std.Request, RouteResult | js.Array[Any]]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTransform")(transformer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addTransformer(
    transformer: js.Function2[/* arg0 */ RouteResult, /* arg1 */ typings.std.Request, RouteResult | js.Array[Any]]
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTransformer")(transformer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeAllTransformers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllTransformers")().asInstanceOf[Unit]
  
  inline def removeAllTransforms(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAllTransforms")().asInstanceOf[Unit]
  
  inline def transform(result: RouteResult, request: typings.std.Request): RouteResult = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(result.asInstanceOf[js.Any], request.asInstanceOf[js.Any])).asInstanceOf[RouteResult]
  
  type Request = typings.nginstackEngine.libHttpRequestMod.^
  
  type Response = typings.nginstackEngine.libHttpResponseMod.^
  
  @js.native
  trait RouteResult extends StObject {
    
    /* private */ var allHeaders_ : Any = js.native
    
    def as(): RouteResult = js.native
    def as(contentType: MediaType): RouteResult = js.native
    
    /* private */ var base_ : Any = js.native
    
    var charset: String | Null = js.native
    
    /* private */ var charset_ : Any = js.native
    
    var content: Any = js.native
    
    var contentType: MediaType = js.native
    
    /* private */ var contentType_ : Any = js.native
    
    /* private */ var content_ : Any = js.native
    
    /* private */ var getInheritedProperty_ : Any = js.native
    
    var headers: Any = js.native
    
    /* private */ var headers_ : Any = js.native
    
    /* private */ var logger_ : Any = js.native
    
    def send(response: Response): Unit = js.native
    def send(response: Response, options: Debug): Unit = js.native
    
    var status: Status | Double = js.native
    
    /* private */ var status_ : Any = js.native
    
    def withCharset(): RouteResult = js.native
    def withCharset(charset: String): RouteResult = js.native
    
    def withContent(content: Any): RouteResult = js.native
    
    def withHeader(name: String, value: String): RouteResult = js.native
    
    def withHeaders(headers: Any): RouteResult = js.native
    
    def withStatus(status: Double | Status): RouteResult = js.native
  }
}
