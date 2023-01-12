package typings.node.cryptoMod

import typings.node.nodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratePrimeOptionsBigInt
  extends StObject
     with GeneratePrimeOptions {
  
  @JSName("bigint")
  var bigint_GeneratePrimeOptionsBigInt: `true`
}
object GeneratePrimeOptionsBigInt {
  
  inline def apply(): GeneratePrimeOptionsBigInt = {
    val __obj = js.Dynamic.literal(bigint = true)
    __obj.asInstanceOf[GeneratePrimeOptionsBigInt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeneratePrimeOptionsBigInt] (val x: Self) extends AnyVal {
    
    inline def setBigint(value: `true`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
  }
}
