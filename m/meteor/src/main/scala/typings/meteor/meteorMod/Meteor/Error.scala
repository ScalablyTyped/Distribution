package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error
  extends StObject
     with typings.std.Error {
  
  var details: js.UndefOr[String] = js.undefined
  
  var error: String | Double
  
  var reason: js.UndefOr[String] = js.undefined
}
object Error {
  
  /** User **/
  /** Error **/
  @JSImport("meteor/meteor", "Meteor.Error")
  @js.native
  val ^ : ErrorStatic = js.native
  
  extension [Self <: Error](x: Self) {
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setError(value: String | Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
