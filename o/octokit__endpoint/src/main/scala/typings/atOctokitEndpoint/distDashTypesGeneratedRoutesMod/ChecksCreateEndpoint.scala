package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksCreateEndpoint extends js.Object {
  var actions: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `actions[].description`: String
  var `actions[].identifier`: String
  var `actions[].label`: String
  var completed_at: js.UndefOr[String] = js.undefined
  var conclusion: js.UndefOr[String] = js.undefined
  var details_url: js.UndefOr[String] = js.undefined
  var external_id: js.UndefOr[String] = js.undefined
  var head_sha: String
  var name: String
  var output: js.UndefOr[js.Object] = js.undefined
  var `output.annotations`: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `output.annotations[].annotation_level`: String
  var `output.annotations[].end_column`: js.UndefOr[Double] = js.undefined
  var `output.annotations[].end_line`: Double
  var `output.annotations[].message`: String
  var `output.annotations[].path`: String
  var `output.annotations[].raw_details`: js.UndefOr[String] = js.undefined
  var `output.annotations[].start_column`: js.UndefOr[Double] = js.undefined
  var `output.annotations[].start_line`: Double
  var `output.annotations[].title`: js.UndefOr[String] = js.undefined
  var `output.images`: js.UndefOr[js.Array[js.Object]] = js.undefined
  var `output.images[].alt`: String
  var `output.images[].caption`: js.UndefOr[String] = js.undefined
  var `output.images[].image_url`: String
  var `output.summary`: String
  var `output.text`: js.UndefOr[String] = js.undefined
  var `output.title`: String
  var owner: String
  var repo: String
  var started_at: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
}

object ChecksCreateEndpoint {
  @scala.inline
  def apply(
    `actions[].description`: String,
    `actions[].identifier`: String,
    `actions[].label`: String,
    head_sha: String,
    name: String,
    `output.annotations[].annotation_level`: String,
    `output.annotations[].end_line`: Double,
    `output.annotations[].message`: String,
    `output.annotations[].path`: String,
    `output.annotations[].start_line`: Double,
    `output.images[].alt`: String,
    `output.images[].image_url`: String,
    `output.summary`: String,
    `output.title`: String,
    owner: String,
    repo: String,
    actions: js.Array[js.Object] = null,
    completed_at: String = null,
    conclusion: String = null,
    details_url: String = null,
    external_id: String = null,
    output: js.Object = null,
    `output.annotations`: js.Array[js.Object] = null,
    `output.annotations[].end_column`: Int | Double = null,
    `output.annotations[].raw_details`: String = null,
    `output.annotations[].start_column`: Int | Double = null,
    `output.annotations[].title`: String = null,
    `output.images`: js.Array[js.Object] = null,
    `output.images[].caption`: String = null,
    `output.text`: String = null,
    started_at: String = null,
    status: String = null
  ): ChecksCreateEndpoint = {
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
    __obj.asInstanceOf[ChecksCreateEndpoint]
  }
}

