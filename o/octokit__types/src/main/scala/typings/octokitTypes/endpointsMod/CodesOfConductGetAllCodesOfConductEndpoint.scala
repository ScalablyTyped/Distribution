package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'scarlet-witch'> */
@js.native
trait CodesOfConductGetAllCodesOfConductEndpoint extends js.Object {
  
  var mediaType: `3` = js.native
}
object CodesOfConductGetAllCodesOfConductEndpoint {
  
  @scala.inline
  def apply(mediaType: `3`): CodesOfConductGetAllCodesOfConductEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodesOfConductGetAllCodesOfConductEndpoint]
  }
  
  @scala.inline
  implicit class CodesOfConductGetAllCodesOfConductEndpointOps[Self <: CodesOfConductGetAllCodesOfConductEndpoint] (val x: Self) extends AnyVal {
    
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
    def setMediaType(value: `3`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
  }
}
