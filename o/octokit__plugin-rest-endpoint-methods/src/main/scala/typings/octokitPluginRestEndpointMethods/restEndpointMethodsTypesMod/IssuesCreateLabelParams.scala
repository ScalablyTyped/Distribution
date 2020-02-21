package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesCreateLabelParams extends js.Object {
  /**
    * The [hexadecimal color code](http://www.color-hex.com/) for the label, without the leading `#`.
    */
  var color: String
  /**
    * A short description of the label.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The name of the label. Emoji can be added to label names, using either native emoji or colon-style markup. For example, typing `:strawberry:` will render the emoji ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png ":strawberry:"). For a full list of available emoji and codes, see [emoji-cheat-sheet.com](http://emoji-cheat-sheet.com/).
    */
  var name: String
  var owner: String
  var repo: String
}

object IssuesCreateLabelParams {
  @scala.inline
  def apply(color: String, name: String, owner: String, repo: String, description: String = null): IssuesCreateLabelParams = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesCreateLabelParams]
  }
}

