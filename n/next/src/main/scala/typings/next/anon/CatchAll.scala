package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatchAll extends StObject {
  
  var catchAll: js.UndefOr[Boolean] = js.undefined
}
object CatchAll {
  
  inline def apply(): CatchAll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatchAll]
  }
  
  extension [Self <: CatchAll](x: Self) {
    
    inline def setCatchAll(value: Boolean): Self = StObject.set(x, "catchAll", value.asInstanceOf[js.Any])
    
    inline def setCatchAllUndefined: Self = StObject.set(x, "catchAll", js.undefined)
  }
}
