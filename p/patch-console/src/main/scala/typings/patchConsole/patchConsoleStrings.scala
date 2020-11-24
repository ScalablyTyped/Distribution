package typings.patchConsole

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patchConsoleStrings {
  
  @scala.inline
  def stderr: stderr = "stderr".asInstanceOf[stderr]
  
  @scala.inline
  def stdout: stdout = "stdout".asInstanceOf[stdout]
  
  @js.native
  sealed trait stderr extends js.Object
  
  @js.native
  sealed trait stdout extends js.Object
}
