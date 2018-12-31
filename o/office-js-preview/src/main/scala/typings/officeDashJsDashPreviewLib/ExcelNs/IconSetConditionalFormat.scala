package typings
package officeDashJsDashPreviewLib.ExcelNs

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
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_IconSetConditionalFormat: RequestContext = js.native
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
  var style: IconSet | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Invalid | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeArrows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeArrowsGray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeFlags | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeTrafficLights1 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeTrafficLights2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeSigns | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeSymbols | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeSymbols2 | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourArrows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourArrowsGray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourRedToBlack | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourRating | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FourTrafficLights | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveArrows | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveArrowsGray | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveRating | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveQuarters | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeStars | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ThreeTriangles | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FiveBoxes | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LinkedEntityFinanceIcon | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.LinkedEntityMapIcon = js.native
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
  def load(option: officeDashJsDashPreviewLib.Anon_Select): IconSetConditionalFormat = js.native
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.IconSetConditionalFormatLoadOptions): IconSetConditionalFormat = js.native
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
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.IconSetConditionalFormatUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.IconSetConditionalFormatUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.IconSetConditionalFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.IconSetConditionalFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.IconSetConditionalFormatData = js.native
}

