package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecSource extends StObject {
  
  /** The game server config resource. Uses the form: `projects/{project}/locations/{location}/gameServerDeployments/{deployment_id}/configs/{config_id}`. */
  var gameServerConfigName: js.UndefOr[String] = js.undefined
  
  /** The name of the Agones leet config or Agones scaling config used to derive the Agones fleet or Agones autoscaler spec. */
  var name: js.UndefOr[String] = js.undefined
}
object SpecSource {
  
  @scala.inline
  def apply(): SpecSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecSource]
  }
  
  @scala.inline
  implicit class SpecSourceMutableBuilder[Self <: SpecSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServerConfigName(value: String): Self = StObject.set(x, "gameServerConfigName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerConfigNameUndefined: Self = StObject.set(x, "gameServerConfigName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
