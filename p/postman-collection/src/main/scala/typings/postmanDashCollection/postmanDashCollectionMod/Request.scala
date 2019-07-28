package typings.postmanDashCollection.postmanDashCollectionMod

import typings.postmanDashCollection.Anon_Enabled
import typings.postmanDashCollection.Anon_IgnoreCase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.postmanDashCollection.postmanDashCollectionMod.RequestDefinition because var conflicts: description, disabled, id, name. Inlined url, method, header, body, auth, proxy, certificate */ @JSImport("postman-collection", "Request")
@js.native
class Request protected () extends Property[RequestDefinition] {
  def this(options: String) = this()
  def this(options: RequestDefinition) = this()
  var auth: js.UndefOr[RequestAuth | RequestAuthDefinition] = js.native
  var body: js.UndefOr[RequestBody] = js.native
  var certificate: js.UndefOr[Certificate | CertificateDefinition] = js.native
  var header: js.UndefOr[HeaderDefinition] = js.native
  var headers: HeaderList = js.native
  var method: js.UndefOr[String] = js.native
  var proxy: js.UndefOr[ProxyConfig | ProxyConfigDefinition] = js.native
  var url: String | Url = js.native
  def addHeader(header: Header): Unit = js.native
  def addHeader(header: HeaderDefinition): Unit = js.native
  def addQueryParams(params: String): Unit = js.native
  def addQueryParams(params: js.Array[QueryParamDefinition]): Unit = js.native
  def authorizeUsing(): Unit = js.native
  def authorizeUsing(`type`: String): Unit = js.native
  def authorizeUsing(`type`: String, options: VariableList): Unit = js.native
  def authorizeUsing(`type`: Null, options: VariableList): Unit = js.native
  def authorizeUsing(`type`: RequestAuthDefinition): Unit = js.native
  def authorizeUsing(`type`: RequestAuthDefinition, options: VariableList): Unit = js.native
  def forEachHeader(callback: js.Function2[/* header */ Header, /* context */ this.type, Unit]): Unit = js.native
  def getHeaders(): js.Any = js.native
  def getHeaders(options: Anon_Enabled): js.Any = js.native
  def removeHeader(toRemove: String): Unit = js.native
  def removeHeader(toRemove: String, options: Anon_IgnoreCase): Unit = js.native
  def removeHeader(toRemove: Header): Unit = js.native
  def removeHeader(toRemove: Header, options: Anon_IgnoreCase): Unit = js.native
  def removeQueryParams(params: String): Unit = js.native
  def removeQueryParams(params: js.Array[QueryParamDefinition | String]): Unit = js.native
  def removeQueryParams(params: QueryParamDefinition): Unit = js.native
  def update(options: RequestDefinition): Unit = js.native
  def upsertHeader(header: HeaderDefinition): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "Request")
@js.native
object Request extends js.Object {
  def isRequest(obj: js.Any): Boolean = js.native
}

