package typings.mjmlReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mjmlReact.mjmlReactStrings.skip
import typings.mjmlReact.mjmlReactStrings.soft
import typings.mjmlReact.mjmlReactStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mjml2HtmlOptions extends StObject {
  
  var beautify: js.UndefOr[Boolean] = js.undefined
  
  var filePath: js.UndefOr[String] = js.undefined
  
  var fonts: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var keepComments: js.UndefOr[Boolean] = js.undefined
  
  var minify: js.UndefOr[Boolean] = js.undefined
  
  var validationLevel: js.UndefOr[strict | soft | skip] = js.undefined
}
object Mjml2HtmlOptions {
  
  inline def apply(): Mjml2HtmlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mjml2HtmlOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mjml2HtmlOptions] (val x: Self) extends AnyVal {
    
    inline def setBeautify(value: Boolean): Self = StObject.set(x, "beautify", value.asInstanceOf[js.Any])
    
    inline def setBeautifyUndefined: Self = StObject.set(x, "beautify", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setFonts(value: StringDictionary[String]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setFontsUndefined: Self = StObject.set(x, "fonts", js.undefined)
    
    inline def setKeepComments(value: Boolean): Self = StObject.set(x, "keepComments", value.asInstanceOf[js.Any])
    
    inline def setKeepCommentsUndefined: Self = StObject.set(x, "keepComments", js.undefined)
    
    inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
    
    inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    
    inline def setValidationLevel(value: strict | soft | skip): Self = StObject.set(x, "validationLevel", value.asInstanceOf[js.Any])
    
    inline def setValidationLevelUndefined: Self = StObject.set(x, "validationLevel", js.undefined)
  }
}
