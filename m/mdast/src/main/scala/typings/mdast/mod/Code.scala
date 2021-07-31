package typings.mdast.mod

import typings.mdast.mdastStrings.code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code
  extends StObject
     with Literal
     with BlockContent {
  
  var lang: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_Code: code
}
object Code {
  
  @scala.inline
  def apply(value: js.Any): Code = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("code")
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    @scala.inline
    def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
