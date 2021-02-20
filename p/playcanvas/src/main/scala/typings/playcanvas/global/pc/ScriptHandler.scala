package typings.playcanvas.global.pc

import typings.playcanvas.pc.ResourceHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler for loading JavaScript files dynamically
  Two types of JavaScript files can be loaded, PlayCanvas scripts which contain calls to {@link pc.createScript},
  or regular JavaScript files, such as third-party libraries.
  * @param app - The running {@link pc.Application}.
  */
@JSGlobal("pc.ScriptHandler")
@js.native
class ScriptHandler protected () extends ResourceHandler {
  def this(app: typings.playcanvas.pc.Application) = this()
}
