package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of SODA operation.count();
  */
trait SodaCountResult extends StObject {
  
  /** The number of documents matching the SodaOperation criteria. */
  var count: Double
}
object SodaCountResult {
  
  inline def apply(count: Double): SodaCountResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SodaCountResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SodaCountResult] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
