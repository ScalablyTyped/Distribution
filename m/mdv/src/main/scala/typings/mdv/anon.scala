package typings.mdv

import typings.mdv.mdvBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined mdv.mdv.Options & {  warnings :true} */
  @js.native
  trait Optionswarningstrue extends StObject {
    
    /**
      * save intermediary html
      * @default false
      */
    var save: js.UndefOr[Boolean] = js.native
    
    /**
      * markdown document path
      */
    var source: js.UndefOr[String] = js.native
    
    /**
      * enable warnings
      * @default false
      */
    var warnings: js.UndefOr[Boolean] with `true` = js.native
  }
  object Optionswarningstrue {
    
    @scala.inline
    def apply(warnings: js.UndefOr[Boolean] with `true`): Optionswarningstrue = {
      val __obj = js.Dynamic.literal(warnings = warnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionswarningstrue]
    }
    
    @scala.inline
    implicit class OptionswarningstrueMutableBuilder[Self <: Optionswarningstrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setWarnings(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    }
  }
}
