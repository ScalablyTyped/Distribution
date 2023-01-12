package typings.openui5.anon

import typings.openui5.sapBaseI18nResourceBundleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamily extends StObject {
  
  /**
    * is the special hexadecimal code without the prefix, for example "e000" or several of them
    */
  var content: String | js.Array[String]
  
  /**
    * is the name of the font when importing the font using @font-face in CSS
    */
  var fontFamily: String
  
  /**
    * indicates if already registered icons should be overwritten when the same name and collection are given.
    * The built in icons can never be overwritten.
    */
  var overWrite: js.UndefOr[Boolean] = js.undefined
  
  /**
    * ResourceBundle to be used for translation. Key format: "Icon.".
    */
  var resourceBundle: js.UndefOr[default] = js.undefined
  
  /**
    * indicates whether this icon should NOT be mirrored in RTL (right to left) mode.
    */
  var suppressMirroring: js.UndefOr[Boolean] = js.undefined
}
object FontFamily {
  
  inline def apply(content: String | js.Array[String], fontFamily: String): FontFamily = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamily]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontFamily] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String | js.Array[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentVarargs(value: String*): Self = StObject.set(x, "content", js.Array(value*))
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setOverWrite(value: Boolean): Self = StObject.set(x, "overWrite", value.asInstanceOf[js.Any])
    
    inline def setOverWriteUndefined: Self = StObject.set(x, "overWrite", js.undefined)
    
    inline def setResourceBundle(value: default): Self = StObject.set(x, "resourceBundle", value.asInstanceOf[js.Any])
    
    inline def setResourceBundleUndefined: Self = StObject.set(x, "resourceBundle", js.undefined)
    
    inline def setSuppressMirroring(value: Boolean): Self = StObject.set(x, "suppressMirroring", value.asInstanceOf[js.Any])
    
    inline def setSuppressMirroringUndefined: Self = StObject.set(x, "suppressMirroring", js.undefined)
  }
}
