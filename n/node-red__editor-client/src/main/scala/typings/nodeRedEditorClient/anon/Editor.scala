package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Editor extends StObject {
  
  var editor: typings.ace.AceAjax.Editor | GetText
  
  var elementPrefix: js.UndefOr[String] = js.undefined
  
  var ext: js.UndefOr[String] = js.undefined
  
  var fields: js.Array[String]
  
  var mode: js.UndefOr[String] = js.undefined
  
  var `type`: String
  
  var url: String
}
object Editor {
  
  inline def apply(
    editor: typings.ace.AceAjax.Editor | GetText,
    fields: js.Array[String],
    `type`: String,
    url: String
  ): Editor = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Editor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Editor] (val x: Self) extends AnyVal {
    
    inline def setEditor(value: typings.ace.AceAjax.Editor | GetText): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setElementPrefix(value: String): Self = StObject.set(x, "elementPrefix", value.asInstanceOf[js.Any])
    
    inline def setElementPrefixUndefined: Self = StObject.set(x, "elementPrefix", js.undefined)
    
    inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
