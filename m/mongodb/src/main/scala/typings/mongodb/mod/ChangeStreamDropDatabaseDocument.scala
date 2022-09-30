package typings.mongodb.mod

import typings.mongodb.mongodbStrings.dropDatabase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamDropDatabaseDocument
  extends StObject
     with ChangeStreamDocumentCommon
     with ChangeStreamDocument[Any] {
  
  /** The database dropped */
  var ns: typings.mongodb.anon.Db
  
  /** Describes the type of operation represented in this change notification */
  var operationType: dropDatabase
}
object ChangeStreamDropDatabaseDocument {
  
  inline def apply(_id: ResumeToken, ns: typings.mongodb.anon.Db): ChangeStreamDropDatabaseDocument = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], operationType = "dropDatabase")
    __obj.asInstanceOf[ChangeStreamDropDatabaseDocument]
  }
  
  extension [Self <: ChangeStreamDropDatabaseDocument](x: Self) {
    
    inline def setNs(value: typings.mongodb.anon.Db): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    inline def setOperationType(value: dropDatabase): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
  }
}
