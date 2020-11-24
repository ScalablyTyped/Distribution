package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpecSource extends js.Object {
  
  /** The game server config resource. Uses the form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment_id}/configs/{config_id}`. */
  var gameServerConfigName: js.UndefOr[String] = js.native
  
  /** The name of the Agones leet config or Agones scaling config used to derive the Agones fleet or Agones autoscaler spec. */
  var name: js.UndefOr[String] = js.native
}
object SpecSource {
  
  @scala.inline
  def apply(): SpecSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecSource]
  }
  
  @scala.inline
  implicit class SpecSourceOps[Self <: SpecSource] (val x: Self) extends AnyVal {
    
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
    def setGameServerConfigName(value: String): Self = this.set("gameServerConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGameServerConfigName: Self = this.set("gameServerConfigName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
