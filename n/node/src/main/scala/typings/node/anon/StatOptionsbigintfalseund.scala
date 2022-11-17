package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.node:fs.StatOptions & {  bigint :false | undefined} */
trait StatOptionsbigintfalseund extends StObject {
  
  var bigint: js.UndefOr[Boolean] & js.UndefOr[false]
}
object StatOptionsbigintfalseund {
  
  inline def apply(bigint: js.UndefOr[Boolean] & js.UndefOr[false]): StatOptionsbigintfalseund = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatOptionsbigintfalseund]
  }
  
  extension [Self <: StatOptionsbigintfalseund](x: Self) {
    
    inline def setBigint(value: js.UndefOr[Boolean] & js.UndefOr[false]): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
  }
}
