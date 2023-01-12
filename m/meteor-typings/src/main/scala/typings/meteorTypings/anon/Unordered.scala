package typings.meteorTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unordered extends StObject {
  
  var unordered: js.UndefOr[Boolean] = js.undefined
  
  var weak: js.UndefOr[Boolean] = js.undefined
}
object Unordered {
  
  inline def apply(): Unordered = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Unordered]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Unordered] (val x: Self) extends AnyVal {
    
    inline def setUnordered(value: Boolean): Self = StObject.set(x, "unordered", value.asInstanceOf[js.Any])
    
    inline def setUnorderedUndefined: Self = StObject.set(x, "unordered", js.undefined)
    
    inline def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    
    inline def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
  }
}
