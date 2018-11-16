package typings
package officeDashJsLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents the ShapeDataItem.
     *
     * [Api set:  1.1]
     */
@JSGlobal("Visio.ShapeDataItem")
@js.native
class ShapeDataItem ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * A string that specifies the format of the shape data item. Read-only.
           *
           * [Api set:  1.1]
           */
  val format: java.lang.String = js.native
  /**
           *
           * A string that specifies the formatted value of the shape data item. Read-only.
           *
           * [Api set:  1.1]
           */
  val formattedValue: java.lang.String = js.native
  /**
           *
           * A string that specifies the label of the shape data item. Read-only.
           *
           * [Api set:  1.1]
           */
  val label: java.lang.String = js.native
  /**
           *
           * A string that specifies the value of the shape data item. Read-only.
           *
           * [Api set:  1.1]
           */
  val value: java.lang.String = js.native
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
  def load(option: java.lang.String): ShapeDataItem = js.native
  def load(option: js.Array[java.lang.String]): ShapeDataItem = js.native
  def load(option: officeDashJsLib.Anon_Select): ShapeDataItem = js.native
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
  def load(option: officeDashJsLib.VisioNs.InterfacesNs.ShapeDataItemLoadOptions): ShapeDataItem = js.native
  def toJSON(): officeDashJsLib.VisioNs.InterfacesNs.ShapeDataItemData = js.native
}

