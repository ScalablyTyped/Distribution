package typings.nodeGeocoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Confidence extends StObject {
    
    var confidence: js.UndefOr[Double] = js.undefined
    
    var googlePlaceId: js.UndefOr[String] = js.undefined
  }
  object Confidence {
    
    inline def apply(): Confidence = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Confidence]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Confidence] (val x: Self) extends AnyVal {
      
      inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
      
      inline def setGooglePlaceId(value: String): Self = StObject.set(x, "googlePlaceId", value.asInstanceOf[js.Any])
      
      inline def setGooglePlaceIdUndefined: Self = StObject.set(x, "googlePlaceId", js.undefined)
    }
  }
  
  trait Level1long extends StObject {
    
    var level1long: js.UndefOr[String] = js.undefined
    
    var level1short: js.UndefOr[String] = js.undefined
    
    var level2long: js.UndefOr[String] = js.undefined
    
    var level2short: js.UndefOr[String] = js.undefined
  }
  object Level1long {
    
    inline def apply(): Level1long = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Level1long]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Level1long] (val x: Self) extends AnyVal {
      
      inline def setLevel1long(value: String): Self = StObject.set(x, "level1long", value.asInstanceOf[js.Any])
      
      inline def setLevel1longUndefined: Self = StObject.set(x, "level1long", js.undefined)
      
      inline def setLevel1short(value: String): Self = StObject.set(x, "level1short", value.asInstanceOf[js.Any])
      
      inline def setLevel1shortUndefined: Self = StObject.set(x, "level1short", js.undefined)
      
      inline def setLevel2long(value: String): Self = StObject.set(x, "level2long", value.asInstanceOf[js.Any])
      
      inline def setLevel2longUndefined: Self = StObject.set(x, "level2long", js.undefined)
      
      inline def setLevel2short(value: String): Self = StObject.set(x, "level2short", value.asInstanceOf[js.Any])
      
      inline def setLevel2shortUndefined: Self = StObject.set(x, "level2short", js.undefined)
    }
  }
}
