package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The sequence constructor.
  * @param config The configuration for the sequence
  */
@JSImport("orientjs", "Sequence")
@js.native
class Sequence () extends js.Object {
  var cache: js.UndefOr[scala.Double] = js.native
  var db: js.UndefOr[Db] = js.native
  var incr: js.UndefOr[scala.Double] = js.native
  var name: js.UndefOr[java.lang.String] = js.native
  var start: js.UndefOr[scala.Double] = js.native
  var `type`: js.UndefOr[java.lang.String] = js.native
  var value: js.UndefOr[scala.Double] = js.native
  /**
    * Cache the given class data for fast lookup later.
    *
    * @param  sequences The sequence objects to cache.
    * @return                The db instance.
    */
  def cacheData(sequences: js.Array[Sequence]): Db = js.native
  /**
    * Configure the sequence instance.
    * @param  config The configuration object.
    */
  def configure(): scala.Unit = js.native
  def configure(config: js.Any): scala.Unit = js.native
  @JSName("create")
  def create_CACHED(name: java.lang.String, `type`: orientjsLib.orientjsLibStrings.CACHED): bluebirdLib.bluebirdMod.^[Sequence] = js.native
  @JSName("create")
  def create_CACHED(name: java.lang.String, `type`: orientjsLib.orientjsLibStrings.CACHED, start: scala.Double): bluebirdLib.bluebirdMod.^[Sequence] = js.native
  @JSName("create")
  def create_CACHED(
    name: java.lang.String,
    `type`: orientjsLib.orientjsLibStrings.CACHED,
    start: scala.Double,
    incerement: scala.Double
  ): bluebirdLib.bluebirdMod.^[Sequence] = js.native
  @JSName("create")
  def create_CACHED(
    name: java.lang.String,
    `type`: orientjsLib.orientjsLibStrings.CACHED,
    start: scala.Double,
    incerement: scala.Double,
    cache: scala.Double
  ): bluebirdLib.bluebirdMod.^[Sequence] = js.native
  /**
    * Create a new sequence.
    *
    * @param  name            The name of the sequence to create.
    * @param  type      The type of sequence.
    * @param  start The start number.
    * @param  incerement The increment number.
    * @param  cache     The cache number
    * @promise {Object}                The created sequence object
    */
  @JSName("create")
  def create_ORDERED(name: java.lang.String, `type`: orientjsLib.orientjsLibStrings.ORDERED): bluebirdLib.bluebirdMod.^[Sequence] = js.native
  @JSName("create")
  def create_ORDERED(name: java.lang.String, `type`: orientjsLib.orientjsLibStrings.ORDERED, start: scala.Double): bluebirdLib.bluebirdMod.^[Sequence] = js.native
  @JSName("create")
  def create_ORDERED(
    name: java.lang.String,
    `type`: orientjsLib.orientjsLibStrings.ORDERED,
    start: scala.Double,
    incerement: scala.Double
  ): bluebirdLib.bluebirdMod.^[Sequence] = js.native
  @JSName("create")
  def create_ORDERED(
    name: java.lang.String,
    `type`: orientjsLib.orientjsLibStrings.ORDERED,
    start: scala.Double,
    incerement: scala.Double,
    cache: scala.Double
  ): bluebirdLib.bluebirdMod.^[Sequence] = js.native
  /**
    * Delete a sequence.
    *
    * @param  name The name of the sequence to delete.
    * @param  config The config.
    * @promise {Db}         The database instance.
    */
  def drop(name: java.lang.String): bluebirdLib.bluebirdMod.^[Db] = js.native
  def drop(name: java.lang.String, config: js.Object): bluebirdLib.bluebirdMod.^[Db] = js.native
  /**
    * Get a sequence by name.
    *
    * @param   name The name of the sequence.
    * @param   refresh Whether to refresh the data, defaults to false.
    * @promise {Object}          The sequence object if it exists.
    */
  def get(name: java.lang.String): bluebirdLib.bluebirdMod.^[Sequence] = js.native
  def get(name: java.lang.String, refresh: scala.Boolean): bluebirdLib.bluebirdMod.^[Sequence] = js.native
  /**
    * Retreive a list of sequences from the database.
    *
    * @param  refresh Whether to refresh the list or not.
    * @promise {Object[]}       An array of class objects.
    */
  def list(refresh: scala.Boolean): bluebirdLib.bluebirdMod.^[js.Array[Sequence]] = js.native
  /**
    * Reload the sequence instance.
    *
    * @promise {Sequence} The class instance.
    */
  def reload(): bluebirdLib.bluebirdMod.^[js.Array[Sequence]] = js.native
  /**
    * update a  sequence.
    *
    * @param  name            The name of the sequence to create.
    * @param incerement The increment number.
    * @param cache The cache number
    * @param  start The start number.
    * @promise {Object} The created sequence object
    */
  def update(name: java.lang.String): bluebirdLib.bluebirdMod.^[Sequence] = js.native
  def update(name: java.lang.String, start: scala.Double): bluebirdLib.bluebirdMod.^[Sequence] = js.native
  def update(name: java.lang.String, start: scala.Double, incerement: scala.Double): bluebirdLib.bluebirdMod.^[Sequence] = js.native
  def update(name: java.lang.String, start: scala.Double, incerement: scala.Double, cache: scala.Double): bluebirdLib.bluebirdMod.^[Sequence] = js.native
}

