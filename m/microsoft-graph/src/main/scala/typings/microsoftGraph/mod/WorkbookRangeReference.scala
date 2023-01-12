package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookRangeReference extends StObject {
  
  var address: js.UndefOr[NullableOption[String]] = js.undefined
}
object WorkbookRangeReference {
  
  inline def apply(): WorkbookRangeReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookRangeReference] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: NullableOption[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
  }
}
