package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssuesUpdateLabelEndpoint extends js.Object {
  /**
    * The [hexadecimal color code](http://www.color-hex.com/) for the label, without the leading `#`.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * A short description of the label.
    */
  var description: js.UndefOr[String] = js.native
  var name: String = js.native
  /**
    * The new name of the label. Emoji can be added to label names, using either native emoji or colon-style markup. For example, typing `:strawberry:` will render the emoji ![:strawberry:](https://github.githubassets.com/images/icons/emoji/unicode/1f353.png ":strawberry:"). For a full list of available emoji and codes, see [emoji-cheat-sheet.com](http://emoji-cheat-sheet.com/).
    */
  var new_name: js.UndefOr[String] = js.native
  var owner: String = js.native
  var repo: String = js.native
}

object IssuesUpdateLabelEndpoint {
  @scala.inline
  def apply(name: String, owner: String, repo: String): IssuesUpdateLabelEndpoint = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuesUpdateLabelEndpoint]
  }
  @scala.inline
  implicit class IssuesUpdateLabelEndpointOps[Self <: IssuesUpdateLabelEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setNew_name(value: String): Self = this.set("new_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew_name: Self = this.set("new_name", js.undefined)
  }
  
}

