package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCollectionsOptions
  extends StObject
     with CommandOperationOptions {
  
  /** Since 4.0: If true and nameOnly is true, allows a user without the required privilege (i.e. listCollections action on the database) to run the command when access control is enforced. */
  var authorizedCollections: js.UndefOr[Boolean] = js.undefined
  
  /** The batchSize for the returned command cursor or if pre 2.8 the systems batch collection */
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  
  /** Since 4.0: If true, will only return the collection name in the response, and will omit additional info */
  var nameOnly: js.UndefOr[Boolean] = js.undefined
}
object ListCollectionsOptions {
  
  inline def apply(): ListCollectionsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionsOptions]
  }
  
  extension [Self <: ListCollectionsOptions](x: Self) {
    
    inline def setAuthorizedCollections(value: Boolean): Self = StObject.set(x, "authorizedCollections", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedCollectionsUndefined: Self = StObject.set(x, "authorizedCollections", js.undefined)
    
    inline def setBatchSize(value: scala.Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setNameOnly(value: Boolean): Self = StObject.set(x, "nameOnly", value.asInstanceOf[js.Any])
    
    inline def setNameOnlyUndefined: Self = StObject.set(x, "nameOnly", js.undefined)
  }
}
