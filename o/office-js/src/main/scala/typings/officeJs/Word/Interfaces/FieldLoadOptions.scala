package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a field.
  *
  * @remarks
  * [Api set: WordApi 1.4]
  */
trait FieldLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the field's code instruction.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    *
    * Note: The ability to set the code was introduced in WordApi 1.5.
    */
  var code: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies data in an "Addin" field. If the field isn't an "Addin" field, it is null and it will throw a general exception when code attempts to set it.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var data: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the field's kind.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var kind: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the field is locked. `true` if the field is locked, `false` otherwise.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var locked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the parent body of the field.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.undefined
  
  /**
    * Gets the content control that contains the field. Throws an `ItemNotFound` error if there isn't a parent content control.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.undefined
  
  /**
    * Gets the content control that contains the field. If there isn't a parent content control, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.undefined
  
  /**
    * Gets the table that contains the field. Throws an `ItemNotFound` error if it is not contained in a table.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  
  /**
    * Gets the table cell that contains the field. Throws an `ItemNotFound` error if it is not contained in a table cell.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.undefined
  
  /**
    * Gets the table cell that contains the field. If it is not contained in a table cell, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.undefined
  
  /**
    * Gets the table that contains the field. If it is not contained in a table, then this method will return an object with its `isNullObject` property set to `true`. For further information, see {@link https://docs.microsoft.com/office/dev/add-ins/develop/application-specific-api-model#ornullobject-methods-and-properties | *OrNullObject methods and properties}.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.undefined
  
  /**
    * Gets the field's result data.
    *
    * @remarks
    * [Api set: WordApi 1.4]
    */
  var result: js.UndefOr[RangeLoadOptions] = js.undefined
  
  /**
    * Gets the field's type.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}
object FieldLoadOptions {
  
  inline def apply(): FieldLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setKind(value: Boolean): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setParentBody(value: BodyLoadOptions): Self = StObject.set(x, "parentBody", value.asInstanceOf[js.Any])
    
    inline def setParentBodyUndefined: Self = StObject.set(x, "parentBody", js.undefined)
    
    inline def setParentContentControl(value: ContentControlLoadOptions): Self = StObject.set(x, "parentContentControl", value.asInstanceOf[js.Any])
    
    inline def setParentContentControlOrNullObject(value: ContentControlLoadOptions): Self = StObject.set(x, "parentContentControlOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setParentContentControlOrNullObjectUndefined: Self = StObject.set(x, "parentContentControlOrNullObject", js.undefined)
    
    inline def setParentContentControlUndefined: Self = StObject.set(x, "parentContentControl", js.undefined)
    
    inline def setParentTable(value: TableLoadOptions): Self = StObject.set(x, "parentTable", value.asInstanceOf[js.Any])
    
    inline def setParentTableCell(value: TableCellLoadOptions): Self = StObject.set(x, "parentTableCell", value.asInstanceOf[js.Any])
    
    inline def setParentTableCellOrNullObject(value: TableCellLoadOptions): Self = StObject.set(x, "parentTableCellOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setParentTableCellOrNullObjectUndefined: Self = StObject.set(x, "parentTableCellOrNullObject", js.undefined)
    
    inline def setParentTableCellUndefined: Self = StObject.set(x, "parentTableCell", js.undefined)
    
    inline def setParentTableOrNullObject(value: TableLoadOptions): Self = StObject.set(x, "parentTableOrNullObject", value.asInstanceOf[js.Any])
    
    inline def setParentTableOrNullObjectUndefined: Self = StObject.set(x, "parentTableOrNullObject", js.undefined)
    
    inline def setParentTableUndefined: Self = StObject.set(x, "parentTable", js.undefined)
    
    inline def setResult(value: RangeLoadOptions): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
