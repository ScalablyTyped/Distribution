package typings.playcanvas.mod

import typings.playcanvas.pc.ResourceHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource handler used for loading {@link pc.TextureAtlas} resources.
  * @param loader - The resource loader.
  */
@JSImport("playcanvas", "TextureAtlasHandler")
@js.native
class TextureAtlasHandler protected () extends ResourceHandler {
  def this(loader: typings.playcanvas.pc.ResourceLoader) = this()
}

