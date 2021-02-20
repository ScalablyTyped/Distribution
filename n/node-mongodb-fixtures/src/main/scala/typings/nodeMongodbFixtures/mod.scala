package typings.nodeMongodbFixtures

import typings.mongodb.mod.MongoClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Setup and tear down test fixtures with MongoDB.
    *
    * Use custom scripts to create indexes and more!
    *
    * @see https://www.npmjs.com/package/node-mongodb-fixtures
    */
  @JSImport("node-mongodb-fixtures", JSImport.Namespace)
  @js.native
  class ^ () extends Fixtures {
    def this(options: Options) = this()
  }
  
  /**
    * Setup and tear down test fixtures with MongoDB.
    *
    * Use custom scripts to create indexes and more!
    *
    * @see https://www.npmjs.com/package/node-mongodb-fixtures
    */
  @js.native
  trait Fixtures extends StObject {
    
    /**
      * @param uri MongoDB connection string.
      *
      * @param options MongoDB connection options.
      *
      * @param dbName Identifies a database to switch to. Useful when the db in the connection string differs from the db you want to connect to.
      */
    def connect(uri: String): js.Promise[this.type] = js.native
    def connect(uri: String, options: js.UndefOr[scala.Nothing], dbName: String): js.Promise[this.type] = js.native
    def connect(uri: String, options: MongoClientOptions): js.Promise[this.type] = js.native
    def connect(uri: String, options: MongoClientOptions, dbName: String): js.Promise[this.type] = js.native
    
    def disconnect(): js.Promise[Unit] = js.native
    
    def load(): js.Promise[this.type] = js.native
    
    def unload(): js.Promise[this.type] = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Specifiy the fixtures directory or default to `./fixtures`.
      */
    var dir: js.UndefOr[String] = js.native
    
    /**
      * Filter the fixtures present in the directory with a regex pattern.
      */
    var filter: js.UndefOr[String] = js.native
    
    /**
      * Specify `true` to mute the log output or default to `false`.
      */
    var mute: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setMute(value: Boolean): Self = StObject.set(x, "mute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMuteUndefined: Self = StObject.set(x, "mute", js.undefined)
    }
  }
}
