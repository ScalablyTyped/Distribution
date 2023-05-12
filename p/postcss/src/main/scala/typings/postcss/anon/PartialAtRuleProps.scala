package typings.postcss.anon

import typings.postcss.libAtRuleMod.AtRuleRaws
import typings.postcss.libNodeMod.ChildNode
import typings.postcss.libNodeMod.ChildProps
import typings.postcss.libNodeMod.Source
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<postcss.postcss/lib/at-rule.AtRuleProps> */
trait PartialAtRuleProps extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var nodes: js.UndefOr[js.Array[ChildNode | ChildProps]] = js.undefined
  
  var params: js.UndefOr[String | Double] = js.undefined
  
  var raws: js.UndefOr[AtRuleRaws] = js.undefined
  
  var source: js.UndefOr[Source] = js.undefined
}
object PartialAtRuleProps {
  
  inline def apply(): PartialAtRuleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAtRuleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialAtRuleProps] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodes(value: js.Array[ChildNode | ChildProps]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    inline def setNodesVarargs(value: (ChildNode | ChildProps)*): Self = StObject.set(x, "nodes", js.Array(value*))
    
    inline def setParams(value: String | Double): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRaws(value: AtRuleRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
    
    inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
