package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clicks extends StObject {
  
  var Clicks: Double
  
  var Date: String
  
  var Unique: Double
}
object Clicks {
  
  @scala.inline
  def apply(Clicks: Double, Date: String, Unique: Double): Clicks = {
    val __obj = js.Dynamic.literal(Clicks = Clicks.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clicks]
  }
  
  @scala.inline
  implicit class ClicksMutableBuilder[Self <: Clicks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClicks(value: Double): Self = StObject.set(x, "Clicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: Double): Self = StObject.set(x, "Unique", value.asInstanceOf[js.Any])
  }
}
