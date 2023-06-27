package typings.officeJsPreview.Word

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.Word.Interfaces.StyleData
import typings.officeJsPreview.Word.Interfaces.StyleLoadOptions
import typings.officeJsPreview.Word.Interfaces.StyleUpdateData
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Character
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a style in a Word document.
  *
  * @remarks
  * [Api set: WordApi 1.3]
  */
@js.native
trait Style
  extends StObject
     with ClientObject {
  
  /**
    * Gets the name of an existing style to use as the base formatting of another style.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  val baseStyle: String = js.native
  
  /**
    * Gets whether the specified style is a built-in style.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  val builtIn: Boolean = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Style: RequestContext = js.native
  
  /**
    * Deletes the style.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  def delete(): Unit = js.native
  
  /**
    * Gets the description of the specified style.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val description: String = js.native
  
  /**
    * Gets a font object that represents the character formatting of the specified style.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  val font: Font = js.native
  
  /**
    * Gets whether the specified style is a built-in style that has been modified or applied in the document or a new style that has been created in the document.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  val inUse: Boolean = js.native
  
  /**
    * Gets whether a style is a linked style that can be used for both paragraph and character formatting.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  val linked: Boolean = js.native
  
  /**
    * Gets a ListTemplate object that represents the list formatting for the specified Style object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val listTemplate: ListTemplate = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Style = js.native
  def load(options: StyleLoadOptions): Style = js.native
  def load(propertyNamesAndPaths: Expand): Style = js.native
  def load(propertyNames: String): Style = js.native
  def load(propertyNames: js.Array[String]): Style = js.native
  
  /**
    * Gets the name of a style in the language of the user.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  val nameLocal: String = js.native
  
  /**
    * Gets the name of the style to be applied automatically to a new paragraph that is inserted after a paragraph formatted with the specified style.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  val nextParagraphStyle: String = js.native
  
  /**
    * Gets a ParagraphFormat object that represents the paragraph settings for the specified style.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  val paragraphFormat: ParagraphFormat = js.native
  
  /**
    * Specifies the priority.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var priority: Double = js.native
  
  /**
    * Specifies whether the style corresponds to an available quick style.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var quickStyle: Boolean = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: StyleUpdateData): Unit = js.native
  def set(properties: StyleUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Style): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Style object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.StyleData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): StyleData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): Style = js.native
  
  /**
    * Gets the style type.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  val `type`: StyleType | Character | typings.officeJsPreview.officeJsPreviewStrings.List | typings.officeJsPreview.officeJsPreviewStrings.Paragraph | typings.officeJsPreview.officeJsPreviewStrings.Table = js.native
  
  /**
    * Specifies whether the specified style is made visible as a recommended style in the Styles and in the Styles task pane in Microsoft Word after it's used in the document.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var unhideWhenUsed: Boolean = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): Style = js.native
  
  /**
    * Specifies whether the specified style is visible as a recommended style in the Styles gallery and in the Styles task pane.
    *
    * @remarks
    * [Api set: WordApi 1.5]
    */
  var visibility: Boolean = js.native
}
