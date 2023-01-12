package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.node:fs.StatOptions & {  bigint :true} */
trait StatOptionsbiginttrue extends StObject {
  
  var bigint: js.UndefOr[Boolean] = js.undefined
}
object StatOptionsbiginttrue {
  
  inline def apply(): StatOptionsbiginttrue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatOptionsbiginttrue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatOptionsbiginttrue] (val x: Self) extends AnyVal {
    
    inline def setBigint(value: Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
  }
}
