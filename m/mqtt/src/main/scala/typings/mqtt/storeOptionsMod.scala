package typings.mqtt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storeOptionsMod {
  
  @js.native
  trait IStoreOptions extends StObject {
    
    /**
      * true, clear _inflights at close
      */
    var clean: js.UndefOr[Boolean] = js.native
  }
  object IStoreOptions {
    
    @scala.inline
    def apply(): IStoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IStoreOptions]
    }
    
    @scala.inline
    implicit class IStoreOptionsMutableBuilder[Self <: IStoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
    }
  }
}
