package typings.nginstackWebFramework

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCssCssExtractorMod {
  
  inline def apply(css: String): Unit = ^.asInstanceOf[js.Dynamic].apply(css.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/css/CssExtractor", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CssExtractor {
    def this(css: String) = this()
    
    /* private */ /* CompleteClass */
    var css_ : Any = js.native
    
    /* private */ /* CompleteClass */
    var extractGlobalClassStyle_ : Any = js.native
    
    /* CompleteClass */
    override def extractStyleFromClass(className: String): StringDictionary[String] = js.native
    
    /* CompleteClass */
    override def extractStylesFromClasses(classes: js.Array[String]): StringDictionary[String] = js.native
    
    /* private */ /* CompleteClass */
    var styleCache_ : Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/css/CssExtractor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CssExtractor extends StObject {
    
    /* private */ var css_ : Any
    
    /* private */ var extractGlobalClassStyle_ : Any
    
    def extractStyleFromClass(className: String): StringDictionary[String]
    
    def extractStylesFromClasses(classes: js.Array[String]): StringDictionary[String]
    
    /* private */ var styleCache_ : Any
  }
  object CssExtractor {
    
    inline def apply(
      css_ : Any,
      extractGlobalClassStyle_ : Any,
      extractStyleFromClass: String => StringDictionary[String],
      extractStylesFromClasses: js.Array[String] => StringDictionary[String],
      styleCache_ : Any
    ): CssExtractor = {
      val __obj = js.Dynamic.literal(css_ = css_.asInstanceOf[js.Any], extractGlobalClassStyle_ = extractGlobalClassStyle_.asInstanceOf[js.Any], extractStyleFromClass = js.Any.fromFunction1(extractStyleFromClass), extractStylesFromClasses = js.Any.fromFunction1(extractStylesFromClasses), styleCache_ = styleCache_.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssExtractor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CssExtractor] (val x: Self) extends AnyVal {
      
      inline def setCss_(value: Any): Self = StObject.set(x, "css_", value.asInstanceOf[js.Any])
      
      inline def setExtractGlobalClassStyle_(value: Any): Self = StObject.set(x, "extractGlobalClassStyle_", value.asInstanceOf[js.Any])
      
      inline def setExtractStyleFromClass(value: String => StringDictionary[String]): Self = StObject.set(x, "extractStyleFromClass", js.Any.fromFunction1(value))
      
      inline def setExtractStylesFromClasses(value: js.Array[String] => StringDictionary[String]): Self = StObject.set(x, "extractStylesFromClasses", js.Any.fromFunction1(value))
      
      inline def setStyleCache_(value: Any): Self = StObject.set(x, "styleCache_", value.asInstanceOf[js.Any])
    }
  }
}
