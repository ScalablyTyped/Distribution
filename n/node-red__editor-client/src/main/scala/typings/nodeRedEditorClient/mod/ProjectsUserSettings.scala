package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsUserSettings extends StObject {
  
  def init(utils: js.Object): Unit
}
object ProjectsUserSettings {
  
  inline def apply(init: js.Object => Unit): ProjectsUserSettings = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[ProjectsUserSettings]
  }
  
  extension [Self <: ProjectsUserSettings](x: Self) {
    
    inline def setInit(value: js.Object => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
  }
}
