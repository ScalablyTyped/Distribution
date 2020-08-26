package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GistsCreateEndpoint extends js.Object {
  /**
    * A descriptive name for this gist.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The filenames and content of each file in the gist. The keys in the `files` object represent the filename and have the type `string`.
    */
  var files: GistsCreateParamsFiles = js.native
  /**
    * When `true`, the gist will be public and available for anyone to see.
    */
  var public: js.UndefOr[Boolean] = js.native
}

object GistsCreateEndpoint {
  @scala.inline
  def apply(files: GistsCreateParamsFiles): GistsCreateEndpoint = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[GistsCreateEndpoint]
  }
  @scala.inline
  implicit class GistsCreateEndpointOps[Self <: GistsCreateEndpoint] (val x: Self) extends AnyVal {
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
    def setFiles(value: GistsCreateParamsFiles): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setPublic(value: Boolean): Self = this.set("public", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublic: Self = this.set("public", js.undefined)
  }
  
}

