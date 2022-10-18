package typings.next

import typings.next.distServerBaseHttpMod.BaseNextResponse
import typings.next.distServerSendPayloadMod.PayloadOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerSendPayloadRevalidateHeadersMod {
  
  @JSImport("next/dist/server/send-payload/revalidate-headers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setRevalidateHeaders(res: BaseNextResponse[Any], options: PayloadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRevalidateHeaders")(res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setRevalidateHeaders(res: ServerResponse[IncomingMessage], options: PayloadOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setRevalidateHeaders")(res.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
