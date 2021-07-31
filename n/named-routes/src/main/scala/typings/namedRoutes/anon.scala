package typings.namedRoutes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<named-routes.named-routes.RouteOptions> */
  trait PartialRouteOptions extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var recursiveWildcard: js.UndefOr[Boolean] = js.undefined
    
    var wildcardInPairs: js.UndefOr[Boolean] = js.undefined
  }
  object PartialRouteOptions {
    
    @scala.inline
    def apply(): PartialRouteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRouteOptions]
    }
    
    @scala.inline
    implicit class PartialRouteOptionsMutableBuilder[Self <: PartialRouteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRecursiveWildcard(value: Boolean): Self = StObject.set(x, "recursiveWildcard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveWildcardUndefined: Self = StObject.set(x, "recursiveWildcard", js.undefined)
      
      @scala.inline
      def setWildcardInPairs(value: Boolean): Self = StObject.set(x, "wildcardInPairs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWildcardInPairsUndefined: Self = StObject.set(x, "wildcardInPairs", js.undefined)
    }
  }
  
  /* Inlined std.Partial<named-routes.named-routes.RouterOptions> */
  trait PartialRouterOptions extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
  }
  object PartialRouterOptions {
    
    @scala.inline
    def apply(): PartialRouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRouterOptions]
    }
    
    @scala.inline
    implicit class PartialRouterOptionsMutableBuilder[Self <: PartialRouterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    }
  }
}
