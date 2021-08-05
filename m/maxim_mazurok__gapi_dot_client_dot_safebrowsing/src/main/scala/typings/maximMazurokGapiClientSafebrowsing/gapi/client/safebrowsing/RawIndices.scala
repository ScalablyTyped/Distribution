package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawIndices extends StObject {
  
  /** The indices to remove from a lexicographically-sorted local list. */
  var indices: js.UndefOr[js.Array[Double]] = js.undefined
}
object RawIndices {
  
  inline def apply(): RawIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RawIndices]
  }
  
  extension [Self <: RawIndices](x: Self) {
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value :_*))
  }
}
