package typings.phaser.phaserMod.GameObjects

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Bob Game Object.
  * 
  * A Bob belongs to a Blitter Game Object. The Blitter is responsible for managing and rendering this object.
  * 
  * A Bob has a position, alpha value and a frame from a texture that it uses to render with. You can also toggle
  * the flipped and visible state of the Bob. The Frame the Bob uses to render can be changed dynamically, but it
  * must be a Frame within the Texture used by the parent Blitter.
  * 
  * Bob positions are relative to the Blitter parent. So if you move the Blitter parent, all Bob children will
  * have their positions impacted by this change as well.
  * 
  * You can manipulate Bob objects directly from your game code, but the creation and destruction of them should be
  * handled via the Blitter parent.
  */
@JSImport("phaser", "GameObjects.Bob")
@js.native
class Bob protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.Bob {
  /**
    * 
    * @param blitter The parent Blitter object is responsible for updating this Bob.
    * @param x The horizontal position of this Game Object in the world, relative to the parent Blitter position.
    * @param y The vertical position of this Game Object in the world, relative to the parent Blitter position.
    * @param frame The Frame this Bob will render with, as defined in the Texture the parent Blitter is using.
    * @param visible Should the Bob render visible or not to start with?
    */
  def this(
    blitter: typings.phaser.Phaser.GameObjects.Blitter,
    x: Double,
    y: Double,
    frame: String,
    visible: Boolean
  ) = this()
  def this(
    blitter: typings.phaser.Phaser.GameObjects.Blitter,
    x: Double,
    y: Double,
    frame: integer,
    visible: Boolean
  ) = this()
}
