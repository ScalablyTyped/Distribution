package typings.officeJsPreview.PowerPoint

import typings.officeJsPreview.OfficeExtension.ClientObject
import typings.officeJsPreview.PowerPoint.Interfaces.ShapeFontData
import typings.officeJsPreview.PowerPoint.Interfaces.ShapeFontLoadOptions
import typings.officeJsPreview.anon.Expand
import typings.officeJsPreview.officeJsPreviewStrings.Dash
import typings.officeJsPreview.officeJsPreviewStrings.DashHeavy
import typings.officeJsPreview.officeJsPreviewStrings.DashLong
import typings.officeJsPreview.officeJsPreviewStrings.DashLongHeavy
import typings.officeJsPreview.officeJsPreviewStrings.DotDash
import typings.officeJsPreview.officeJsPreviewStrings.DotDashHeavy
import typings.officeJsPreview.officeJsPreviewStrings.DotDotDash
import typings.officeJsPreview.officeJsPreviewStrings.DotDotDashHeavy
import typings.officeJsPreview.officeJsPreviewStrings.Dotted
import typings.officeJsPreview.officeJsPreviewStrings.DottedHeavy
import typings.officeJsPreview.officeJsPreviewStrings.Heavy
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Single
import typings.officeJsPreview.officeJsPreviewStrings.Wavy
import typings.officeJsPreview.officeJsPreviewStrings.WavyDouble
import typings.officeJsPreview.officeJsPreviewStrings.WavyHeavy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the font attributes, such as font name, font size, and color, for a shape's TextRange object.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
@js.native
trait ShapeFont
  extends StObject
     with ClientObject {
  
  /**
    * Represents the bold status of font. Returns `null` if the `TextRange` includes both bold and non-bold text fragments.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var bold: Boolean = js.native
  
  /**
    * HTML color code representation of the text color (e.g., "#FF0000" represents red). Returns `null` if the `TextRange` includes text fragments with different colors.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var color: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeFont: RequestContext = js.native
  
  /**
    * Represents the italic status of font. Returns 'null' if the 'TextRange' includes both italic and non-italic text fragments.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var italic: Boolean = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeFont = js.native
  def load(options: ShapeFontLoadOptions): ShapeFont = js.native
  def load(propertyNamesAndPaths: Expand): ShapeFont = js.native
  def load(propertyNames: String): ShapeFont = js.native
  def load(propertyNames: js.Array[String]): ShapeFont = js.native
  
  /**
    * Represents font name (e.g., "Calibri"). If the text is a Complex Script or East Asian language, this is the corresponding font name; otherwise it is the Latin font name.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var name: String = js.native
  
  /**
    * Represents font size in points (e.g., 11). Returns null if the TextRange includes text fragments with different font sizes.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var size: Double = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original PowerPoint.ShapeFont object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.ShapeFontData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ShapeFontData = js.native
  
  /**
    * Type of underline applied to the font. Returns `null` if the `TextRange` includes text fragments with different underline styles. See {@link PowerPoint.ShapeFontUnderlineStyle} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var underline: ShapeFontUnderlineStyle | None | Single | typings.officeJsPreview.officeJsPreviewStrings.Double | Heavy | Dotted | DottedHeavy | Dash | DashHeavy | DashLong | DashLongHeavy | DotDash | DotDashHeavy | DotDotDash | DotDotDashHeavy | Wavy | WavyHeavy | WavyDouble = js.native
}
