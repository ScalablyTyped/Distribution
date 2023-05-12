package typings.postcss.anon

import typings.postcss.libNodeMod.ChildNode
import typings.postcss.libNodeMod.ChildProps
import typings.postcss.libNodeMod.Source
import typings.postcss.libRuleMod.RuleRaws
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<postcss.postcss/lib/rule.RuleProps> */
trait PartialRuleProps extends StObject {
  
  var nodes: js.UndefOr[js.Array[ChildNode | ChildProps]] = js.undefined
  
  var raws: js.UndefOr[RuleRaws] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
  
  var selectors: js.UndefOr[js.Array[String]] = js.undefined
  
  var source: js.UndefOr[Source] = js.undefined
}
object PartialRuleProps {
  
  inline def apply(): PartialRuleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRuleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRuleProps] (val x: Self) extends AnyVal {
    
    inline def setNodes(value: js.Array[ChildNode | ChildProps]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: (ChildNode | ChildProps)*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setRaws(value: RuleRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
    
    inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSelectors(value: js.Array[String]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    inline def setSelectorsVarargs(value: String*): Self = StObject.set(x, "selectors", js.Array(value*))
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
