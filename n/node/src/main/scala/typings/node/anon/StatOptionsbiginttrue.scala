package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.node:fs.StatOptions & {  bigint :true} */
trait StatOptionsbiginttrue extends StObject {
  
  var bigint: js.UndefOr[Boolean] & true
}
object StatOptionsbiginttrue {
  
  inline def apply(bigint: js.UndefOr[Boolean] & true): StatOptionsbiginttrue = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatOptionsbiginttrue]
  }
  
  extension [Self <: StatOptionsbiginttrue](x: Self) {
    
    inline def setBigint(value: js.UndefOr[Boolean] & true): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
  }
}
