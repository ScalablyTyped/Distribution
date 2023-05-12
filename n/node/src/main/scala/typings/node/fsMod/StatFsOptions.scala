package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatFsOptions extends StObject {
  
  var bigint: js.UndefOr[Boolean] = js.undefined
}
object StatFsOptions {
  
  inline def apply(): StatFsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatFsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatFsOptions] (val x: Self) extends AnyVal {
    
    inline def setBigint(value: Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
  }
}
