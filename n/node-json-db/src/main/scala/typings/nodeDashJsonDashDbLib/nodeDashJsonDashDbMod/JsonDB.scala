package typings
package nodeDashJsonDashDbLib.nodeDashJsonDashDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonDB extends js.Object {
  /**
       * Delete the data
       * @param dataPath path leading to the data
       */
  def delete(dataPath: java.lang.String): scala.Unit = js.native
  /**
       * Get the deta stored in the data base
       * @param dataPath path leading to the data
       * @returns {*}
       */
  def getData(dataPath: java.lang.String): js.Any = js.native
  /**
       * Manually load the database
       * It is automatically called when the first getData is done
       */
  def load(): scala.Unit = js.native
  /**
       * Pushing data into the database
       * @param dataPath path leading to the data
       * @param data data to push
       * @param override overriding or not the data, if not, it will merge them
       */
  def push(dataPath: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
       * Pushing data into the database
       * @param dataPath path leading to the data
       * @param data data to push
       * @param override overriding or not the data, if not, it will merge them
       */
  def push(dataPath: java.lang.String, data: js.Any, `override`: scala.Boolean): scala.Unit = js.native
  /**
       * Reload the database from the file
       */
  def reload(): scala.Unit = js.native
  /**
       * Manually save the database
       * By default you can't save the database if it's not loaded
       * @param force force the save of the database
       */
  def save(): scala.Unit = js.native
  /**
       * Manually save the database
       * By default you can't save the database if it's not loaded
       * @param force force the save of the database
       */
  def save(force: scala.Boolean): scala.Unit = js.native
}

