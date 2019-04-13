package typings
package orientjsLib.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The class constructor.
  * @param config The configuration for the class
  */
@JSImport("orientjs", "Class")
@js.native
class Class () extends js.Object {
  var clusterIds: js.UndefOr[js.Array[scala.Double]] = js.native
  var db: js.UndefOr[Db] = js.native
  var defaultClusterId: js.UndefOr[js.Any] = js.native
  var name: js.UndefOr[java.lang.String] = js.native
  var originalName: js.UndefOr[java.lang.String] = js.native
  var property: Property = js.native
  var shortName: js.UndefOr[java.lang.String] = js.native
  var superClass: js.UndefOr[java.lang.String] = js.native
  /**
    * Cache the given class data for fast lookup later.
    *
    * @param  classes The class objects to cache.
    * @return                The db instance.
    */
  def cacheData(classes: js.Array[Class]): Db = js.native
  /**
    * Configure the class instance.
    * @param  config The configuration object.
    */
  def configure(): scala.Unit = js.native
  def configure(config: js.Any): scala.Unit = js.native
  /**
    * Create a new class.
    *
    * @param  name            The name of the class to create.
    * @param  parentName      The name of the parent to extend, if any.
    * @param  cluster The cluster name or id.
    * @param  isAbstract     The flag for the abstract class
    * @param  ifnotexist     The flag for the if not exist class
    * @promise {Object}                The created class object
    */
  def create(name: java.lang.String): bluebirdLib.bluebirdMod.^[Class] = js.native
  def create(name: java.lang.String, parentName: java.lang.String): bluebirdLib.bluebirdMod.^[Class] = js.native
  def create(name: java.lang.String, parentName: java.lang.String, cluster: java.lang.String): bluebirdLib.bluebirdMod.^[Class] = js.native
  def create(
    name: java.lang.String,
    parentName: java.lang.String,
    cluster: java.lang.String,
    isAbstract: scala.Boolean
  ): bluebirdLib.bluebirdMod.^[Class] = js.native
  def create(
    name: java.lang.String,
    parentName: java.lang.String,
    cluster: java.lang.String,
    isAbstract: scala.Boolean,
    ifnotexist: scala.Boolean
  ): bluebirdLib.bluebirdMod.^[Class] = js.native
  /**
    * Create a record for this class.
    *
    * @param   record The record to create.
    * @promise {Object}        The created record.
    */
  def create(record: Record): bluebirdLib.bluebirdMod.^[Record] = js.native
  /**
    * Delete a class.
    *
    * @param  name The name of the class to delete.
    * @param  config The config.
    * @promise {Db}         The database instance.
    */
  def drop(name: java.lang.String): bluebirdLib.bluebirdMod.^[Db] = js.native
  def drop(name: java.lang.String, config: orientjsLib.Anon_Force): bluebirdLib.bluebirdMod.^[Db] = js.native
  /**
    * Find a list of records in the class.
    *
    * @param   attributes The attributes to search with.
    * @param  limit      The maximum number of records to return
    * @param  offset     The offset to start returning records from.
    * @promise {Object[]}          An array of records in the class.
    */
  def find(attributes: js.Any): bluebirdLib.bluebirdMod.^[js.Array[Record]] = js.native
  def find(attributes: js.Any, limit: scala.Double): bluebirdLib.bluebirdMod.^[js.Array[Record]] = js.native
  def find(attributes: js.Any, limit: scala.Double, offset: scala.Double): bluebirdLib.bluebirdMod.^[js.Array[Record]] = js.native
  /**
    * Get a class by name.
    *
    * @param   name The name of the class.
    * @param   refresh Whether to refresh the data, defaults to false.
    * @promise {Object}          The class object if it exists.
    */
  def get(name: java.lang.String): bluebirdLib.bluebirdMod.^[Class] = js.native
  def get(name: java.lang.String, refresh: scala.Boolean): bluebirdLib.bluebirdMod.^[Class] = js.native
  def list(limit: js.Any): bluebirdLib.bluebirdMod.^[js.Array[Class]] = js.native
  def list(limit: js.Any, offset: scala.Double): bluebirdLib.bluebirdMod.^[js.Array[Class]] = js.native
  def list(limit: scala.Boolean): bluebirdLib.bluebirdMod.^[js.Array[Class]] = js.native
  def list(limit: scala.Boolean, offset: scala.Double): bluebirdLib.bluebirdMod.^[js.Array[Class]] = js.native
  /**
    * Retreive a list of classes from the database.
    *
    * @param  refresh Whether to refresh the list or not.
    * @promise {Object[]}       An array of class objects.
    */
  def list(limit: scala.Double): bluebirdLib.bluebirdMod.^[js.Array[Class]] = js.native
  def list(limit: scala.Double, offset: scala.Double): bluebirdLib.bluebirdMod.^[js.Array[Class]] = js.native
  /**
    * Reload the class instance.
    *
    * @promise {Class} The class instance.
    */
  def reload(): bluebirdLib.bluebirdMod.^[js.Array[Class]] = js.native
  /**
    * Update the given class.
    *
    * @param    class    The class settings.
    * @param   reload   Whether to reload the class, default to true.
    * @promise {Object}           The updated class.
    */
  def update(cls: js.Any, reload: scala.Boolean): bluebirdLib.bluebirdMod.^[Class] = js.native
}

