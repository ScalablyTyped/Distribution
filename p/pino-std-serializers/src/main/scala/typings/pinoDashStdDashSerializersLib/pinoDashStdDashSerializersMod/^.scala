package typings
package pinoDashStdDashSerializersLib.pinoDashStdDashSerializersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino-std-serializers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def err(err: stdLib.Error): SerializedError = js.native
  def mapHttpRequest(req: nodeLib.httpMod.IncomingMessage): pinoDashStdDashSerializersLib.Anon_Req = js.native
  def mapHttpResponse(res: nodeLib.httpMod.ServerResponse): pinoDashStdDashSerializersLib.Anon_Res = js.native
  def req(req: nodeLib.httpMod.IncomingMessage): SerializedRequest = js.native
  def res(res: nodeLib.httpMod.ServerResponse): SerializedResponse = js.native
  def wrapErrorSerializer(customSerializer: CustomErrorSerializer): js.Function1[/* err */ stdLib.Error, stdLib.Record[java.lang.String, _]] = js.native
  def wrapRequestSerializer(customSerializer: CustomRequestSerializer): js.Function1[/* req */ nodeLib.httpMod.IncomingMessage, stdLib.Record[java.lang.String, _]] = js.native
  def wrapResponseSerializer(customSerializer: CustomResponseSerializer): js.Function1[/* res */ nodeLib.httpMod.ServerResponse, stdLib.Record[java.lang.String, _]] = js.native
}

