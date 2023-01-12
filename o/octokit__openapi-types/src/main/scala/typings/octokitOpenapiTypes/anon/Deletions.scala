package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deletions extends StObject {
  
  var additions: js.UndefOr[Double] = js.undefined
  
  var deletions: js.UndefOr[Double] = js.undefined
  
  var total: js.UndefOr[Double] = js.undefined
}
object Deletions {
  
  inline def apply(): Deletions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deletions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deletions] (val x: Self) extends AnyVal {
    
    inline def setAdditions(value: Double): Self = StObject.set(x, "additions", value.asInstanceOf[js.Any])
    
    inline def setAdditionsUndefined: Self = StObject.set(x, "additions", js.undefined)
    
    inline def setDeletions(value: Double): Self = StObject.set(x, "deletions", value.asInstanceOf[js.Any])
    
    inline def setDeletionsUndefined: Self = StObject.set(x, "deletions", js.undefined)
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
