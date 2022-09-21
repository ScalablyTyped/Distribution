package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of {@link Word.Field} objects.
  *
  * @remarks
  * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
  * @beta
  */
trait FieldCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the field's code instruction. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var code: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the parent body of the field.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var parentBody: js.UndefOr[BodyLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the content control that contains the field. Throws an error if there isn't a parent content control.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var parentContentControl: js.UndefOr[ContentControlLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the content control that contains the field. Returns a null object if there isn't a parent content control.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var parentContentControlOrNullObject: js.UndefOr[ContentControlLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the table that contains the field. Throws an error if it is not contained in a table.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var parentTable: js.UndefOr[TableLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the table cell that contains the field. Throws an error if it is not contained in a table cell.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var parentTableCell: js.UndefOr[TableCellLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the table cell that contains the field. Returns a null object if it is not contained in a table cell.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var parentTableCellOrNullObject: js.UndefOr[TableCellLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the table that contains the field. Returns a null object if it is not contained in a table.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var parentTableOrNullObject: js.UndefOr[TableLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the field's result data. Read-only.
    *
    * @remarks
    * [Api set: WordApiOnline BETA (PREVIEW ONLY)]
    * @beta
    */
  var result: js.UndefOr[Boolean] = js.undefined
}
object FieldCollectionLoadOptions {
  
  inline def apply(): FieldCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldCollectionLoadOptions]
  }
  
  extension [Self <: FieldCollectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setCode(value: Boolean): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
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
    
    inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
