package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Workbook is the top level object which contains related workbook objects such as worksheets, tables, ranges, etc.
         *
         * [Api set: ExcelApi 1.1]
         */

trait WorkbookLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Represents the Excel application instance that contains this workbook.
              *
              * [Api set: ExcelApi 1.1]
              */
  var application: js.UndefOr[ApplicationLoadOptions] = js.undefined
  /**
               *
               * True if the workbook is in auto save mode.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var autoSave: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Represents a collection of bindings that are part of the workbook.
              *
              * [Api set: ExcelApi 1.1]
              */
  var bindings: js.UndefOr[BindingCollectionLoadOptions] = js.undefined
  /**
               *
               * Returns a number about the version of Excel Calculation Engine. Read-Only.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var calculationEngineVersion: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * True if all charts in the workbook are tracking the actual data points to which they are attached.
              False if the charts track the index of the data points.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var chartDataPointTrack: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * True if no changes have been made to the specified workbook since it was last saved.
              You can set this property to True if you want to close a modified workbook without either saving it or being prompted to save it.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var isDirty: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * Gets the workbook name. Read-only.
               *
               * [Api set: ExcelApi 1.7]
               */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * True if the workbook has ever been saved locally or online.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var previouslySaved: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Gets the workbook properties.
              *
              * [Api set: ExcelApi 1.7]
              */
  var properties: js.UndefOr[DocumentPropertiesLoadOptions] = js.undefined
  /**
              *
              * Returns workbook protection object for a workbook.
              *
              * [Api set: ExcelApi 1.7]
              */
  var protection: js.UndefOr[WorkbookProtectionLoadOptions] = js.undefined
  /**
               *
               * True if the workbook is open in Read-only mode. Read-only.
               *
               * [Api set: ExcelApi 1.8]
               */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Represents a collection of tables associated with the workbook.
              *
              * [Api set: ExcelApi 1.1]
              */
  var tables: js.UndefOr[TableCollectionLoadOptions] = js.undefined
  /**
               *
               * True if the workbook uses the 1904 date system.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var use1904DateSystem: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * True if calculations in this workbook will be done using only the precision of the numbers as they're displayed.
              Data will permanently lose accuracy when switching this property from false to true.
               *
               * [Api set: ExcelApi BETA (PREVIEW ONLY)]
               * @beta
               */
  var usePrecisionAsDisplayed: js.UndefOr[scala.Boolean] = js.undefined
}

