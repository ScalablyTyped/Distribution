package typings.postmanCollection.mod

import typings.postmanCollection.anon.Enabled
import typings.postmanCollection.anon.IgnoreCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.PropertyDefinition because Already inherited
- typings.postmanCollection.mod.RequestDefinition because var conflicts: description, disabled, id, name. Inlined url, method, header, body, auth, proxy, certificate */ @JSImport("postman-collection", "Request")
@js.native
open class Request protected () extends Property[RequestDefinition] {
  def this(options: String) = this()
  def this(options: RequestDefinition) = this()
  
  def addHeader(header: Header): Unit = js.native
  def addHeader(header: HeaderDefinition): Unit = js.native
  
  def addQueryParams(params: String): Unit = js.native
  def addQueryParams(params: js.Array[QueryParamDefinition]): Unit = js.native
  
  var auth: js.UndefOr[RequestAuth | RequestAuthDefinition] = js.native
  
  def authorizeUsing(): Unit = js.native
  def authorizeUsing(`type`: String): Unit = js.native
  def authorizeUsing(`type`: String, options: VariableList): Unit = js.native
  def authorizeUsing(`type`: Null, options: VariableList): Unit = js.native
  def authorizeUsing(`type`: RequestAuthDefinition): Unit = js.native
  def authorizeUsing(`type`: RequestAuthDefinition, options: VariableList): Unit = js.native
  
  var body: js.UndefOr[RequestBody | RequestBodyDefinition] = js.native
  
  var certificate: js.UndefOr[Certificate | CertificateDefinition] = js.native
  
  def forEachHeader(callback: js.Function2[/* header */ Header, /* context */ this.type, Unit]): Unit = js.native
  
  def getHeaders(): Any = js.native
  def getHeaders(options: Enabled): Any = js.native
  
  var header: js.UndefOr[js.Array[HeaderDefinition]] = js.native
  
  var headers: HeaderList = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var proxy: js.UndefOr[ProxyConfig | ProxyConfigDefinition] = js.native
  
  def removeHeader(toRemove: String): Unit = js.native
  def removeHeader(toRemove: String, options: IgnoreCase): Unit = js.native
  def removeHeader(toRemove: Header): Unit = js.native
  def removeHeader(toRemove: Header, options: IgnoreCase): Unit = js.native
  
  def removeQueryParams(params: String): Unit = js.native
  def removeQueryParams(params: js.Array[QueryParamDefinition | String]): Unit = js.native
  def removeQueryParams(params: QueryParamDefinition): Unit = js.native
  
  def update(options: RequestDefinition): Unit = js.native
  
  def upsertHeader(header: HeaderDefinition): Unit = js.native
  
  var url: String | Url | UrlDefinition = js.native
}
/* static members */
object Request {
  
  @JSImport("postman-collection", "Request")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isRequest(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRequest")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
