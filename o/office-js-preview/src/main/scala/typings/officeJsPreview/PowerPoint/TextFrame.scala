package typings.officeJsPreview.PowerPoint

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.PowerPoint.Interfaces.TextFrameData
import typings.officeJsPreview.PowerPoint.Interfaces.TextFrameLoadOptions
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.AutoSizeMixed
import typings.officeJsPreview.officeJsPreviewStrings.AutoSizeNone
import typings.officeJsPreview.officeJsPreviewStrings.AutoSizeShapeToFitText
import typings.officeJsPreview.officeJsPreviewStrings.AutoSizeTextToFitShape
import typings.officeJsPreview.officeJsPreviewStrings.Bottom
import typings.officeJsPreview.officeJsPreviewStrings.BottomCentered
import typings.officeJsPreview.officeJsPreviewStrings.Middle
import typings.officeJsPreview.officeJsPreviewStrings.MiddleCentered
import typings.officeJsPreview.officeJsPreviewStrings.Top
import typings.officeJsPreview.officeJsPreviewStrings.TopCentered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the text frame of a shape object.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
@js.native
trait TextFrame
  extends StObject
     with ClientObject {
  
  /**
    * The automatic sizing settings for the text frame. A text frame can be set to automatically fit the text to the text frame, to automatically fit the text frame to the text, or not perform any automatic sizing.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var autoSizeSetting: ShapeAutoSize | AutoSizeNone | AutoSizeTextToFitShape | AutoSizeShapeToFitText | AutoSizeMixed = js.native
  
  /**
    * Represents the bottom margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var bottomMargin: Double = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_TextFrame: RequestContext = js.native
  
  /**
    * Deletes all the text in the text frame.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  def deleteText(): Unit = js.native
  
  /**
    * Returns the parent {@link PowerPoint.Shape} object that holds this `TextFrame`.
    *
    * @remarks
    * [Api set: PowerPointApi 1.5]
    */
  def getParentShape(): Shape = js.native
  
  /**
    * Specifies if the text frame contains text.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  val hasText: Boolean = js.native
  
  /**
    * Represents the left margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var leftMargin: Double = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): TextFrame = js.native
  def load(options: TextFrameLoadOptions): TextFrame = js.native
  def load(propertyNamesAndPaths: Expand): TextFrame = js.native
  def load(propertyNames: String): TextFrame = js.native
  def load(propertyNames: js.Array[String]): TextFrame = js.native
  
  /**
    * Represents the right margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var rightMargin: Double = js.native
  
  /**
    * Represents the text that is attached to a shape in the text frame, and properties and methods for manipulating the text. See {@link PowerPoint.TextRange} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  val textRange: TextRange = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original PowerPoint.TextFrame object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.TextFrameData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): TextFrameData = js.native
  
  /**
    * Represents the top margin, in points, of the text frame.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var topMargin: Double = js.native
  
  /**
    * Represents the vertical alignment of the text frame. See {@link PowerPoint.TextVerticalAlignment} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var verticalAlignment: TextVerticalAlignment | Top | Middle | Bottom | TopCentered | MiddleCentered | BottomCentered = js.native
  
  /**
    * Determines whether lines break automatically to fit text inside the shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var wordWrap: Boolean = js.native
}
