package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.closed
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIssuesLegacyParams extends js.Object {
  /**
    * The search term.
    */
  var keyword: String
  var owner: String
  var repository: String
  /**
    * Indicates the state of the issues to return. Can be either `open` or `closed`.
    */
  var state: open | closed
}

object SearchIssuesLegacyParams {
  @scala.inline
  def apply(keyword: String, owner: String, repository: String, state: open | closed): SearchIssuesLegacyParams = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchIssuesLegacyParams]
  }
}

