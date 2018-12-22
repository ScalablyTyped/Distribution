package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents a defined name for a range of cells or value. Names can be primitive named objects (as seen in the type below), range object, or a reference to a range. This object can be used to obtain range object associated with names.
         *
         * [Api set: ExcelApi 1.1]
         */

trait NamedItemLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Returns an object containing values and types of the named item.
              *
              * [Api set: ExcelApi 1.7]
              */
  var arrayValues: js.UndefOr[NamedItemArrayValuesLoadOptions] = js.undefined
  /**
               *
               * Represents the comment associated with this name.
               *
               * [Api set: ExcelApi 1.4]
               */
  var comment: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets or sets the formula of the named item.  Formula always starts with a '=' sign.
               *
               * [Api set: ExcelApi 1.7]
               */
  var formula: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * The name of the object. Read-only.
               *
               * [Api set: ExcelApi 1.1]
               */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Indicates whether the name is scoped to the workbook or to a specific worksheet. Possible values are: Worksheet, Workbook. Read-only.
               *
               * [Api set: ExcelApi 1.4]
               */
  var scope: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Indicates the type of the value returned by the name's formula. See Excel.NamedItemType for details. Read-only.
               *
               * [Api set: ExcelApi 1.1 for String,Integer,Double,Boolean,Range,Error; 1.7 for Array]
               */
  var `type`: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Represents the value computed by the name's formula. For a named range, will return the range address. Read-only.
               *
               * [Api set: ExcelApi 1.1]
               */
  var value: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Specifies whether the object is visible or not.
               *
               * [Api set: ExcelApi 1.1]
               */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Returns the worksheet on which the named item is scoped to. Throws an error if the item is scoped to the workbook instead.
              *
              * [Api set: ExcelApi 1.4]
              */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
  /**
              *
              * Returns the worksheet on which the named item is scoped to. Returns a null object if the item is scoped to the workbook instead.
              *
              * [Api set: ExcelApi 1.4]
              */
  var worksheetOrNullObject: js.UndefOr[WorksheetLoadOptions] = js.undefined
}

