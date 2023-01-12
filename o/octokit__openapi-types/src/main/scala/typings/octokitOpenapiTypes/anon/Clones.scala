package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clones extends StObject {
  
  var clones: js.Array[Count]
  
  /** @example 173 */
  var count: Double
  
  /** @example 128 */
  var uniques: Double
}
object Clones {
  
  inline def apply(clones: js.Array[Count], count: Double, uniques: Double): Clones = {
    val __obj = js.Dynamic.literal(clones = clones.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clones]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Clones] (val x: Self) extends AnyVal {
    
    inline def setClones(value: js.Array[Count]): Self = StObject.set(x, "clones", value.asInstanceOf[js.Any])
    
    inline def setClonesVarargs(value: Count*): Self = StObject.set(x, "clones", js.Array(value*))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setUniques(value: Double): Self = StObject.set(x, "uniques", value.asInstanceOf[js.Any])
  }
}
