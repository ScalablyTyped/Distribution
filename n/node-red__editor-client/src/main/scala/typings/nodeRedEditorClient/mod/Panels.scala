package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Panels extends StObject {
  
  def create(options: Resize): PanelsInstance = js.native
}
object Panels {
  
  @scala.inline
  def apply(create: Resize => PanelsInstance): Panels = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Panels]
  }
  
  @scala.inline
  implicit class PanelsMutableBuilder[Self <: Panels] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: Resize => PanelsInstance): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
