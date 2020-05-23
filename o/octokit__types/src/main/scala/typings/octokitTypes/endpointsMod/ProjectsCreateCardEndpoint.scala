package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  column_id  :number,   note ? :string,   content_id ? :number,   content_type ? :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
trait ProjectsCreateCardEndpoint extends js.Object {
  var column_id: Double
  /**
    * The issue or pull request id you want to associate with this card. You can use the [List repository issues](https://developer.github.com/v3/issues/#list-repository-issues) and [List pull requests](https://developer.github.com/v3/pulls/#list-pull-requests) endpoints to find this id.
    * **Note:** Depending on whether you use the issue id or pull request id, you will need to specify `Issue` or `PullRequest` as the `content_type`.
    */
  var content_id: js.UndefOr[Double] = js.undefined
  /**
    * **Required if you provide `content_id`**. The type of content you want to associate with this card. Use `Issue` when `content_id` is an issue id and use `PullRequest` when `content_id` is a pull request id.
    */
  var content_type: js.UndefOr[String] = js.undefined
  var mediaType: `8`
  /**
    * The card's note content. Only valid for cards without another type of content, so you must omit when specifying `content_id` and `content_type`.
    */
  var note: js.UndefOr[String] = js.undefined
}

object ProjectsCreateCardEndpoint {
  @scala.inline
  def apply(
    column_id: Double,
    mediaType: `8`,
    content_id: js.UndefOr[Double] = js.undefined,
    content_type: String = null,
    note: String = null
  ): ProjectsCreateCardEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    if (!js.isUndefined(content_id)) __obj.updateDynamic("content_id")(content_id.get.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateCardEndpoint]
  }
}

