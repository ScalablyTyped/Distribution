package typings.mongration

import typings.mongodb.mod.Db
import typings.mongration.mongrationStrings.`not-run`
import typings.mongration.mongrationStrings.`rollback-error`
import typings.mongration.mongrationStrings.error
import typings.mongration.mongrationStrings.ok
import typings.mongration.mongrationStrings.pending
import typings.mongration.mongrationStrings.rollback
import typings.mongration.mongrationStrings.skipped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mongration", "Migration")
  @js.native
  open class Migration protected () extends StObject {
    def this(dbConfig: DbConfig) = this()
    
    def add(paths: String): Unit = js.native
    def add(paths: js.Array[String]): Unit = js.native
    
    def addAllFromPath(path: String): Unit = js.native
    
    def migrate(): Unit = js.native
    def migrate(doneCb: js.Function2[/* err */ js.Error | Null, /* response */ js.Array[MigrationResponse], Unit]): Unit = js.native
  }
  
  trait DbConfig extends StObject {
    
    var db: js.UndefOr[String] = js.undefined
    
    var hosts: js.UndefOr[String] = js.undefined
    
    var migrationCollection: String
    
    var mongoUri: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var replicaSet: js.UndefOr[String] = js.undefined
    
    var user: js.UndefOr[String] = js.undefined
  }
  object DbConfig {
    
    inline def apply(migrationCollection: String): DbConfig = {
      val __obj = js.Dynamic.literal(migrationCollection = migrationCollection.asInstanceOf[js.Any])
      __obj.asInstanceOf[DbConfig]
    }
    
    extension [Self <: DbConfig](x: Self) {
      
      inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      inline def setHosts(value: String): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
      
      inline def setMigrationCollection(value: String): Self = StObject.set(x, "migrationCollection", value.asInstanceOf[js.Any])
      
      inline def setMongoUri(value: String): Self = StObject.set(x, "mongoUri", value.asInstanceOf[js.Any])
      
      inline def setMongoUriUndefined: Self = StObject.set(x, "mongoUri", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setReplicaSet(value: String): Self = StObject.set(x, "replicaSet", value.asInstanceOf[js.Any])
      
      inline def setReplicaSetUndefined: Self = StObject.set(x, "replicaSet", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait MigrationResponse extends StObject {
    
    var id: String
    
    var status: `not-run` | skipped | pending | ok | error | rollback | `rollback-error`
  }
  object MigrationResponse {
    
    inline def apply(id: String, status: `not-run` | skipped | pending | ok | error | rollback | `rollback-error`): MigrationResponse = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MigrationResponse]
    }
    
    extension [Self <: MigrationResponse](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: `not-run` | skipped | pending | ok | error | rollback | `rollback-error`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait MigrationStep extends StObject {
    
    var down: js.UndefOr[
        js.Function2[/* db */ Db, /* cb */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], Unit]
      ] = js.undefined
    
    var id: String
    
    def up(db: Db, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit
  }
  object MigrationStep {
    
    inline def apply(id: String, up: (Db, js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit): MigrationStep = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], up = js.Any.fromFunction2(up))
      __obj.asInstanceOf[MigrationStep]
    }
    
    extension [Self <: MigrationStep](x: Self) {
      
      inline def setDown(value: (/* db */ Db, /* cb */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit): Self = StObject.set(x, "down", js.Any.fromFunction2(value))
      
      inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setUp(value: (Db, js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Unit): Self = StObject.set(x, "up", js.Any.fromFunction2(value))
    }
  }
}
