package typings.migrateMongo

import typings.migrateMongo.anon.Client
import typings.migrateMongo.anon.DatabaseName
import typings.mongodb.mod.Db
import typings.mongodb.mod.MongoCallback
import typings.mongodb.mod.MongoClient
import typings.mongodb.mod.UpdateWriteOpResult
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
    @scala.inline
    def getConfigFilename(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfigFilename")().asInstanceOf[String]
    
    /**
      * Read the `migrate-mongo-config.js` file.
      */
    @scala.inline
    def read(): js.Promise[Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")().asInstanceOf[js.Promise[Config]]
    
    /**
      * @internal
      */
    @scala.inline
    def shouldExist(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldExist")().asInstanceOf[js.Promise[Unit]]
    
    /**
      * @internal
      */
    @scala.inline
    def shouldNotExist(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldNotExist")().asInstanceOf[js.Promise[Unit]]
    
    trait Config extends StObject {
      
      /**
        * The MongoDB collection where the applied changes are stored.
        */
      var changelogCollectionName: String
      
      /**
        * The migrations dir, can be an relative or absolute path.
        */
      var migrationsDir: js.UndefOr[String] = js.undefined
      
      var mongodb: DatabaseName
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
  
  @scala.inline
  def create(description: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(description.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  object database {
    
    @JSImport("migrate-mongo", "database")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def connect(): js.Promise[Client] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[js.Promise[Client]]
  }
  
  @scala.inline
  def down(db: Db): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("down")(db.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  @scala.inline
  def init(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def status(db: Db): js.Promise[js.Array[MigrationStatus]] = ^.asInstanceOf[js.Dynamic].applyDynamic("status")(db.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MigrationStatus]]]
  
  @scala.inline
  def up(db: Db): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("up")(db.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
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
  
  trait MigrationStatus extends StObject {
    
    /**
      * Either "PENDING" or a JSON date.
      */
    var appliedAt: String
    
    var fileName: String
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
