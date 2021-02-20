package typings.pouchdbCore.PouchDB

import typings.pouchdbCore.Fetch
import typings.pouchdbCore.anon.Password
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Configuration {
  
  @js.native
  trait CommonDatabaseConfiguration extends StObject {
    
    /**
      * Database adapter to use.
      *
      * If unspecified, PouchDB will infer this automatically, preferring
      * IndexedDB to WebSQL in browsers that support both (i.e. Chrome,
      * Opera and Android 4.4+).
      */
    var adapter: js.UndefOr[String] = js.native
    
    /**
      * Database name.
      */
    var name: js.UndefOr[String] = js.native
  }
  object CommonDatabaseConfiguration {
    
    @scala.inline
    def apply(): CommonDatabaseConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonDatabaseConfiguration]
    }
    
    @scala.inline
    implicit class CommonDatabaseConfigurationMutableBuilder[Self <: CommonDatabaseConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: String): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration
    - typings.pouchdbCore.PouchDB.Configuration.RemoteDatabaseConfiguration
  */
  trait DatabaseConfiguration extends StObject
  object DatabaseConfiguration {
    
    @scala.inline
    def LocalDatabaseConfiguration(): typings.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.pouchdbCore.PouchDB.Configuration.LocalDatabaseConfiguration]
    }
    
    @scala.inline
    def RemoteDatabaseConfiguration(): typings.pouchdbCore.PouchDB.Configuration.RemoteDatabaseConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.pouchdbCore.PouchDB.Configuration.RemoteDatabaseConfiguration]
    }
  }
  
  @js.native
  trait LocalDatabaseConfiguration
    extends CommonDatabaseConfiguration
       with DatabaseConfiguration {
    
    /**
      * Enables auto compaction, which means compact() is called after
      * every change to the database.
      *
      * Defaults to false.
      */
    var auto_compaction: js.UndefOr[Boolean] = js.native
    
    /**
      * Use a md5 hash to create a deterministic revision number for documents.
      * Setting it to false will mean that the revision number will be a random UUID.
      * Defaults to true.
      */
    var deterministic_revs: js.UndefOr[Boolean] = js.native
    
    /**
      * A special constructor option, which appends a prefix to the database name
      * and can be helpful for URL-based or file-based LevelDOWN path names.
      */
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * How many old revisions we keep track (not a copy) of.
      */
    var revs_limit: js.UndefOr[Double] = js.native
    
    /**
      * Size of the database (Most significant for Safari)
      * option to set the max size in MB that Safari will grant to the local database. Valid options are: 10, 50, 100, 500 and 1000
      * ex_ new PouchDB("dbName", {size:100});
      */
    var size: js.UndefOr[Double] = js.native
  }
  object LocalDatabaseConfiguration {
    
    @scala.inline
    def apply(): LocalDatabaseConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocalDatabaseConfiguration]
    }
    
    @scala.inline
    implicit class LocalDatabaseConfigurationMutableBuilder[Self <: LocalDatabaseConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuto_compaction(value: Boolean): Self = StObject.set(x, "auto_compaction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuto_compactionUndefined: Self = StObject.set(x, "auto_compaction", js.undefined)
      
      @scala.inline
      def setDeterministic_revs(value: Boolean): Self = StObject.set(x, "deterministic_revs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeterministic_revsUndefined: Self = StObject.set(x, "deterministic_revs", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRevs_limit(value: Double): Self = StObject.set(x, "revs_limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevs_limitUndefined: Self = StObject.set(x, "revs_limit", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait RemoteDatabaseConfiguration
    extends CommonDatabaseConfiguration
       with DatabaseConfiguration {
    
    var auth: js.UndefOr[Password] = js.native
    
    var fetch: js.UndefOr[Fetch] = js.native
    
    /**
      * Disables automatic creation of databases.
      */
    var skip_setup: js.UndefOr[Boolean] = js.native
  }
  object RemoteDatabaseConfiguration {
    
    @scala.inline
    def apply(): RemoteDatabaseConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoteDatabaseConfiguration]
    }
    
    @scala.inline
    implicit class RemoteDatabaseConfigurationMutableBuilder[Self <: RemoteDatabaseConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuth(value: Password): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setFetch(value: (/* url */ String | Request, /* opts */ js.UndefOr[RequestInit]) => js.Promise[Response]): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      @scala.inline
      def setSkip_setup(value: Boolean): Self = StObject.set(x, "skip_setup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip_setupUndefined: Self = StObject.set(x, "skip_setup", js.undefined)
    }
  }
}
