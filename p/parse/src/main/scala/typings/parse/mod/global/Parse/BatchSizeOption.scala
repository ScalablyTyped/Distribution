package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchSizeOption extends StObject {
  
  var batchSize: js.UndefOr[Double] = js.undefined
}
object BatchSizeOption {
  
  inline def apply(): BatchSizeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchSizeOption]
  }
  
  extension [Self <: BatchSizeOption](x: Self) {
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
  }
}
