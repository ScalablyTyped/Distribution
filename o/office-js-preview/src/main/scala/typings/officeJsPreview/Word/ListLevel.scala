package typings.officeJsPreview.Word

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.OfficeExtension.UpdateOptions
import typings.officeJsPreview.Word.Interfaces.ListLevelData
import typings.officeJsPreview.Word.Interfaces.ListLevelLoadOptions
import typings.officeJsPreview.Word.Interfaces.ListLevelUpdateData
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Centered
import typings.officeJsPreview.officeJsPreviewStrings.Justified
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.TrailingNone
import typings.officeJsPreview.officeJsPreviewStrings.TrailingSpace
import typings.officeJsPreview.officeJsPreviewStrings.TrailingTab
import typings.officeJsPreview.officeJsPreviewStrings.Unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a list level.
  *
  * @remarks
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait ListLevel
  extends StObject
     with ClientObject {
  
  /**
    * Specifies the horizontal alignment of the list level. The value can be 'Left', 'Centered', or 'Right'.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var alignment: Alignment | Mixed | Unknown_ | Left | Centered | Right | Justified = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ListLevel: RequestContext = js.native
  
  /**
    * Gets a Font object that represents the character formatting of the specified object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val font: Font = js.native
  
  /**
    * Specifies the name of the style that's linked to the specified list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var linkedStyle: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ListLevel = js.native
  def load(options: ListLevelLoadOptions): ListLevel = js.native
  def load(propertyNamesAndPaths: Expand): ListLevel = js.native
  def load(propertyNames: String): ListLevel = js.native
  def load(propertyNames: js.Array[String]): ListLevel = js.native
  
  /**
    * Specifies the number format for the specified list level.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberFormat: String = js.native
  
  /**
    * Specifies the position (in points) of the number or bullet for the specified list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberPosition: Double = js.native
  
  /**
    * Specifies the number style for the list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var numberStyle: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 69, starting with typings.officeJsPreview.Word.ListBuiltInNumberStyle, typings.officeJsPreview.officeJsPreviewStrings.None, typings.officeJsPreview.officeJsPreviewStrings.Arabic */ Any = js.native
  
  /**
    * Specifies the list level that must appear before the specified list level restarts numbering at 1.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var resetOnHigher: Double = js.native
  
  /**
    * Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: ListLevelUpdateData): Unit = js.native
  def set(properties: ListLevelUpdateData, options: UpdateOptions): Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ListLevel): Unit = js.native
  
  /**
    * Specifies the starting number for the specified list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var startAt: Double = js.native
  
  /**
    * Specifies the tab position for the specified list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var tabPosition: Double = js.native
  
  /**
    * Specifies the position (in points) for the second line of wrapping text for the specified list level object.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var textPosition: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.ListLevel object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.ListLevelData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ListLevelData = js.native
  
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.add(thisObject)}. If you are using this object across `.sync` calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you need to add the object to the tracked object collection when the object was first created. If this object is part of a collection, you should also track the parent collection.
    */
  def track(): ListLevel = js.native
  
  /**
    * Specifies the character inserted after the number for the specified list level.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var trailingCharacter: TrailingCharacter | TrailingTab | TrailingSpace | TrailingNone = js.native
  
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for {@link https://docs.microsoft.com/javascript/api/office/officeextension.clientrequestcontext#office-officeextension-clientrequestcontext-trackedobjects-member | context.trackedObjects.remove(thisObject)}. Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call `context.sync()` before the memory release takes effect.
    */
  def untrack(): ListLevel = js.native
}
