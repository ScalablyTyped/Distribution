package typings.officeJs.PowerPoint

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.PowerPoint.Interfaces.ShapeFillData
import typings.officeJs.PowerPoint.Interfaces.ShapeFillLoadOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Gradient
import typings.officeJs.officeJsStrings.NoFill
import typings.officeJs.officeJsStrings.Pattern
import typings.officeJs.officeJsStrings.PictureAndTexture
import typings.officeJs.officeJsStrings.SlideBackground
import typings.officeJs.officeJsStrings.Solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the fill formatting of a shape object.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
@js.native
trait ShapeFill
  extends StObject
     with ClientObject {
  
  /**
    * Clears the fill formatting of this shape.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  def clear(): Unit = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeFill: RequestContext = js.native
  
  /**
    * Represents the shape fill foreground color in HTML color format, in the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var foregroundColor: String = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeFill = js.native
  def load(options: ShapeFillLoadOptions): ShapeFill = js.native
  def load(propertyNamesAndPaths: Expand): ShapeFill = js.native
  def load(propertyNames: String): ShapeFill = js.native
  def load(propertyNames: js.Array[String]): ShapeFill = js.native
  
  /**
    * Sets the fill formatting of the shape to a uniform color. This changes the fill type to `Solid`.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    *
    * @param color A string that specifies the fill color in HTML color format, in the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    */
  def setSolidColor(color: String): Unit = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original PowerPoint.ShapeFill object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.ShapeFillData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ShapeFillData = js.native
  
  /**
    * Specifies the transparency percentage of the fill as a value from 0.0 (opaque) through 1.0 (clear). Returns `null` if the shape type does not support transparency or the shape fill has inconsistent transparency, such as with a gradient fill type.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var transparency: Double = js.native
  
  /**
    * Returns the fill type of the shape. See {@link PowerPoint.ShapeFillType} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  val `type`: ShapeFillType | NoFill | Solid | Gradient | Pattern | PictureAndTexture | SlideBackground = js.native
}
