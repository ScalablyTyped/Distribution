package typings.mendixmodelsdk.transportInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mendixmodelsdk.anon.AppType
  - typings.mendixmodelsdk.anon.Cause
*/
trait IEnvironmentStatus extends StObject
object IEnvironmentStatus {
  
  inline def AppType(
    disk: Double,
    endpoint: String,
    environmentId: String,
    instances: Double,
    memory: Double,
    name: String,
    profile: String,
    state: SuccessAppState,
    url: String
  ): typings.mendixmodelsdk.anon.AppType = {
    val __obj = js.Dynamic.literal(disk = disk.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], buildstatus = null)
    __obj.updateDynamic("type")("success")
    __obj.asInstanceOf[typings.mendixmodelsdk.anon.AppType]
  }
  
  inline def Cause(state: CannotFixAppState): typings.mendixmodelsdk.anon.Cause = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("fail")
    __obj.asInstanceOf[typings.mendixmodelsdk.anon.Cause]
  }
}
