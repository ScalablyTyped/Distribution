package typings.officeUiFabricReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ k in keyof std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/DetailsList/DetailsRow.types.IDetailsRowStyles, 'isMultiline' | 'isRowHeader' | 'cell' | 'cellAnimation' | 'cellPadded' | 'cellUnpadded' | 'fields'> ]: string} */
@js.native
trait kinkeyofPickIDetailsRowSt extends StObject {
  
  var cell: String = js.native
  
  var cellAnimation: String = js.native
  
  var cellPadded: String = js.native
  
  var cellUnpadded: String = js.native
  
  var fields: String = js.native
  
  var isMultiline: String = js.native
  
  var isRowHeader: String = js.native
}
object kinkeyofPickIDetailsRowSt {
  
  @scala.inline
  def apply(
    cell: String,
    cellAnimation: String,
    cellPadded: String,
    cellUnpadded: String,
    fields: String,
    isMultiline: String,
    isRowHeader: String
  ): kinkeyofPickIDetailsRowSt = {
    val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], cellAnimation = cellAnimation.asInstanceOf[js.Any], cellPadded = cellPadded.asInstanceOf[js.Any], cellUnpadded = cellUnpadded.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], isMultiline = isMultiline.asInstanceOf[js.Any], isRowHeader = isRowHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[kinkeyofPickIDetailsRowSt]
  }
  
  @scala.inline
  implicit class kinkeyofPickIDetailsRowStMutableBuilder[Self <: kinkeyofPickIDetailsRowSt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCell(value: String): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellAnimation(value: String): Self = StObject.set(x, "cellAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellPadded(value: String): Self = StObject.set(x, "cellPadded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellUnpadded(value: String): Self = StObject.set(x, "cellUnpadded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMultiline(value: String): Self = StObject.set(x, "isMultiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRowHeader(value: String): Self = StObject.set(x, "isRowHeader", value.asInstanceOf[js.Any])
  }
}
