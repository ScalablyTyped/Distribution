package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIndexesOptions
  extends StObject
     with CommandOperationOptions {
  
  /** The batchSize for the returned command cursor or if pre 2.8 the systems batch collection */
  var batchSize: js.UndefOr[scala.Double] = js.undefined
}
object ListIndexesOptions {
  
  inline def apply(): ListIndexesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndexesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListIndexesOptions] (val x: Self) extends AnyVal {
    
    inline def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
  }
}
