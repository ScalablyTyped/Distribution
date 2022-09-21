package typings.microsoftteams.global.microsoftTeams

import typings.microsoftteams.microsoftTeams.IAppWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("microsoftTeams.ParentAppWindow")
@js.native
open class ParentAppWindow ()
  extends StObject
     with typings.microsoftteams.microsoftTeams.ParentAppWindow {
  
  /* CompleteClass */
  override def addEventListener(`type`: String, listener: js.Function0[Unit]): Unit = js.native
  
  /* CompleteClass */
  override def postMessage(message: Any): Unit = js.native
}
object ParentAppWindow {
  
  @JSGlobal("microsoftTeams.ParentAppWindow")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("microsoftTeams.ParentAppWindow.Instance")
  @js.native
  val Instance: IAppWindow = js.native
  
  /* static member */
  @JSGlobal("microsoftTeams.ParentAppWindow._instance")
  @js.native
  def _instance: Any = js.native
  inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
}
