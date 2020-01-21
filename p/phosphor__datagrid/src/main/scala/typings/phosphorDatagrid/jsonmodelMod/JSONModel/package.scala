package typings.phosphorDatagrid.jsonmodelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSONModel {
  /**
    * A type alias for a data source for a JSON data model.
    *
    * A data source is an array of JSON object records which represent
    * the rows of the table. The keys of the records correspond to the
    * field names of the columns.
    */
  type DataSource = js.Array[typings.phosphorCoreutils.jsonMod.ReadonlyJSONObject]
}
