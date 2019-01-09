package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents an IconSet criteria for conditional formatting.
  *
  * [Api set: ExcelApi 1.6]
  */
@JSGlobal("Excel.IconSetConditionalFormat")
@js.native
class IconSetConditionalFormat ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * An array of Criteria and IconSets for the rules and potential custom icons for conditional icons. Note that for the first criterion only the custom icon can be modified, while type, formula, and operator will be ignored when set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.Array[ConditionalIconCriterion] = js.native
  /**
    *
    * If true, reverses the icon orders for the IconSet. Note that this cannot be set if custom icons are used.
    *
    * [Api set: ExcelApi 1.6]
    */
  var reverseIconOrder: scala.Boolean = js.native
  /**
    *
    * If true, hides the values and only shows icons.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showIconOnly: scala.Boolean = js.native
  /**
    *
    * If set, displays the IconSet option for the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: IconSet | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.ThreeArrows | officeDashJsLib.officeDashJsLibStrings.ThreeArrowsGray | officeDashJsLib.officeDashJsLibStrings.ThreeFlags | officeDashJsLib.officeDashJsLibStrings.ThreeTrafficLights1 | officeDashJsLib.officeDashJsLibStrings.ThreeTrafficLights2 | officeDashJsLib.officeDashJsLibStrings.ThreeSigns | officeDashJsLib.officeDashJsLibStrings.ThreeSymbols | officeDashJsLib.officeDashJsLibStrings.ThreeSymbols2 | officeDashJsLib.officeDashJsLibStrings.FourArrows | officeDashJsLib.officeDashJsLibStrings.FourArrowsGray | officeDashJsLib.officeDashJsLibStrings.FourRedToBlack | officeDashJsLib.officeDashJsLibStrings.FourRating | officeDashJsLib.officeDashJsLibStrings.FourTrafficLights | officeDashJsLib.officeDashJsLibStrings.FiveArrows | officeDashJsLib.officeDashJsLibStrings.FiveArrowsGray | officeDashJsLib.officeDashJsLibStrings.FiveRating | officeDashJsLib.officeDashJsLibStrings.FiveQuarters | officeDashJsLib.officeDashJsLibStrings.ThreeStars | officeDashJsLib.officeDashJsLibStrings.ThreeTriangles | officeDashJsLib.officeDashJsLibStrings.FiveBoxes = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Excel.IconSetConditionalFormat` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Excel.IconSetConditionalFormat` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.IconSetConditionalFormat` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): IconSetConditionalFormat = js.native
  def load(option: java.lang.String): IconSetConditionalFormat = js.native
  def load(option: js.Array[java.lang.String]): IconSetConditionalFormat = js.native
  def load(option: officeDashJsLib.Anon_Expand): IconSetConditionalFormat = js.native
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.IconSetConditionalFormatLoadOptions): IconSetConditionalFormat = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: IconSetConditionalFormat): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Excel.IconSetConditionalFormat): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.IconSetConditionalFormatUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.IconSetConditionalFormatUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.IconSetConditionalFormatData = js.native
}

