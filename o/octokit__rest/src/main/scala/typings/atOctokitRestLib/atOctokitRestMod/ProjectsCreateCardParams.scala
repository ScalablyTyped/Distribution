package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsCreateCardParams extends js.Object {
  var column_id: scala.Double
  /**
    * The issue or pull request id you want to associate with this card. You can use the [List issues for a repository](https://developer.github.com/v3/issues/#list-issues-for-a-repository) and [List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests) endpoints to find this id.
    * **Note:** Depending on whether you use the issue id or pull request id, you will need to specify `Issue` or `PullRequest` as the `content_type`.
    */
  var content_id: js.UndefOr[scala.Double] = js.undefined
  /**
    * **Required if you provide `content_id`**. The type of content you want to associate with this card. Use `Issue` when `content_id` is an issue id and use `PullRequest` when `content_id` is a pull request id.
    */
  var content_type: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The card's note content. Only valid for cards without another type of content, so you must omit when specifying `content_id` and `content_type`.
    */
  var note: js.UndefOr[java.lang.String] = js.undefined
}

object ProjectsCreateCardParams {
  @scala.inline
  def apply(
    column_id: scala.Double,
    content_id: scala.Int | scala.Double = null,
    content_type: java.lang.String = null,
    note: java.lang.String = null
  ): ProjectsCreateCardParams = {
    val __obj = js.Dynamic.literal(column_id = column_id)
    if (content_id != null) __obj.updateDynamic("content_id")(content_id.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type)
    if (note != null) __obj.updateDynamic("note")(note)
    __obj.asInstanceOf[ProjectsCreateCardParams]
  }
}

