package typings.node.cryptoMod

import typings.node.nodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratePrimeOptionsArrayBuffer
  extends StObject
     with GeneratePrimeOptions {
  
  @JSName("bigint")
  var bigint_GeneratePrimeOptionsArrayBuffer: js.UndefOr[`false`] = js.undefined
}
object GeneratePrimeOptionsArrayBuffer {
  
  inline def apply(): GeneratePrimeOptionsArrayBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratePrimeOptionsArrayBuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneratePrimeOptionsArrayBuffer] (val x: Self) extends AnyVal {
    
    inline def setBigint(value: `false`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    
    inline def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
  }
}
