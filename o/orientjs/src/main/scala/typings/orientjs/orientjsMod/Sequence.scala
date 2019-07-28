package typings.orientjs.orientjsMod

import typings.orientjs.orientjsStrings.CACHED
import typings.orientjs.orientjsStrings.ORDERED
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
  var cache: js.UndefOr[Double] = js.native
  var db: js.UndefOr[Db] = js.native
  var incr: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var start: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[Double] = js.native
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
  def configure(): Unit = js.native
  def configure(config: js.Any): Unit = js.native
  @JSName("create")
  def create_CACHED(name: String, `type`: CACHED): typings.bluebird.bluebirdMod.^[Sequence] = js.native
  @JSName("create")
  def create_CACHED(name: String, `type`: CACHED, start: Double): typings.bluebird.bluebirdMod.^[Sequence] = js.native
  @JSName("create")
  def create_CACHED(name: String, `type`: CACHED, start: Double, incerement: Double): typings.bluebird.bluebirdMod.^[Sequence] = js.native
  @JSName("create")
  def create_CACHED(name: String, `type`: CACHED, start: Double, incerement: Double, cache: Double): typings.bluebird.bluebirdMod.^[Sequence] = js.native
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
  def create_ORDERED(name: String, `type`: ORDERED): typings.bluebird.bluebirdMod.^[Sequence] = js.native
  @JSName("create")
  def create_ORDERED(name: String, `type`: ORDERED, start: Double): typings.bluebird.bluebirdMod.^[Sequence] = js.native
  @JSName("create")
  def create_ORDERED(name: String, `type`: ORDERED, start: Double, incerement: Double): typings.bluebird.bluebirdMod.^[Sequence] = js.native
  @JSName("create")
  def create_ORDERED(name: String, `type`: ORDERED, start: Double, incerement: Double, cache: Double): typings.bluebird.bluebirdMod.^[Sequence] = js.native
  /**
    * Delete a sequence.
    *
    * @param  name The name of the sequence to delete.
    * @param  config The config.
    * @promise {Db}         The database instance.
    */
  def drop(name: String): typings.bluebird.bluebirdMod.^[Db] = js.native
  def drop(name: String, config: js.Object): typings.bluebird.bluebirdMod.^[Db] = js.native
  /**
    * Get a sequence by name.
    *
    * @param   name The name of the sequence.
    * @param   refresh Whether to refresh the data, defaults to false.
    * @promise {Object}          The sequence object if it exists.
    */
  def get(name: String): typings.bluebird.bluebirdMod.^[Sequence] = js.native
  def get(name: String, refresh: Boolean): typings.bluebird.bluebirdMod.^[Sequence] = js.native
  /**
    * Retreive a list of sequences from the database.
    *
    * @param  refresh Whether to refresh the list or not.
    * @promise {Object[]}       An array of class objects.
    */
  def list(refresh: Boolean): typings.bluebird.bluebirdMod.^[js.Array[Sequence]] = js.native
  /**
    * Reload the sequence instance.
    *
    * @promise {Sequence} The class instance.
    */
  def reload(): typings.bluebird.bluebirdMod.^[js.Array[Sequence]] = js.native
  /**
    * update a  sequence.
    *
    * @param  name            The name of the sequence to create.
    * @param incerement The increment number.
    * @param cache The cache number
    * @param  start The start number.
    * @promise {Object} The created sequence object
    */
  def update(name: String): typings.bluebird.bluebirdMod.^[Sequence] = js.native
  def update(name: String, start: Double): typings.bluebird.bluebirdMod.^[Sequence] = js.native
  def update(name: String, start: Double, incerement: Double): typings.bluebird.bluebirdMod.^[Sequence] = js.native
  def update(name: String, start: Double, incerement: Double, cache: Double): typings.bluebird.bluebirdMod.^[Sequence] = js.native
}

