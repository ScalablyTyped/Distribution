package typings.phaser.PhaserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BlendModes extends js.Object

/**
  * Phaser Blend Modes.
  */
@JSGlobal("Phaser.BlendModes")
@js.native
object BlendModes extends js.Object {
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
  
  /* 2 */ val ADD: typings.phaser.PhaserNs.BlendModes.ADD with Double = js.native
  /* 16 */ val COLOR: typings.phaser.PhaserNs.BlendModes.COLOR with Double = js.native
  /* 9 */ val COLOR_BURN: typings.phaser.PhaserNs.BlendModes.COLOR_BURN with Double = js.native
  /* 8 */ val COLOR_DODGE: typings.phaser.PhaserNs.BlendModes.COLOR_DODGE with Double = js.native
  /* 27 */ val COPY: typings.phaser.PhaserNs.BlendModes.COPY with Double = js.native
  /* 6 */ val DARKEN: typings.phaser.PhaserNs.BlendModes.DARKEN with Double = js.native
  /* 25 */ val DESTINATION_ATOP: typings.phaser.PhaserNs.BlendModes.DESTINATION_ATOP with Double = js.native
  /* 23 */ val DESTINATION_IN: typings.phaser.PhaserNs.BlendModes.DESTINATION_IN with Double = js.native
  /* 24 */ val DESTINATION_OUT: typings.phaser.PhaserNs.BlendModes.DESTINATION_OUT with Double = js.native
  /* 22 */ val DESTINATION_OVER: typings.phaser.PhaserNs.BlendModes.DESTINATION_OVER with Double = js.native
  /* 12 */ val DIFFERENCE: typings.phaser.PhaserNs.BlendModes.DIFFERENCE with Double = js.native
  /* 18 */ val ERASE: typings.phaser.PhaserNs.BlendModes.ERASE with Double = js.native
  /* 13 */ val EXCLUSION: typings.phaser.PhaserNs.BlendModes.EXCLUSION with Double = js.native
  /* 10 */ val HARD_LIGHT: typings.phaser.PhaserNs.BlendModes.HARD_LIGHT with Double = js.native
  /* 14 */ val HUE: typings.phaser.PhaserNs.BlendModes.HUE with Double = js.native
  /* 7 */ val LIGHTEN: typings.phaser.PhaserNs.BlendModes.LIGHTEN with Double = js.native
  /* 26 */ val LIGHTER: typings.phaser.PhaserNs.BlendModes.LIGHTER with Double = js.native
  /* 17 */ val LUMINOSITY: typings.phaser.PhaserNs.BlendModes.LUMINOSITY with Double = js.native
  /* 3 */ val MULTIPLY: typings.phaser.PhaserNs.BlendModes.MULTIPLY with Double = js.native
  /* 1 */ val NORMAL: typings.phaser.PhaserNs.BlendModes.NORMAL with Double = js.native
  /* 5 */ val OVERLAY: typings.phaser.PhaserNs.BlendModes.OVERLAY with Double = js.native
  /* 15 */ val SATURATION: typings.phaser.PhaserNs.BlendModes.SATURATION with Double = js.native
  /* 4 */ val SCREEN: typings.phaser.PhaserNs.BlendModes.SCREEN with Double = js.native
  /* 0 */ val SKIP_CHECK: typings.phaser.PhaserNs.BlendModes.SKIP_CHECK with Double = js.native
  /* 11 */ val SOFT_LIGHT: typings.phaser.PhaserNs.BlendModes.SOFT_LIGHT with Double = js.native
  /* 21 */ val SOURCE_ATOP: typings.phaser.PhaserNs.BlendModes.SOURCE_ATOP with Double = js.native
  /* 19 */ val SOURCE_IN: typings.phaser.PhaserNs.BlendModes.SOURCE_IN with Double = js.native
  /* 20 */ val SOURCE_OUT: typings.phaser.PhaserNs.BlendModes.SOURCE_OUT with Double = js.native
  /* 28 */ val XOR: typings.phaser.PhaserNs.BlendModes.XOR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendModes with Double] = js.native
}

