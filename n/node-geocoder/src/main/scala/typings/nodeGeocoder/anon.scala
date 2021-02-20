package typings.nodeGeocoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Confidence extends StObject {
    
    var confidence: js.UndefOr[Double] = js.native
    
    var googlePlaceId: js.UndefOr[String] = js.native
  }
  object Confidence {
    
    @scala.inline
    def apply(): Confidence = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Confidence]
    }
    
    @scala.inline
    implicit class ConfidenceMutableBuilder[Self <: Confidence] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
      
      @scala.inline
      def setGooglePlaceId(value: String): Self = StObject.set(x, "googlePlaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGooglePlaceIdUndefined: Self = StObject.set(x, "googlePlaceId", js.undefined)
    }
  }
  
  @js.native
  trait Level1long extends StObject {
    
    var level1long: js.UndefOr[String] = js.native
    
    var level1short: js.UndefOr[String] = js.native
    
    var level2long: js.UndefOr[String] = js.native
    
    var level2short: js.UndefOr[String] = js.native
  }
  object Level1long {
    
    @scala.inline
    def apply(): Level1long = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Level1long]
    }
    
    @scala.inline
    implicit class Level1longMutableBuilder[Self <: Level1long] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel1long(value: String): Self = StObject.set(x, "level1long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel1longUndefined: Self = StObject.set(x, "level1long", js.undefined)
      
      @scala.inline
      def setLevel1short(value: String): Self = StObject.set(x, "level1short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel1shortUndefined: Self = StObject.set(x, "level1short", js.undefined)
      
      @scala.inline
      def setLevel2long(value: String): Self = StObject.set(x, "level2long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel2longUndefined: Self = StObject.set(x, "level2long", js.undefined)
      
      @scala.inline
      def setLevel2short(value: String): Self = StObject.set(x, "level2short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel2shortUndefined: Self = StObject.set(x, "level2short", js.undefined)
    }
  }
}
