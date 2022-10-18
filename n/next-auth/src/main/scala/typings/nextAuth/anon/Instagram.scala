package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instagram extends StObject {
  
  var facebook: js.UndefOr[Double] = js.undefined
  
  var instagram: js.UndefOr[Double] = js.undefined
  
  var livejournal: js.UndefOr[Double] = js.undefined
  
  var twitter: js.UndefOr[Double] = js.undefined
}
object Instagram {
  
  inline def apply(): Instagram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instagram]
  }
  
  extension [Self <: Instagram](x: Self) {
    
    inline def setFacebook(value: Double): Self = StObject.set(x, "facebook", value.asInstanceOf[js.Any])
    
    inline def setFacebookUndefined: Self = StObject.set(x, "facebook", js.undefined)
    
    inline def setInstagram(value: Double): Self = StObject.set(x, "instagram", value.asInstanceOf[js.Any])
    
    inline def setInstagramUndefined: Self = StObject.set(x, "instagram", js.undefined)
    
    inline def setLivejournal(value: Double): Self = StObject.set(x, "livejournal", value.asInstanceOf[js.Any])
    
    inline def setLivejournalUndefined: Self = StObject.set(x, "livejournal", js.undefined)
    
    inline def setTwitter(value: Double): Self = StObject.set(x, "twitter", value.asInstanceOf[js.Any])
    
    inline def setTwitterUndefined: Self = StObject.set(x, "twitter", js.undefined)
  }
}
