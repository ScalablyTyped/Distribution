package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Confused extends StObject {
  
  var `-1`: Double
  
  @JSName("+1")
  var Plussign1: Double
  
  var confused: Double
  
  var eyes: Double
  
  var heart: Double
  
  var hooray: Double
  
  var laugh: Double
  
  var rocket: Double
  
  var total_count: Double
  
  /** Format: uri */
  var url: String
}
object Confused {
  
  inline def apply(
    `-1`: Double,
    Plussign1: Double,
    confused: Double,
    eyes: Double,
    heart: Double,
    hooray: Double,
    laugh: Double,
    rocket: Double,
    total_count: Double,
    url: String
  ): Confused = {
    val __obj = js.Dynamic.literal(confused = confused.asInstanceOf[js.Any], eyes = eyes.asInstanceOf[js.Any], heart = heart.asInstanceOf[js.Any], hooray = hooray.asInstanceOf[js.Any], laugh = laugh.asInstanceOf[js.Any], rocket = rocket.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("-1")(`-1`.asInstanceOf[js.Any])
    __obj.updateDynamic("+1")(Plussign1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confused]
  }
  
  extension [Self <: Confused](x: Self) {
    
    inline def `set-1`(value: Double): Self = StObject.set(x, "-1", value.asInstanceOf[js.Any])
    
    inline def setConfused(value: Double): Self = StObject.set(x, "confused", value.asInstanceOf[js.Any])
    
    inline def setEyes(value: Double): Self = StObject.set(x, "eyes", value.asInstanceOf[js.Any])
    
    inline def setHeart(value: Double): Self = StObject.set(x, "heart", value.asInstanceOf[js.Any])
    
    inline def setHooray(value: Double): Self = StObject.set(x, "hooray", value.asInstanceOf[js.Any])
    
    inline def setLaugh(value: Double): Self = StObject.set(x, "laugh", value.asInstanceOf[js.Any])
    
    inline def setPlussign1(value: Double): Self = StObject.set(x, "+1", value.asInstanceOf[js.Any])
    
    inline def setRocket(value: Double): Self = StObject.set(x, "rocket", value.asInstanceOf[js.Any])
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
