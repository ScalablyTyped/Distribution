package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountOptions
  extends StObject
     with CommandOperationOptions {
  
  /** An index name hint for the query. */
  var hint: js.UndefOr[String | Document] = js.undefined
  
  /** The maximum amounts to count before aborting. */
  var limit: js.UndefOr[scala.Double] = js.undefined
  
  /** The number of documents to skip. */
  var skip: js.UndefOr[scala.Double] = js.undefined
}
object CountOptions {
  
  inline def apply(): CountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountOptions] (val x: Self) extends AnyVal {
    
    inline def setHint(value: String | Document): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setLimit(value: scala.Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setSkip(value: scala.Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
  }
}
