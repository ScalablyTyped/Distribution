package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents the Excel PivotHierarchy.
     *
     * [Api set: ExcelApi 1.8]
     */
@JSGlobal("Excel.PivotHierarchy")
@js.native
class PivotHierarchy ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_PivotHierarchy: RequestContext = js.native
  /**
           *
           * Returns the PivotFields associated with the PivotHierarchy.
           *
           * [Api set: ExcelApi 1.8]
           */
  val fields: PivotFieldCollection = js.native
  /**
           *
           * Id of the PivotHierarchy.
           *
           * [Api set: ExcelApi 1.8]
           */
  val id: java.lang.String = js.native
  /**
           *
           * Name of the PivotHierarchy.
           *
           * [Api set: ExcelApi 1.8]
           */
  var name: java.lang.String = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.PivotHierarchy` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.PivotHierarchy` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.PivotHierarchy` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): PivotHierarchy = js.native
  def load(option: java.lang.String): PivotHierarchy = js.native
  def load(option: js.Array[java.lang.String]): PivotHierarchy = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Select): PivotHierarchy = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.PivotHierarchy` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.PivotHierarchy` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.PivotHierarchy` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PivotHierarchyLoadOptions): PivotHierarchy = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.PivotHierarchy): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PivotHierarchyUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.PivotHierarchy): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PivotHierarchyUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: PivotHierarchy): scala.Unit = js.native
  /**
          * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
          * Whereas the original Excel.PivotHierarchy object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.PivotHierarchyData`) that contains shallow copies of any loaded child properties from the original object.
          */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.PivotHierarchyData = js.native
}

