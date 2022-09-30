package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountDocumentsOptions
  extends StObject
     with AggregateOptions {
  
  /** The maximum amounts to count before aborting. */
  var limit: js.UndefOr[scala.Double] = js.undefined
  
  /** The number of documents to skip. */
  var skip: js.UndefOr[scala.Double] = js.undefined
}
object CountDocumentsOptions {
  
  inline def apply(): CountDocumentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountDocumentsOptions]
  }
  
  extension [Self <: CountDocumentsOptions](x: Self) {
    
    inline def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setSkip(value: scala.Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
  }
}
