package typings.postmanCollection.mod

import typings.postmanCollection.anon.ForcePort
import typings.postmanCollection.anon.IgnoredDisabled
import typings.postmanCollection.anon.Password
import typings.postmanCollection.anon.Unresolved
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.postmanCollection.mod.PropertyBaseDefinition because Already inherited
- typings.postmanCollection.mod.UrlDefinition because var conflicts: description. Inlined auth, hash, host, path, port, query, variable, protocol */ @JSImport("postman-collection", "Url")
@js.native
class Url protected () extends PropertyBase[UrlDefinition] {
  def this(options: String) = this()
  def this(options: UrlDefinition) = this()
  var auth: js.UndefOr[Password] = js.native
  var hash: js.UndefOr[String] = js.native
  var host: js.UndefOr[js.Array[String] | String] = js.native
  var path: js.UndefOr[js.Array[String] | String] = js.native
  var port: js.UndefOr[String] = js.native
  var protocol: js.UndefOr[String] = js.native
  var query: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | String] = js.native
  var variable: js.UndefOr[js.Array[VariableDefinition]] = js.native
  var variables: VariableList = js.native
  def addQueryParams(params: String): Unit = js.native
  def addQueryParams(params: js.Array[QueryParamDefinition]): Unit = js.native
  def getHost(): String = js.native
  def getOAuth1BaseUrl(): String = js.native
  def getPath(): String = js.native
  def getPath(options: Unresolved): String = js.native
  def getPathWithQuery(): String = js.native
  def getQueryString(): String = js.native
  def getQueryString(options: IgnoredDisabled): String = js.native
  def getRaw(): String = js.native
  def getRemote(): String = js.native
  def getRemote(options: ForcePort): String = js.native
  def removeQueryParams(params: String): Unit = js.native
  def removeQueryParams(params: js.Array[QueryParamDefinition | String]): Unit = js.native
  def removeQueryParams(params: QueryParamDefinition): Unit = js.native
  def toString(forceProtocol: Boolean): String = js.native
  def update(url: String): Unit = js.native
  def update(url: UrlDefinition): Unit = js.native
}

/* static members */
@JSImport("postman-collection", "Url")
@js.native
object Url extends js.Object {
  def isUrl(obj: js.Any): Boolean = js.native
  def parse(url: String): UrlDefinition = js.native
}

