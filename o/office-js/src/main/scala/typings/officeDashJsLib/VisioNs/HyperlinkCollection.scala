package typings
package officeDashJsLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents the Hyperlink Collection.
     *
     * [Api set:  1.1]
     */
@JSGlobal("Visio.HyperlinkCollection")
@js.native
class HyperlinkCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** Gets the loaded child items in this collection. */
  val items: js.Array[Hyperlink] = js.native
  /**
           *
           * Gets the number of hyperlinks.
           *
           * [Api set:  1.1]
           */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Gets a Hyperlink using its key (name or Id).
           *
           * [Api set:  1.1]
           *
           * @param Key Key is the name or index of the Hyperlink to be retrieved.
           */
  def getItem(Key: java.lang.String): Hyperlink = js.native
  /**
           *
           * Gets a Hyperlink using its key (name or Id).
           *
           * [Api set:  1.1]
           *
           * @param Key Key is the name or index of the Hyperlink to be retrieved.
           */
  def getItem(Key: scala.Double): Hyperlink = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Visio.HyperlinkCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Visio.HyperlinkCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.HyperlinkCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): HyperlinkCollection = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Visio.HyperlinkCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Visio.HyperlinkCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.HyperlinkCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(
    option: officeDashJsLib.VisioNs.InterfacesNs.HyperlinkCollectionLoadOptions with officeDashJsLib.VisioNs.InterfacesNs.CollectionLoadOptions
  ): HyperlinkCollection = js.native
  def load(option: java.lang.String): HyperlinkCollection = js.native
  def load(option: js.Array[java.lang.String]): HyperlinkCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): HyperlinkCollection = js.native
  def toJSON(): officeDashJsLib.VisioNs.InterfacesNs.HyperlinkCollectionData = js.native
}

