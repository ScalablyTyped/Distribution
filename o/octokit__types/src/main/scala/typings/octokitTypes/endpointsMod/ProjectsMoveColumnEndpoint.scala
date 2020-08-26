package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`10`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  column_id :number,   position :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait ProjectsMoveColumnEndpoint extends js.Object {
  var column_id: Double = js.native
  var mediaType: `10` = js.native
  /**
    * Can be one of `first`, `last`, or `after:<column_id>`, where `<column_id>` is the `id` value of a column in the same project.
    */
  var position: String = js.native
}

object ProjectsMoveColumnEndpoint {
  @scala.inline
  def apply(column_id: Double, mediaType: `10`, position: String): ProjectsMoveColumnEndpoint = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsMoveColumnEndpoint]
  }
  @scala.inline
  implicit class ProjectsMoveColumnEndpointOps[Self <: ProjectsMoveColumnEndpoint] (val x: Self) extends AnyVal {
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
    def setColumn_id(value: Double): Self = this.set("column_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: `10`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

