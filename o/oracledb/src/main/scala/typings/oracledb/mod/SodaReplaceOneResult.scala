package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of SODA operation.replaceOne();
  */
trait SodaReplaceOneResult extends StObject {
  
  /** This attribute will be true if the document was successfully replaced, false otherwise. */
  var replaced: Boolean
}
object SodaReplaceOneResult {
  
  inline def apply(replaced: Boolean): SodaReplaceOneResult = {
    val __obj = js.Dynamic.literal(replaced = replaced.asInstanceOf[js.Any])
    __obj.asInstanceOf[SodaReplaceOneResult]
  }
  
  extension [Self <: SodaReplaceOneResult](x: Self) {
    
    inline def setReplaced(value: Boolean): Self = StObject.set(x, "replaced", value.asInstanceOf[js.Any])
  }
}
