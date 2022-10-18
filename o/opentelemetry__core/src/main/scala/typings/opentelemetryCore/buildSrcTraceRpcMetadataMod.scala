package typings.opentelemetryCore

import typings.opentelemetryApi.buildSrcContextTypesMod.Context
import typings.opentelemetryApi.buildSrcTraceSpanMod.Span
import typings.opentelemetryCore.buildSrcTraceRpcMetadataMod.RPCType.HTTP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTraceRpcMetadataMod {
  
  @JSImport("@opentelemetry/core/build/src/trace/rpc-metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait RPCType extends StObject
  @JSImport("@opentelemetry/core/build/src/trace/rpc-metadata", "RPCType")
  @js.native
  object RPCType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RPCType & String] = js.native
    
    @js.native
    sealed trait HTTP
      extends StObject
         with RPCType
    /* "http" */ val HTTP: typings.opentelemetryCore.buildSrcTraceRpcMetadataMod.RPCType.HTTP & String = js.native
  }
  
  inline def deleteRPCMetadata(context: Context): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteRPCMetadata")(context.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  inline def getRPCMetadata(context: Context): js.UndefOr[RPCMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRPCMetadata")(context.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[RPCMetadata]]
  
  inline def setRPCMetadata(context: Context, meta: RPCMetadata): Context = (^.asInstanceOf[js.Dynamic].applyDynamic("setRPCMetadata")(context.asInstanceOf[js.Any], meta.asInstanceOf[js.Any])).asInstanceOf[Context]
  
  trait HTTPMetadata extends StObject {
    
    var route: js.UndefOr[String] = js.undefined
    
    var span: Span
    
    var `type`: HTTP
  }
  object HTTPMetadata {
    
    inline def apply(span: Span, `type`: HTTP): HTTPMetadata = {
      val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTTPMetadata]
    }
    
    extension [Self <: HTTPMetadata](x: Self) {
      
      inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
      
      inline def setSpan(value: Span): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setType(value: HTTP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RPCMetadata = HTTPMetadata
}
