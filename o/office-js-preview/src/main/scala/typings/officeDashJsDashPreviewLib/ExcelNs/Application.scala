package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Excel application that manages the workbook.
  *
  * [Api set: ExcelApi 1.1]
  */
@JSGlobal("Excel.Application")
@js.native
class Application ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Returns a number about the version of Excel Calculation Engine that the workbook was last fully recalculated by. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val calculationEngineVersion: scala.Double = js.native
  /**
    *
    * Returns the calculation mode used in the workbook, as defined by the constants in Excel.CalculationMode. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
    *
    * [Api set: ExcelApi 1.1 for get, 1.8 for set]
    */
  var calculationMode: CalculationMode | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutomaticExceptTables | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Manual = js.native
  /**
    *
    * Returns a CalculationState that indicates the calculation state of the application. See Excel.CalculationState for details. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val calculationState: CalculationState | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Done | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Calculating | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Pending = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Application: RequestContext = js.native
  /**
    *
    * Returns the Iterative Calculation settings.
    On Excel for Windows and Excel for Mac, the settings will apply to the Excel Application.
    On Excel Online and Excel for other platforms, the settings will apply to the active workbook.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  val iterativeCalculation: IterativeCalculation = js.native
  /**
    *
    * Recalculate all currently opened workbooks in Excel.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param calculationType Specifies the calculation type to use. See Excel.CalculationType for details.
    */
  def calculate(calculationType: CalculationType): scala.Unit = js.native
  @JSName("calculate")
  def calculate_Full(calculationType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Full): scala.Unit = js.native
  @JSName("calculate")
  def calculate_FullRebuild(calculationType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FullRebuild): scala.Unit = js.native
  /**
    *
    * Recalculate all currently opened workbooks in Excel.
    *
    * [Api set: ExcelApi 1.1]
    *
    * @param calculationType Specifies the calculation type to use. See Excel.CalculationType for details.
    */
  @JSName("calculate")
  def calculate_Recalculate(calculationType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Recalculate): scala.Unit = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.Application` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.Application` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Application` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Application = js.native
  def load(option: java.lang.String): Application = js.native
  def load(option: js.Array[java.lang.String]): Application = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Select): Application = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ApplicationLoadOptions): Application = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Application): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.Application): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ApplicationUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ApplicationUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
    *
    * Suspends calculation until the next "context.sync()" is called. Once set, it is the developer's responsibility to re-calc the workbook, to ensure that any dependencies are propagated.
    *
    * [Api set: ExcelApi 1.6]
    */
  def suspendApiCalculationUntilNextSync(): scala.Unit = js.native
  /**
    *
    * Suspends sceen updating until the next "context.sync()" is called.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  def suspendScreenUpdatingUntilNextSync(): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.Application object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ApplicationData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ApplicationData = js.native
}

