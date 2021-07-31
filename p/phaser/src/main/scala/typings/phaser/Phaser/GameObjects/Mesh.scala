package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Size
import typings.phaser.Phaser.GameObjects.Components.Texture
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.std.Float32Array
import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Mesh Game Object.
  */
@js.native
trait Mesh
  extends StObject
     with GameObject
     with BlendMode
     with Depth
     with Mask
     with Pipeline
     with Size
     with Texture
     with Transform
     with Visible
     with ScrollFactor {
  
  /**
    * An array containing the alpha data for this Mesh.
    */
  var alphas: Float32Array = js.native
  
  /**
    * An array containing the color data for this Mesh.
    */
  var colors: Uint32Array = js.native
  
  /**
    * This method is left intentionally empty and does not do anything.
    * It is retained to allow a Mesh or Quad to be added to a Container.
    */
  def setAlpha(): Unit = js.native
  
  /**
    * Fill or additive mode used when blending the color values?
    */
  var tintFill: Boolean = js.native
  
  /**
    * An array containing the uv data for this Mesh.
    */
  var uv: Float32Array = js.native
  
  /**
    * An array containing the vertices data for this Mesh.
    */
  var vertices: Float32Array = js.native
}
