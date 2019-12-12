package typings.phaser.Phaser

import org.scalablytyped.runtime.TopLevel
import typings.phaser.Phaser.BlendModes.ADD
import typings.phaser.Phaser.BlendModes.COLOR
import typings.phaser.Phaser.BlendModes.COLOR_BURN
import typings.phaser.Phaser.BlendModes.COLOR_DODGE
import typings.phaser.Phaser.BlendModes.COPY
import typings.phaser.Phaser.BlendModes.DARKEN
import typings.phaser.Phaser.BlendModes.DESTINATION_ATOP
import typings.phaser.Phaser.BlendModes.DESTINATION_IN
import typings.phaser.Phaser.BlendModes.DESTINATION_OUT
import typings.phaser.Phaser.BlendModes.DESTINATION_OVER
import typings.phaser.Phaser.BlendModes.DIFFERENCE
import typings.phaser.Phaser.BlendModes.ERASE
import typings.phaser.Phaser.BlendModes.EXCLUSION
import typings.phaser.Phaser.BlendModes.HARD_LIGHT
import typings.phaser.Phaser.BlendModes.HUE
import typings.phaser.Phaser.BlendModes.LIGHTEN
import typings.phaser.Phaser.BlendModes.LIGHTER
import typings.phaser.Phaser.BlendModes.LUMINOSITY
import typings.phaser.Phaser.BlendModes.MULTIPLY
import typings.phaser.Phaser.BlendModes.NORMAL
import typings.phaser.Phaser.BlendModes.OVERLAY
import typings.phaser.Phaser.BlendModes.SATURATION
import typings.phaser.Phaser.BlendModes.SCREEN
import typings.phaser.Phaser.BlendModes.SKIP_CHECK
import typings.phaser.Phaser.BlendModes.SOFT_LIGHT
import typings.phaser.Phaser.BlendModes.SOURCE_ATOP
import typings.phaser.Phaser.BlendModes.SOURCE_IN
import typings.phaser.Phaser.BlendModes.SOURCE_OUT
import typings.phaser.Phaser.BlendModes.XOR
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BlendModes with Double] = js.native
  /* 2 */ @js.native
  object ADD extends TopLevel[ADD with Double]
  
  /* 16 */ @js.native
  object COLOR extends TopLevel[COLOR with Double]
  
  /* 9 */ @js.native
  object COLOR_BURN extends TopLevel[COLOR_BURN with Double]
  
  /* 8 */ @js.native
  object COLOR_DODGE extends TopLevel[COLOR_DODGE with Double]
  
  /* 27 */ @js.native
  object COPY extends TopLevel[COPY with Double]
  
  /* 6 */ @js.native
  object DARKEN extends TopLevel[DARKEN with Double]
  
  /* 25 */ @js.native
  object DESTINATION_ATOP extends TopLevel[DESTINATION_ATOP with Double]
  
  /* 23 */ @js.native
  object DESTINATION_IN extends TopLevel[DESTINATION_IN with Double]
  
  /* 24 */ @js.native
  object DESTINATION_OUT extends TopLevel[DESTINATION_OUT with Double]
  
  /* 22 */ @js.native
  object DESTINATION_OVER extends TopLevel[DESTINATION_OVER with Double]
  
  /* 12 */ @js.native
  object DIFFERENCE extends TopLevel[DIFFERENCE with Double]
  
  /* 18 */ @js.native
  object ERASE extends TopLevel[ERASE with Double]
  
  /* 13 */ @js.native
  object EXCLUSION extends TopLevel[EXCLUSION with Double]
  
  /* 10 */ @js.native
  object HARD_LIGHT extends TopLevel[HARD_LIGHT with Double]
  
  /* 14 */ @js.native
  object HUE extends TopLevel[HUE with Double]
  
  /* 7 */ @js.native
  object LIGHTEN extends TopLevel[LIGHTEN with Double]
  
  /* 26 */ @js.native
  object LIGHTER extends TopLevel[LIGHTER with Double]
  
  /* 17 */ @js.native
  object LUMINOSITY extends TopLevel[LUMINOSITY with Double]
  
  /* 3 */ @js.native
  object MULTIPLY extends TopLevel[MULTIPLY with Double]
  
  /* 1 */ @js.native
  object NORMAL extends TopLevel[NORMAL with Double]
  
  /* 5 */ @js.native
  object OVERLAY extends TopLevel[OVERLAY with Double]
  
  /* 15 */ @js.native
  object SATURATION extends TopLevel[SATURATION with Double]
  
  /* 4 */ @js.native
  object SCREEN extends TopLevel[SCREEN with Double]
  
  /* 0 */ @js.native
  object SKIP_CHECK extends TopLevel[SKIP_CHECK with Double]
  
  /* 11 */ @js.native
  object SOFT_LIGHT extends TopLevel[SOFT_LIGHT with Double]
  
  /* 21 */ @js.native
  object SOURCE_ATOP extends TopLevel[SOURCE_ATOP with Double]
  
  /* 19 */ @js.native
  object SOURCE_IN extends TopLevel[SOURCE_IN with Double]
  
  /* 20 */ @js.native
  object SOURCE_OUT extends TopLevel[SOURCE_OUT with Double]
  
  /* 28 */ @js.native
  object XOR extends TopLevel[XOR with Double]
  
}

