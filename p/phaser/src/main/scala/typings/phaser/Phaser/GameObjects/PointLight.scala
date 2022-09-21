package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Display.Color
import typings.phaser.Phaser.GameObjects.Components.AlphaSingle
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.GetBounds
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Point Light Game Object provides a way to add a point light effect into your game,
  * without the expensive shader processing requirements of the traditional Light Game Object.
  * 
  * The difference is that the Point Light renders using a custom shader, designed to give the
  * impression of a point light source, of variable radius, intensity and color, in your game.
  * However, unlike the Light Game Object, it does not impact any other Game Objects, or use their
  * normal maps for calcuations. This makes them extremely fast to render compared to Lights
  * and perfect for special effects, such as flickering torches or muzzle flashes.
  * 
  * For maximum performance you should batch Point Light Game Objects together. This means
  * ensuring they follow each other consecutively on the display list. Ideally, use a Layer
  * Game Object and then add just Point Lights to it, so that it can batch together the rendering
  * of the lights. You don't _have_ to do this, and if you've only a handful of Point Lights in
  * your game then it's perfectly safe to mix them into the dislay list as normal. However, if
  * you're using a large number of them, please consider how they are mixed into the display list.
  * 
  * The renderer will automatically cull Point Lights. Those with a radius that does not intersect
  * with the Camera will be skipped in the rendering list. This happens automatically and the
  * culled state is refreshed every frame, for every camera.
  * 
  * The origin of a Point Light is always 0.5 and it cannot be changed.
  * 
  * Point Lights are a WebGL only feature and do not have a Canvas counterpart.
  */
@js.native
trait PointLight
  extends StObject
     with GameObject
     with AlphaSingle
     with BlendMode
     with Depth
     with GetBounds
     with Mask
     with Pipeline
     with ScrollFactor
     with Transform
     with Visible {
  
  /**
    * The attenuation of the Point Light.
    * 
    * This value controls the force with which the light falls-off from the center of the light.
    * 
    * Use small float-based values, i.e. 0.1.
    */
  var attenuation: Double = js.native
  
  /**
    * The color of this Point Light. This property is an instance of a
    * Color object, so you can use the methods within it, such as `setTo(r, g, b)`
    * to change the color value.
    */
  var color: Color = js.native
  
  /**
    * The intensity of the Point Light.
    * 
    * The colors of the light are multiplied by this value during rendering.
    */
  var intensity: Double = js.native
  
  /**
    * The radius of the Point Light.
    */
  var radius: Double = js.native
}
