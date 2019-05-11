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
  
  val ADD: ADD with java.lang.String = js.native
  val COLOR: COLOR with java.lang.String = js.native
  val COLOR_BURN: COLOR_BURN with java.lang.String = js.native
  val COLOR_DODGE: COLOR_DODGE with java.lang.String = js.native
  val COPY: COPY with java.lang.String = js.native
  val DARKEN: DARKEN with java.lang.String = js.native
  val DESTINATION_ATOP: DESTINATION_ATOP with java.lang.String = js.native
  val DESTINATION_IN: DESTINATION_IN with java.lang.String = js.native
  val DESTINATION_OUT: DESTINATION_OUT with java.lang.String = js.native
  val DESTINATION_OVER: DESTINATION_OVER with java.lang.String = js.native
  val DIFFERENCE: DIFFERENCE with java.lang.String = js.native
  val ERASE: ERASE with java.lang.String = js.native
  val EXCLUSION: EXCLUSION with java.lang.String = js.native
  val HARD_LIGHT: HARD_LIGHT with java.lang.String = js.native
  val HUE: HUE with java.lang.String = js.native
  val LIGHTEN: LIGHTEN with java.lang.String = js.native
  val LIGHTER: LIGHTER with java.lang.String = js.native
  val LUMINOSITY: LUMINOSITY with java.lang.String = js.native
  val MULTIPLY: MULTIPLY with java.lang.String = js.native
  val NORMAL: NORMAL with java.lang.String = js.native
  val OVERLAY: OVERLAY with java.lang.String = js.native
  val SATURATION: SATURATION with java.lang.String = js.native
  val SCREEN: SCREEN with java.lang.String = js.native
  val SKIP_CHECK: SKIP_CHECK with java.lang.String = js.native
  val SOFT_LIGHT: SOFT_LIGHT with java.lang.String = js.native
  val SOURCE_ATOP: SOURCE_ATOP with java.lang.String = js.native
  val SOURCE_IN: SOURCE_IN with java.lang.String = js.native
  val SOURCE_OUT: SOURCE_OUT with java.lang.String = js.native
  val XOR: XOR with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[phaserLib.PhaserNs.BlendModes with java.lang.String] = js.native
}

