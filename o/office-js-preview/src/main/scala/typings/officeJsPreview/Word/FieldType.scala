package typings.officeJsPreview.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldType extends StObject
/**
  * Represents the type of Field.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
@JSGlobal("Word.FieldType")
@js.native
object FieldType extends StObject {
  
  /**
    * Represents that the field type is Add-in.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait addin
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is AddressBlock.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait addressBlock
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Advance.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait advance
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Ask.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait ask
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Author.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait author
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is AutoText.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait autoText
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is AutoTextList.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait autoTextList
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Barcode.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait barCode
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Bibliography.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait bibliography
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is BidiOutline.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait bidiOutline
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Citation.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait citation
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Comments.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait comments
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Compare.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait compare
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is CreateDate.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait createDate
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Data.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait data
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Database.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait database
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Date.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait date
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is DisplayBarcode.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait displayBarcode
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is DocumentProperty
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait docProperty
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is DocumentVariable.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait docVariable
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is EditTime.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait editTime
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Embedded.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait embedded
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Empty.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait empty
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Equation.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait eq
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Expression.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait expression
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is FileName.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait fileName
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is FileSize.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait fileSize
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is FillIn.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait fillIn
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is FormCheckbox.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait formCheckbox
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is FormDropdown.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait formDropdown
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is FormText.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait formText
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is GotoButton.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait gotoButton
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is GreetingLine.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait greetingLine
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Hyperlink.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait hyperlink
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is If.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait `if`
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Import.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait `import`
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Include.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait include
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is IncludePicture.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait includePicture
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is IncludeText.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait includeText
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Index.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait index
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Information.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait info
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Keywords.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait keywords
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is LastSavedBy.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait lastSavedBy
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Link.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait link
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is ListNumber.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait listNum
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is MacroButton.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait macroButton
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is MergeBarcode.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait mergeBarcode
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is MergeField.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait mergeField
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is MergeRecord.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait mergeRec
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is MergeSequence.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait mergeSeq
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Next.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait next
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is NextIf.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait nextIf
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is NoteReference.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait noteRef
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is NumberOfCharacters.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait numChars
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is NumberOfPages.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait numPages
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is NumberOfWords.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait numWords
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is ActiveXControl.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait ocx
    extends StObject
       with FieldType
  
  /**
    * Represents the field types not supported by the Office JavaScript API.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait others
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Page.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait page
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is PageReference.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait pageRef
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Print.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait print
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is PrintDate.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait printDate
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Private.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait `private`
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Quote.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait quote
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is ReferencedDocument.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait rd
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Reference.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait ref
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is RevisionNumber.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait revNum
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is SaveDate.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait saveDate
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Section.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait section
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is SectionPages.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait sectionPages
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Sequence.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait seq
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Set.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait set
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Shape.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait shape
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is SkipIf.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait skipIf
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is StyleReference.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait styleRef
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Subject.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait subject
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Subscriber.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait subscriber
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Symbol.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait symbol
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is TableOfAuthoritiesEntry.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait ta
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is TableOfContentsEntry.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait tc
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Template.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait template
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Time.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait time
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Title.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait title
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is TableOfAuthorities.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait toa
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is TableOfContents.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait toc
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is Undefined.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait undefined
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is UserAddress.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait userAddress
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is UserInitials.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait userInitials
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is UserName.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait userName
    extends StObject
       with FieldType
  
  /**
    * Represents that the field type is IndexEntry.
    * @remarks
    * [Api set: WordApi 1.5]
    */
  @js.native
  sealed trait xe
    extends StObject
       with FieldType
}
