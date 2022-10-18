package typings.postcssNested

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.PluginCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-nested", JSImport.Namespace)
  @js.native
  val ^ : Nested = js.native
  
  type Nested = PluginCreator[Options]
  
  trait Options extends StObject {
    
    /**
      * By default, plugin will bubble only `@media`, `@supports` and `@layer`
      * at-rules. Use this option to add your custom at-rules to this list.
      */
    var bubble: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * By default, plugin will strip out any empty selector generated
      * by intermediate nesting levels. You can set this option to `true`
      * to preserve them.
      */
    var preserveEmpty: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The plugin supports the SCSS custom at-rule `@at-root` which breaks
      * rule blocks out of their nested position. If you want, you can choose
      * a new custom name for this rule in your code.
      */
    var rootRuleName: js.UndefOr[String] = js.undefined
    
    /**
      * By default, plugin will unwrap only `@font-face`, `@keyframes`,
      * and `@document` at-rules. You can add your custom at-rules
      * to this list by this option.
      */
    var unwrap: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBubble(value: js.Array[String]): Self = StObject.set(x, "bubble", value.asInstanceOf[js.Any])
      
      inline def setBubbleUndefined: Self = StObject.set(x, "bubble", js.undefined)
      
      inline def setBubbleVarargs(value: String*): Self = StObject.set(x, "bubble", js.Array(value*))
      
      inline def setPreserveEmpty(value: Boolean): Self = StObject.set(x, "preserveEmpty", value.asInstanceOf[js.Any])
      
      inline def setPreserveEmptyUndefined: Self = StObject.set(x, "preserveEmpty", js.undefined)
      
      inline def setRootRuleName(value: String): Self = StObject.set(x, "rootRuleName", value.asInstanceOf[js.Any])
      
      inline def setRootRuleNameUndefined: Self = StObject.set(x, "rootRuleName", js.undefined)
      
      inline def setUnwrap(value: js.Array[String]): Self = StObject.set(x, "unwrap", value.asInstanceOf[js.Any])
      
      inline def setUnwrapUndefined: Self = StObject.set(x, "unwrap", js.undefined)
      
      inline def setUnwrapVarargs(value: String*): Self = StObject.set(x, "unwrap", js.Array(value*))
    }
  }
  
  type _To = Nested
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Nested = ^
}
