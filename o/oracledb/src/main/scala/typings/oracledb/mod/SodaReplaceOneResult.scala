package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of SODA operation.replaceOne();
  */
@js.native
trait SodaReplaceOneResult extends StObject {
  
  /** This attribute will be true if the document was successfully replaced, false otherwise. */
  var replaced: Boolean = js.native
}
object SodaReplaceOneResult {
  
  @scala.inline
  def apply(replaced: Boolean): SodaReplaceOneResult = {
    val __obj = js.Dynamic.literal(replaced = replaced.asInstanceOf[js.Any])
    __obj.asInstanceOf[SodaReplaceOneResult]
  }
  
  @scala.inline
  implicit class SodaReplaceOneResultMutableBuilder[Self <: SodaReplaceOneResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplaced(value: Boolean): Self = StObject.set(x, "replaced", value.asInstanceOf[js.Any])
  }
}
