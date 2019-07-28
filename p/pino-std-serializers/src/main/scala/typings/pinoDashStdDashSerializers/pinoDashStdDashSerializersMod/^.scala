package typings.pinoDashStdDashSerializers.pinoDashStdDashSerializersMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.pinoDashStdDashSerializers.Anon_Req
import typings.pinoDashStdDashSerializers.Anon_Res
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino-std-serializers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def err(err: Error): SerializedError = js.native
  def mapHttpRequest(req: IncomingMessage): Anon_Req = js.native
  def mapHttpResponse(res: ServerResponse): Anon_Res = js.native
  def req(req: IncomingMessage): SerializedRequest = js.native
  def res(res: ServerResponse): SerializedResponse = js.native
  def wrapErrorSerializer(customSerializer: CustomErrorSerializer): js.Function1[/* err */ Error, Record[String, _]] = js.native
  def wrapRequestSerializer(customSerializer: CustomRequestSerializer): js.Function1[/* req */ IncomingMessage, Record[String, _]] = js.native
  def wrapResponseSerializer(customSerializer: CustomResponseSerializer): js.Function1[/* res */ ServerResponse, Record[String, _]] = js.native
}

