package typings.pino.mod.pino

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.pinoStdSerializers.anon.Req
import typings.pinoStdSerializers.anon.Res
import typings.pinoStdSerializers.mod.CustomErrorSerializer
import typings.pinoStdSerializers.mod.CustomRequestSerializer
import typings.pinoStdSerializers.mod.CustomResponseSerializer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stdSerializers {
  
  @JSImport("pino", "pino.stdSerializers")
  @js.native
  val ^ : js.Any = js.native
  
  inline def err(err: js.Error): typings.pinoStdSerializers.mod.SerializedError = ^.asInstanceOf[js.Dynamic].applyDynamic("err")(err.asInstanceOf[js.Any]).asInstanceOf[typings.pinoStdSerializers.mod.SerializedError]
  
  inline def mapHttpRequest(req: IncomingMessage): Req = ^.asInstanceOf[js.Dynamic].applyDynamic("mapHttpRequest")(req.asInstanceOf[js.Any]).asInstanceOf[Req]
  
  inline def mapHttpResponse(res: ServerResponse[IncomingMessage]): Res = ^.asInstanceOf[js.Dynamic].applyDynamic("mapHttpResponse")(res.asInstanceOf[js.Any]).asInstanceOf[Res]
  
  inline def req(req: IncomingMessage): typings.pinoStdSerializers.mod.SerializedRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("req")(req.asInstanceOf[js.Any]).asInstanceOf[typings.pinoStdSerializers.mod.SerializedRequest]
  
  inline def res(res: ServerResponse[IncomingMessage]): typings.pinoStdSerializers.mod.SerializedResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("res")(res.asInstanceOf[js.Any]).asInstanceOf[typings.pinoStdSerializers.mod.SerializedResponse]
  
  inline def wrapErrorSerializer(customSerializer: CustomErrorSerializer): js.Function1[/* err */ js.Error, Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapErrorSerializer")(customSerializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* err */ js.Error, Record[String, Any]]]
  
  inline def wrapRequestSerializer(customSerializer: CustomRequestSerializer): js.Function1[/* req */ IncomingMessage, Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapRequestSerializer")(customSerializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* req */ IncomingMessage, Record[String, Any]]]
  
  inline def wrapResponseSerializer(customSerializer: CustomResponseSerializer): js.Function1[/* res */ ServerResponse[IncomingMessage], Record[String, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapResponseSerializer")(customSerializer.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* res */ ServerResponse[IncomingMessage], Record[String, Any]]]
}
