package typings.meteor.anon

import org.scalablytyped.runtime.Instantiable1
import typings.mongodb.mod.Callback
import typings.mongodb.mod.MongoClient
import typings.mongodb.mod.MongoClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofMongoClient
  extends StObject
     with Instantiable1[/* url */ String, MongoClient] {
  
  /**
    * Connect to MongoDB using a url
    *
    * @remarks
    * The programmatically provided options take precedence over the URI options.
    *
    * @see https://docs.mongodb.org/manual/reference/connection-string/
    */
  def connect(url: String): js.Promise[MongoClient] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def connect(url: String, callback: Callback[MongoClient]): Unit = js.native
  def connect(url: String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
  /** @deprecated Callbacks are deprecated and will be removed in the next major version. See [mongodb-legacy](https://github.com/mongodb-js/nodejs-mongodb-legacy) for migration assistance */
  def connect(url: String, options: MongoClientOptions, callback: Callback[MongoClient]): Unit = js.native
}
