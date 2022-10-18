package typings.nodeRedEditorClient.mod

import typings.nodeRedEditorClient.anon.Dir
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Panels extends StObject {
  
  def create(options: Dir): PanelsInstance
}
object Panels {
  
  inline def apply(create: Dir => PanelsInstance): Panels = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[Panels]
  }
  
  extension [Self <: Panels](x: Self) {
    
    inline def setCreate(value: Dir => PanelsInstance): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
  }
}
