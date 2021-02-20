package typings.officeUiFabricReact.anon

import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compact extends StObject {
  
  var compact: Boolean = js.native
  
  var isHeaderVisible: Boolean = js.native
  
  var selectionMode: SelectionMode = js.native
}
object Compact {
  
  @scala.inline
  def apply(compact: Boolean, isHeaderVisible: Boolean, selectionMode: SelectionMode): Compact = {
    val __obj = js.Dynamic.literal(compact = compact.asInstanceOf[js.Any], isHeaderVisible = isHeaderVisible.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compact]
  }
  
  @scala.inline
  implicit class CompactMutableBuilder[Self <: Compact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHeaderVisible(value: Boolean): Self = StObject.set(x, "isHeaderVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMode(value: SelectionMode): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
  }
}
