package typings.phaser.Phaser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BlendModes extends StObject
/**
  * Phaser Blend Modes.
  */
@JSGlobal("Phaser.BlendModes")
@js.native
object BlendModes extends StObject {
  
  /**
    * Add blend mode. For Canvas and WebGL.
    * Where both shapes overlap the color is determined by adding color values.
    */
  @js.native
  sealed trait ADD extends BlendModes
  
  /**
    * Color blend mode. For Canvas only.
    * Preserves the luma of the bottom layer, while adopting the hue and chroma of the top layer.
    */
  @js.native
  sealed trait COLOR extends BlendModes
  
  /**
    * Color Burn blend mode. For Canvas only.
    * Divides the inverted bottom layer by the top layer, and then inverts the result.
    */
  @js.native
  sealed trait COLOR_BURN extends BlendModes
  
  /**
    * Color Dodge blend mode. For Canvas only.
    * Divides the bottom layer by the inverted top layer.
    */
  @js.native
  sealed trait COLOR_DODGE extends BlendModes
  
  /**
    * Copy blend mode. For Canvas only.
    * Only the new shape is shown.
    */
  @js.native
  sealed trait COPY extends BlendModes
  
  /**
    * Darken blend mode. For Canvas only.
    * Retains the darkest pixels of both layers.
    */
  @js.native
  sealed trait DARKEN extends BlendModes
  
  /**
    * Destination-out blend mode. For Canvas only.
    * The existing canvas is only kept where it overlaps the new shape. The new shape is drawn behind the canvas content.
    */
  @js.native
  sealed trait DESTINATION_ATOP extends BlendModes
  
  /**
    * Destination-in blend mode. For Canvas only.
    * The existing canvas content is kept where both the new shape and existing canvas content overlap. Everything else is made transparent.
    */
  @js.native
  sealed trait DESTINATION_IN extends BlendModes
  
  /**
    * Destination-out blend mode. For Canvas only.
    * The existing content is kept where it doesn't overlap the new shape.
    */
  @js.native
  sealed trait DESTINATION_OUT extends BlendModes
  
  /**
    * Destination-over blend mode. For Canvas only.
    * New shapes are drawn behind the existing canvas content.
    */
  @js.native
  sealed trait DESTINATION_OVER extends BlendModes
  
  /**
    * Difference blend mode. For Canvas only.
    * Subtracts the bottom layer from the top layer or the other way round to always get a positive value.
    */
  @js.native
  sealed trait DIFFERENCE extends BlendModes
  
  /**
    * Alpha erase blend mode. For Canvas and WebGL.
    */
  @js.native
  sealed trait ERASE extends BlendModes
  
  /**
    * Exclusion blend mode. For Canvas only.
    * Like difference, but with lower contrast.
    */
  @js.native
  sealed trait EXCLUSION extends BlendModes
  
  /**
    * Hard Light blend mode. For Canvas only.
    * A combination of multiply and screen like overlay, but with top and bottom layer swapped.
    */
  @js.native
  sealed trait HARD_LIGHT extends BlendModes
  
  /**
    * Hue blend mode. For Canvas only.
    * Preserves the luma and chroma of the bottom layer, while adopting the hue of the top layer.
    */
  @js.native
  sealed trait HUE extends BlendModes
  
  /**
    * Lighten blend mode. For Canvas only.
    * Retains the lightest pixels of both layers.
    */
  @js.native
  sealed trait LIGHTEN extends BlendModes
  
  /**
    * Lighten blend mode. For Canvas only.
    * Where both shapes overlap the color is determined by adding color values.
    */
  @js.native
  sealed trait LIGHTER extends BlendModes
  
  /**
    * Luminosity blend mode. For Canvas only.
    * Preserves the hue and chroma of the bottom layer, while adopting the luma of the top layer.
    */
  @js.native
  sealed trait LUMINOSITY extends BlendModes
  
  /**
    * Multiply blend mode. For Canvas and WebGL.
    * The pixels are of the top layer are multiplied with the corresponding pixel of the bottom layer. A darker picture is the result.
    */
  @js.native
  sealed trait MULTIPLY extends BlendModes
  
  /**
    * Normal blend mode. For Canvas and WebGL.
    * This is the default setting and draws new shapes on top of the existing canvas content.
    */
  @js.native
  sealed trait NORMAL extends BlendModes
  
  /**
    * Overlay blend mode. For Canvas only.
    * A combination of multiply and screen. Dark parts on the base layer become darker, and light parts become lighter.
    */
  @js.native
  sealed trait OVERLAY extends BlendModes
  
  /**
    * Saturation blend mode. For Canvas only.
    * Preserves the luma and hue of the bottom layer, while adopting the chroma of the top layer.
    */
  @js.native
  sealed trait SATURATION extends BlendModes
  
  /**
    * Screen blend mode. For Canvas and WebGL.
    * The pixels are inverted, multiplied, and inverted again. A lighter picture is the result (opposite of multiply)
    */
  @js.native
  sealed trait SCREEN extends BlendModes
  
  /**
    * Skips the Blend Mode check in the renderer.
    */
  @js.native
  sealed trait SKIP_CHECK extends BlendModes
  
  /**
    * Soft Light blend mode. For Canvas only.
    * A softer version of hard-light. Pure black or white does not result in pure black or white.
    */
  @js.native
  sealed trait SOFT_LIGHT extends BlendModes
  
  /**
    * Source-out blend mode. For Canvas only.
    * The new shape is only drawn where it overlaps the existing canvas content.
    */
  @js.native
  sealed trait SOURCE_ATOP extends BlendModes
  
  /**
    * Source-in blend mode. For Canvas only.
    * The new shape is drawn only where both the new shape and the destination canvas overlap. Everything else is made transparent.
    */
  @js.native
  sealed trait SOURCE_IN extends BlendModes
  
  /**
    * Source-out blend mode. For Canvas only.
    * The new shape is drawn where it doesn't overlap the existing canvas content.
    */
  @js.native
  sealed trait SOURCE_OUT extends BlendModes
  
  /**
    * Xor blend mode. For Canvas only.
    * Shapes are made transparent where both overlap and drawn normal everywhere else.
    */
  @js.native
  sealed trait XOR extends BlendModes
}
