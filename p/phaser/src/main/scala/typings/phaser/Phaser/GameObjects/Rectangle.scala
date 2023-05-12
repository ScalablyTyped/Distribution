package typings.phaser.Phaser.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Rectangle Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports both fill and stroke colors.
  * 
  * You can change the size of the rectangle by changing the `width` and `height` properties.
  */
@js.native
trait Rectangle
  extends StObject
     with Shape {
  
  /**
    * Sets the internal size of this Rectangle, as used for frame or physics body creation.
    * 
    * If you have assigned a custom input hit area for this Rectangle, changing the Rectangle size will _not_ change the
    * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  def setSize(width: Double, height: Double): this.type = js.native
}
