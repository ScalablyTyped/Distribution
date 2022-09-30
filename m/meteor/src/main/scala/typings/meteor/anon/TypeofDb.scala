package typings.meteor.anon

import org.scalablytyped.runtime.Instantiable2
import typings.mongodb.mod.Db
import typings.mongodb.mod.MongoClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDb
  extends StObject
     with Instantiable2[/* client */ MongoClient, /* databaseName */ String, Db] {
  
  var SYSTEM_COMMAND_COLLECTION: String = js.native
  
  var SYSTEM_INDEX_COLLECTION: String = js.native
  
  var SYSTEM_JS_COLLECTION: String = js.native
  
  /* Excluded from this release type: s */
  var SYSTEM_NAMESPACE_COLLECTION: String = js.native
  
  var SYSTEM_PROFILE_COLLECTION: String = js.native
  
  var SYSTEM_USER_COLLECTION: String = js.native
}
