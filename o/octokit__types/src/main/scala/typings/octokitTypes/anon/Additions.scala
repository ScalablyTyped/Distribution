package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Additions extends StObject {
  
  var additions: Double
  
  var deletions: Double
  
  var total: Double
}
object Additions {
  
  inline def apply(additions: Double, deletions: Double, total: Double): Additions = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Additions]
  }
  
  extension [Self <: Additions](x: Self) {
    
    inline def setAdditions(value: Double): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    inline def setDeletions(value: Double): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
