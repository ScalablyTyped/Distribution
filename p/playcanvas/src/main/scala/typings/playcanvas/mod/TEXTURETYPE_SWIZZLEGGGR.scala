package typings.playcanvas.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Texture stores normalmap data swizzled in GGGR format. This is used for tangent space normal
  * maps. The R component is stored in alpha and G is stored in RGB. This packing can result in higher quality
  * when the texture data is compressed.
  */
@JSImport("playcanvas", "TEXTURETYPE_SWIZZLEGGGR")
@js.native
object TEXTURETYPE_SWIZZLEGGGR extends TopLevel[Double]

