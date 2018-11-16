package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "worksheetProtection.toJSON()". */

trait WorksheetProtectionData extends js.Object {
  /**
               *
               * Sheet protection options. Read-only.
               *
               * [Api set: ExcelApi 1.2]
               */
  var options: js.UndefOr[officeDashJsLib.ExcelNs.WorksheetProtectionOptions] = js.undefined
  /**
               *
               * Indicates if the worksheet is protected. Read-only.
               *
               * [Api set: ExcelApi 1.2]
               */
  var `protected`: js.UndefOr[scala.Boolean] = js.undefined
}

