package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents workbook properties.
     *
     * [Api set: ExcelApi 1.7]
     */
@JSGlobal("Excel.DocumentProperties")
@js.native
class DocumentProperties ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Gets or sets the author of the workbook.
           *
           * [Api set: ExcelApi 1.7]
           */
  var author: java.lang.String = js.native
  /**
           *
           * Gets or sets the category of the workbook.
           *
           * [Api set: ExcelApi 1.7]
           */
  var category: java.lang.String = js.native
  /**
           *
           * Gets or sets the comments of the workbook.
           *
           * [Api set: ExcelApi 1.7]
           */
  var comments: java.lang.String = js.native
  /**
           *
           * Gets or sets the company of the workbook.
           *
           * [Api set: ExcelApi 1.7]
           */
  var company: java.lang.String = js.native
  /**
           *
           * Gets the creation date of the workbook. Read only.
           *
           * [Api set: ExcelApi 1.7]
           */
  val creationDate: stdLib.Date = js.native
  /**
           *
           * Gets the collection of custom properties of the workbook. Read only.
           *
           * [Api set: ExcelApi 1.7]
           */
  val custom: CustomPropertyCollection = js.native
  /**
           *
           * Gets or sets the keywords of the workbook.
           *
           * [Api set: ExcelApi 1.7]
           */
  var keywords: java.lang.String = js.native
  /**
           *
           * Gets the last author of the workbook. Read only.
           *
           * [Api set: ExcelApi 1.7]
           */
  val lastAuthor: java.lang.String = js.native
  /**
           *
           * Gets or sets the manager of the workbook.
           *
           * [Api set: ExcelApi 1.7]
           */
  var manager: java.lang.String = js.native
  /**
           *
           * Gets the revision number of the workbook. Read only.
           *
           * [Api set: ExcelApi 1.7]
           */
  var revisionNumber: scala.Double = js.native
  /**
           *
           * Gets or sets the subject of the workbook.
           *
           * [Api set: ExcelApi 1.7]
           */
  var subject: java.lang.String = js.native
  /**
           *
           * Gets or sets the title of the workbook.
           *
           * [Api set: ExcelApi 1.7]
           */
  var title: java.lang.String = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.DocumentProperties` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.DocumentProperties` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.DocumentProperties` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): DocumentProperties = js.native
  def load(option: java.lang.String): DocumentProperties = js.native
  def load(option: js.Array[java.lang.String]): DocumentProperties = js.native
  def load(option: officeDashJsLib.Anon_Select): DocumentProperties = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.DocumentProperties` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.DocumentProperties` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.DocumentProperties` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.DocumentPropertiesLoadOptions): DocumentProperties = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: DocumentProperties): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.DocumentProperties): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.DocumentPropertiesUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.DocumentProperties): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.DocumentPropertiesUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.DocumentPropertiesData = js.native
}

