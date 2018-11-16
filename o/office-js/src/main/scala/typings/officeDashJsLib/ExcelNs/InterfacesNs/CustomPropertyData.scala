package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "customProperty.toJSON()". */

trait CustomPropertyData extends js.Object {
  /**
               *
               * Gets the key of the custom property. Read only.
               *
               * [Api set: ExcelApi 1.7]
               */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Gets the value type of the custom property. Read only.
               *
               * [Api set: ExcelApi 1.7]
               */
  var `type`: js.UndefOr[
    officeDashJsLib.ExcelNs.DocumentPropertyType | officeDashJsLib.officeDashJsLibStrings.Number | officeDashJsLib.officeDashJsLibStrings.Boolean | officeDashJsLib.officeDashJsLibStrings.Date | officeDashJsLib.officeDashJsLibStrings.String | officeDashJsLib.officeDashJsLibStrings.Float
  ] = js.undefined
  /**
               *
               * Gets or sets the value of the custom property.
               *
               * [Api set: ExcelApi 1.7]
               */
  var value: js.UndefOr[js.Any] = js.undefined
}

