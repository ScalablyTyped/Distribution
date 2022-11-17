package typings.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratePrimeOptionsBigInt
  extends StObject
     with GeneratePrimeOptions {
  
  @JSName("bigint")
  var bigint_GeneratePrimeOptionsBigInt: true
}
object GeneratePrimeOptionsBigInt {
  
  inline def apply(): GeneratePrimeOptionsBigInt = {
    val __obj = js.Dynamic.literal(bigint = true)
    __obj.asInstanceOf[GeneratePrimeOptionsBigInt]
  }
  
  extension [Self <: GeneratePrimeOptionsBigInt](x: Self) {
    
    inline def setBigint(value: true): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
  }
}
