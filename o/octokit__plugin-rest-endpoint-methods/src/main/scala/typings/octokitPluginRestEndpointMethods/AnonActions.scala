package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActions extends js.Object {
  var actions: AnonType
  @JSName("actions[].description")
  var `actions[]Dotdescription`: AnonRequired
  @JSName("actions[].identifier")
  var `actions[]Dotidentifier`: AnonRequired
  @JSName("actions[].label")
  var `actions[]Dotlabel`: AnonRequired
  var completed_at: AnonType
  var conclusion: AnonEnum
  var details_url: AnonType
  var external_id: AnonType
  var head_sha: AnonRequired
  var name: AnonRequired
  var output: AnonType
  @JSName("output.annotations")
  var outputDotannotations: AnonType
  @JSName("output.annotations[].annotation_level")
  var `outputDotannotations[]Dotannotation_level`: AnonEnumRequired
  @JSName("output.annotations[].end_column")
  var `outputDotannotations[]Dotend_column`: AnonType
  @JSName("output.annotations[].end_line")
  var `outputDotannotations[]Dotend_line`: AnonRequired
  @JSName("output.annotations[].message")
  var `outputDotannotations[]Dotmessage`: AnonRequired
  @JSName("output.annotations[].path")
  var `outputDotannotations[]Dotpath`: AnonRequired
  @JSName("output.annotations[].raw_details")
  var `outputDotannotations[]Dotraw_details`: AnonType
  @JSName("output.annotations[].start_column")
  var `outputDotannotations[]Dotstart_column`: AnonType
  @JSName("output.annotations[].start_line")
  var `outputDotannotations[]Dotstart_line`: AnonRequired
  @JSName("output.annotations[].title")
  var `outputDotannotations[]Dottitle`: AnonType
  @JSName("output.images")
  var outputDotimages: AnonType
  @JSName("output.images[].alt")
  var `outputDotimages[]Dotalt`: AnonRequired
  @JSName("output.images[].caption")
  var `outputDotimages[]Dotcaption`: AnonType
  @JSName("output.images[].image_url")
  var `outputDotimages[]Dotimage_url`: AnonRequired
  @JSName("output.summary")
  var outputDotsummary: AnonRequired
  @JSName("output.text")
  var outputDottext: AnonType
  @JSName("output.title")
  var outputDottitle: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
  var started_at: AnonType
  var status: AnonEnum
}

object AnonActions {
  @scala.inline
  def apply(
    actions: AnonType,
    `actions[]Dotdescription`: AnonRequired,
    `actions[]Dotidentifier`: AnonRequired,
    `actions[]Dotlabel`: AnonRequired,
    completed_at: AnonType,
    conclusion: AnonEnum,
    details_url: AnonType,
    external_id: AnonType,
    head_sha: AnonRequired,
    name: AnonRequired,
    output: AnonType,
    outputDotannotations: AnonType,
    `outputDotannotations[]Dotannotation_level`: AnonEnumRequired,
    `outputDotannotations[]Dotend_column`: AnonType,
    `outputDotannotations[]Dotend_line`: AnonRequired,
    `outputDotannotations[]Dotmessage`: AnonRequired,
    `outputDotannotations[]Dotpath`: AnonRequired,
    `outputDotannotations[]Dotraw_details`: AnonType,
    `outputDotannotations[]Dotstart_column`: AnonType,
    `outputDotannotations[]Dotstart_line`: AnonRequired,
    `outputDotannotations[]Dottitle`: AnonType,
    outputDotimages: AnonType,
    `outputDotimages[]Dotalt`: AnonRequired,
    `outputDotimages[]Dotcaption`: AnonType,
    `outputDotimages[]Dotimage_url`: AnonRequired,
    outputDotsummary: AnonRequired,
    outputDottext: AnonType,
    outputDottitle: AnonRequired,
    owner: AnonRequired,
    repo: AnonRequired,
    started_at: AnonType,
    status: AnonEnum
  ): AnonActions = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], completed_at = completed_at.asInstanceOf[js.Any], conclusion = conclusion.asInstanceOf[js.Any], details_url = details_url.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], head_sha = head_sha.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], started_at = started_at.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("actions[].description")(`actions[]Dotdescription`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions[].identifier")(`actions[]Dotidentifier`.asInstanceOf[js.Any])
    __obj.updateDynamic("actions[].label")(`actions[]Dotlabel`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations")(outputDotannotations.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].annotation_level")(`outputDotannotations[]Dotannotation_level`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].end_column")(`outputDotannotations[]Dotend_column`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].end_line")(`outputDotannotations[]Dotend_line`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].message")(`outputDotannotations[]Dotmessage`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].path")(`outputDotannotations[]Dotpath`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].raw_details")(`outputDotannotations[]Dotraw_details`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].start_column")(`outputDotannotations[]Dotstart_column`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].start_line")(`outputDotannotations[]Dotstart_line`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.annotations[].title")(`outputDotannotations[]Dottitle`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.images")(outputDotimages.asInstanceOf[js.Any])
    __obj.updateDynamic("output.images[].alt")(`outputDotimages[]Dotalt`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.images[].caption")(`outputDotimages[]Dotcaption`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.images[].image_url")(`outputDotimages[]Dotimage_url`.asInstanceOf[js.Any])
    __obj.updateDynamic("output.summary")(outputDotsummary.asInstanceOf[js.Any])
    __obj.updateDynamic("output.text")(outputDottext.asInstanceOf[js.Any])
    __obj.updateDynamic("output.title")(outputDottitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActions]
  }
}

