package typings
package atOctokitRestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetTemplate extends js.Object {
  /**
    * The API also allows fetching the source of a single template.,* ,* Use the raw [media type](https://developer.github.com/v3/media/) to get the raw contents.,* ,*
    */
  @JSName("getTemplate")
  var getTemplate_Original: Anon_EndpointParamsGitignoreGetTemplateParams = js.native
  /**
    * List all templates available to pass as an option when [creating a repository](https://developer.github.com/v3/repos/#create).
    */
  @JSName("listTemplates")
  var listTemplates_Original: Anon_EndpointParamsEmptyParams = js.native
  /**
    * The API also allows fetching the source of a single template.,* ,* Use the raw [media type](https://developer.github.com/v3/media/) to get the raw contents.,* ,*
    */
  def getTemplate(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitignoreGetTemplateResponse]
  ] = js.native
  def getTemplate(params: atOctokitRestLib.atOctokitRestMod.GitignoreGetTemplateParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitignoreGetTemplateResponse]
  ] = js.native
  /**
    * List all templates available to pass as an option when [creating a repository](https://developer.github.com/v3/repos/#create).
    */
  def listTemplates(): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitignoreListTemplatesResponse]
  ] = js.native
  def listTemplates(params: atOctokitRestLib.atOctokitRestMod.EmptyParams): js.Promise[
    atOctokitRestLib.atOctokitRestMod.Response[atOctokitRestLib.atOctokitRestMod.GitignoreListTemplatesResponse]
  ] = js.native
}

