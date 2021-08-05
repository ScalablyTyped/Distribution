package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AtRuleNewProps
  extends StObject
     with ContainerNewProps {
  
  /**
    * The identifier that immediately follows the @.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * These are the values that follow the at-rule's name, but precede any {}
    * block. The spec refers to this area as the at-rule's "prelude".
    */
  var params: js.UndefOr[String | Double] = js.undefined
  
  @JSName("raws")
  var raws_AtRuleNewProps: js.UndefOr[AtRuleRaws] = js.undefined
}
object AtRuleNewProps {
  
  inline def apply(): AtRuleNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AtRuleNewProps]
  }
  
  extension [Self <: AtRuleNewProps](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParams(value: String | Double): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setRaws(value: AtRuleRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
    
    inline def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
  }
}
