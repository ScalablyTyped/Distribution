package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GcsDestination extends js.Object {
  
  /**
    * Required. The bucket used in 'output_uri_prefix' must exist and there must be no files under 'output_uri_prefix'. 'output_uri_prefix' must end with "/" and start with "gs://". One
    * 'output_uri_prefix' can only be used by one batch translation job at a time. Otherwise an INVALID_ARGUMENT (400) error is returned.
    */
  var outputUriPrefix: js.UndefOr[String] = js.native
}
object GcsDestination {
  
  @scala.inline
  def apply(): GcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsDestination]
  }
  
  @scala.inline
  implicit class GcsDestinationOps[Self <: GcsDestination] (val x: Self) extends AnyVal {
    
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
    def setOutputUriPrefix(value: String): Self = this.set("outputUriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputUriPrefix: Self = this.set("outputUriPrefix", js.undefined)
  }
}
