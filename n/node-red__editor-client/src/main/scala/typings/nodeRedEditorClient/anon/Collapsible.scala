package typings.nodeRedEditorClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collapsible extends StObject {
  
  var collapsible: js.UndefOr[Boolean] = js.native
  
  var title: String = js.native
}
object Collapsible {
  
  @scala.inline
  def apply(title: String): Collapsible = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collapsible]
  }
  
  @scala.inline
  implicit class CollapsibleMutableBuilder[Self <: Collapsible] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
