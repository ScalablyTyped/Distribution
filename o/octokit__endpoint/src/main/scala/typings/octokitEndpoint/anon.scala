package typings.octokitEndpoint

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictx
    extends StObject
       with /* x */ StringDictionary[js.UndefOr[String]] {
    
    var q: js.UndefOr[String] = js.undefined
  }
  object Dictx {
    
    @scala.inline
    def apply(): Dictx = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictx]
    }
    
    @scala.inline
    implicit class DictxMutableBuilder[Self <: Dictx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    }
  }
  
  trait Expand extends StObject {
    
    def expand(context: js.Object): String
  }
  object Expand {
    
    @scala.inline
    def apply(expand: js.Object => String): Expand = {
      val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand))
      __obj.asInstanceOf[Expand]
    }
    
    @scala.inline
    implicit class ExpandMutableBuilder[Self <: Expand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpand(value: js.Object => String): Self = StObject.set(x, "expand", js.Any.fromFunction1(value))
    }
  }
}
