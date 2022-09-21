package typings.mmdbLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @js.native
  trait Cache extends StObject {
    
    def get(key: String): Any = js.native
    def get(key: Double): Any = js.native
    
    def set(key: String, value: Any): Any = js.native
    def set(key: Double, value: Any): Any = js.native
  }
  
  trait ReaderOptions extends StObject {
    
    var cache: js.UndefOr[Cache] = js.undefined
  }
  object ReaderOptions {
    
    inline def apply(): ReaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReaderOptions]
    }
    
    extension [Self <: ReaderOptions](x: Self) {
      
      inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
}
