package typings.pixiCore.mod

import typings.pixiMath.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "QuadUv")
@js.native
open class QuadUv () extends Geometry {
  
  /**
    * Legacy upload method, just marks buffers dirty.
    * @returns - Returns itself.
    */
  def invalidate(): this.type = js.native
  
  /**
    * Maps two Rectangle to the quad.
    * @param targetTextureFrame - The first rectangle
    * @param destinationFrame - The second rectangle
    * @returns - Returns itself.
    */
  def map(targetTextureFrame: Rectangle, destinationFrame: Rectangle): this.type = js.native
  
  var uvBuffer: Buffer2 = js.native
  
  /** The Uvs of the quad. */
  var uvs: js.typedarray.Float32Array = js.native
  
  var vertexBuffer: Buffer2 = js.native
  
  /** An array of vertices. */
  var vertices: js.typedarray.Float32Array = js.native
}
