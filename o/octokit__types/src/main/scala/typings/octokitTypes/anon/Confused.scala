package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Confused extends StObject {
  
  var `-1`: Double = js.native
  
  @JSName("+1")
  var Plussign1: Double = js.native
  
  var confused: Double = js.native
  
  var heart: Double = js.native
  
  var hooray: Double = js.native
  
  var laugh: Double = js.native
  
  var total_count: Double = js.native
  
  var url: String = js.native
}
object Confused {
  
  @scala.inline
  def apply(
    `-1`: Double,
    Plussign1: Double,
    confused: Double,
    heart: Double,
    hooray: Double,
    laugh: Double,
    total_count: Double,
    url: String
  ): Confused = {
    val __obj = js.Dynamic.literal(confused = confused.asInstanceOf[js.Any], heart = heart.asInstanceOf[js.Any], hooray = hooray.asInstanceOf[js.Any], laugh = laugh.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("-1")(`-1`.asInstanceOf[js.Any])
    __obj.updateDynamic("+1")(Plussign1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confused]
  }
  
  @scala.inline
  implicit class ConfusedMutableBuilder[Self <: Confused] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `set-1`(value: Double): Self = StObject.set(x, "-1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfused(value: Double): Self = StObject.set(x, "confused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeart(value: Double): Self = StObject.set(x, "heart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooray(value: Double): Self = StObject.set(x, "hooray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaugh(value: Double): Self = StObject.set(x, "laugh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlussign1(value: Double): Self = StObject.set(x, "+1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
