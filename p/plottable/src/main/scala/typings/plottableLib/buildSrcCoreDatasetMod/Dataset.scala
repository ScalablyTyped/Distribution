package typings
package plottableLib.buildSrcCoreDatasetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/core/dataset", "Dataset")
@js.native
/**
  * A Dataset contains an array of data and some metadata.
  * Changes to the data or metadata will cause anything subscribed to the Dataset to update.
  *
  * @constructor
  * @param {any[]} [data=[]] The data for this Dataset.
  * @param {any} [metadata={}] An object containing additional information.
  */
class Dataset () extends js.Object {
  def this(data: js.Array[_]) = this()
  def this(data: js.Array[_], metadata: js.Any) = this()
  var _callbacks: js.Any = js.native
  var _data: js.Any = js.native
  var _metadata: js.Any = js.native
  /**
    * Store an update id for fast detection of changes to the dataset. Also, this
    * uses a global monotonically increasing value so that it may be used as a
    * combination update-aware memoize key.
    */
  var _updateId: js.Any = js.native
  /* private */ def _dispatchUpdate(): js.Any = js.native
  /**
    * Gets the data.
    *
    * @returns {any[]}
    */
  def data(): js.Array[_] = js.native
  /**
    * Sets the data.
    *
    * @param {any[]} data
    * @returns {Dataset} The calling Dataset.
    */
  def data(data: js.Array[_]): this.type = js.native
  /**
    * Gets the metadata.
    *
    * @returns {any}
    */
  def metadata(): js.Any = js.native
  /**
    * Sets the metadata.
    *
    * @param {any} metadata
    * @returns {Dataset} The calling Dataset.
    */
  def metadata(metadata: js.Any): this.type = js.native
  /**
    * Removes a callback that would be called when the Dataset updates.
    *
    * @param {DatasetCallback} callback
    * @returns {Dataset} The calling Dataset.
    */
  def offUpdate(callback: DatasetCallback): this.type = js.native
  /**
    * Adds a callback to be called when the Dataset updates.
    *
    * @param {DatasetCallback} callback.
    * @returns {Dataset} The calling Dataset.
    */
  def onUpdate(callback: DatasetCallback): this.type = js.native
  def updateId(): scala.Double = js.native
}

