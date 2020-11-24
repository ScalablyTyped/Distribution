package typings.pixiJs.global.PIXI

import typings.pixiJs.anon.Alpha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Slightly opinionated default shader for PixiJS 2D objects.
  * @class
  * @memberof PIXI
  * @extends PIXI.Shader
  */
@JSGlobal("PIXI.MeshMaterial")
@js.native
class MeshMaterial protected ()
  extends typings.pixiJs.PIXI.MeshMaterial {
  def this(uSampler: typings.pixiJs.PIXI.Texture) = this()
  def this(uSampler: typings.pixiJs.PIXI.Texture, options: Alpha) = this()
}
