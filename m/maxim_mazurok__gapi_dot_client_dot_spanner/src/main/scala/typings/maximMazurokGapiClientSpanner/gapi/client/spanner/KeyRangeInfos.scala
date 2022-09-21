package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyRangeInfos extends StObject {
  
  /** The list individual KeyRangeInfos. */
  var infos: js.UndefOr[js.Array[KeyRangeInfo]] = js.undefined
  
  /**
    * The total size of the list of all KeyRangeInfos. This may be larger than the number of repeated messages above. If that is the case, this number may be used to determine how many
    * are not being shown.
    */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object KeyRangeInfos {
  
  inline def apply(): KeyRangeInfos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRangeInfos]
  }
  
  extension [Self <: KeyRangeInfos](x: Self) {
    
    inline def setInfos(value: js.Array[KeyRangeInfo]): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
    
    inline def setInfosUndefined: Self = StObject.set(x, "infos", js.undefined)
    
    inline def setInfosVarargs(value: KeyRangeInfo*): Self = StObject.set(x, "infos", js.Array(value*))
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
