package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatOptions extends StObject {
  
  var bigint: Boolean
}
object StatOptions {
  
  inline def apply(bigint: Boolean): StatOptions = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatOptions]
  }
  
  extension [Self <: StatOptions](x: Self) {
    
    inline def setBigint(value: Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
  }
}
