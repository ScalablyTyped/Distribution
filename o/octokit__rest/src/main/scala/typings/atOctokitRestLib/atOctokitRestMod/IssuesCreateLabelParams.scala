package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateLabelParams extends js.Object {
  /**
    * The [hexadecimal color code](http://www.color-hex.com/) for the label, without the leading `#`.
    */
  var color: java.lang.String
  /**
    * A short description of the label.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the label. Emoji can be added to label names, using either native emoji or colon-style markup. For example, typing `:strawberry:` will render the emoji ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png ":strawberry:"). For a full list of available emoji and codes, see [emoji-cheat-sheet.com](http://emoji-cheat-sheet.com/).
    */
  var name: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object IssuesCreateLabelParams {
  @scala.inline
  def apply(
    color: java.lang.String,
    name: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    description: java.lang.String = null
  ): IssuesCreateLabelParams = {
    val __obj = js.Dynamic.literal(color = color, name = name, owner = owner, repo = repo)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[IssuesCreateLabelParams]
  }
}

