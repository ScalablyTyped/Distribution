package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksUpdateParamsOutput extends js.Object {
  /**
    * Adds information from your analysis to specific lines of code. Annotations are visible in GitHub's pull request UI. Annotations are visible in GitHub's pull request UI. The Checks API limits the number of annotations to a maximum of 50 per API request. To create more than 50 annotations, you have to make multiple requests to the [Update a check run](https://developer.github.com/v3/checks/runs/#update-a-check-run) endpoint. Each time you update the check run, annotations are appended to the list of annotations that already exist for the check run. For details about annotations in the UI, see "[About status checks](https://help.github.com/articles/about-status-checks#checks)". See the [`annotations` object](https://developer.github.com/v3/checks/runs/#annotations-object-1) description for details.
    */
  var annotations: js.UndefOr[js.Array[ChecksUpdateParamsOutputAnnotations]] = js.undefined
  /**
    * Adds images to the output displayed in the GitHub pull request UI. See the [`images` object](https://developer.github.com/v3/checks/runs/#annotations-object-1) description for details.
    */
  var images: js.UndefOr[js.Array[ChecksUpdateParamsOutputImages]] = js.undefined
  /**
    * Can contain Markdown.
    */
  var summary: String
  /**
    * Can contain Markdown.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * **Required**.
    */
  var title: js.UndefOr[String] = js.undefined
}

object ChecksUpdateParamsOutput {
  @scala.inline
  def apply(
    summary: String,
    annotations: js.Array[ChecksUpdateParamsOutputAnnotations] = null,
    images: js.Array[ChecksUpdateParamsOutputImages] = null,
    text: String = null,
    title: String = null
  ): ChecksUpdateParamsOutput = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateParamsOutput]
  }
}

