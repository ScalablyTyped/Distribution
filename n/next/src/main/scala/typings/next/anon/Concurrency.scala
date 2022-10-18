package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Concurrency extends StObject {
  
  var concurrency: js.UndefOr[Double] = js.undefined
  
  var filter: js.UndefOr[js.Function1[/* filePath */ String, Boolean]] = js.undefined
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
}
object Concurrency {
  
  inline def apply(): Concurrency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Concurrency]
  }
  
  extension [Self <: Concurrency](x: Self) {
    
    inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
    
    inline def setFilter(value: /* filePath */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
  }
}
