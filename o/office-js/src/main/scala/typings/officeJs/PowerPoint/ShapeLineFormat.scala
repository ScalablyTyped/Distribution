package typings.officeJs.PowerPoint

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.PowerPoint.Interfaces.ShapeLineFormatData
import typings.officeJs.PowerPoint.Interfaces.ShapeLineFormatLoadOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.DashDot
import typings.officeJs.officeJsStrings.DashDotDot
import typings.officeJs.officeJsStrings.LongDash
import typings.officeJs.officeJsStrings.LongDashDot
import typings.officeJs.officeJsStrings.LongDashDotDot
import typings.officeJs.officeJsStrings.RoundDot
import typings.officeJs.officeJsStrings.Single
import typings.officeJs.officeJsStrings.Solid
import typings.officeJs.officeJsStrings.SquareDot
import typings.officeJs.officeJsStrings.SystemDash
import typings.officeJs.officeJsStrings.SystemDashDot
import typings.officeJs.officeJsStrings.SystemDot
import typings.officeJs.officeJsStrings.ThickBetweenThin
import typings.officeJs.officeJsStrings.ThickThin
import typings.officeJs.officeJsStrings.ThinThick
import typings.officeJs.officeJsStrings.ThinThin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the line formatting for the shape object. For images and geometric shapes, line formatting represents the border of the shape.
  *
  * @remarks
  * [Api set: PowerPointApi 1.4]
  */
@js.native
trait ShapeLineFormat
  extends StObject
     with ClientObject {
  
  /**
    * Represents the line color in HTML color format, in the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var color: String = js.native
  
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeLineFormat: RequestContext = js.native
  
  /**
    * Represents the dash style of the line. Returns null when the line is not visible or there are inconsistent dash styles. See PowerPoint.ShapeLineDashStyle for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var dashStyle: ShapeLineDashStyle | Dash | DashDot | DashDotDot | LongDash | LongDashDot | RoundDot | Solid | SquareDot | LongDashDotDot | SystemDash | SystemDot | SystemDashDot = js.native
  
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeLineFormat = js.native
  def load(options: ShapeLineFormatLoadOptions): ShapeLineFormat = js.native
  def load(propertyNamesAndPaths: Expand): ShapeLineFormat = js.native
  def load(propertyNames: String): ShapeLineFormat = js.native
  def load(propertyNames: js.Array[String]): ShapeLineFormat = js.native
  
  /**
    * Represents the line style of the shape. Returns null when the line is not visible or there are inconsistent styles. See PowerPoint.ShapeLineStyle for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var style: ShapeLineStyle | Single | ThickBetweenThin | ThickThin | ThinThick | ThinThin = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original PowerPoint.ShapeLineFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `PowerPoint.Interfaces.ShapeLineFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ShapeLineFormatData = js.native
  
  /**
    * Specifies the transparency percentage of the line as a value from 0.0 (opaque) through 1.0 (clear). Returns null when the shape has inconsistent transparencies.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var transparency: Double = js.native
  
  /**
    * Specifies if the line formatting of a shape element is visible. Returns `null` when the shape has inconsistent visibilities.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var visible: Boolean = js.native
  
  /**
    * Represents the weight of the line, in points. Returns `null` when the line is not visible or there are inconsistent line weights.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var weight: Double = js.native
}
