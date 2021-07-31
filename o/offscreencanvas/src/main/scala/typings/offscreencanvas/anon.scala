package typings.offscreencanvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Quality extends StObject {
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Quality {
    
    @scala.inline
    def apply(): Quality = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Quality]
    }
    
    @scala.inline
    implicit class QualityMutableBuilder[Self <: Quality] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
