package typings.mqtt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeOptionsMod {
  
  trait IStoreOptions extends StObject {
    
    /**
      * true, clear _inflights at close
      */
    var clean: js.UndefOr[Boolean] = js.undefined
  }
  object IStoreOptions {
    
    inline def apply(): IStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStoreOptions]
    }
    
    extension [Self <: IStoreOptions](x: Self) {
      
      inline def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      inline def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
    }
  }
}
