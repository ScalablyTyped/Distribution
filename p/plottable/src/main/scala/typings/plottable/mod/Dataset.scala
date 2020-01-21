package typings.plottable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable", "Dataset")
@js.native
/**
  * A Dataset contains an array of data and some metadata.
  * Changes to the data or metadata will cause anything subscribed to the Dataset to update.
  *
  * @constructor
  * @param {any[]} [data=[]] The data for this Dataset.
  * @param {any} [metadata={}] An object containing additional information.
  */
class Dataset ()
  extends typings.plottable.datasetMod.Dataset {
  def this(data: js.Array[_]) = this()
  def this(data: js.Array[_], metadata: js.Any) = this()
}

