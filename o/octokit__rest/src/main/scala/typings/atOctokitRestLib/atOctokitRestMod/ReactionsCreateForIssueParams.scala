package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactionsCreateForIssueParams extends js.Object {
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the issue.
    */
  var content: atOctokitRestLib.atOctokitRestLibStrings.`+1` | atOctokitRestLib.atOctokitRestLibStrings.`-1` | atOctokitRestLib.atOctokitRestLibStrings.laugh | atOctokitRestLib.atOctokitRestLibStrings.confused | atOctokitRestLib.atOctokitRestLibStrings.heart | atOctokitRestLib.atOctokitRestLibStrings.hooray
  var number: scala.Double
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReactionsCreateForIssueParams {
  @scala.inline
  def apply(
    content: atOctokitRestLib.atOctokitRestLibStrings.`+1` | atOctokitRestLib.atOctokitRestLibStrings.`-1` | atOctokitRestLib.atOctokitRestLibStrings.laugh | atOctokitRestLib.atOctokitRestLibStrings.confused | atOctokitRestLib.atOctokitRestLibStrings.heart | atOctokitRestLib.atOctokitRestLibStrings.hooray,
    number: scala.Double,
    owner: java.lang.String,
    repo: java.lang.String
  ): ReactionsCreateForIssueParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], number = number, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReactionsCreateForIssueParams]
  }
}

