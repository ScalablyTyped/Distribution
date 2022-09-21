package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Advertising {
  
  trait AdvertisementBase extends StObject {
    
    var source: Any
  }
  object AdvertisementBase {
    
    inline def apply(source: Any): AdvertisementBase = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdvertisementBase]
    }
    
    extension [Self <: AdvertisementBase](x: Self) {
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait MidrollAdvertisement
    extends StObject
       with AdvertisementBase {
    
    var time: Double
    
    var timePercentage: Double
  }
  object MidrollAdvertisement {
    
    inline def apply(source: Any, time: Double, timePercentage: Double): MidrollAdvertisement = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timePercentage = timePercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[MidrollAdvertisement]
    }
    
    extension [Self <: MidrollAdvertisement](x: Self) {
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimePercentage(value: Double): Self = StObject.set(x, "timePercentage", value.asInstanceOf[js.Any])
    }
  }
  
  trait PrerollAdvertisement
    extends StObject
       with AdvertisementBase
  object PrerollAdvertisement {
    
    inline def apply(source: Any): PrerollAdvertisement = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrerollAdvertisement]
    }
  }
}
