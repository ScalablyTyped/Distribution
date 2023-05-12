package typings.playcanvas.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  var attributes: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var fshader: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var shaderLanguage: js.UndefOr[String] = js.undefined
  
  var useTransformFeedback: js.UndefOr[Boolean] = js.undefined
  
  var vshader: String
}
object Attributes {
  
  inline def apply(vshader: String): Attributes = {
    val __obj = js.Dynamic.literal(vshader = vshader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setFshader(value: String): Self = StObject.set(x, "fshader", value.asInstanceOf[js.Any])
    
    inline def setFshaderUndefined: Self = StObject.set(x, "fshader", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShaderLanguage(value: String): Self = StObject.set(x, "shaderLanguage", value.asInstanceOf[js.Any])
    
    inline def setShaderLanguageUndefined: Self = StObject.set(x, "shaderLanguage", js.undefined)
    
    inline def setUseTransformFeedback(value: Boolean): Self = StObject.set(x, "useTransformFeedback", value.asInstanceOf[js.Any])
    
    inline def setUseTransformFeedbackUndefined: Self = StObject.set(x, "useTransformFeedback", js.undefined)
    
    inline def setVshader(value: String): Self = StObject.set(x, "vshader", value.asInstanceOf[js.Any])
  }
}
