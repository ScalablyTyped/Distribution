package typings.postcss

import typings.postcss.anon.PartialAtRuleProps
import typings.postcss.anon.Raw
import typings.postcss.containerMod.ContainerProps
import typings.postcss.nodeMod.AnyNode
import typings.postcss.nodeMod.ChildNode
import typings.postcss.nodeMod.ChildProps
import typings.postcss.postcssStrings.atrule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atRuleMod {
  
  @JSImport("postcss/lib/at-rule", JSImport.Default)
  @js.native
  open class default ()
    extends AtRule
       with AnyNode
       with ChildNode {
    def this(defaults: AtRuleProps) = this()
  }
  
  @js.native
  trait AtRule
    extends typings.postcss.containerMod.default[ChildNode] {
    
    def assign(overrides: AtRuleProps): this.type = js.native
    
    def clone(overrides: PartialAtRuleProps): this.type = js.native
    
    def cloneAfter(overrides: PartialAtRuleProps): this.type = js.native
    
    def cloneBefore(overrides: PartialAtRuleProps): this.type = js.native
    
    /**
      * The at-rule’s name immediately follows the `@`.
      *
      * ```js
      * const root  = postcss.parse('@media print {}')
      * media.name //=> 'media'
      * const media = root.first
      * ```
      */
    var name: String = js.native
    
    /**
      * The at-rule’s parameters, the values that follow the at-rule’s name
      * but precede any {} block.
      *
      * ```js
      * const root  = postcss.parse('@media print, screen {}')
      * const media = root.first
      * media.params //=> 'print, screen'
      * ```
      */
    var params: String = js.native
    
    @JSName("parent")
    var parent_AtRule: js.UndefOr[typings.postcss.containerMod.default[ChildNode]] = js.native
    
    @JSName("raws")
    var raws_AtRule: AtRuleRaws = js.native
    
    @JSName("type")
    var type_AtRule: atrule = js.native
  }
  
  trait AtRuleProps
    extends StObject
       with ContainerProps
       with ChildProps {
    
    /** Name of the at-rule. */
    var name: String
    
    /** Parameters following the name of the at-rule. */
    var params: js.UndefOr[String | Double] = js.undefined
    
    /** Information used to generate byte-to-byte equal node string as it was in the origin input. */
    var raws: js.UndefOr[AtRuleRaws] = js.undefined
  }
  object AtRuleProps {
    
    inline def apply(name: String): AtRuleProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AtRuleProps]
    }
    
    extension [Self <: AtRuleProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: String | Double): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setRaws(value: AtRuleRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
      
      inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait AtRuleRaws extends StObject {
    
    /**
      * The space symbols after the last child of the node to the end of the node.
      */
    var after: js.UndefOr[String] = js.undefined
    
    /**
      * The space between the at-rule name and its parameters.
      */
    var afterName: js.UndefOr[String] = js.undefined
    
    /**
      * The space symbols before the node. It also stores `*`
      * and `_` symbols before the declaration (IE hack).
      */
    var before: js.UndefOr[String] = js.undefined
    
    /**
      * The symbols between the last parameter and `{` for rules.
      */
    var between: js.UndefOr[String] = js.undefined
    
    /**
      * The rule’s selector with comments.
      */
    var params: js.UndefOr[Raw] = js.undefined
    
    /**
      * Contains `true` if the last child has an (optional) semicolon.
      */
    var semicolon: js.UndefOr[Boolean] = js.undefined
  }
  object AtRuleRaws {
    
    inline def apply(): AtRuleRaws = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AtRuleRaws]
    }
    
    extension [Self <: AtRuleRaws](x: Self) {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterName(value: String): Self = StObject.set(x, "afterName", value.asInstanceOf[js.Any])
      
      inline def setAfterNameUndefined: Self = StObject.set(x, "afterName", js.undefined)
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBetween(value: String): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
      
      inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
      
      inline def setParams(value: Raw): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setSemicolon(value: Boolean): Self = StObject.set(x, "semicolon", value.asInstanceOf[js.Any])
      
      inline def setSemicolonUndefined: Self = StObject.set(x, "semicolon", js.undefined)
    }
  }
}
