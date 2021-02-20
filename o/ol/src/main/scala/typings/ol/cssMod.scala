package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssMod {
  
  @JSImport("ol/css", "CLASS_COLLAPSED")
  @js.native
  val CLASS_COLLAPSED: String = js.native
  
  @JSImport("ol/css", "CLASS_CONTROL")
  @js.native
  val CLASS_CONTROL: String = js.native
  
  @JSImport("ol/css", "CLASS_HIDDEN")
  @js.native
  val CLASS_HIDDEN: String = js.native
  
  @JSImport("ol/css", "CLASS_SELECTABLE")
  @js.native
  val CLASS_SELECTABLE: String = js.native
  
  @JSImport("ol/css", "CLASS_UNSELECTABLE")
  @js.native
  val CLASS_UNSELECTABLE: String = js.native
  
  @JSImport("ol/css", "CLASS_UNSUPPORTED")
  @js.native
  val CLASS_UNSUPPORTED: String = js.native
  
  @JSImport("ol/css", "getFontParameters")
  @js.native
  def getFontParameters(fontSpec: String): FontParameters = js.native
  
  @js.native
  trait FontParameters extends StObject {
    
    var families: js.Array[String] = js.native
    
    var family: String = js.native
    
    var lineHeight: String = js.native
    
    var size: String = js.native
    
    var style: String = js.native
    
    var variant: String = js.native
    
    var weight: String = js.native
  }
  object FontParameters {
    
    @scala.inline
    def apply(
      families: js.Array[String],
      family: String,
      lineHeight: String,
      size: String,
      style: String,
      variant: String,
      weight: String
    ): FontParameters = {
      val __obj = js.Dynamic.literal(families = families.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontParameters]
    }
    
    @scala.inline
    implicit class FontParametersMutableBuilder[Self <: FontParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFamilies(value: js.Array[String]): Self = StObject.set(x, "families", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamiliesVarargs(value: String*): Self = StObject.set(x, "families", js.Array(value :_*))
      
      @scala.inline
      def setFamily(value: String): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
}
