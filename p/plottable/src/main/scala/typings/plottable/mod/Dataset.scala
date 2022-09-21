package typings.plottable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
open class Dataset ()
  extends typings.plottable.datasetMod.Dataset {
  def this(data: js.Array[Any]) = this()
  def this(data: js.Array[Any], metadata: Any) = this()
  def this(data: Unit, metadata: Any) = this()
}
