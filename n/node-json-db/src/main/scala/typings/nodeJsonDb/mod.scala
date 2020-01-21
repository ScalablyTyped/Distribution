package typings.nodeJsonDb

import typings.nodeJsonDb.jsonDBConfigMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-json-db", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class JsonDB protected () extends js.Object {
    /**
      * JSONDB Constructor
      * @param filename where to save the "DB". Can also be used to give the whole configuration
      * @param saveOnPush save the database at each push command into the json file
      * @param humanReadable the JSON file will be readable easily by a human
      * @param separator what to use as separator
      */
    def this(filename: String) = this()
    def this(filename: Config) = this()
    def this(filename: String, saveOnPush: Boolean) = this()
    def this(filename: Config, saveOnPush: Boolean) = this()
    def this(filename: String, saveOnPush: Boolean, humanReadable: Boolean) = this()
    def this(filename: Config, saveOnPush: Boolean, humanReadable: Boolean) = this()
    def this(filename: String, saveOnPush: Boolean, humanReadable: Boolean, separator: String) = this()
    def this(filename: Config, saveOnPush: Boolean, humanReadable: Boolean, separator: String) = this()
    val config: js.Any = js.native
    var data: js.Any = js.native
    var getParentData: js.Any = js.native
    var loaded: js.Any = js.native
    /**
      * Process datapath into different parts
      * @param dataPath
      */
    var processDataPath: js.Any = js.native
    var retrieveData: js.Any = js.native
    /**
      * Delete the data
      * @param dataPath path leading to the data
      */
    def delete(dataPath: String): Unit = js.native
    /**
      * Check for existing datapath
      * @param dataPath
      */
    def exists(dataPath: String): Boolean = js.native
    /**
      * Find all specific entry in an array/object
      * @param rootPath base dataPath from where to start searching
      * @param callback method to filter the result and find the wanted entry. Receive the entry and it's index.
      */
    def filter[T](rootPath: String, callback: FindCallback): js.UndefOr[js.Array[T]] = js.native
    /**
      * Find a specific entry in an array/object
      * @param rootPath base dataPath from where to start searching
      * @param callback method to filter the result and find the wanted entry. Receive the entry and it's index.
      */
    def find[T](rootPath: String, callback: FindCallback): js.UndefOr[T] = js.native
    /**
      * Get the wanted data
      * @param dataPath
      */
    def getData(dataPath: String): js.Any = js.native
    /**
      * Manually load the database
      * It is automatically called when the first getData is done
      */
    def load(): Unit = js.native
    /**
      * Pushing data into the database
      * @param dataPath path leading to the data
      * @param data data to push
      * @param override overriding or not the data, if not, it will merge them
      */
    def push(dataPath: String, data: js.Any): Unit = js.native
    def push(dataPath: String, data: js.Any, `override`: Boolean): Unit = js.native
    /**
      * Reload the database from the file
      */
    def reload(): Unit = js.native
    /**
      * Only use this if you know what you're doing.
      * It reset the full data of the database.
      * @param data
      */
    def resetData(data: js.Any): Unit = js.native
    /**
      * Manually save the database
      * By default you can't save the database if it's not loaded
      * @param force force the save of the database
      */
    def save(): Unit = js.native
    def save(force: Boolean): Unit = js.native
  }
  
  type FindCallback = js.Function2[/* entry */ js.Any, /* index */ Double | String, Boolean]
}

