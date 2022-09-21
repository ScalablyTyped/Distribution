package typings.officeJs.OneNote

import typings.officeJs.officeJsStrings.Bullet
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List information for paragraph.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
trait ParagraphInfo extends StObject {
  
  /**
    * //
    Bullet list type of paragraph
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var bulletType: String
  
  /**
    * //
    Level of indentation of the paragraph
    *
    * @remarks
    * [Api set: OneNoteApi 1.8]
    */
  var indentationLevel: Double
  
  /**
    * //
    Index of paragraph in a list
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var index: Double
  
  /**
    * //
    Type of list in paragraph
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var listType: ListType | None | Number | Bullet
  
  /**
    * //
    Numbered list type of paragraph
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var numberType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ Any
}
object ParagraphInfo {
  
  inline def apply(
    bulletType: String,
    indentationLevel: Double,
    index: Double,
    listType: ListType | None | Number | Bullet,
    numberType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ Any
  ): ParagraphInfo = {
    val __obj = js.Dynamic.literal(bulletType = bulletType.asInstanceOf[js.Any], indentationLevel = indentationLevel.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], listType = listType.asInstanceOf[js.Any], numberType = numberType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphInfo]
  }
  
  extension [Self <: ParagraphInfo](x: Self) {
    
    inline def setBulletType(value: String): Self = StObject.set(x, "bulletType", value.asInstanceOf[js.Any])
    
    inline def setIndentationLevel(value: Double): Self = StObject.set(x, "indentationLevel", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setListType(value: ListType | None | Number | Bullet): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
    
    inline def setNumberType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 63 */ Any): Self = StObject.set(x, "numberType", value.asInstanceOf[js.Any])
  }
}
