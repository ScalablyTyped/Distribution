package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  key :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'scarlet-witch'> */
@js.native
trait CodesOfConductGetConductCodeEndpoint extends js.Object {
  
  var key: String = js.native
  
  var mediaType: `3` = js.native
}
object CodesOfConductGetConductCodeEndpoint {
  
  @scala.inline
  def apply(key: String, mediaType: `3`): CodesOfConductGetConductCodeEndpoint = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodesOfConductGetConductCodeEndpoint]
  }
  
  @scala.inline
  implicit class CodesOfConductGetConductCodeEndpointOps[Self <: CodesOfConductGetConductCodeEndpoint] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `3`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
  }
}
