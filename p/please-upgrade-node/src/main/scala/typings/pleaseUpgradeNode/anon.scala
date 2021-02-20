package typings.pleaseUpgradeNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<please-upgrade-node.please-upgrade-node.Options> */
  @js.native
  trait PartialOptions extends StObject {
    
    var exitCode: js.UndefOr[Double] = js.native
    
    var message: js.UndefOr[js.Function1[/* version */ String, String]] = js.native
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
      
      @scala.inline
      def setMessage(value: /* version */ String => String): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
