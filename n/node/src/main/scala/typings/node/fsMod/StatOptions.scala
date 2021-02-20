package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatOptions extends StObject {
  
  var bigint: Boolean = js.native
}
object StatOptions {
  
  @scala.inline
  def apply(bigint: Boolean): StatOptions = {
    val __obj = js.Dynamic.literal(bigint = bigint.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatOptions]
  }
  
  @scala.inline
  implicit class StatOptionsMutableBuilder[Self <: StatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBigint(value: Boolean): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
  }
}
