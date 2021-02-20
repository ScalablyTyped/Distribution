package typings.prettierPackageJson

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prettier-package-json", "check")
  @js.native
  def check(json: String): Boolean = js.native
  @JSImport("prettier-package-json", "check")
  @js.native
  def check(json: String, options: Options): Boolean = js.native
  @JSImport("prettier-package-json", "check")
  @js.native
  def check(json: js.Object): Boolean = js.native
  @JSImport("prettier-package-json", "check")
  @js.native
  def check(json: js.Object, options: Options): Boolean = js.native
  
  @JSImport("prettier-package-json", "format")
  @js.native
  def format(json: js.Object): String = js.native
  @JSImport("prettier-package-json", "format")
  @js.native
  def format(json: js.Object, options: Options): String = js.native
  
  type CompareFn = js.Function2[/* a */ String, /* b */ String, Double]
  
  @js.native
  trait Options extends StObject {
    
    var expandUsers: js.UndefOr[Boolean] = js.native
    
    var keyOrder: js.UndefOr[js.Array[String] | CompareFn] = js.native
    
    var tabWidth: js.UndefOr[Double] = js.native
    
    var useTabs: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandUsers(value: Boolean): Self = StObject.set(x, "expandUsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandUsersUndefined: Self = StObject.set(x, "expandUsers", js.undefined)
      
      @scala.inline
      def setKeyOrder(value: js.Array[String] | CompareFn): Self = StObject.set(x, "keyOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyOrderFunction2(value: (/* a */ String, /* b */ String) => Double): Self = StObject.set(x, "keyOrder", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyOrderUndefined: Self = StObject.set(x, "keyOrder", js.undefined)
      
      @scala.inline
      def setKeyOrderVarargs(value: String*): Self = StObject.set(x, "keyOrder", js.Array(value :_*))
      
      @scala.inline
      def setTabWidth(value: Double): Self = StObject.set(x, "tabWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabWidthUndefined: Self = StObject.set(x, "tabWidth", js.undefined)
      
      @scala.inline
      def setUseTabs(value: Boolean): Self = StObject.set(x, "useTabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTabsUndefined: Self = StObject.set(x, "useTabs", js.undefined)
    }
  }
}
