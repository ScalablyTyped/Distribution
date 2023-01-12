package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoppedColumns extends StObject {
  
  /**
    * popped-in columns.
    */
  var poppedColumns: js.UndefOr[js.Array[Any]] = js.undefined
}
object PoppedColumns {
  
  inline def apply(): PoppedColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoppedColumns]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PoppedColumns] (val x: Self) extends AnyVal {
    
    inline def setPoppedColumns(value: js.Array[Any]): Self = StObject.set(x, "poppedColumns", value.asInstanceOf[js.Any])
    
    inline def setPoppedColumnsUndefined: Self = StObject.set(x, "poppedColumns", js.undefined)
    
    inline def setPoppedColumnsVarargs(value: Any*): Self = StObject.set(x, "poppedColumns", js.Array(value*))
  }
}
