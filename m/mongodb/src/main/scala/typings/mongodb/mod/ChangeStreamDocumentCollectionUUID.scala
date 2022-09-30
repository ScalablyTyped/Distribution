package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeStreamDocumentCollectionUUID extends StObject {
  
  /**
    * The UUID (Binary subtype 4) of the collection that the operation was performed on.
    *
    * Only present when the `showExpandedEvents` flag is enabled.
    *
    * **NOTE:** collectionUUID will be converted to a NodeJS Buffer if the promoteBuffers
    *    flag is enabled.
    *
    * @sinceServerVersion 6.1.0
    */
  var collectionUUID: typings.bson.mod.Binary
}
object ChangeStreamDocumentCollectionUUID {
  
  inline def apply(collectionUUID: typings.bson.mod.Binary): ChangeStreamDocumentCollectionUUID = {
    val __obj = js.Dynamic.literal(collectionUUID = collectionUUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeStreamDocumentCollectionUUID]
  }
  
  extension [Self <: ChangeStreamDocumentCollectionUUID](x: Self) {
    
    inline def setCollectionUUID(value: typings.bson.mod.Binary): Self = StObject.set(x, "collectionUUID", value.asInstanceOf[js.Any])
  }
}
