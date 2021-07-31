package typings.officeJs.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContentControlType extends StObject
/**
  *
  * Specifies supported content control types and subtypes.
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.ContentControlType")
@js.native
object ContentControlType extends StObject {
  
  @js.native
  sealed trait buildingBlockGallery
    extends StObject
       with ContentControlType
  
  @js.native
  sealed trait checkBox
    extends StObject
       with ContentControlType
  
  @js.native
  sealed trait comboBox
    extends StObject
       with ContentControlType
  
  @js.native
  sealed trait datePicker
    extends StObject
       with ContentControlType
  
  @js.native
  sealed trait dropDownList
    extends StObject
       with ContentControlType
  
  @js.native
  sealed trait picture
    extends StObject
       with ContentControlType
  
  @js.native
  sealed trait plainText
    extends StObject
       with ContentControlType
  
  @js.native
  sealed trait plainTextInline
    extends StObject
       with ContentControlType
  
  @js.native
  sealed trait plainTextParagraph
    extends StObject
       with ContentControlType
  
  @js.native
  sealed trait repeatingSection
    extends StObject
       with ContentControlType
  
  /**
    * Identifies a rich text content control.
    *
    */
  @js.native
  sealed trait richText
    extends StObject
       with ContentControlType
  
  @js.native
  sealed trait richTextInline
    extends StObject
       with ContentControlType
  
  @js.native
  sealed trait richTextParagraphs
    extends StObject
       with ContentControlType
  
  /**
    * Contains a whole table.
    *
    */
  @js.native
  sealed trait richTextTable
    extends StObject
       with ContentControlType
  
  /**
    * Contains a whole cell.
    *
    */
  @js.native
  sealed trait richTextTableCell
    extends StObject
       with ContentControlType
  
  /**
    * Contains a whole row.
    *
    */
  @js.native
  sealed trait richTextTableRow
    extends StObject
       with ContentControlType
  
  @js.native
  sealed trait unknown
    extends StObject
       with ContentControlType
}
