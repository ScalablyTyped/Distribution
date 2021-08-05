package typings.meteorTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Multi extends StObject {
  
  var multi: js.UndefOr[Boolean] = js.undefined
  
  var upsert: js.UndefOr[Boolean] = js.undefined
}
object Multi {
  
  inline def apply(): Multi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Multi]
  }
  
  extension [Self <: Multi](x: Self) {
    
    inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
    
    inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
    
    inline def setUpsert(value: Boolean): Self = StObject.set(x, "upsert", value.asInstanceOf[js.Any])
    
    inline def setUpsertUndefined: Self = StObject.set(x, "upsert", js.undefined)
  }
}
