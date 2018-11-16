package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents an Office.js binding that is defined in the workbook.
     *
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.Binding")
@js.native
class Binding ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Represents binding identifier. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val id: java.lang.String = js.native
  /**
           *
           * Occurs when data or formatting within the binding is changed.
           *
           * [Api set: ExcelApi 1.2]
           *
           * @eventproperty
           */
  val onDataChanged: officeDashJsLib.OfficeExtensionNs.EventHandlers[BindingDataChangedEventArgs] = js.native
  /**
           *
           * Occurs when the selected content in the binding is changed.
           *
           * [Api set: ExcelApi 1.2]
           *
           * @eventproperty
           */
  val onSelectionChanged: officeDashJsLib.OfficeExtensionNs.EventHandlers[BindingSelectionChangedEventArgs] = js.native
  /**
           *
           * Returns the type of the binding. See Excel.BindingType for details. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val `type`: BindingType | officeDashJsLib.officeDashJsLibStrings.Range | officeDashJsLib.officeDashJsLibStrings.Table | officeDashJsLib.officeDashJsLibStrings.Text = js.native
  /**
           *
           * Deletes the binding.
           *
           * [Api set: ExcelApi 1.3]
           */
  def delete(): scala.Unit = js.native
  /**
           *
           * Returns the range represented by the binding. Will throw an error if binding is not of the correct type.
           *
           * [Api set: ExcelApi 1.1]
           */
  def getRange(): Range = js.native
  /**
           *
           * Returns the table represented by the binding. Will throw an error if binding is not of the correct type.
           *
           * [Api set: ExcelApi 1.1]
           */
  def getTable(): Table = js.native
  /**
           *
           * Returns the text represented by the binding. Will throw an error if binding is not of the correct type.
           *
           * [Api set: ExcelApi 1.1]
           */
  def getText(): officeDashJsLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.Binding` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.Binding` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Binding` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): Binding = js.native
  def load(option: java.lang.String): Binding = js.native
  def load(option: js.Array[java.lang.String]): Binding = js.native
  def load(option: officeDashJsLib.Anon_Select): Binding = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.Binding` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.Binding` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Binding` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.BindingLoadOptions): Binding = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.BindingData = js.native
}

