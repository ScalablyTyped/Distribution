package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A dictionary of configuration options for the MusicKit instance.
  */
trait Configuration extends StObject {
  
  /**
    * The version of your app.
    */
  var app: js.UndefOr[AppConfiguration] = js.undefined
  
  /**
    * The playback bit rate of the music player.
    */
  var bitrate: js.UndefOr[PlaybackBitrate] = js.undefined
  
  /**
    * This property indicates whether you have explicitly enabled or disabled
    * declarative markup.
    */
  var declarativeMarkup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The developer token to identify yourself as a trusted developer and
    * member of the Apple Developer Program.
    */
  var developerToken: js.UndefOr[String] = js.undefined
  
  /**
    * The current storefront for this MusicKit configuration.
    */
  var storefrontId: js.UndefOr[String] = js.undefined
}
object Configuration {
  
  inline def apply(): Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
    
    inline def setApp(value: AppConfiguration): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setBitrate(value: PlaybackBitrate): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    inline def setDeclarativeMarkup(value: Boolean): Self = StObject.set(x, "declarativeMarkup", value.asInstanceOf[js.Any])
    
    inline def setDeclarativeMarkupUndefined: Self = StObject.set(x, "declarativeMarkup", js.undefined)
    
    inline def setDeveloperToken(value: String): Self = StObject.set(x, "developerToken", value.asInstanceOf[js.Any])
    
    inline def setDeveloperTokenUndefined: Self = StObject.set(x, "developerToken", js.undefined)
    
    inline def setStorefrontId(value: String): Self = StObject.set(x, "storefrontId", value.asInstanceOf[js.Any])
    
    inline def setStorefrontIdUndefined: Self = StObject.set(x, "storefrontId", js.undefined)
  }
}
