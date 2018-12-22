package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * This object represents the font attributes (font name, font size, color, etc.) for a TextRange in the Shape.
     *
     * [Api set: ExcelApi BETA (PREVIEW ONLY)]
     * @beta
     */
@JSGlobal("Excel.ShapeFont")
@js.native
class ShapeFont ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Represents the bold status of font. Returns null the TextRange includes both bold and non-bold text fragments.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var bold: scala.Boolean = js.native
  /**
           *
           * HTML color code representation of the text color. E.g. #FF0000 represents Red. Returns null if the TextRange includes text fragments with different colors.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var color: java.lang.String = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_ShapeFont: RequestContext = js.native
  /**
           *
           * Represents the italic status of font. Return null if the TextRange includes both italic and non-italic text fragments.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var italic: scala.Boolean = js.native
  /**
           *
           * Represents font name (e.g. "Calibri"). If the text is Complex Script or East Asian language, represents corresponding font name; otherwise represents Latin font name.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var name: java.lang.String = js.native
  /**
           *
           * Represents font size in points (e.g. 11). Return null if the TextRange includes text fragments with different font sizes.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var size: scala.Double = js.native
  /**
           *
           * Type of underline applied to the font. Return null if the TextRange includes text fragments with different underline styles. See Excel.ShapeFontUnderlineStyle for details.
           *
           * [Api set: ExcelApi BETA (PREVIEW ONLY)]
           * @beta
           */
  var underline: ShapeFontUnderlineStyle | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Single | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Double | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Heavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dotted | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DottedHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Dash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashLong | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DashLongHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDashHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDotDash | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DotDotDashHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Wavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WavyHeavy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.WavyDouble = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ShapeFont` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ShapeFont` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ShapeFont` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): ShapeFont = js.native
  def load(option: java.lang.String): ShapeFont = js.native
  def load(option: js.Array[java.lang.String]): ShapeFont = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Select): ShapeFont = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ShapeFont` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ShapeFont` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ShapeFont` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ShapeFontLoadOptions): ShapeFont = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ShapeFont): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ShapeFontUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ShapeFont): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ShapeFontUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ShapeFont): scala.Unit = js.native
  /**
          * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
          * Whereas the original Excel.ShapeFont object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Excel.Interfaces.ShapeFontData`) that contains shallow copies of any loaded child properties from the original object.
          */
  def toJSON(): officeDashJsDashPreviewLib.ExcelNs.InterfacesNs.ShapeFontData = js.native
}

