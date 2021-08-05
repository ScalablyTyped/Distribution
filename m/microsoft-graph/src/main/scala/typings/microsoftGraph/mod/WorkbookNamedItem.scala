package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookNamedItem
  extends StObject
     with Entity {
  
  // Represents the comment associated with this name.
  var comment: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The name of the object. Read-only.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates whether the name is scoped to the workbook or to a specific worksheet. Read-only.
  var scope: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates what type of reference is associated with the name. The possible values are: String, Integer, Double,
    * Boolean, Range. Read-only.
    */
  var `type`: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Represents the formula that the name is defined to refer to. E.g. =Sheet14!$B$2:$H$12, =4.75, etc. Read-only.
  var value: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // Specifies whether the object is visible or not.
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the worksheet on which the named item is scoped to. Available only if the item is scoped to the worksheet.
    * Read-only.
    */
  var worksheet: js.UndefOr[NullableOption[WorkbookWorksheet]] = js.undefined
}
object WorkbookNamedItem {
  
  inline def apply(): WorkbookNamedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookNamedItem]
  }
  
  extension [Self <: WorkbookNamedItem](x: Self) {
    
    inline def setComment(value: NullableOption[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setType(value: NullableOption[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: NullableOption[js.Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWorksheet(value: NullableOption[WorkbookWorksheet]): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    inline def setWorksheetNull: Self = StObject.set(x, "worksheet", null)
    
    inline def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}
