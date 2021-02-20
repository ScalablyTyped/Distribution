package typings.migrateMongo

import typings.migrateMongo.anon.Client
import typings.migrateMongo.anon.DatabaseName
import typings.mongodb.mod.Db
import typings.mongodb.mod.MongoCallback
import typings.mongodb.mod.MongoClient
import typings.mongodb.mod.UpdateWriteOpResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object config {
    
    /**
      * @internal
      */
    @JSImport("migrate-mongo", "config.DEFAULT_CONFIG_FILE_NAME")
    @js.native
    val DEFAULT_CONFIG_FILE_NAME: String = js.native
    
    /**
      * @internal
      */
    @JSImport("migrate-mongo", "config.getConfigFilename")
    @js.native
    def getConfigFilename(): String = js.native
    
    /**
      * Read the `migrate-mongo-config.js` file.
      */
    @JSImport("migrate-mongo", "config.read")
    @js.native
    def read(): js.Promise[Config] = js.native
    
    /**
      * @internal
      */
    @JSImport("migrate-mongo", "config.shouldExist")
    @js.native
    def shouldExist(): js.Promise[Unit] = js.native
    
    /**
      * @internal
      */
    @JSImport("migrate-mongo", "config.shouldNotExist")
    @js.native
    def shouldNotExist(): js.Promise[Unit] = js.native
    
    @js.native
    trait Config extends StObject {
      
      /**
        * The MongoDB collection where the applied changes are stored.
        */
      var changelogCollectionName: String = js.native
      
      /**
        * The migrations dir, can be an relative or absolute path.
        */
      var migrationsDir: js.UndefOr[String] = js.native
      
      var mongodb: DatabaseName = js.native
    }
    object Config {
      
      @scala.inline
      def apply(changelogCollectionName: String, mongodb: DatabaseName): Config = {
        val __obj = js.Dynamic.literal(changelogCollectionName = changelogCollectionName.asInstanceOf[js.Any], mongodb = mongodb.asInstanceOf[js.Any])
        __obj.asInstanceOf[Config]
      }
      
      @scala.inline
      implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChangelogCollectionName(value: String): Self = StObject.set(x, "changelogCollectionName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMigrationsDir(value: String): Self = StObject.set(x, "migrationsDir", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMigrationsDirUndefined: Self = StObject.set(x, "migrationsDir", js.undefined)
        
        @scala.inline
        def setMongodb(value: DatabaseName): Self = StObject.set(x, "mongodb", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("migrate-mongo", "create")
  @js.native
  def create(description: String): js.Promise[String] = js.native
  
  object database {
    
    @JSImport("migrate-mongo", "database.connect")
    @js.native
    def connect(): js.Promise[Client] = js.native
  }
  
  @JSImport("migrate-mongo", "down")
  @js.native
  def down(db: Db): js.Promise[js.Array[String]] = js.native
  
  @JSImport("migrate-mongo", "init")
  @js.native
  def init(): js.Promise[Unit] = js.native
  
  @JSImport("migrate-mongo", "status")
  @js.native
  def status(db: Db): js.Promise[js.Array[MigrationStatus]] = js.native
  
  @JSImport("migrate-mongo", "up")
  @js.native
  def up(db: Db): js.Promise[js.Array[String]] = js.native
  
  type MigrationFunction = (js.Function2[
    /* db */ Db, 
    (/* next */ MongoCallback[UpdateWriteOpResult]) | (/* client */ MongoClient), 
    js.Promise[Unit] | Unit
  ]) | (js.Function3[
    /* db */ Db, 
    /* client */ MongoClient, 
    /* next */ MongoCallback[UpdateWriteOpResult], 
    Unit
  ])
  
  @js.native
  trait MigrationStatus extends StObject {
    
    /**
      * Either "PENDING" or a JSON date.
      */
    var appliedAt: String = js.native
    
    var fileName: String = js.native
  }
  object MigrationStatus {
    
    @scala.inline
    def apply(appliedAt: String, fileName: String): MigrationStatus = {
      val __obj = js.Dynamic.literal(appliedAt = appliedAt.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[MigrationStatus]
    }
    
    @scala.inline
    implicit class MigrationStatusMutableBuilder[Self <: MigrationStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppliedAt(value: String): Self = StObject.set(x, "appliedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    }
  }
}
