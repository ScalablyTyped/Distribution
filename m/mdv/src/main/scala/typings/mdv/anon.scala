package typings.mdv

import typings.mdv.mdvBooleans.`true`
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
    var warnings: js.UndefOr[Boolean] & `true`
  }
  object Optionswarningstrue {
    
    inline def apply(warnings: js.UndefOr[Boolean] & `true`): Optionswarningstrue = {
      val __obj = js.Dynamic.literal(warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionswarningstrue]
    }
    
    extension [Self <: Optionswarningstrue](x: Self) {
      
      inline def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setWarnings(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    }
  }
}
