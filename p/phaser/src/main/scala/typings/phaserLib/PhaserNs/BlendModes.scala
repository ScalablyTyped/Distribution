package typings
package phaserLib.PhaserNs

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
  sealed trait ADD
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Color blend mode. For Canvas only.
    * Preserves the luma of the bottom layer, while adopting the hue and chroma of the top layer.
    */
  @js.native
  sealed trait COLOR
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Color Burn blend mode. For Canvas only.
    * Divides the inverted bottom layer by the top layer, and then inverts the result.
    */
  @js.native
  sealed trait COLOR_BURN
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Color Dodge blend mode. For Canvas only.
    * Divides the bottom layer by the inverted top layer.
    */
  @js.native
  sealed trait COLOR_DODGE
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Copy blend mode. For Canvas only.
    * Only the new shape is shown.
    */
  @js.native
  sealed trait COPY
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Darken blend mode. For Canvas only.
    * Retains the darkest pixels of both layers.
    */
  @js.native
  sealed trait DARKEN
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Destination-out blend mode. For Canvas only.
    * The existing canvas is only kept where it overlaps the new shape. The new shape is drawn behind the canvas content.
    */
  @js.native
  sealed trait DESTINATION_ATOP
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Destination-in blend mode. For Canvas only.
    * The existing canvas content is kept where both the new shape and existing canvas content overlap. Everything else is made transparent.
    */
  @js.native
  sealed trait DESTINATION_IN
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Destination-out blend mode. For Canvas only.
    * The existing content is kept where it doesn't overlap the new shape.
    */
  @js.native
  sealed trait DESTINATION_OUT
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Destination-over blend mode. For Canvas only.
    * New shapes are drawn behind the existing canvas content.
    */
  @js.native
  sealed trait DESTINATION_OVER
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Difference blend mode. For Canvas only.
    * Subtracts the bottom layer from the top layer or the other way round to always get a positive value.
    */
  @js.native
  sealed trait DIFFERENCE
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Alpha erase blend mode. For Canvas and WebGL.
    */
  @js.native
  sealed trait ERASE
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Exclusion blend mode. For Canvas only.
    * Like difference, but with lower contrast.
    */
  @js.native
  sealed trait EXCLUSION
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Hard Light blend mode. For Canvas only.
    * A combination of multiply and screen like overlay, but with top and bottom layer swapped.
    */
  @js.native
  sealed trait HARD_LIGHT
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Hue blend mode. For Canvas only.
    * Preserves the luma and chroma of the bottom layer, while adopting the hue of the top layer.
    */
  @js.native
  sealed trait HUE
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Lighten blend mode. For Canvas only.
    * Retains the lightest pixels of both layers.
    */
  @js.native
  sealed trait LIGHTEN
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Lighten blend mode. For Canvas only.
    * Where both shapes overlap the color is determined by adding color values.
    */
  @js.native
  sealed trait LIGHTER
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Luminosity blend mode. For Canvas only.
    * Preserves the hue and chroma of the bottom layer, while adopting the luma of the top layer.
    */
  @js.native
  sealed trait LUMINOSITY
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Multiply blend mode. For Canvas and WebGL.
    * The pixels are of the top layer are multiplied with the corresponding pixel of the bottom layer. A darker picture is the result.
    */
  @js.native
  sealed trait MULTIPLY
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Normal blend mode. For Canvas and WebGL.
    * This is the default setting and draws new shapes on top of the existing canvas content.
    */
  @js.native
  sealed trait NORMAL
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Overlay blend mode. For Canvas only.
    * A combination of multiply and screen. Dark parts on the base layer become darker, and light parts become lighter.
    */
  @js.native
  sealed trait OVERLAY
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Saturation blend mode. For Canvas only.
    * Preserves the luma and hue of the bottom layer, while adopting the chroma of the top layer.
    */
  @js.native
  sealed trait SATURATION
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Screen blend mode. For Canvas and WebGL.
    * The pixels are inverted, multiplied, and inverted again. A lighter picture is the result (opposite of multiply)
    */
  @js.native
  sealed trait SCREEN
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Skips the Blend Mode check in the renderer.
    */
  @js.native
  sealed trait SKIP_CHECK
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Soft Light blend mode. For Canvas only.
    * A softer version of hard-light. Pure black or white does not result in pure black or white.
    */
  @js.native
  sealed trait SOFT_LIGHT
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Source-out blend mode. For Canvas only.
    * The new shape is only drawn where it overlaps the existing canvas content.
    */
  @js.native
  sealed trait SOURCE_ATOP
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Source-in blend mode. For Canvas only.
    * The new shape is drawn only where both the new shape and the destination canvas overlap. Everything else is made transparent.
    */
  @js.native
  sealed trait SOURCE_IN
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Source-out blend mode. For Canvas only.
    * The new shape is drawn where it doesn't overlap the existing canvas content.
    */
  @js.native
  sealed trait SOURCE_OUT
    extends phaserLib.PhaserNs.BlendModes
  
  /**
    * Xor blend mode. For Canvas only.
    * Shapes are made transparent where both overlap and drawn normal everywhere else.
    */
  @js.native
  sealed trait XOR
    extends phaserLib.PhaserNs.BlendModes
  
  /* 2 */ val ADD: ADD with scala.Double = js.native
  /* 16 */ val COLOR: COLOR with scala.Double = js.native
  /* 9 */ val COLOR_BURN: COLOR_BURN with scala.Double = js.native
  /* 8 */ val COLOR_DODGE: COLOR_DODGE with scala.Double = js.native
  /* 27 */ val COPY: COPY with scala.Double = js.native
  /* 6 */ val DARKEN: DARKEN with scala.Double = js.native
  /* 25 */ val DESTINATION_ATOP: DESTINATION_ATOP with scala.Double = js.native
  /* 23 */ val DESTINATION_IN: DESTINATION_IN with scala.Double = js.native
  /* 24 */ val DESTINATION_OUT: DESTINATION_OUT with scala.Double = js.native
  /* 22 */ val DESTINATION_OVER: DESTINATION_OVER with scala.Double = js.native
  /* 12 */ val DIFFERENCE: DIFFERENCE with scala.Double = js.native
  /* 18 */ val ERASE: ERASE with scala.Double = js.native
  /* 13 */ val EXCLUSION: EXCLUSION with scala.Double = js.native
  /* 10 */ val HARD_LIGHT: HARD_LIGHT with scala.Double = js.native
  /* 14 */ val HUE: HUE with scala.Double = js.native
  /* 7 */ val LIGHTEN: LIGHTEN with scala.Double = js.native
  /* 26 */ val LIGHTER: LIGHTER with scala.Double = js.native
  /* 17 */ val LUMINOSITY: LUMINOSITY with scala.Double = js.native
  /* 3 */ val MULTIPLY: MULTIPLY with scala.Double = js.native
  /* 1 */ val NORMAL: NORMAL with scala.Double = js.native
  /* 5 */ val OVERLAY: OVERLAY with scala.Double = js.native
  /* 15 */ val SATURATION: SATURATION with scala.Double = js.native
  /* 4 */ val SCREEN: SCREEN with scala.Double = js.native
  /* 0 */ val SKIP_CHECK: SKIP_CHECK with scala.Double = js.native
  /* 11 */ val SOFT_LIGHT: SOFT_LIGHT with scala.Double = js.native
  /* 21 */ val SOURCE_ATOP: SOURCE_ATOP with scala.Double = js.native
  /* 19 */ val SOURCE_IN: SOURCE_IN with scala.Double = js.native
  /* 20 */ val SOURCE_OUT: SOURCE_OUT with scala.Double = js.native
  /* 28 */ val XOR: XOR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.PhaserNs.BlendModes with scala.Double] = js.native
}

