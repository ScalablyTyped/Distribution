package typings.officeJs.Visio

import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.Visio.Interfaces.ShapeDataItemData
import typings.officeJs.Visio.Interfaces.ShapeDataItemLoadOptions
import typings.officeJs.anon.Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the ShapeDataItem.
  *
  * [Api set:  1.1]
  */
@js.native
trait ShapeDataItem extends ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeDataItem: RequestContext = js.native
  /**
    *
    * A string that specifies the format of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  val format: String = js.native
  /**
    *
    * A string that specifies the formatted value of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  val formattedValue: String = js.native
  /**
    *
    * A string that specifies the label of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  val label: String = js.native
  /**
    *
    * A string that specifies the value of the shape data item. Read-only.
    *
    * [Api set:  1.1]
    */
  val value: String = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.ShapeDataItem` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.ShapeDataItem` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.ShapeDataItem` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): ShapeDataItem = js.native
  def load(option: String): ShapeDataItem = js.native
  def load(option: js.Array[String]): ShapeDataItem = js.native
  def load(option: ShapeDataItemLoadOptions): ShapeDataItem = js.native
  def load(option: Expand): ShapeDataItem = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Visio.ShapeDataItem object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Visio.Interfaces.ShapeDataItemData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): ShapeDataItemData = js.native
}

