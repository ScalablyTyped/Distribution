package typings.officeJs.Excel

import typings.officeJs.Excel.Interfaces.IconSetConditionalFormatData
import typings.officeJs.Excel.Interfaces.IconSetConditionalFormatLoadOptions
import typings.officeJs.Excel.Interfaces.IconSetConditionalFormatUpdateData
import typings.officeJs.OfficeExtension.ClientObject
import typings.officeJs.OfficeExtension.UpdateOptions
import typings.officeJs.anon.Expand
import typings.officeJs.officeJsStrings.FiveArrows
import typings.officeJs.officeJsStrings.FiveArrowsGray
import typings.officeJs.officeJsStrings.FiveBoxes
import typings.officeJs.officeJsStrings.FiveQuarters
import typings.officeJs.officeJsStrings.FiveRating
import typings.officeJs.officeJsStrings.FourArrows
import typings.officeJs.officeJsStrings.FourArrowsGray
import typings.officeJs.officeJsStrings.FourRating
import typings.officeJs.officeJsStrings.FourRedToBlack
import typings.officeJs.officeJsStrings.FourTrafficLights
import typings.officeJs.officeJsStrings.Invalid
import typings.officeJs.officeJsStrings.ThreeArrows
import typings.officeJs.officeJsStrings.ThreeArrowsGray
import typings.officeJs.officeJsStrings.ThreeFlags
import typings.officeJs.officeJsStrings.ThreeSigns
import typings.officeJs.officeJsStrings.ThreeStars
import typings.officeJs.officeJsStrings.ThreeSymbols
import typings.officeJs.officeJsStrings.ThreeSymbols2
import typings.officeJs.officeJsStrings.ThreeTrafficLights1
import typings.officeJs.officeJsStrings.ThreeTrafficLights2
import typings.officeJs.officeJsStrings.ThreeTriangles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents an IconSet criteria for conditional formatting.
  *
  * [Api set: ExcelApi 1.6]
  */
@js.native
trait IconSetConditionalFormat
  extends StObject
     with ClientObject {
  
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
    * Queues up a command to load the specified properties of the object. You must call `context.sync()` before reading the properties.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): IconSetConditionalFormat = js.native
  def load(options: IconSetConditionalFormatLoadOptions): IconSetConditionalFormat = js.native
  def load(propertyNamesAndPaths: Expand): IconSetConditionalFormat = js.native
  def load(propertyNames: String): IconSetConditionalFormat = js.native
  def load(propertyNames: js.Array[String]): IconSetConditionalFormat = js.native
  
  /**
    *
    * If true, reverses the icon orders for the IconSet. Note that this cannot be set if custom icons are used.
    *
    * [Api set: ExcelApi 1.6]
    */
  var reverseIconOrder: Boolean = js.native
  
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: IconSetConditionalFormat): Unit = js.native
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
  def set(properties: IconSetConditionalFormatUpdateData): Unit = js.native
  def set(properties: IconSetConditionalFormatUpdateData, options: UpdateOptions): Unit = js.native
  
  /**
    *
    * If true, hides the values and only shows icons.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showIconOnly: Boolean = js.native
  
  /**
    *
    * If set, displays the IconSet option for the conditional format.
    *
    * [Api set: ExcelApi 1.6]
    */
  var style: IconSet | Invalid | ThreeArrows | ThreeArrowsGray | ThreeFlags | ThreeTrafficLights1 | ThreeTrafficLights2 | ThreeSigns | ThreeSymbols | ThreeSymbols2 | FourArrows | FourArrowsGray | FourRedToBlack | FourRating | FourTrafficLights | FiveArrows | FiveArrowsGray | FiveRating | FiveQuarters | ThreeStars | ThreeTriangles | FiveBoxes = js.native
  
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Excel.IconSetConditionalFormat object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.IconSetConditionalFormatData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): IconSetConditionalFormatData = js.native
}
