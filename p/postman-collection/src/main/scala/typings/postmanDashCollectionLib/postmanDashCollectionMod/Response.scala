package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- postmanDashCollectionLib.postmanDashCollectionMod.ResponseDefinition because var conflicts: description, disabled, id, name. Inlined code, header, cookie, body, stream, responseTime, originalRequest */ @JSImport("postman-collection", "Response")
@js.native
class Response protected () extends Property[ResponseDefinition] {
  def this(options: ResponseDefinition) = this()
  var body: js.UndefOr[java.lang.String] = js.native
  var code: scala.Double = js.native
  var cookie: js.UndefOr[js.Array[CookieDefinition]] = js.native
  var cookies: CookieList = js.native
  var header: js.UndefOr[js.Array[HeaderDefinition]] = js.native
  var headers: HeaderList = js.native
  var originalRequest: js.UndefOr[Request | RequestDefinition] = js.native
  var responseSize: js.UndefOr[scala.Double] = js.native
  var responseTime: scala.Double = js.native
  var status: java.lang.String = js.native
  var stream: js.UndefOr[nodeLib.Buffer | stdLib.Uint8Array] = js.native
  def dataURI(): java.lang.String = js.native
  def details(): js.UndefOr[postmanDashCollectionLib.Anon_Code] = js.native
  def encoding(): postmanDashCollectionLib.Anon_Format = js.native
  def json(): js.Any = js.native
  def json(reviver: js.Any): js.Any = js.native
  def json(reviver: js.Any, strict: scala.Boolean): js.Any = js.native
  def reason(): java.lang.String = js.native
  def size(): scala.Double = js.native
  def text(): js.UndefOr[java.lang.String] = js.native
  def update(options: ResponseDefinition): scala.Unit = js.native
}

@JSImport("postman-collection", "Response")
@js.native
object Response extends js.Object {
  def createFromNode(
    response: postmanDashCollectionLib.Anon_Body,
    cookies: js.Array[postmanDashCollectionLib.postmanDashCollectionMod.CookieDefinition]
  ): postmanDashCollectionLib.postmanDashCollectionMod.Response = js.native
  def isResponse(obj: js.Any): scala.Boolean = js.native
}

