package typings.meteor.anon

import org.scalablytyped.runtime.Instantiable1
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
    * @see https://www.mongodb.com/docs/manual/reference/connection-string/
    */
  def connect(url: String): js.Promise[MongoClient] = js.native
  def connect(url: String, options: MongoClientOptions): js.Promise[MongoClient] = js.native
}
