package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelLocalization extends StObject {
  
  /** The localized strings for channel's description. */
  var description: js.UndefOr[String] = js.native
  
  /** The localized strings for channel's title. */
  var title: js.UndefOr[String] = js.native
}
object ChannelLocalization {
  
  @scala.inline
  def apply(): ChannelLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelLocalization]
  }
  
  @scala.inline
  implicit class ChannelLocalizationMutableBuilder[Self <: ChannelLocalization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
