package typings.meteor

import typings.mongodb.mod.Db
import typings.mongodb.mod.MongoClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MongoInternals {
  
  trait MongoConnection extends StObject {
    
    var client: MongoClient
    
    var db: Db
  }
  object MongoConnection {
    
    inline def apply(client: MongoClient, db: Db): typings.meteor.MongoInternals.MongoConnection = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.meteor.MongoInternals.MongoConnection]
    }
    
    extension [Self <: typings.meteor.MongoInternals.MongoConnection](x: Self) {
      
      inline def setClient(value: MongoClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setDb(value: Db): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
    }
  }
}
