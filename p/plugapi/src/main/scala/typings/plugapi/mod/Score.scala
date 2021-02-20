package typings.plugapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Score extends StObject {
  
  var grabs: Double = js.native
  
  var listeners: Double = js.native
  
  var negative: Double = js.native
  
  var positive: Double = js.native
  
  var skipped: Double = js.native
}
object Score {
  
  @scala.inline
  def apply(grabs: Double, listeners: Double, negative: Double, positive: Double, skipped: Double): Score = {
    val __obj = js.Dynamic.literal(grabs = grabs.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any])
    __obj.asInstanceOf[Score]
  }
  
  @scala.inline
  implicit class ScoreMutableBuilder[Self <: Score] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrabs(value: Double): Self = StObject.set(x, "grabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListeners(value: Double): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegative(value: Double): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositive(value: Double): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipped(value: Double): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
  }
}
