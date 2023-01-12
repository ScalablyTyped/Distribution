package typings.postcss

import typings.postcss.anon.PartialRuleProps
import typings.postcss.anon.Raw
import typings.postcss.libContainerMod.ContainerProps
import typings.postcss.libNodeMod.AnyNode
import typings.postcss.libNodeMod.ChildNode
import typings.postcss.libNodeMod.ChildProps
import typings.postcss.postcssStrings.rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRuleMod {
  
  @JSImport("postcss/lib/rule", JSImport.Default)
  @js.native
  open class default ()
    extends Rule
       with AnyNode
       with ChildNode {
    def this(defaults: RuleProps) = this()
  }
  
  @js.native
  trait Rule
    extends typings.postcss.libContainerMod.default[ChildNode] {
    
    def assign(overrides: RuleProps): this.type = js.native
    
    def clone(overrides: PartialRuleProps): this.type = js.native
    
    def cloneAfter(overrides: PartialRuleProps): this.type = js.native
    
    def cloneBefore(overrides: PartialRuleProps): this.type = js.native
    
    @JSName("parent")
    var parent_Rule: js.UndefOr[typings.postcss.libContainerMod.default[ChildNode]] = js.native
    
    @JSName("raws")
    var raws_Rule: RuleRaws = js.native
    
    /**
      * The rule’s full selector represented as a string.
      *
      * ```js
      * const root = postcss.parse('a, b { }')
      * const rule = root.first
      * rule.selector //=> 'a, b'
      * ```
      */
    var selector: String = js.native
    
    /**
      * An array containing the rule’s individual selectors.
      * Groups of selectors are split at commas.
      *
      * ```js
      * const root = postcss.parse('a, b { }')
      * const rule = root.first
      *
      * rule.selector  //=> 'a, b'
      * rule.selectors //=> ['a', 'b']
      *
      * rule.selectors = ['a', 'strong']
      * rule.selector //=> 'a, strong'
      * ```
      */
    var selectors: js.Array[String] = js.native
    
    @JSName("type")
    var type_Rule: rule = js.native
  }
  
  trait RuleProps
    extends StObject
       with ContainerProps
       with ChildProps {
    
    /** Information used to generate byte-to-byte equal node string as it was in the origin input. */
    var raws: js.UndefOr[RuleRaws] = js.undefined
    
    /** Selector or selectors of the rule. */
    var selector: js.UndefOr[String] = js.undefined
    
    /** Selectors of the rule represented as an array of strings. */
    var selectors: js.UndefOr[js.Array[String]] = js.undefined
  }
  object RuleProps {
    
    inline def apply(): RuleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleProps] (val x: Self) extends AnyVal {
      
      inline def setRaws(value: RuleRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
      
      inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSelectors(value: js.Array[String]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
      
      inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
      
      inline def setSelectorsVarargs(value: String*): Self = StObject.set(x, "selectors", js.Array(value*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: unknown} */ trait RuleRaws extends StObject {
    
    /**
      * The space symbols after the last child of the node to the end of the node.
      */
    var after: js.UndefOr[String] = js.undefined
    
    /**
      * The space symbols before the node. It also stores `*`
      * and `_` symbols before the declaration (IE hack).
      */
    var before: js.UndefOr[String] = js.undefined
    
    /**
      * The symbols between the selector and `{` for rules.
      */
    var between: js.UndefOr[String] = js.undefined
    
    /**
      * Contains `true` if there is semicolon after rule.
      */
    var ownSemicolon: js.UndefOr[String] = js.undefined
    
    /**
      * The rule’s selector with comments.
      */
    var selector: js.UndefOr[Raw] = js.undefined
    
    /**
      * Contains `true` if the last child has an (optional) semicolon.
      */
    var semicolon: js.UndefOr[Boolean] = js.undefined
  }
  object RuleRaws {
    
    inline def apply(): RuleRaws = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleRaws]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleRaws] (val x: Self) extends AnyVal {
      
      inline def setAfter(value: String): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBetween(value: String): Self = StObject.set(x, "between", value.asInstanceOf[js.Any])
      
      inline def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
      
      inline def setOwnSemicolon(value: String): Self = StObject.set(x, "ownSemicolon", value.asInstanceOf[js.Any])
      
      inline def setOwnSemicolonUndefined: Self = StObject.set(x, "ownSemicolon", js.undefined)
      
      inline def setSelector(value: Raw): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setSemicolon(value: Boolean): Self = StObject.set(x, "semicolon", value.asInstanceOf[js.Any])
      
      inline def setSemicolonUndefined: Self = StObject.set(x, "semicolon", js.undefined)
    }
  }
}
