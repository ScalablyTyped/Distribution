package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// name change to avoid conflict with base ecmascript Symbol
@js.native
trait NovaSymbol extends StObject {
  
  val comment: String | Null = js.native
  
  val displayName: String = js.native
  
  val name: String = js.native
  
  val nameRange: Range = js.native
  
  val parent: NovaSymbol | Null = js.native
  
  val range: Range = js.native
  
  val `type`: NovaSymbolType = js.native
}
object NovaSymbol {
  
  @scala.inline
  def apply(displayName: String, name: String, nameRange: Range, range: Range, `type`: NovaSymbolType): NovaSymbol = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameRange = nameRange.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NovaSymbol]
  }
  
  @scala.inline
  implicit class NovaSymbolMutableBuilder[Self <: NovaSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentNull: Self = StObject.set(x, "comment", null)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameRange(value: Range): Self = StObject.set(x, "nameRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: NovaSymbol): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNull: Self = StObject.set(x, "parent", null)
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: NovaSymbolType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
