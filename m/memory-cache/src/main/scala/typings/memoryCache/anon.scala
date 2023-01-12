package typings.memoryCache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait SkipDuplicates extends StObject {
    
    var skipDuplicates: js.UndefOr[Boolean] = js.undefined
  }
  object SkipDuplicates {
    
    inline def apply(): SkipDuplicates = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipDuplicates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkipDuplicates] (val x: Self) extends AnyVal {
      
      inline def setSkipDuplicates(value: Boolean): Self = StObject.set(x, "skipDuplicates", value.asInstanceOf[js.Any])
      
      inline def setSkipDuplicatesUndefined: Self = StObject.set(x, "skipDuplicates", js.undefined)
    }
  }
}
