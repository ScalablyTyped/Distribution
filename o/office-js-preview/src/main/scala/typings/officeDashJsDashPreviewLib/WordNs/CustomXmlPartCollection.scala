package typings
package officeDashJsDashPreviewLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Contains the collection of {@link Word.CustomXmlPart} objects.
     *
     * [Api set: WordApi BETA (PREVIEW ONLY)]
     * @beta
     */
@JSGlobal("Word.CustomXmlPartCollection")
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
           * Adds a new custom XML part to the document.
           *
           * [Api set: WordApi BETA (PREVIEW ONLY)]
           * @beta
           *
           * @param xml Required. XML content. Must be a valid XML fragment.
           */
  def add(xml: java.lang.String): CustomXmlPart = js.native
  /**
           *
           * Gets a new scoped collection of custom XML parts whose namespaces match the given namespace.
           *
           * [Api set: WordApi BETA (PREVIEW ONLY)]
           * @beta
           *
           * @param namespaceUri Required. The namespace URI.
           */
  def getByNamespace(namespaceUri: java.lang.String): CustomXmlPartScopedCollection = js.native
  /**
           *
           * Gets the number of items in the collection.
           *
           * [Api set: WordApi BETA (PREVIEW ONLY)]
           * @beta
           */
  def getCount(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[scala.Double] = js.native
  /**
           *
           * Gets a custom XML part based on its ID. Read only.
           *
           * [Api set: WordApi BETA (PREVIEW ONLY)]
           * @beta
           *
           * @param id ID or index of the custom XML part to be retrieved.
           */
  def getItem(id: java.lang.String): CustomXmlPart = js.native
  /**
           *
           * Gets a custom XML part based on its ID. Returns a null object if the CustomXmlPart does not exist.
           *
           * [Api set: WordApi BETA (PREVIEW ONLY)]
           * @beta
           *
           * @param id Required. ID of the object to be retrieved.
           */
  def getItemOrNullObject(id: java.lang.String): CustomXmlPart = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Word.CustomXmlPartCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Word.CustomXmlPartCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.CustomXmlPartCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
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
           * `load(option?: string | string[]): Word.CustomXmlPartCollection` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Word.CustomXmlPartCollection` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.CustomXmlPartCollection` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(
    option: officeDashJsDashPreviewLib.WordNs.InterfacesNs.CustomXmlPartCollectionLoadOptions with officeDashJsDashPreviewLib.WordNs.InterfacesNs.CollectionLoadOptions
  ): CustomXmlPartCollection = js.native
  def load(option: java.lang.String): CustomXmlPartCollection = js.native
  def load(option: js.Array[java.lang.String]): CustomXmlPartCollection = js.native
  def load(option: officeDashJsDashPreviewLib.OfficeExtensionNs.LoadOption): CustomXmlPartCollection = js.native
  def toJSON(): officeDashJsDashPreviewLib.WordNs.InterfacesNs.CustomXmlPartCollectionData = js.native
  /**
           * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
           */
  def track(): CustomXmlPartCollection = js.native
  /**
           * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
           */
  def untrack(): CustomXmlPartCollection = js.native
}

