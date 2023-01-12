package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Multi extends StObject {
  
  /** True to modify all matching documents; false to only modify one of the matching documents (the default). */
  var multi: js.UndefOr[Boolean] = js.undefined
}
object Multi {
  
  inline def apply(): Multi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Multi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Multi] (val x: Self) extends AnyVal {
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
  }
}
