package typings.naverWhale.whale.omnibox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestResult extends js.Object {
  /** The text that is put into the URL bar, and that is sent to the extension when the user chooses this entry. */
  var content: String = js.native
  /**
    * Whether the suggest result can be deleted by the user.
    * @since Chrome 63.
    */
  var deletable: js.UndefOr[Boolean] = js.native
  /** The text that is displayed in the URL dropdown. Can contain XML-style markup for styling. The supported tags are 'url' (for a literal URL), 'match' (for highlighting text that matched what the user's query), and 'dim' (for dim helper text). The styles can be nested, eg. dimmed match. You must escape the five predefined entities to display them as text: stackoverflow.com/a/1091953/89484 */
  var description: String = js.native
}

object SuggestResult {
  @scala.inline
  def apply(content: String, description: String): SuggestResult = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuggestResult]
  }
  @scala.inline
  implicit class SuggestResultOps[Self <: SuggestResult] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletable(value: Boolean): Self = this.set("deletable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletable: Self = this.set("deletable", js.undefined)
  }
  
}

