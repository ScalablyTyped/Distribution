package typings.postmanCollection.mod

import typings.node.bufferMod.global.Buffer
import typings.postmanCollection.anon.Body
import typings.postmanCollection.anon.Code
import typings.postmanCollection.anon.Format
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.PropertyDefinition because Already inherited
- typings.postmanCollection.mod.ResponseDefinition because var conflicts: description, disabled, id, name. Inlined code, header, cookie, body, stream, responseTime, originalRequest */ @JSImport("postman-collection", "Response")
@js.native
open class Response protected () extends Property[ResponseDefinition] {
  def this(options: ResponseDefinition) = this()
  
  var body: js.UndefOr[String] = js.native
  
  var code: Double = js.native
  
  var cookie: js.UndefOr[js.Array[CookieDefinition]] = js.native
  
  var cookies: CookieList = js.native
  
  def dataURI(): String = js.native
  
  def details(): js.UndefOr[Code] = js.native
  
  def encoding(): Format = js.native
  
  var header: js.UndefOr[js.Array[HeaderDefinition]] = js.native
  
  var headers: HeaderList = js.native
  
  def json(): Any = js.native
  def json(reviver: Any): Any = js.native
  def json(reviver: Any, strict: Boolean): Any = js.native
  def json(reviver: Unit, strict: Boolean): Any = js.native
  
  var originalRequest: js.UndefOr[Request | RequestDefinition] = js.native
  
  def reason(): String = js.native
  
  var responseSize: js.UndefOr[Double] = js.native
  
  var responseTime: Double = js.native
  
  def size(): Double = js.native
  
  var status: String = js.native
  
  var stream: js.UndefOr[Buffer | js.typedarray.Uint8Array] = js.native
  
  def text(): js.UndefOr[String] = js.native
  
  def update(options: ResponseDefinition): Unit = js.native
}
/* static members */
object Response {
  
  @JSImport("postman-collection", "Response")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFromNode(response: Body, cookies: js.Array[CookieDefinition]): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromNode")(response.asInstanceOf[js.Any], cookies.asInstanceOf[js.Any])).asInstanceOf[Response]
  
  inline def isResponse(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isResponse")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
