package typings.pixiJs.mod

import typings.pixiJs.anon.Alpha
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Slightly opinionated default shader for PixiJS 2D objects.
  * @class
  * @memberof PIXI
  * @extends PIXI.Shader
  */
@JSImport("pixi.js", "MeshMaterial")
@js.native
class MeshMaterial protected ()
  extends typings.pixiJs.PIXI.MeshMaterial {
  def this(uSampler: typings.pixiJs.PIXI.Texture) = this()
  def this(uSampler: typings.pixiJs.PIXI.Texture, options: Alpha) = this()
}
