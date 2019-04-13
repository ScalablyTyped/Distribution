package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a binding in two dimensions of rows and columns.
  *
  * @remarks
  * The MatrixBinding object inherits the id property, type property, getDataAsync method, and setDataAsync method from the Binding object.
  */
@js.native
trait MatrixBinding extends Binding {
  /**
    * Gets the number of columns in the matrix data structure, as an integer value.
    */
  var columnCount: scala.Double = js.native
  /**
    * Gets the number of rows in the matrix data structure, as an integer value.
    */
  var rowCount: scala.Double = js.native
}

