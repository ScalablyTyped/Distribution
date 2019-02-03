package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- postmanDashCollectionLib.postmanDashCollectionMod.RequestDefinition because var conflicts: description, disabled, id, name. Inlined url, method, header, body, auth, proxy, certificate */ @JSImport("postman-collection", "Request")
@js.native
class Request protected () extends Property[RequestDefinition] {
  def this(options: java.lang.String) = this()
  def this(options: RequestDefinition) = this()
  var auth: js.UndefOr[RequestAuth | RequestAuthDefinition] = js.native
  var body: js.UndefOr[RequestBody] = js.native
  var certificate: js.UndefOr[Certificate | CertificateDefinition] = js.native
  var header: js.UndefOr[HeaderDefinition] = js.native
  var headers: HeaderList = js.native
  var method: java.lang.String | js.UndefOr[java.lang.String] = js.native
  var proxy: js.UndefOr[ProxyConfig | ProxyConfigDefinition] = js.native
  var url: java.lang.String | Url = js.native
  def addHeader(header: Header): scala.Unit = js.native
  def addHeader(header: HeaderDefinition): scala.Unit = js.native
  def addQueryParams(params: java.lang.String): scala.Unit = js.native
  def addQueryParams(params: js.Array[QueryParamDefinition]): scala.Unit = js.native
  def authorizeUsing(): scala.Unit = js.native
  def authorizeUsing(`type`: java.lang.String): scala.Unit = js.native
  def authorizeUsing(`type`: java.lang.String, options: VariableList): scala.Unit = js.native
  def authorizeUsing(`type`: RequestAuthDefinition): scala.Unit = js.native
  def authorizeUsing(`type`: RequestAuthDefinition, options: VariableList): scala.Unit = js.native
  def authorizeUsing(`type`: scala.Null, options: VariableList): scala.Unit = js.native
  def forEachHeader(callback: js.Function2[/* header */ Header, /* context */ this.type, scala.Unit]): scala.Unit = js.native
  def getHeaders(): js.Any = js.native
  def getHeaders(options: postmanDashCollectionLib.Anon_Enabled): js.Any = js.native
  def removeHeader(toRemove: java.lang.String): scala.Unit = js.native
  def removeHeader(toRemove: java.lang.String, options: postmanDashCollectionLib.Anon_IgnoreCase): scala.Unit = js.native
  def removeHeader(toRemove: Header): scala.Unit = js.native
  def removeHeader(toRemove: Header, options: postmanDashCollectionLib.Anon_IgnoreCase): scala.Unit = js.native
  def removeQueryParams(params: java.lang.String): scala.Unit = js.native
  def removeQueryParams(params: js.Array[QueryParamDefinition | java.lang.String]): scala.Unit = js.native
  def removeQueryParams(params: QueryParamDefinition): scala.Unit = js.native
  def update(options: RequestDefinition): scala.Unit = js.native
  def upsertHeader(header: HeaderDefinition): scala.Unit = js.native
}

/* static members */
@JSImport("postman-collection", "Request")
@js.native
object Request extends js.Object {
  def isRequest(obj: js.Any): scala.Boolean = js.native
}

