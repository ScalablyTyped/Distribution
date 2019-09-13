package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TextureGarbageCollector. This class manages the GPU and ensures that it does not get clogged
  * up with textures that are no longer being used.
  */
@JSImport("pixi.js", "TextureGarbageCollector")
@js.native
class TextureGarbageCollector protected ()
  extends typings.pixiDotJs.PIXINs.TextureGarbageCollector {
  def this(renderer: typings.pixiDotJs.PIXINs.WebGLRenderer) = this()
}

