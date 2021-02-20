package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceIosDetails extends StObject {
  
  /** Bundle identifier. */
  var bundleIdentifier: js.UndefOr[String] = js.native
  
  /** iTunes App ID. */
  var itunesAppId: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#instanceIosDetails`. */
  var kind: js.UndefOr[String] = js.native
  
  /** Indicates that this instance is the default for new installations on iPad devices. */
  var preferredForIpad: js.UndefOr[Boolean] = js.native
  
  /** Indicates that this instance is the default for new installations on iPhone devices. */
  var preferredForIphone: js.UndefOr[Boolean] = js.native
  
  /** Flag to indicate if this instance supports iPad. */
  var supportIpad: js.UndefOr[Boolean] = js.native
  
  /** Flag to indicate if this instance supports iPhone. */
  var supportIphone: js.UndefOr[Boolean] = js.native
}
object InstanceIosDetails {
  
  @scala.inline
  def apply(): InstanceIosDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIosDetails]
  }
  
  @scala.inline
  implicit class InstanceIosDetailsMutableBuilder[Self <: InstanceIosDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleIdentifier(value: String): Self = StObject.set(x, "bundleIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdentifierUndefined: Self = StObject.set(x, "bundleIdentifier", js.undefined)
    
    @scala.inline
    def setItunesAppId(value: String): Self = StObject.set(x, "itunesAppId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItunesAppIdUndefined: Self = StObject.set(x, "itunesAppId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPreferredForIpad(value: Boolean): Self = StObject.set(x, "preferredForIpad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredForIpadUndefined: Self = StObject.set(x, "preferredForIpad", js.undefined)
    
    @scala.inline
    def setPreferredForIphone(value: Boolean): Self = StObject.set(x, "preferredForIphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredForIphoneUndefined: Self = StObject.set(x, "preferredForIphone", js.undefined)
    
    @scala.inline
    def setSupportIpad(value: Boolean): Self = StObject.set(x, "supportIpad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportIpadUndefined: Self = StObject.set(x, "supportIpad", js.undefined)
    
    @scala.inline
    def setSupportIphone(value: Boolean): Self = StObject.set(x, "supportIphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportIphoneUndefined: Self = StObject.set(x, "supportIphone", js.undefined)
  }
}
