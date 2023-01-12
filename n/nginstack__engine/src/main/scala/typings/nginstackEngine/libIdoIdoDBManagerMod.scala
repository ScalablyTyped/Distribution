package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIdoIdoDBManagerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/ido/IdoDBManager", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with IdoDBManager {
    
    /* CompleteClass */
    override def createDatabase(name: String): Unit = js.native
    
    /* CompleteClass */
    override def createTempDatabase(alias: String): IdoDB = js.native
    
    /* CompleteClass */
    override def databaseExists(name: String, searchInTempDBs: Boolean): Boolean = js.native
    
    /* CompleteClass */
    override def deleteDatabase(name: String): Unit = js.native
    
    /* CompleteClass */
    override def loadDatabase(name: String): IdoDB = js.native
    
    /* CompleteClass */
    override def renameDatabase(oldName: String, newName: String): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/ido/IdoDBManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type IdoDB = typings.nginstackEngine.libIdoIdoDBMod.^
  
  trait IdoDBManager extends StObject {
    
    def createDatabase(name: String): Unit
    
    def createTempDatabase(alias: String): IdoDB
    
    def databaseExists(name: String, searchInTempDBs: Boolean): Boolean
    
    def deleteDatabase(name: String): Unit
    
    def loadDatabase(name: String): IdoDB
    
    def renameDatabase(oldName: String, newName: String): Unit
  }
  object IdoDBManager {
    
    inline def apply(
      createDatabase: String => Unit,
      createTempDatabase: String => IdoDB,
      databaseExists: (String, Boolean) => Boolean,
      deleteDatabase: String => Unit,
      loadDatabase: String => IdoDB,
      renameDatabase: (String, String) => Unit
    ): IdoDBManager = {
      val __obj = js.Dynamic.literal(createDatabase = js.Any.fromFunction1(createDatabase), createTempDatabase = js.Any.fromFunction1(createTempDatabase), databaseExists = js.Any.fromFunction2(databaseExists), deleteDatabase = js.Any.fromFunction1(deleteDatabase), loadDatabase = js.Any.fromFunction1(loadDatabase), renameDatabase = js.Any.fromFunction2(renameDatabase))
      __obj.asInstanceOf[IdoDBManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdoDBManager] (val x: Self) extends AnyVal {
      
      inline def setCreateDatabase(value: String => Unit): Self = StObject.set(x, "createDatabase", js.Any.fromFunction1(value))
      
      inline def setCreateTempDatabase(value: String => IdoDB): Self = StObject.set(x, "createTempDatabase", js.Any.fromFunction1(value))
      
      inline def setDatabaseExists(value: (String, Boolean) => Boolean): Self = StObject.set(x, "databaseExists", js.Any.fromFunction2(value))
      
      inline def setDeleteDatabase(value: String => Unit): Self = StObject.set(x, "deleteDatabase", js.Any.fromFunction1(value))
      
      inline def setLoadDatabase(value: String => IdoDB): Self = StObject.set(x, "loadDatabase", js.Any.fromFunction1(value))
      
      inline def setRenameDatabase(value: (String, String) => Unit): Self = StObject.set(x, "renameDatabase", js.Any.fromFunction2(value))
    }
  }
}
