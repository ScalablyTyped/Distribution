package typings.migrateMongo

import typings.migrateMongo.anon.Client
import typings.migrateMongo.anon.DatabaseName
import typings.migrateMongo.anon.PartialConfig
import typings.mongodb.mod.Callback
import typings.mongodb.mod.Db
import typings.mongodb.mod.MongoClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("migrate-mongo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object config {
    
    @JSImport("migrate-mongo", "config")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @internal
      */
    @JSImport("migrate-mongo", "config.DEFAULT_CONFIG_FILE_NAME")
    @js.native
    val DEFAULT_CONFIG_FILE_NAME: String = js.native
    
    /**
      * @internal
      */
    inline def getConfigFilename(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigFilename")().asInstanceOf[String]
    
    /**
      * Read the `migrate-mongo-config.js` file.
      */
    inline def read(): js.Promise[Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")().asInstanceOf[js.Promise[Config]]
    
    /**
      * Set the passed config object.
      * @param config The config object.
      */
    inline def set(config: PartialConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @internal
      */
    inline def shouldExist(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldExist")().asInstanceOf[js.Promise[Unit]]
    
    /**
      * @internal
      */
    inline def shouldNotExist(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldNotExist")().asInstanceOf[js.Promise[Unit]]
    
    trait Config extends StObject {
      
      /**
        * The MongoDB collection where the applied changes are stored.
        */
      var changelogCollectionName: String
      
      /**
        * The file extension to create migrations and search for in migration dir
        */
      var migrationFileExtension: js.UndefOr[String] = js.undefined
      
      /**
        * The migrations dir, can be an relative or absolute path.
        */
      var migrationsDir: js.UndefOr[String] = js.undefined
      
      var mongodb: DatabaseName
      
      /**
        * Enable the algorithm to create a checksum of the file contents and use that in the comparison to determine
        * if the file should be run.  Requires that scripts are coded to be run multiple times.
        */
      var useFileHash: js.UndefOr[Boolean] = js.undefined
    }
    object Config {
      
      inline def apply(changelogCollectionName: String, mongodb: DatabaseName): Config = {
        val __obj = js.Dynamic.literal(changelogCollectionName = changelogCollectionName.asInstanceOf[js.Any], mongodb = mongodb.asInstanceOf[js.Any])
        __obj.asInstanceOf[Config]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
        
        inline def setChangelogCollectionName(value: String): Self = StObject.set(x, "changelogCollectionName", value.asInstanceOf[js.Any])
        
        inline def setMigrationFileExtension(value: String): Self = StObject.set(x, "migrationFileExtension", value.asInstanceOf[js.Any])
        
        inline def setMigrationFileExtensionUndefined: Self = StObject.set(x, "migrationFileExtension", js.undefined)
        
        inline def setMigrationsDir(value: String): Self = StObject.set(x, "migrationsDir", value.asInstanceOf[js.Any])
        
        inline def setMigrationsDirUndefined: Self = StObject.set(x, "migrationsDir", js.undefined)
        
        inline def setMongodb(value: DatabaseName): Self = StObject.set(x, "mongodb", value.asInstanceOf[js.Any])
        
        inline def setUseFileHash(value: Boolean): Self = StObject.set(x, "useFileHash", value.asInstanceOf[js.Any])
        
        inline def setUseFileHashUndefined: Self = StObject.set(x, "useFileHash", js.undefined)
      }
    }
  }
  
  inline def create(description: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  object database {
    
    @JSImport("migrate-mongo", "database")
    @js.native
    val ^ : js.Any = js.native
    
    inline def connect(): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[js.Promise[Client]]
  }
  
  inline def down(db: Db, client: MongoClient): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("down")(db.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def init(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[Unit]]
  
  inline def status(db: Db): js.Promise[js.Array[MigrationStatus]] = ^.asInstanceOf[js.Dynamic].applyDynamic("status")(db.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MigrationStatus]]]
  
  inline def up(db: Db, client: MongoClient): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("up")(db.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  
  type MigrationFunction = (js.Function2[
    /* db */ Db, 
    (/* next */ Callback[Any]) | (/* client */ MongoClient), 
    js.Promise[Unit] | Unit
  ]) | (js.Function3[/* db */ Db, /* client */ MongoClient, /* next */ Callback[Any], Unit])
  
  trait MigrationStatus extends StObject {
    
    /**
      * Either "PENDING" or a JSON date.
      */
    var appliedAt: String
    
    var fileHash: js.UndefOr[String] = js.undefined
    
    var fileName: String
  }
  object MigrationStatus {
    
    inline def apply(appliedAt: String, fileName: String): MigrationStatus = {
      val __obj = js.Dynamic.literal(appliedAt = appliedAt.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MigrationStatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MigrationStatus] (val x: Self) extends AnyVal {
      
      inline def setAppliedAt(value: String): Self = StObject.set(x, "appliedAt", value.asInstanceOf[js.Any])
      
      inline def setFileHash(value: String): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
      
      inline def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    }
  }
}
