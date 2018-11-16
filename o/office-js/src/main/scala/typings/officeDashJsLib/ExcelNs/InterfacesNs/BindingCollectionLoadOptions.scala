package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents the collection of all the binding objects that are part of the workbook.
         *
         * [Api set: ExcelApi 1.1]
         */

trait BindingCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Represents binding identifier. Read-only.
               *
               * [Api set: ExcelApi 1.1]
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Returns the type of the binding. See Excel.BindingType for details. Read-only.
               *
               * [Api set: ExcelApi 1.1]
               */
  var `type`: js.UndefOr[scala.Boolean] = js.undefined
}

