package typings
package officeDashJsLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Hyperlink.
  *
  * [Api set:  1.1]
  */
@JSGlobal("Visio.Hyperlink")
@js.native
class Hyperlink ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Gets the address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  val address: java.lang.String = js.native
  /**
    *
    * Gets the description of a hyperlink. Read-only.
    *
    * [Api set:  1.1]
    */
  val description: java.lang.String = js.native
  /**
    *
    * Gets the extra URL request information used to resolve the hyperlink's URL. Read-only.
    *
    * [Api set:  1.1]
    */
  val extraInfo: java.lang.String = js.native
  /**
    *
    * Gets the sub-address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  val subAddress: java.lang.String = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Visio.Hyperlink` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Visio.Hyperlink` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.Hyperlink` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Hyperlink = js.native
  def load(option: java.lang.String): Hyperlink = js.native
  def load(option: js.Array[java.lang.String]): Hyperlink = js.native
  def load(option: officeDashJsLib.Anon_Select): Hyperlink = js.native
  def load(option: officeDashJsLib.VisioNs.InterfacesNs.HyperlinkLoadOptions): Hyperlink = js.native
  def toJSON(): officeDashJsLib.VisioNs.InterfacesNs.HyperlinkData = js.native
}

