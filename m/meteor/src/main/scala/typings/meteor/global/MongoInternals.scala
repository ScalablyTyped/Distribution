package typings.meteor.global

import typings.meteor.anon.MongoMongoConnection
import typings.meteor.anon.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MongoInternals {
  
  @JSGlobal("MongoInternals")
  @js.native
  val ^ : js.Any = js.native
  
  object NpmModules {
    
    @JSGlobal("MongoInternals.NpmModules")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("MongoInternals.NpmModules.mongodb")
    @js.native
    def mongodb: Version = js.native
    inline def mongodb_=(x: Version): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mongodb")(x.asInstanceOf[js.Any])
  }
  
  inline def defaultRemoteCollectionDriver(): MongoMongoConnection = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRemoteCollectionDriver")().asInstanceOf[MongoMongoConnection]
}
