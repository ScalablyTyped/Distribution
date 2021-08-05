package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var `-1`: Double
  
  @JSName("+1")
  var Plussign1: Double
  
  var confused: Double
  
  var heart: Double
  
  var hooray: Double
  
  var laugh: Double
  
  var total_count: Double
  
  var url: String
}
object `1` {
  
  inline def apply(
    `-1`: Double,
    Plussign1: Double,
    confused: Double,
    heart: Double,
    hooray: Double,
    laugh: Double,
    total_count: Double,
    url: String
  ): `1` = {
    val __obj = js.Dynamic.literal(confused = confused.asInstanceOf[js.Any], heart = heart.asInstanceOf[js.Any], hooray = hooray.asInstanceOf[js.Any], laugh = laugh.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("-1")(`-1`.asInstanceOf[js.Any])
    __obj.updateDynamic("+1")(Plussign1.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def `set-1`(value: Double): Self = StObject.set(x, "-1", value.asInstanceOf[js.Any])
    
    inline def setConfused(value: Double): Self = StObject.set(x, "confused", value.asInstanceOf[js.Any])
    
    inline def setHeart(value: Double): Self = StObject.set(x, "heart", value.asInstanceOf[js.Any])
    
    inline def setHooray(value: Double): Self = StObject.set(x, "hooray", value.asInstanceOf[js.Any])
    
    inline def setLaugh(value: Double): Self = StObject.set(x, "laugh", value.asInstanceOf[js.Any])
    
    inline def setPlussign1(value: Double): Self = StObject.set(x, "+1", value.asInstanceOf[js.Any])
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
