package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHtmlHtmlSanitizerMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/html/HtmlSanitizer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with HtmlSanitizer
  @JSImport("@nginstack/engine/lib/html/HtmlSanitizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanHtml(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanHtml")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def cleanText(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanText")(content.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait HtmlSanitizer extends StObject {
    
    def addAllowedTagAttributes(tag: String, attributes: String): Unit = js.native
    def addAllowedTagAttributes(tag: String, attributes: js.Array[String]): Unit = js.native
    
    def addAllowedTags(tags: String): Unit = js.native
    def addAllowedTags(tags: js.Array[String]): Unit = js.native
    
    def addAllowedUrlSchemes(schemes: String): Unit = js.native
    def addAllowedUrlSchemes(schemes: js.Array[String]): Unit = js.native
    
    def clean(content: String): String = js.native
    
    def getAllowedTagAttributes(): Any = js.native
    
    def getAllowedTags(): js.Array[String] = js.native
    
    def getAllowedUrlSchemes(): js.Array[String] = js.native
    
    def removeAllowedTag(tag: String): Boolean = js.native
    
    def removeAllowedTagAttribute(tag: String): Boolean = js.native
    def removeAllowedTagAttribute(tag: String, opt_attrib: String): Boolean = js.native
    
    def removeAllowedUrlScheme(scheme: String): Boolean = js.native
  }
}
