package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveSnapshotHeadRequest extends StObject {
  
  /**
    * Required. The automatic resolution policy. All conflicts are resolved in chronological order, starting from the/ least recent. If the comparison metric is equal for the tentative
    * head and the conflict, the head wins.
    */
  var resolutionPolicy: js.UndefOr[String] = js.undefined
}
object ResolveSnapshotHeadRequest {
  
  @scala.inline
  def apply(): ResolveSnapshotHeadRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveSnapshotHeadRequest]
  }
  
  @scala.inline
  implicit class ResolveSnapshotHeadRequestMutableBuilder[Self <: ResolveSnapshotHeadRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResolutionPolicy(value: String): Self = StObject.set(x, "resolutionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionPolicyUndefined: Self = StObject.set(x, "resolutionPolicy", js.undefined)
  }
}
