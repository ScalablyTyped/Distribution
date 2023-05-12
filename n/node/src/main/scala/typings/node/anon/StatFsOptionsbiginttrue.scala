package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined node.node:fs.StatFsOptions & {  bigint :true} */
trait StatFsOptionsbiginttrue extends StObject {
  
  var bigint: js.UndefOr[Boolean] = js.undefined
}
object StatFsOptionsbiginttrue {
  
  inline def apply(): StatFsOptionsbiginttrue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatFsOptionsbiginttrue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatFsOptionsbiginttrue] (val x: Self) extends AnyVal {
    
    inline def setBigint(value: Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
  }
}
