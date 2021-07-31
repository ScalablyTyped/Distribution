package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closeable extends StObject {
  
  var closeable: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var iconClass: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var label: String
  
  var pinned: js.UndefOr[Boolean] = js.undefined
}
object Closeable {
  
  @scala.inline
  def apply(id: String, label: String): Closeable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closeable]
  }
  
  @scala.inline
  implicit class CloseableMutableBuilder[Self <: Closeable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
  }
}
