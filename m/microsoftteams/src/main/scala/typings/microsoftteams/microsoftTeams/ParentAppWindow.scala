package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentAppWindow
  extends StObject
     with IAppWindow {
  
  def addEventListener(`type`: String, listener: js.Function1[/* message */ Any, Unit]): Unit = js.native
  
  def postMessage(
    message: Any,
    onComplete: js.Function2[/* status */ Boolean, /* reason */ js.UndefOr[String], Unit]
  ): Unit = js.native
}
