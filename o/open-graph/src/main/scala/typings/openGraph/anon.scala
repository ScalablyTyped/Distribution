package typings.openGraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Alternate extends StObject {
    
    /** An array of other locales this page is available in. */
    var alternate: js.UndefOr[String | js.Array[String]] = js.native
  }
  object Alternate {
    
    @scala.inline
    def apply(): Alternate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alternate]
    }
    
    @scala.inline
    implicit class AlternateMutableBuilder[Self <: Alternate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlternate(value: String | js.Array[String]): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternateUndefined: Self = StObject.set(x, "alternate", js.undefined)
      
      @scala.inline
      def setAlternateVarargs(value: String*): Self = StObject.set(x, "alternate", js.Array(value :_*))
    }
  }
}
