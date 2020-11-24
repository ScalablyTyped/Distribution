package typings.playcanvas.global.pc

import typings.playcanvas.pc.ResourceHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Resource handler used for loading {@link pc.TextureAtlas} resources.
  * @param loader - The resource loader.
  */
@JSGlobal("pc.TextureAtlasHandler")
@js.native
class TextureAtlasHandler protected () extends ResourceHandler {
  def this(loader: typings.playcanvas.pc.ResourceLoader) = this()
}
