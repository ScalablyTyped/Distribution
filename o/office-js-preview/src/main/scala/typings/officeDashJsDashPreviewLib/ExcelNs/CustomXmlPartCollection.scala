package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_CustomXmlPartCollection: RequestContext = js.native
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
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
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
    option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CustomXmlPartCollectionLoadOptions with officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CollectionLoadOptions
  ): CustomXmlPartCollection = js.native
  def load(option: java.lang.String): CustomXmlPartCollection = js.native
  def load(option: js.Array[java.lang.String]): CustomXmlPartCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): CustomXmlPartCollection = js.native
  /**
          * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
          * Whereas the original `Excel.CustomXmlPartCollection` object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.CustomXmlPartCollectionData`) that contains an "items" array with shallow copies of any loaded properties from the collection's items.
          */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.CustomXmlPartCollectionData = js.native
}

