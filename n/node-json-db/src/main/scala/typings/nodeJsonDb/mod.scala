package typings.nodeJsonDb

import typings.nodeJsonDb.distLibJsonDBConfigMod.JsonDBConfig
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-json-db", "Config")
  @js.native
  open class Config protected ()
    extends typings.nodeJsonDb.distLibJsonDBConfigMod.Config {
    def this(filename: String) = this()
    def this(filename: String, saveOnPush: Boolean) = this()
    def this(filename: String, saveOnPush: Boolean, humanReadable: Boolean) = this()
    def this(filename: String, saveOnPush: Unit, humanReadable: Boolean) = this()
    def this(filename: String, saveOnPush: Boolean, humanReadable: Boolean, separator: String) = this()
    def this(filename: String, saveOnPush: Boolean, humanReadable: Unit, separator: String) = this()
    def this(filename: String, saveOnPush: Unit, humanReadable: Boolean, separator: String) = this()
    def this(filename: String, saveOnPush: Unit, humanReadable: Unit, separator: String) = this()
    def this(
      filename: String,
      saveOnPush: Boolean,
      humanReadable: Boolean,
      separator: String,
      syncOnSave: Boolean
    ) = this()
    def this(
      filename: String,
      saveOnPush: Boolean,
      humanReadable: Boolean,
      separator: Unit,
      syncOnSave: Boolean
    ) = this()
    def this(filename: String, saveOnPush: Boolean, humanReadable: Unit, separator: String, syncOnSave: Boolean) = this()
    def this(filename: String, saveOnPush: Boolean, humanReadable: Unit, separator: Unit, syncOnSave: Boolean) = this()
    def this(filename: String, saveOnPush: Unit, humanReadable: Boolean, separator: String, syncOnSave: Boolean) = this()
    def this(filename: String, saveOnPush: Unit, humanReadable: Boolean, separator: Unit, syncOnSave: Boolean) = this()
    def this(filename: String, saveOnPush: Unit, humanReadable: Unit, separator: String, syncOnSave: Boolean) = this()
    def this(filename: String, saveOnPush: Unit, humanReadable: Unit, separator: Unit, syncOnSave: Boolean) = this()
  }
  
  @JSImport("node-json-db", "DataError")
  @js.native
  open class DataError protected ()
    extends typings.nodeJsonDb.distLibErrorsMod.DataError {
    def this(message: String, id: Number) = this()
    def this(message: String, id: Number, inner: js.Error) = this()
  }
  
  @JSImport("node-json-db", "DatabaseError")
  @js.native
  open class DatabaseError protected ()
    extends typings.nodeJsonDb.distLibErrorsMod.DatabaseError {
    def this(message: String, id: Number) = this()
    def this(message: String, id: Number, inner: js.Error) = this()
  }
  
  @JSImport("node-json-db", "JsonDB")
  @js.native
  open class JsonDB protected () extends StObject {
    /**
      * JSONDB Constructor
      * @param config Configuration for the database
      */
    def this(config: JsonDBConfig) = this()
    
    /* private */ val config: Any = js.native
    
    /**
      * Returns the number of element which constitutes the array
      * @param dataPath
      */
    def count(dataPath: String): js.Promise[Double] = js.native
    
    /* private */ var data: Any = js.native
    
    /**
      * Delete the data
      * @param dataPath path leading to the data
      */
    def delete(dataPath: String): js.Promise[Unit] = js.native
    
    /**
      * Check for existing datapath
      * @param dataPath
      */
    def exists(dataPath: String): js.Promise[Boolean] = js.native
    
    /**
      * Find all specific entry in an array/object
      * @param rootPath base dataPath from where to start searching
      * @param callback method to filter the result and find the wanted entry. Receive the entry and it's index.
      */
    def filter[T](rootPath: String, callback: FindCallback): js.Promise[js.UndefOr[js.Array[T]]] = js.native
    
    /**
      * Find a specific entry in an array/object
      * @param rootPath base dataPath from where to start searching
      * @param callback method to filter the result and find the wanted entry. Receive the entry and it's index.
      */
    def find[T](rootPath: String, callback: FindCallback): js.Promise[js.UndefOr[T]] = js.native
    
    /* private */ var getArrayData: Any = js.native
    
    /**
      * Get the wanted data
      * @param dataPath path of the data to retrieve
      */
    def getData(dataPath: String): js.Promise[Any] = js.native
    
    /**
      * Returns the index of the object that meets the criteria submitted. Returns -1, if no match is found.
      * @param dataPath  base dataPath from where to start searching
      * @param searchValue value to look for in the dataPath
      * @param propertyName name of the property to look for searchValue
      */
    def getIndex(dataPath: String, searchValue: String): js.Promise[Double] = js.native
    def getIndex(dataPath: String, searchValue: String, propertyName: String): js.Promise[Double] = js.native
    def getIndex(dataPath: String, searchValue: Double): js.Promise[Double] = js.native
    def getIndex(dataPath: String, searchValue: Double, propertyName: String): js.Promise[Double] = js.native
    
    /**
      * Return the index of the value inside the array. Returns -1, if no match is found.
      * @param dataPath  base dataPath from where to start searching
      * @param searchValue value to look for in the dataPath
      */
    def getIndexValue(dataPath: String, searchValue: String): js.Promise[Double] = js.native
    def getIndexValue(dataPath: String, searchValue: Double): js.Promise[Double] = js.native
    
    /**
      * Same as getData only here it's directly typed to your object
      * @param dataPath  path of the data to retrieve
      */
    def getObject[T](dataPath: String): js.Promise[T] = js.native
    
    /* private */ var getParentData: Any = js.native
    
    /**
      * Manually load the database
      * It is automatically called when the first getData is done
      */
    def load(): js.Promise[Unit] = js.native
    
    /* private */ var loaded: Any = js.native
    
    /**
      * Process datapath into different parts
      * @param dataPath
      */
    /* private */ var processDataPath: Any = js.native
    
    /**
      * Pushing data into the database
      * @param dataPath path leading to the data
      * @param data data to push
      * @param override overriding or not the data, if not, it will merge them
      */
    def push(dataPath: String, data: Any): js.Promise[Unit] = js.native
    def push(dataPath: String, data: Any, `override`: Boolean): js.Promise[Unit] = js.native
    
    /**
      * Reload the database from the file
      */
    def reload(): js.Promise[Unit] = js.native
    
    /**
      * Only use this if you know what you're doing.
      * It reset the full data of the database.
      * @param data
      */
    def resetData(data: Any): Unit = js.native
    
    /* private */ var retrieveData: Any = js.native
    
    /**
      * Manually save the database
      * By default you can't save the database if it's not loaded
      * @param force force the save of the database
      */
    def save(): js.Promise[Unit] = js.native
    def save(force: Boolean): js.Promise[Unit] = js.native
  }
  
  type FindCallback = js.Function2[/* entry */ Any, /* index */ Double | String, Boolean]
}
