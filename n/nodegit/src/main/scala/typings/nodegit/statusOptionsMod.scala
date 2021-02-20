package typings.nodegit

import org.scalablytyped.runtime.StringDictionary
import typings.nodegit.strArrayMod.Strarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusOptionsMod {
  
  @js.native
  trait StatusOptions
    extends /* key */ StringDictionary[js.Any] {
    
    var flags: js.UndefOr[Double] = js.native
    
    var pathspec: js.UndefOr[Strarray | String | js.Array[String]] = js.native
    
    var show: js.UndefOr[Double] = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object StatusOptions {
    
    @scala.inline
    def apply(): StatusOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatusOptions]
    }
    
    @scala.inline
    implicit class StatusOptionsMutableBuilder[Self <: StatusOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setPathspec(value: Strarray | String | js.Array[String]): Self = StObject.set(x, "pathspec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathspecUndefined: Self = StObject.set(x, "pathspec", js.undefined)
      
      @scala.inline
      def setPathspecVarargs(value: String*): Self = StObject.set(x, "pathspec", js.Array(value :_*))
      
      @scala.inline
      def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
