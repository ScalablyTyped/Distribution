package typings.navigo

import typings.navigo.mod.NavigoHooks
import typings.navigo.mod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait As extends StObject {
    
    var as: String = js.native
    
    def uses(params: Params, query: String): Unit = js.native
  }
  object As {
    
    @scala.inline
    def apply(as: String, uses: (Params, String) => Unit): As = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], uses = js.Any.fromFunction2(uses))
      __obj.asInstanceOf[As]
    }
    
    @scala.inline
    implicit class AsMutableBuilder[Self <: As] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUses(value: (Params, String) => Unit): Self = StObject.set(x, "uses", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Hooks extends StObject {
    
    var hooks: NavigoHooks = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var params: js.UndefOr[Params] = js.native
    
    var query: String = js.native
    
    var url: String = js.native
  }
  object Hooks {
    
    @scala.inline
    def apply(hooks: NavigoHooks, query: String, url: String): Hooks = {
      val __obj = js.Dynamic.literal(hooks = hooks.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hooks]
    }
    
    @scala.inline
    implicit class HooksMutableBuilder[Self <: Hooks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHooks(value: NavigoHooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
