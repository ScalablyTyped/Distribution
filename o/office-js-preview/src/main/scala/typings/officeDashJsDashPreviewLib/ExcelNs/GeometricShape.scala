package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a geometric shape inside a worksheet. A geometric shape can be a rectangle, block arrow, equation symbol, flowchart item, star, banner, callout, or any other basic shape in Excel.
  *
  * [Api set: ExcelApi 1.9]
  */
@JSGlobal("Excel.GeometricShape")
@js.native
class GeometricShape ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_GeometricShape: RequestContext = js.native
  /**
    *
    * Returns the shape identifier. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val id: java.lang.String = js.native
  /**
    *
    * Returns the Shape object for the geometric shape. Read-only.
    *
    * [Api set: ExcelApi 1.9]
    */
  val shape: Shape = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.GeometricShape` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.GeometricShape` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.GeometricShape` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): GeometricShape = js.native
  def load(option: java.lang.String): GeometricShape = js.native
  def load(option: js.Array[java.lang.String]): GeometricShape = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): GeometricShape = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.GeometricShapeLoadOptions): GeometricShape = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.GeometricShape object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.GeometricShapeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.GeometricShapeData = js.native
}

