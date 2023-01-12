package typings.monacoEditor.mod.languages.css

import typings.monacoEditor.monacoEditorDoubles.`1.1`
import typings.monacoEditor.monacoEditorInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSDataV1 extends StObject {
  
  var atDirectives: js.UndefOr[js.Array[IAtDirectiveData]] = js.undefined
  
  var properties: js.UndefOr[js.Array[IPropertyData]] = js.undefined
  
  var pseudoClasses: js.UndefOr[js.Array[IPseudoClassData]] = js.undefined
  
  var pseudoElements: js.UndefOr[js.Array[IPseudoElementData]] = js.undefined
  
  var version: `1` | `1.1`
}
object CSSDataV1 {
  
  inline def apply(version: `1` | `1.1`): CSSDataV1 = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSDataV1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSDataV1] (val x: Self) extends AnyVal {
    
    inline def setAtDirectives(value: js.Array[IAtDirectiveData]): Self = StObject.set(x, "atDirectives", value.asInstanceOf[js.Any])
    
    inline def setAtDirectivesUndefined: Self = StObject.set(x, "atDirectives", js.undefined)
    
    inline def setAtDirectivesVarargs(value: IAtDirectiveData*): Self = StObject.set(x, "atDirectives", js.Array(value*))
    
    inline def setProperties(value: js.Array[IPropertyData]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: IPropertyData*): Self = StObject.set(x, "properties", js.Array(value*))
    
    inline def setPseudoClasses(value: js.Array[IPseudoClassData]): Self = StObject.set(x, "pseudoClasses", value.asInstanceOf[js.Any])
    
    inline def setPseudoClassesUndefined: Self = StObject.set(x, "pseudoClasses", js.undefined)
    
    inline def setPseudoClassesVarargs(value: IPseudoClassData*): Self = StObject.set(x, "pseudoClasses", js.Array(value*))
    
    inline def setPseudoElements(value: js.Array[IPseudoElementData]): Self = StObject.set(x, "pseudoElements", value.asInstanceOf[js.Any])
    
    inline def setPseudoElementsUndefined: Self = StObject.set(x, "pseudoElements", js.undefined)
    
    inline def setPseudoElementsVarargs(value: IPseudoElementData*): Self = StObject.set(x, "pseudoElements", js.Array(value*))
    
    inline def setVersion(value: `1` | `1.1`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
