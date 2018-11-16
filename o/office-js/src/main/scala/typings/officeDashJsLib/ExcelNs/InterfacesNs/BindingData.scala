package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "binding.toJSON()". */

trait BindingData extends js.Object {
  /**
               *
               * Represents binding identifier. Read-only.
               *
               * [Api set: ExcelApi 1.1]
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Returns the type of the binding. See Excel.BindingType for details. Read-only.
               *
               * [Api set: ExcelApi 1.1]
               */
  var `type`: js.UndefOr[
    officeDashJsLib.ExcelNs.BindingType | officeDashJsLib.officeDashJsLibStrings.Range | officeDashJsLib.officeDashJsLibStrings.Table | officeDashJsLib.officeDashJsLibStrings.Text
  ] = js.undefined
}

