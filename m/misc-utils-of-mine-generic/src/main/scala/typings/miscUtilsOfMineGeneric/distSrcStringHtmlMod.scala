package typings.miscUtilsOfMineGeneric

import typings.miscUtilsOfMineGeneric.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStringHtmlMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/string/html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addUniqueParam(url: String, param: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addUniqueParam")(url.asInstanceOf[js.Any], param.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def escapeHtmlAttribute(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtmlAttribute")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def htmlElement(config: HtmlElementConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlElement")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def styleObjectToCss(o: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("styleObjectToCss")(o.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def styleObjectToCss(o: js.Object, propertiesSeparator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("styleObjectToCss")(o.asInstanceOf[js.Any], propertiesSeparator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stylePropertyNameToCssSyntax(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stylePropertyNameToCssSyntax")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unEscapeHtmlAttribute(code: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unEscapeHtmlAttribute")(code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def wrapInHtml(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapInHtml")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait HtmlElementConfig extends StObject {
    
    var attributes: js.UndefOr[js.Array[Name]] = js.undefined
    
    var children: js.UndefOr[js.Array[HtmlElementConfig]] = js.undefined
    
    /** by default, if there's no children or innerHTML we use a single-closing tag like `<tag/>`.  If this is true will force the format <tag></tag> always. */
    var forceContent: js.UndefOr[Boolean] = js.undefined
    
    var innerHTML: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object HtmlElementConfig {
    
    inline def apply(name: String): HtmlElementConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HtmlElementConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HtmlElementConfig] (val x: Self) extends AnyVal {
      
      inline def setAttributes(value: js.Array[Name]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: Name*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setChildren(value: js.Array[HtmlElementConfig]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: HtmlElementConfig*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setForceContent(value: Boolean): Self = StObject.set(x, "forceContent", value.asInstanceOf[js.Any])
      
      inline def setForceContentUndefined: Self = StObject.set(x, "forceContent", js.undefined)
      
      inline def setInnerHTML(value: String): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
      
      inline def setInnerHTMLUndefined: Self = StObject.set(x, "innerHTML", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
