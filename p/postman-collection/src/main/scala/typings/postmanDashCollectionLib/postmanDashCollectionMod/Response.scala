package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(postmanDashCollectionLib.postmanDashCollectionMod.ResponseDefinition because Would inherit conflicting mutable fields List(description, disabled, id, name))*/
@JSImport("postman-collection", "Response")
@js.native
class Response protected () extends Property[ResponseDefinition] {
  def this(options: ResponseDefinition) = this()
  var body: js.UndefOr[java.lang.String] = js.native
  var code: scala.Double = js.native
  var cookies: CookieList = js.native
  var headers: HeaderList = js.native
  var originalRequest: js.UndefOr[Request] = js.native
  var responseSize: js.UndefOr[scala.Double] = js.native
  var responseTime: scala.Double = js.native
  var status: java.lang.String = js.native
  var stream: js.UndefOr[nodeLib.Buffer | stdLib.Uint8Array] = js.native
  def dataURI(): java.lang.String = js.native
  def details(): js.UndefOr[postmanDashCollectionLib.Anon_NameCode] = js.native
  def encoding(): postmanDashCollectionLib.Anon_Source = js.native
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
    response: postmanDashCollectionLib.Anon_StatusCode,
    cookies: js.Array[postmanDashCollectionLib.postmanDashCollectionMod.CookieDefinition]
  ): postmanDashCollectionLib.postmanDashCollectionMod.Response = js.native
  def isResponse(obj: js.Any): scala.Boolean = js.native
}

