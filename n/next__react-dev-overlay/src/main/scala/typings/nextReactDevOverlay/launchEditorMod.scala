package typings.nextReactDevOverlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object launchEditorMod {
  
  @JSImport("@next/react-dev-overlay/lib/internal/helpers/launchEditor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def launchEditor(fileName: String, lineNumber: Double, colNumber: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("launchEditor")(fileName.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any], colNumber.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
