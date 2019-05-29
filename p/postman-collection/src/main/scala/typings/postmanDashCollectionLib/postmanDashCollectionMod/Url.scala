package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- postmanDashCollectionLib.postmanDashCollectionMod.UrlDefinition because var conflicts: description. Inlined auth, hash, host, path, port, query, variable, protocol */ @JSImport("postman-collection", "Url")
@js.native
class Url protected () extends PropertyBase[UrlDefinition] {
  def this(options: java.lang.String) = this()
  def this(options: UrlDefinition) = this()
  var auth: js.UndefOr[postmanDashCollectionLib.Anon_Password] = js.native
  var hash: js.UndefOr[java.lang.String] = js.native
  var host: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.native
  var path: js.Array[java.lang.String] | java.lang.String = js.native
  var port: js.UndefOr[java.lang.String] = js.native
  var protocol: js.UndefOr[java.lang.String] = js.native
  var query: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | java.lang.String] = js.native
  var variable: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var variables: VariableList = js.native
  def addQueryParams(params: java.lang.String): scala.Unit = js.native
  def addQueryParams(params: js.Array[QueryParamDefinition]): scala.Unit = js.native
  def getHost(): java.lang.String = js.native
  def getOAuth1BaseUrl(): java.lang.String = js.native
  def getPath(): java.lang.String = js.native
  def getPath(options: postmanDashCollectionLib.Anon_Unresolved): java.lang.String = js.native
  def getPathWithQuery(): java.lang.String = js.native
  def getQueryString(): java.lang.String = js.native
  def getQueryString(options: postmanDashCollectionLib.Anon_EncodeIgnoredDisabled): java.lang.String = js.native
  def getRaw(): java.lang.String = js.native
  def getRemote(): java.lang.String = js.native
  def getRemote(options: postmanDashCollectionLib.Anon_ForcePort): java.lang.String = js.native
  def removeQueryParams(params: java.lang.String): scala.Unit = js.native
  def removeQueryParams(params: js.Array[QueryParamDefinition | java.lang.String]): scala.Unit = js.native
  def removeQueryParams(params: QueryParamDefinition): scala.Unit = js.native
  def toString(forceProtocol: scala.Boolean): java.lang.String = js.native
  def update(url: java.lang.String): scala.Unit = js.native
  def update(url: UrlDefinition): scala.Unit = js.native
}

/* static members */
@JSImport("postman-collection", "Url")
@js.native
object Url extends js.Object {
  def isUrl(obj: js.Any): scala.Boolean = js.native
  def parse(url: java.lang.String): postmanDashCollectionLib.postmanDashCollectionMod.UrlDefinition = js.native
}

