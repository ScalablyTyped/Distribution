package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceWebDetails extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#instanceWebDetails`. */
  var kind: js.UndefOr[String] = js.native
  
  /** Launch URL for the game. */
  var launchUrl: js.UndefOr[String] = js.native
  
  /** Indicates that this instance is the default for new installations. */
  var preferred: js.UndefOr[Boolean] = js.native
}
object InstanceWebDetails {
  
  @scala.inline
  def apply(): InstanceWebDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceWebDetails]
  }
  
  @scala.inline
  implicit class InstanceWebDetailsMutableBuilder[Self <: InstanceWebDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLaunchUrl(value: String): Self = StObject.set(x, "launchUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchUrlUndefined: Self = StObject.set(x, "launchUrl", js.undefined)
    
    @scala.inline
    def setPreferred(value: Boolean): Self = StObject.set(x, "preferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredUndefined: Self = StObject.set(x, "preferred", js.undefined)
  }
}
