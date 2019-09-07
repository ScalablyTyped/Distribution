package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.ScriptHandler
  * @implements {pc.ResourceHandler}
  * @classdesc Resource handler for loading JavaScript files dynamically
  * Two types of JavaScript files can be loaded, PlayCanvas scripts which contain calls to {@link pc.createScript},
  * or regular JavaScript files, such as third-party libraries.
  * @param {pc.Application} app The running {@link pc.Application}
  */
@JSGlobal("pc.ScriptHandler")
@js.native
class ScriptHandler protected () extends ResourceHandler {
  def this(app: Application) = this()
}

