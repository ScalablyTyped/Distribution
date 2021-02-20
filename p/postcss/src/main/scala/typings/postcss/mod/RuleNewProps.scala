package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleNewProps extends ContainerNewProps {
  
  @JSName("raws")
  var raws_RuleNewProps: js.UndefOr[RuleRaws] = js.native
  
  /**
    * The rule's full selector. If there are multiple comma-separated selectors,
    * the entire group will be included.
    */
  var selector: js.UndefOr[String] = js.native
  
  /**
    * An array containing the rule's individual selectors. Groups of selectors
    * are split at commas.
    */
  var selectors: js.UndefOr[js.Array[String]] = js.native
}
object RuleNewProps {
  
  @scala.inline
  def apply(): RuleNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleNewProps]
  }
  
  @scala.inline
  implicit class RuleNewPropsMutableBuilder[Self <: RuleNewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaws(value: RuleRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setSelectors(value: js.Array[String]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    @scala.inline
    def setSelectorsVarargs(value: String*): Self = StObject.set(x, "selectors", js.Array(value :_*))
  }
}
