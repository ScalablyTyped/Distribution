package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * A collection of custom XML parts.
     *
     * [Api set: ExcelApi 1.5]
     */
@JSGlobal("Excel.CustomXmlPartCollection")
@js.native
class CustomXmlPartCollection ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /** Gets the loaded child items in this collection. */
  val items: js.Array[CustomXmlPart] = js.native
  /**
           *
           * Adds a new custom XML part to the workbook.
           *
           * [Api set: ExcelApi 1.5]
           *
           * @param xml XML content. Must be a valid XML fragment.
           */
  def add(xml: java.lang.String): CustomXmlPart = js.native
  /**
           *
           * Gets a new scoped collection of custom XML parts whose namespaces match the given namespace.
           *
           * [Api set: ExcelApi 1.5]
           *
           * @param namespaceUri This must be a fully qualified schema URI; for example, "http://schemas.contoso.com/review/1.0".
           */
  def getByNamespace(namespaceUri: java.lang.String): CustomXmlPartScopedCollection = js.native
  /**
           *
           * Gets the number of CustomXml parts in the collection.
           *
           * [Api set: ExcelApi 1.5]
           */
  def getCount(): officeDashJsLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Gets a custom XML part based on its ID.
           *
           * [Api set: ExcelApi 1.5]
           *
           * @param id ID of the object to be retrieved.
           */
  def getItem(id: java.lang.String): CustomXmlPart = js.native
  /**
           *
           * Gets a custom XML part based on its ID.
              If the CustomXmlPart does not exist, the return object's isNull property will be true.
           *
           * [Api set: ExcelApi 1.5]
           *
           * @param id ID of the object to be retrieved.
           */
  def getItemOrNullObject(id: java.lang.String): CustomXmlPart = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.CustomXmlPartCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.CustomXmlPartCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.CustomXmlPartCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): CustomXmlPartCollection = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.CustomXmlPartCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.CustomXmlPartCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.CustomXmlPartCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(
    option: officeDashJsLib.ExcelNs.InterfacesNs.CustomXmlPartCollectionLoadOptions with officeDashJsLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): CustomXmlPartCollection = js.native
  def load(option: java.lang.String): CustomXmlPartCollection = js.native
  def load(option: js.Array[java.lang.String]): CustomXmlPartCollection = js.native
  def load(option: officeDashJsLib.OfficeExtensionNs.LoadOption): CustomXmlPartCollection = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.CustomXmlPartCollectionData = js.native
}

