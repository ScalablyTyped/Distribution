package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreate_Options extends js.Object {
  var actions: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `actions[].description`: java.lang.String
  var `actions[].identifier`: java.lang.String
  var `actions[].label`: java.lang.String
  var completed_at: js.UndefOr[java.lang.String] = js.undefined
  var conclusion: js.UndefOr[java.lang.String] = js.undefined
  var details_url: js.UndefOr[java.lang.String] = js.undefined
  var external_id: js.UndefOr[java.lang.String] = js.undefined
  var head_sha: java.lang.String
  var name: java.lang.String
  var output: js.UndefOr[js.Object] = js.undefined
  var `output.annotations`: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `output.annotations[].annotation_level`: java.lang.String
  var `output.annotations[].end_column`: js.UndefOr[scala.Double] = js.undefined
  var `output.annotations[].end_line`: scala.Double
  var `output.annotations[].message`: java.lang.String
  var `output.annotations[].path`: java.lang.String
  var `output.annotations[].raw_details`: js.UndefOr[java.lang.String] = js.undefined
  var `output.annotations[].start_column`: js.UndefOr[scala.Double] = js.undefined
  var `output.annotations[].start_line`: scala.Double
  var `output.annotations[].title`: js.UndefOr[java.lang.String] = js.undefined
  var `output.images`: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `output.images[].alt`: java.lang.String
  var `output.images[].caption`: js.UndefOr[java.lang.String] = js.undefined
  var `output.images[].image_url`: java.lang.String
  var `output.summary`: java.lang.String
  var `output.text`: js.UndefOr[java.lang.String] = js.undefined
  var `output.title`: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
  var started_at: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object ChecksCreate_Options {
  @scala.inline
  def apply(
    `actions[].description`: java.lang.String,
    `actions[].identifier`: java.lang.String,
    `actions[].label`: java.lang.String,
    head_sha: java.lang.String,
    name: java.lang.String,
    `output.annotations[].annotation_level`: java.lang.String,
    `output.annotations[].end_line`: scala.Double,
    `output.annotations[].message`: java.lang.String,
    `output.annotations[].path`: java.lang.String,
    `output.annotations[].start_line`: scala.Double,
    `output.images[].alt`: java.lang.String,
    `output.images[].image_url`: java.lang.String,
    `output.summary`: java.lang.String,
    `output.title`: java.lang.String,
    owner: java.lang.String,
    repo: java.lang.String,
    actions: js.Array[js.Object] = null,
    completed_at: java.lang.String = null,
    conclusion: java.lang.String = null,
    details_url: java.lang.String = null,
    external_id: java.lang.String = null,
    output: js.Object = null,
    `output.annotations`: js.Array[js.Object] = null,
    `output.annotations[].end_column`: scala.Int | scala.Double = null,
    `output.annotations[].raw_details`: java.lang.String = null,
    `output.annotations[].start_column`: scala.Int | scala.Double = null,
    `output.annotations[].title`: java.lang.String = null,
    `output.images`: js.Array[js.Object] = null,
    `output.images[].caption`: java.lang.String = null,
    `output.text`: java.lang.String = null,
    started_at: java.lang.String = null,
    status: java.lang.String = null
  ): ChecksCreate_Options = {
    val __obj = js.Dynamic.literal(head_sha = head_sha, name = name, owner = owner, repo = repo)
    __obj.updateDynamic("actions[].description")(`actions[].description`)
    __obj.updateDynamic("actions[].identifier")(`actions[].identifier`)
    __obj.updateDynamic("actions[].label")(`actions[].label`)
    __obj.updateDynamic("output.annotations[].annotation_level")(`output.annotations[].annotation_level`)
    __obj.updateDynamic("output.annotations[].end_line")(`output.annotations[].end_line`)
    __obj.updateDynamic("output.annotations[].message")(`output.annotations[].message`)
    __obj.updateDynamic("output.annotations[].path")(`output.annotations[].path`)
    __obj.updateDynamic("output.annotations[].start_line")(`output.annotations[].start_line`)
    __obj.updateDynamic("output.images[].alt")(`output.images[].alt`)
    __obj.updateDynamic("output.images[].image_url")(`output.images[].image_url`)
    __obj.updateDynamic("output.summary")(`output.summary`)
    __obj.updateDynamic("output.title")(`output.title`)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (completed_at != null) __obj.updateDynamic("completed_at")(completed_at)
    if (conclusion != null) __obj.updateDynamic("conclusion")(conclusion)
    if (details_url != null) __obj.updateDynamic("details_url")(details_url)
    if (external_id != null) __obj.updateDynamic("external_id")(external_id)
    if (output != null) __obj.updateDynamic("output")(output)
    if (`output.annotations` != null) __obj.updateDynamic("output.annotations")(`output.annotations`)
    if (`output.annotations[].end_column` != null) __obj.updateDynamic("output.annotations[].end_column")(`output.annotations[].end_column`.asInstanceOf[js.Any])
    if (`output.annotations[].raw_details` != null) __obj.updateDynamic("output.annotations[].raw_details")(`output.annotations[].raw_details`)
    if (`output.annotations[].start_column` != null) __obj.updateDynamic("output.annotations[].start_column")(`output.annotations[].start_column`.asInstanceOf[js.Any])
    if (`output.annotations[].title` != null) __obj.updateDynamic("output.annotations[].title")(`output.annotations[].title`)
    if (`output.images` != null) __obj.updateDynamic("output.images")(`output.images`)
    if (`output.images[].caption` != null) __obj.updateDynamic("output.images[].caption")(`output.images[].caption`)
    if (`output.text` != null) __obj.updateDynamic("output.text")(`output.text`)
    if (started_at != null) __obj.updateDynamic("started_at")(started_at)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ChecksCreate_Options]
  }
}

