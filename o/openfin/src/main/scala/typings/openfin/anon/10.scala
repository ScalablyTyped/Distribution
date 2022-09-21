package typings.openfin.anon

import typings.openfin.downloadPreloadMod.DownloadPreloadOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var newVal: js.UndefOr[js.Array[DownloadPreloadOption]] = js.undefined
  
  var oldVal: js.UndefOr[js.Array[DownloadPreloadOption]] = js.undefined
}
object `10` {
  
  inline def apply(): `10` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setNewVal(value: js.Array[DownloadPreloadOption]): Self = StObject.set(x, "newVal", value.asInstanceOf[js.Any])
    
    inline def setNewValUndefined: Self = StObject.set(x, "newVal", js.undefined)
    
    inline def setNewValVarargs(value: DownloadPreloadOption*): Self = StObject.set(x, "newVal", js.Array(value*))
    
    inline def setOldVal(value: js.Array[DownloadPreloadOption]): Self = StObject.set(x, "oldVal", value.asInstanceOf[js.Any])
    
    inline def setOldValUndefined: Self = StObject.set(x, "oldVal", js.undefined)
    
    inline def setOldValVarargs(value: DownloadPreloadOption*): Self = StObject.set(x, "oldVal", js.Array(value*))
  }
}
