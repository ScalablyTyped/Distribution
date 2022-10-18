package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Facebook extends StObject {
  
  var facebook: js.UndefOr[String] = js.undefined
  
  var instagram: js.UndefOr[String] = js.undefined
  
  var livejournal: js.UndefOr[String] = js.undefined
  
  var skype: js.UndefOr[String] = js.undefined
  
  var twitter: js.UndefOr[String] = js.undefined
}
object Facebook {
  
  inline def apply(): Facebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Facebook]
  }
  
  extension [Self <: Facebook](x: Self) {
    
    inline def setFacebook(value: String): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
    
    inline def setFacebookUndefined: Self = StObject.set(x, "facebook", js.undefined)
    
    inline def setInstagram(value: String): Self = StObject.set(x, "instagram", value.asInstanceOf[js.Any])
    
    inline def setInstagramUndefined: Self = StObject.set(x, "instagram", js.undefined)
    
    inline def setLivejournal(value: String): Self = StObject.set(x, "livejournal", value.asInstanceOf[js.Any])
    
    inline def setLivejournalUndefined: Self = StObject.set(x, "livejournal", js.undefined)
    
    inline def setSkype(value: String): Self = StObject.set(x, "skype", value.asInstanceOf[js.Any])
    
    inline def setSkypeUndefined: Self = StObject.set(x, "skype", js.undefined)
    
    inline def setTwitter(value: String): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
    
    inline def setTwitterUndefined: Self = StObject.set(x, "twitter", js.undefined)
  }
}
