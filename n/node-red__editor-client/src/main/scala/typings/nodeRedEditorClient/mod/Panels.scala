package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Panels extends StObject {
  
  def create(options: Resize): PanelsInstance
}
object Panels {
  
  inline def apply(create: Resize => PanelsInstance): Panels = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Panels]
  }
  
  extension [Self <: Panels](x: Self) {
    
    inline def setCreate(value: Resize => PanelsInstance): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
