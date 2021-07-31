package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  var attributes: js.Any
  
  var fshader: String
  
  var useTransformFeedback: js.UndefOr[Boolean] = js.undefined
  
  var vshader: String
}
object Attributes {
  
  @scala.inline
  def apply(attributes: js.Any, fshader: String, vshader: String): Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], fshader = fshader.asInstanceOf[js.Any], vshader = vshader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFshader(value: String): Self = StObject.set(x, "fshader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTransformFeedback(value: Boolean): Self = StObject.set(x, "useTransformFeedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTransformFeedbackUndefined: Self = StObject.set(x, "useTransformFeedback", js.undefined)
    
    @scala.inline
    def setVshader(value: String): Self = StObject.set(x, "vshader", value.asInstanceOf[js.Any])
  }
}
