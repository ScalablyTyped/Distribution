package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatOptions extends StObject {
  
  var bigint: js.UndefOr[Boolean] = js.undefined
}
object StatOptions {
  
  inline def apply(): StatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatOptions]
  }
  
  extension [Self <: StatOptions](x: Self) {
    
    inline def setBigint(value: Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
  }
}
