package typings.microsoftteams.global.microsoftTeams

import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:no-unnecessary-class
@JSGlobal("microsoftTeams.Communication")
@js.native
open class Communication ()
  extends StObject
     with typings.microsoftteams.microsoftTeams.Communication
object Communication {
  
  @JSGlobal("microsoftTeams.Communication")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("microsoftTeams.Communication.childWindow")
  @js.native
  def childWindow: Window = js.native
  inline def childWindow_=(x: Window): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childWindow")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("microsoftTeams.Communication.currentWindow")
  @js.native
  def currentWindow: Window = js.native
  inline def currentWindow_=(x: Window): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentWindow")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("microsoftTeams.Communication.parentOrigin")
  @js.native
  def parentOrigin: String = js.native
  inline def parentOrigin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentOrigin")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("microsoftTeams.Communication.parentWindow")
  @js.native
  def parentWindow: Window = js.native
  inline def parentWindow_=(x: Window): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parentWindow")(x.asInstanceOf[js.Any])
}
