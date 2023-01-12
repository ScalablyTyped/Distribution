package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detection extends StObject {
  
  /** The name of the binary associated with the memory hash signature detection. */
  var binary: js.UndefOr[String] = js.undefined
  
  /** The percentage of memory page hashes in the signature that were matched. */
  var percentPagesMatched: js.UndefOr[Double] = js.undefined
}
object Detection {
  
  inline def apply(): Detection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Detection] (val x: Self) extends AnyVal {
    
    inline def setBinary(value: String): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setPercentPagesMatched(value: Double): Self = StObject.set(x, "percentPagesMatched", value.asInstanceOf[js.Any])
    
    inline def setPercentPagesMatchedUndefined: Self = StObject.set(x, "percentPagesMatched", js.undefined)
  }
}
