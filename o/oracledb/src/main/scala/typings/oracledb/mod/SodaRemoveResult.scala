package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of SODA operation.remove();
  */
trait SodaRemoveResult extends StObject {
  
  /** The number of documents matching the SodaOperation criteria. */
  var count: Double
}
object SodaRemoveResult {
  
  @scala.inline
  def apply(count: Double): SodaRemoveResult = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SodaRemoveResult]
  }
  
  @scala.inline
  implicit class SodaRemoveResultMutableBuilder[Self <: SodaRemoveResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
