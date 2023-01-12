package typings.postmark.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tracked extends StObject {
  
  var Date: String
  
  var Tracked: Double
}
object Tracked {
  
  inline def apply(Date: String, Tracked: Double): Tracked = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Tracked = Tracked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tracked] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setTracked(value: Double): Self = StObject.set(x, "Tracked", value.asInstanceOf[js.Any])
  }
}
