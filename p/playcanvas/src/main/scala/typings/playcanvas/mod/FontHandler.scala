package typings.playcanvas.mod

import typings.playcanvas.pc.ResourceHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading {@link pc.Font} resources.
  * @param loader - The resource loader.
  */
@JSImport("playcanvas", "FontHandler")
@js.native
class FontHandler protected () extends ResourceHandler {
  def this(loader: typings.playcanvas.pc.ResourceLoader) = this()
}
