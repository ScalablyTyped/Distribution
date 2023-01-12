package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// name change to avoid conflict with base ecmascript Symbol
trait NovaSymbol extends StObject {
  
  val comment: String | Null
  
  val displayName: String
  
  val name: String
  
  val nameRange: Range
  
  val parent: NovaSymbol | Null
  
  val range: Range
  
  val `type`: NovaSymbolType
}
object NovaSymbol {
  
  inline def apply(displayName: String, name: String, nameRange: Range, range: Range, `type`: NovaSymbolType): NovaSymbol = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameRange = nameRange.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], comment = null, parent = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NovaSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NovaSymbol] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentNull: Self = StObject.set(x, "comment", null)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameRange(value: Range): Self = StObject.set(x, "nameRange", value.asInstanceOf[js.Any])
    
    inline def setParent(value: NovaSymbol): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setType(value: NovaSymbolType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
