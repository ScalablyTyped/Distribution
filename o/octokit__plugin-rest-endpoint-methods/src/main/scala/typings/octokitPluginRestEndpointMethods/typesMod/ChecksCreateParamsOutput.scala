package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateParamsOutput extends js.Object {
  /**
    * Adds information from your analysis to specific lines of code. Annotations are visible on GitHub in the **Checks** and **Files changed** tab of the pull request. The Checks API limits the number of annotations to a maximum of 50 per API request. To create more than 50 annotations, you have to make multiple requests to the [Update a check run](https://developer.github.com/v3/checks/runs/#update-a-check-run) endpoint. Each time you update the check run, annotations are appended to the list of annotations that already exist for the check run. For details about how you can view annotations on GitHub, see "[About status checks](https://help.github.com/articles/about-status-checks#checks)". See the [`annotations` object](https://developer.github.com/v3/checks/runs/#annotations-object) description for details about how to use this parameter.
    */
  var annotations: js.UndefOr[js.Array[ChecksCreateParamsOutputAnnotations]] = js.undefined
  /**
    * Adds images to the output displayed in the GitHub pull request UI. See the [`images` object](https://developer.github.com/v3/checks/runs/#images-object) description for details.
    */
  var images: js.UndefOr[js.Array[ChecksCreateParamsOutputImages]] = js.undefined
  /**
    * The summary of the check run. This parameter supports Markdown.
    */
  var summary: String
  /**
    * The details of the check run. This parameter supports Markdown.
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    * The title of the check run.
    */
  var title: String
}

object ChecksCreateParamsOutput {
  @scala.inline
  def apply(
    summary: String,
    title: String,
    annotations: js.Array[ChecksCreateParamsOutputAnnotations] = null,
    images: js.Array[ChecksCreateParamsOutputImages] = null,
    text: String = null
  ): ChecksCreateParamsOutput = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (annotations != null) __obj.updateDynamic("annotations")(annotations.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateParamsOutput]
  }
}

