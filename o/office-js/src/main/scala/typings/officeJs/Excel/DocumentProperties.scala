package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.DocumentPropertiesData
import typings.officeJs.Excel.Interfaces.DocumentPropertiesLoadOptions
import typings.officeJs.Excel.Interfaces.DocumentPropertiesUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents workbook properties.
  *
  * [Api set: ExcelApi 1.7]
  */
@js.native
trait DocumentProperties extends ClientObject {
  /**
    *
    * The author of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var author: String = js.native
  /**
    *
    * The category of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var category: String = js.native
  /**
    *
    * The comments of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var comments: String = js.native
  /**
    *
    * The company of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var company: String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_DocumentProperties: RequestContext = js.native
  /**
    *
    * Gets the creation date of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val creationDate: Date = js.native
  /**
    *
    * Gets the collection of custom properties of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val custom: CustomPropertyCollection = js.native
  /**
    *
    * The keywords of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var keywords: String = js.native
  /**
    *
    * Gets the last author of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  val lastAuthor: String = js.native
  /**
    *
    * The manager of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var manager: String = js.native
  /**
    *
    * Gets the revision number of the workbook. Read only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var revisionNumber: Double = js.native
  /**
    *
    * The subject of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var subject: String = js.native
  /**
    *
    * The title of the workbook.
    *
    * [Api set: ExcelApi 1.7]
    */
  var title: String = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): DocumentProperties = js.native
  def load(options: DocumentPropertiesLoadOptions): DocumentProperties = js.native
  def load(propertyNamesAndPaths: Expand): DocumentProperties = js.native
  def load(propertyNames: String): DocumentProperties = js.native
  def load(propertyNames: js.Array[String]): DocumentProperties = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: DocumentProperties): Unit = js.native
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
  def set(properties: DocumentPropertiesUpdateData): Unit = js.native
  def set(properties: DocumentPropertiesUpdateData, options: UpdateOptions): Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.DocumentProperties object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.DocumentPropertiesData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): DocumentPropertiesData = js.native
}

