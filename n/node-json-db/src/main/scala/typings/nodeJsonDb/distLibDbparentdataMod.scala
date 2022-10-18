package typings.nodeJsonDb

import typings.nodeJsonDb.distLibUtilsMod.KeyValue
import typings.nodeJsonDb.mod.JsonDB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibDbparentdataMod {
  
  @JSImport("node-json-db/dist/lib/DBParentData", "DBParentData")
  @js.native
  open class DBParentData protected () extends StObject {
    def this(data: Any, db: JsonDB, dataPath: String) = this()
    def this(data: Any, db: JsonDB, dataPath: String, parent: String) = this()
    
    /**
      * Check if it's an array
      * @param deletion
      */
    /* private */ var checkArray: Any = js.native
    
    val data: KeyValue = js.native
    
    val dataPath: String = js.native
    
    val db: JsonDB = js.native
    
    /**
      * Delete the data of the current path
      */
    def delete(): Unit = js.native
    
    /**
      * Get the data linked to this path
      */
    def getData(): Any = js.native
    
    val parent: js.UndefOr[String] = js.native
    
    /**
      * Set the data to the wanted path
      * @param toSet
      */
    def setData(toSet: Any): Unit = js.native
  }
}
