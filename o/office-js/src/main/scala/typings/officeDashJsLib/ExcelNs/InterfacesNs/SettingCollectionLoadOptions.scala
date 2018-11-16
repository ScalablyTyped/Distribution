package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents a collection of key-value pair setting objects that are part of the workbook. The scope is limited to per file and add-in (task-pane or content) combination.
         *
         * [Api set: ExcelApi 1.4]
         */

trait SettingCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Returns the key that represents the id of the Setting. Read-only.
               *
               * [Api set: ExcelApi 1.4]
               */
  var key: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents the value stored for this setting.
               *
               * [Api set: ExcelApi 1.4]
               */
  var value: js.UndefOr[scala.Boolean] = js.undefined
}

