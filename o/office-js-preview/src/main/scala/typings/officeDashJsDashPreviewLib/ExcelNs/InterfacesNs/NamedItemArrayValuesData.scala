package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "namedItemArrayValues.toJSON()". */
trait NamedItemArrayValuesData extends js.Object {
  /**
    *
    * Represents the types for each item in the named item array
    *
    * [Api set: ExcelApi 1.7]
    */
  var types: js.UndefOr[js.Array[js.Array[officeDashJsDashPreviewLib.ExcelNs.RangeValueType]]] = js.undefined
  /**
    *
    * Represents the values of each item in the named item array.
    *
    * [Api set: ExcelApi 1.7]
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

