package typings.postmanCollection.mod

import typings.node.Buffer
import typings.postmanCollection.anon.Body
import typings.postmanCollection.anon.Code
import typings.postmanCollection.anon.Format
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.PropertyDefinition because Already inherited
- typings.postmanCollection.mod.ResponseDefinition because var conflicts: description, disabled, id, name. Inlined code, header, cookie, body, stream, responseTime, originalRequest */ @JSImport("postman-collection", "Response")
@js.native
class Response protected () extends Property[ResponseDefinition] {
  def this(options: ResponseDefinition) = this()
  var body: js.UndefOr[String] = js.native
  var code: Double = js.native
  var cookie: js.UndefOr[js.Array[CookieDefinition]] = js.native
  var cookies: CookieList = js.native
  var header: js.UndefOr[js.Array[HeaderDefinition]] = js.native
  var headers: HeaderList = js.native
  var originalRequest: js.UndefOr[Request | RequestDefinition] = js.native
  var responseSize: js.UndefOr[Double] = js.native
  var responseTime: Double = js.native
  var status: String = js.native
  var stream: js.UndefOr[Buffer | Uint8Array] = js.native
  def dataURI(): String = js.native
  def details(): js.UndefOr[Code] = js.native
  def encoding(): Format = js.native
  def json(): js.Any = js.native
  def json(reviver: js.Any): js.Any = js.native
  def json(reviver: js.Any, strict: Boolean): js.Any = js.native
  def reason(): String = js.native
  def size(): Double = js.native
  def text(): js.UndefOr[String] = js.native
  def update(options: ResponseDefinition): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "Response")
@js.native
object Response extends js.Object {
  def createFromNode(response: Body, cookies: js.Array[CookieDefinition]): Response = js.native
  def isResponse(obj: js.Any): Boolean = js.native
}

