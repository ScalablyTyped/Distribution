package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateCollectionOptions
  extends StObject
     with CommandOperationOptions {
  
  /** Validates a collection in the background, without interrupting read or write traffic (only in MongoDB 4.4+) */
  var background: js.UndefOr[Boolean] = js.undefined
}
object ValidateCollectionOptions {
  
  inline def apply(): ValidateCollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateCollectionOptions]
  }
  
  extension [Self <: ValidateCollectionOptions](x: Self) {
    
    inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
  }
}
