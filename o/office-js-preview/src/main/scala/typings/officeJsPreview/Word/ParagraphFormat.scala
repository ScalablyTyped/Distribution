package typings.officeJsPreview.Word

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.Word.Interfaces.ParagraphFormatData
import typings.officeJsPreview.Word.Interfaces.ParagraphFormatLoadOptions
import typings.officeJsPreview.Word.Interfaces.ParagraphFormatUpdateData
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Centered
import typings.officeJsPreview.officeJsPreviewStrings.Justified
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel1
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel2
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel3
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel4
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel5
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel6
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel7
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel8
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevel9
import typings.officeJsPreview.officeJsPreviewStrings.OutlineLevelBodyText
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a style of paragraph in a document.
  *
  * @remarks
  * [Api set: WordApi 1.5]
  */
@js.native
trait ParagraphFormat
  extends StObject
     with ClientObject {
  
  /**
    * Specifies the alignment for the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var alignment: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ParagraphFormat: RequestContext = js.native
  
  /**
    * Specifies the value (in points) for a first line or hanging indent. Use a positive value to set a first-line indent, and use a negative value to set a hanging indent.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var firstLineIndent: Double = js.native
  
  /**
    * Specifies whether all lines in the specified paragraphs remain on the same page when Microsoft Word repaginates the document.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var keepTogether: Boolean = js.native
  
  /**
    * Specifies whether the specified paragraph remains on the same page as the paragraph that follows it when Microsoft Word repaginates the document.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var keepWithNext: Boolean = js.native
  
  /**
    * Specifies the left indent.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var leftIndent: Double = js.native
  
  /**
    * Specifies the line spacing (in points) for the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var lineSpacing: Double = js.native
  
  /**
    * Specifies the amount of spacing (in gridlines) after the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var lineUnitAfter: Double = js.native
  
  /**
    * Specifies the amount of spacing (in gridlines) before the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var lineUnitBefore: Double = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ParagraphFormat = js.native
  def load(options: ParagraphFormatLoadOptions): ParagraphFormat = js.native
  def load(propertyNamesAndPaths: Expand): ParagraphFormat = js.native
  def load(propertyNames: String): ParagraphFormat = js.native
  def load(propertyNames: js.Array[String]): ParagraphFormat = js.native
  
  /**
    * Specifies whether left and right indents are the same width.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var mirrorIndents: Boolean = js.native
  
  /**
    * Specifies the outline level for the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var outlineLevel: OutlineLevel | OutlineLevel1 | OutlineLevel2 | OutlineLevel3 | OutlineLevel4 | OutlineLevel5 | OutlineLevel6 | OutlineLevel7 | OutlineLevel8 | OutlineLevel9 | OutlineLevelBodyText = js.native
  
  /**
    * Specifies the right indent (in points) for the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var rightIndent: Double = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ParagraphFormatUpdateData): Unit = js.native
  def set(properties: ParagraphFormatUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ParagraphFormat): Unit = js.native
  
  /**
    * Specifies the amount of spacing (in points) after the specified paragraph or text column.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var spaceAfter: Double = js.native
  
  /**
    * Specifies the spacing (in points) before the specified paragraphs.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var spaceBefore: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.ParagraphFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.ParagraphFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ParagraphFormatData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): ParagraphFormat = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): ParagraphFormat = js.native
  
  /**
    * Specifies whether the first and last lines in the specified paragraph remain on the same page as the rest of the paragraph when Microsoft Word repaginates the document.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var widowControl: Boolean = js.native
}
