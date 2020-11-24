package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcsObject extends js.Object {
  
  /** Required. Bucket of the Cloud Storage object. */
  var bucket: js.UndefOr[String] = js.native
  
  /** Required. Generation number of the Cloud Storage object. This is used to ensure that the ExecStep specified by this PatchJob does not change. */
  var generationNumber: js.UndefOr[String] = js.native
  
  /** Required. Name of the Cloud Storage object. */
  var `object`: js.UndefOr[String] = js.native
}
object GcsObject {
  
  @scala.inline
  def apply(): GcsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsObject]
  }
  
  @scala.inline
  implicit class GcsObjectOps[Self <: GcsObject] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setGenerationNumber(value: String): Self = this.set("generationNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerationNumber: Self = this.set("generationNumber", js.undefined)
    
    @scala.inline
    def setObject(value: String): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
  }
}
