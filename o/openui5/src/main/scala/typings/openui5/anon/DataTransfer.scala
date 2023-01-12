package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTransfer extends StObject {
  
  /**
    * The `drop` event operation data.
    */
  var dataTransfer: js.UndefOr[typings.std.DataTransfer] = js.undefined
}
object DataTransfer {
  
  inline def apply(): DataTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataTransfer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataTransfer] (val x: Self) extends AnyVal {
    
    inline def setDataTransfer(value: typings.std.DataTransfer): Self = StObject.set(x, "dataTransfer", value.asInstanceOf[js.Any])
    
    inline def setDataTransferUndefined: Self = StObject.set(x, "dataTransfer", js.undefined)
  }
}
