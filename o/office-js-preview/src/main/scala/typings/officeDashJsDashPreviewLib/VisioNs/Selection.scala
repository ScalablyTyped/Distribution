package typings
package officeDashJsDashPreviewLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Selection in the page.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.Selection")
@js.native
class Selection ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Gets the Shapes of the Selection. Read-only.
    *
    * [Api set:  1.1]
    */
  val shapes: ShapeCollection = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.Selection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.Selection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.Selection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Selection = js.native
  def load(option: java.lang.String): Selection = js.native
  def load(option: js.Array[java.lang.String]): Selection = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Select): Selection = js.native
  def toJSON(): officeDashJsDashPreviewLib.VisioNs.InterfacesNs.SelectionData = js.native
}

