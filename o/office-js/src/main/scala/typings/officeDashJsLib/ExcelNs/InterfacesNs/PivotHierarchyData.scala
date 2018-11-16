package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pivotHierarchy.toJSON()". */

trait PivotHierarchyData extends js.Object {
  /**
              *
              * Returns the PivotFields associated with the PivotHierarchy.
              *
              * [Api set: ExcelApi 1.8]
              */
  var fields: js.UndefOr[js.Array[PivotFieldData]] = js.undefined
  /**
               *
               * Id of the PivotHierarchy.
               *
               * [Api set: ExcelApi 1.8]
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Name of the PivotHierarchy.
               *
               * [Api set: ExcelApi 1.8]
               */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

