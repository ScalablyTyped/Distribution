package typings.postcssCssVariables

import org.scalablytyped.runtime.Shortcut
import typings.postcss.mod.Declaration
import typings.postcss.mod.PluginCreator
import typings.postcssCssVariables.anon.IsImportant
import typings.postcssCssVariables.postcssCssVariablesStrings.computed
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("postcss-css-variables", JSImport.Namespace)
  @js.native
  val ^ : PluginCreator[Options] = js.native
  
  trait Options extends StObject {
    
    /**
      * Allows you to preserve custom propertires and `var()` usage in output.
      *
      * Values:
      *
      * - `false`: Removes -`-var` declarations and replaces `var()` with their resolved/computed values.
      * - `true`: Keeps `var()` declarations in the output and has the computed value as a fallback declaration.
      *   Also keeps computed `--var` declarations.
      * - `'computed'`: Keeps computed `--var` declarations in the output.
      *   Handy to make them available to your JavaScript.
      * - Function: Return how to preserve each given declaration.
      *
      * @see {@link <https://github.com/MadLittleMods/postcss-css-variables#preserve-default-false>}
      *
      * @default false
      */
    var preserve: js.UndefOr[
        Boolean | computed | (js.Function1[/* declaration */ Declaration, Boolean | computed])
      ] = js.undefined
    
    /**
      * Keeps at-rules such as media queries in the order they were defined.
      *
      * @see {@link <https://github.com/MadLittleMods/postcss-css-variables#preserveatrulesorder-default-false>}
      *
      * @default false
      */
    var preserveAtRulesOrder: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to preserve the custom property declarations inserted via the `variables` option in the final output.
      *
      * A typical use case is CSS Modules, where you would want to avoid repeating custom property definitions
      * in every module passed through this plugin.
      * Setting this option to `false` prevents JS-injected variables from appearing in output CSS.
      *
      * @see {@link <https://github.com/MadLittleMods/postcss-css-variables#preserveinjectedvariables-default-true>}
      *
      * @default true
      */
    var preserveInjectedVariables: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Define an object map of variables in JavaScript that will be declared at the `:root` scope.
      *
      * The object keys are automatically prefixed with `--` if not already.
      *
      * @see {@link <https://github.com/MadLittleMods/postcss-css-variables#variables-default->}
      */
    var variables: js.UndefOr[Record[String, Variable]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPreserve(value: Boolean | computed | (js.Function1[/* declaration */ Declaration, Boolean | computed])): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveAtRulesOrder(value: Boolean): Self = StObject.set(x, "preserveAtRulesOrder", value.asInstanceOf[js.Any])
      
      inline def setPreserveAtRulesOrderUndefined: Self = StObject.set(x, "preserveAtRulesOrder", js.undefined)
      
      inline def setPreserveFunction1(value: /* declaration */ Declaration => Boolean | computed): Self = StObject.set(x, "preserve", js.Any.fromFunction1(value))
      
      inline def setPreserveInjectedVariables(value: Boolean): Self = StObject.set(x, "preserveInjectedVariables", value.asInstanceOf[js.Any])
      
      inline def setPreserveInjectedVariablesUndefined: Self = StObject.set(x, "preserveInjectedVariables", js.undefined)
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
      
      inline def setVariables(value: Record[String, Variable]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  type Variable = String | IsImportant
  
  type _To = PluginCreator[Options]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[Options] = ^
}
