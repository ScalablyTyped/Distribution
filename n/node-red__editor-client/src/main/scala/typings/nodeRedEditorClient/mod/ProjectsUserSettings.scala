package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsUserSettings extends StObject {
  
  def init(utils: js.Object): Unit = js.native
}
object ProjectsUserSettings {
  
  @scala.inline
  def apply(init: js.Object => Unit): ProjectsUserSettings = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[ProjectsUserSettings]
  }
  
  @scala.inline
  implicit class ProjectsUserSettingsMutableBuilder[Self <: ProjectsUserSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: js.Object => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
  }
}
