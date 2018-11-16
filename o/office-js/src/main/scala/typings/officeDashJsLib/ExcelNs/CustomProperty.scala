package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents a custom property.
     *
     * [Api set: ExcelApi 1.7]
     */
@JSGlobal("Excel.CustomProperty")
@js.native
class CustomProperty ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Gets the key of the custom property. Read only.
           *
           * [Api set: ExcelApi 1.7]
           */
  val key: java.lang.String = js.native
  /**
           *
           * Gets the value type of the custom property. Read only.
           *
           * [Api set: ExcelApi 1.7]
           */
  val `type`: DocumentPropertyType | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Boolean | officeDashJsLib.officeDashJsLibStrings.Date | officeDashJsLib.officeDashJsLibStrings.String | officeDashJsLib.officeDashJsLibStrings.Float = js.native
  /**
           *
           * Gets or sets the value of the custom property.
           *
           * [Api set: ExcelApi 1.7]
           */
  var value: js.Any = js.native
  /**
           *
           * Deletes the custom property.
           *
           * [Api set: ExcelApi 1.7]
           */
  def delete(): scala.Unit = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.CustomProperty` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.CustomProperty` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.CustomProperty` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): CustomProperty = js.native
  def load(option: java.lang.String): CustomProperty = js.native
  def load(option: js.Array[java.lang.String]): CustomProperty = js.native
  def load(option: officeDashJsLib.Anon_Select): CustomProperty = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.CustomProperty` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.CustomProperty` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.CustomProperty` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.CustomPropertyLoadOptions): CustomProperty = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: CustomProperty): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.CustomProperty): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.CustomPropertyUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.CustomProperty): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.CustomPropertyUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.CustomPropertyData = js.native
}

