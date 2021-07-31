package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookRangeReference extends StObject {
  
  var address: js.UndefOr[NullableOption[String]] = js.undefined
}
object WorkbookRangeReference {
  
  @scala.inline
  def apply(): WorkbookRangeReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeReference]
  }
  
  @scala.inline
  implicit class WorkbookRangeReferenceMutableBuilder[Self <: WorkbookRangeReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: NullableOption[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressNull: Self = StObject.set(x, "address", null)
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
  }
}
