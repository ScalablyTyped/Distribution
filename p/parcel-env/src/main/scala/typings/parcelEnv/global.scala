package typings.parcelEnv

import typings.node.NodeModule
import typings.node.NodeRequire
import typings.parcelEnv.NodeJS.Process
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("module")
  @js.native
  def module: NodeModule = js.native
  @scala.inline
  def module_=(x: NodeModule): Unit = js.Dynamic.global.updateDynamic("module")(x.asInstanceOf[js.Any])
  
  @JSGlobal("process")
  @js.native
  def process: Process = js.native
  @scala.inline
  def process_=(x: Process): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
  
  @JSGlobal("require")
  @js.native
  def require: NodeRequire = js.native
  @scala.inline
  def require_=(x: NodeRequire): Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])
  
  /**
  * Declare process variable
  */
  object NodeJS
}
