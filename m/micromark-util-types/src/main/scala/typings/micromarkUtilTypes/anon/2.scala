package typings.micromarkUtilTypes.anon

import typings.micromarkUtilTypes.mod.DocumentHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var `null`: js.UndefOr[DocumentHandle] = js.undefined
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setNull(value: DocumentHandle): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
    
    inline def setNullUndefined: Self = StObject.set(x, "null", js.undefined)
  }
}
