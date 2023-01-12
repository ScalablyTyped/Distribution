package typings.mdv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined mdv.mdv.Options & {  warnings :true} */
  trait Optionswarningstrue extends StObject {
    
    /**
      * save intermediary html
      * @default false
      */
    var save: js.UndefOr[Boolean] = js.undefined
    
    /**
      * markdown document path
      */
    var source: js.UndefOr[String] = js.undefined
    
    /**
      * enable warnings
      * @default false
      */
    var warnings: js.UndefOr[Boolean] = js.undefined
  }
  object Optionswarningstrue {
    
    inline def apply(): Optionswarningstrue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionswarningstrue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Optionswarningstrue] (val x: Self) extends AnyVal {
      
      inline def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
      
      inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    }
  }
}
