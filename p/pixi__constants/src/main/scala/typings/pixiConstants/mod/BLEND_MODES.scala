package typings.pixiConstants.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BLEND_MODES extends StObject
@JSImport("@pixi/constants", "BLEND_MODES")
@js.native
object BLEND_MODES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BLEND_MODES & Double] = js.native
  
  /**
    * @default 1
    */
  @js.native
  sealed trait ADD
    extends StObject
       with BLEND_MODES
  /* 1 */ val ADD: typings.pixiConstants.mod.BLEND_MODES.ADD & Double = js.native
  
  /**
    * @default 18
    */
  @js.native
  sealed trait ADD_NPM
    extends StObject
       with BLEND_MODES
  /* 18 */ val ADD_NPM: typings.pixiConstants.mod.BLEND_MODES.ADD_NPM & Double = js.native
  
  /**
    * Preserves the luma of the bottom layer, while adopting the hue and chroma of the top layer.
    *
    * Canvas Renderer only.
    * @default 15
    */
  @js.native
  sealed trait COLOR
    extends StObject
       with BLEND_MODES
  /* 15 */ val COLOR: typings.pixiConstants.mod.BLEND_MODES.COLOR & Double = js.native
  
  /**
    * Divides the inverted bottom layer by the top layer, and then inverts the result.
    *
    * Canvas Renderer only.
    * @default 8
    */
  @js.native
  sealed trait COLOR_BURN
    extends StObject
       with BLEND_MODES
  /* 8 */ val COLOR_BURN: typings.pixiConstants.mod.BLEND_MODES.COLOR_BURN & Double = js.native
  
  /**
    * Divides the bottom layer by the inverted top layer.
    *
    * Canvas Renderer only.
    * @default 7
    */
  @js.native
  sealed trait COLOR_DODGE
    extends StObject
       with BLEND_MODES
  /* 7 */ val COLOR_DODGE: typings.pixiConstants.mod.BLEND_MODES.COLOR_DODGE & Double = js.native
  
  /**
    * Retains the darkest pixels of both layers.
    *
    * Canvas Renderer only.
    * @default 5
    */
  @js.native
  sealed trait DARKEN
    extends StObject
       with BLEND_MODES
  /* 5 */ val DARKEN: typings.pixiConstants.mod.BLEND_MODES.DARKEN & Double = js.native
  
  /**
    * Subtracts the bottom layer from the top layer or the other way round to always get a positive value.
    *
    * Canvas Renderer only.
    * @default 11
    */
  @js.native
  sealed trait DIFFERENCE
    extends StObject
       with BLEND_MODES
  /* 11 */ val DIFFERENCE: typings.pixiConstants.mod.BLEND_MODES.DIFFERENCE & Double = js.native
  
  /**
    * The existing canvas is only kept where it overlaps the new shape. The new shape is drawn behind the canvas content.
    * @default 27
    */
  @js.native
  sealed trait DST_ATOP
    extends StObject
       with BLEND_MODES
  /* 27 */ val DST_ATOP: typings.pixiConstants.mod.BLEND_MODES.DST_ATOP & Double = js.native
  
  /**
    * The existing canvas content is kept where both the new shape and existing canvas content overlap.
    * Everything else is made transparent.
    * @default 25
    */
  @js.native
  sealed trait DST_IN
    extends StObject
       with BLEND_MODES
  /* 25 */ val DST_IN: typings.pixiConstants.mod.BLEND_MODES.DST_IN & Double = js.native
  
  /**
    * The existing content is kept where it doesn't overlap the new shape.
    * @default 26
    */
  @js.native
  sealed trait DST_OUT
    extends StObject
       with BLEND_MODES
  /* 26 */ val DST_OUT: typings.pixiConstants.mod.BLEND_MODES.DST_OUT & Double = js.native
  
  /**
    * New shapes are drawn behind the existing canvas content.
    * @default 24
    */
  @js.native
  sealed trait DST_OVER
    extends StObject
       with BLEND_MODES
  /* 24 */ val DST_OVER: typings.pixiConstants.mod.BLEND_MODES.DST_OVER & Double = js.native
  
  /**
    * @default 26
    */
  @js.native
  sealed trait ERASE
    extends StObject
       with BLEND_MODES
  /* 26 */ val ERASE: typings.pixiConstants.mod.BLEND_MODES.ERASE & Double = js.native
  
  /**
    * Like difference, but with lower contrast.
    *
    * Canvas Renderer only.
    * @default 12
    */
  @js.native
  sealed trait EXCLUSION
    extends StObject
       with BLEND_MODES
  /* 12 */ val EXCLUSION: typings.pixiConstants.mod.BLEND_MODES.EXCLUSION & Double = js.native
  
  /**
    * A combination of multiply and screen like overlay, but with top and bottom layer swapped.
    *
    * Canvas Renderer only.
    * @default 9
    */
  @js.native
  sealed trait HARD_LIGHT
    extends StObject
       with BLEND_MODES
  /* 9 */ val HARD_LIGHT: typings.pixiConstants.mod.BLEND_MODES.HARD_LIGHT & Double = js.native
  
  /**
    * Preserves the luma and chroma of the bottom layer, while adopting the hue of the top layer.
    *
    * Canvas Renderer only.
    * @default 13
    */
  @js.native
  sealed trait HUE
    extends StObject
       with BLEND_MODES
  /* 13 */ val HUE: typings.pixiConstants.mod.BLEND_MODES.HUE & Double = js.native
  
  /**
    * Retains the lightest pixels of both layers.
    *
    * Canvas Renderer only.
    * @default 6
    */
  @js.native
  sealed trait LIGHTEN
    extends StObject
       with BLEND_MODES
  /* 6 */ val LIGHTEN: typings.pixiConstants.mod.BLEND_MODES.LIGHTEN & Double = js.native
  
  /**
    * Preserves the hue and chroma of the bottom layer, while adopting the luma of the top layer.
    *
    * Canvas Renderer only.
    * @default 16
    */
  @js.native
  sealed trait LUMINOSITY
    extends StObject
       with BLEND_MODES
  /* 16 */ val LUMINOSITY: typings.pixiConstants.mod.BLEND_MODES.LUMINOSITY & Double = js.native
  
  /**
    * The pixels of the top layer are multiplied with the corresponding pixel of the bottom layer.
    * A darker picture is the result.
    * @default 2
    */
  @js.native
  sealed trait MULTIPLY
    extends StObject
       with BLEND_MODES
  /* 2 */ val MULTIPLY: typings.pixiConstants.mod.BLEND_MODES.MULTIPLY & Double = js.native
  
  /**
    * @default 20
    */
  @js.native
  sealed trait NONE
    extends StObject
       with BLEND_MODES
  /* 20 */ val NONE: typings.pixiConstants.mod.BLEND_MODES.NONE & Double = js.native
  
  /**
    * @default 0
    */
  @js.native
  sealed trait NORMAL
    extends StObject
       with BLEND_MODES
  /* 0 */ val NORMAL: typings.pixiConstants.mod.BLEND_MODES.NORMAL & Double = js.native
  
  /**
    * @default 17
    */
  @js.native
  sealed trait NORMAL_NPM
    extends StObject
       with BLEND_MODES
  /* 17 */ val NORMAL_NPM: typings.pixiConstants.mod.BLEND_MODES.NORMAL_NPM & Double = js.native
  
  /**
    * A combination of multiply and screen. Dark parts on the base layer become darker, and light parts become lighter.
    *
    * Canvas Renderer only.
    * @default 4
    */
  @js.native
  sealed trait OVERLAY
    extends StObject
       with BLEND_MODES
  /* 4 */ val OVERLAY: typings.pixiConstants.mod.BLEND_MODES.OVERLAY & Double = js.native
  
  /**
    * Preserves the luma and hue of the bottom layer, while adopting the chroma of the top layer.
    *
    * Canvas Renderer only.
    * @default 14
    */
  @js.native
  sealed trait SATURATION
    extends StObject
       with BLEND_MODES
  /* 14 */ val SATURATION: typings.pixiConstants.mod.BLEND_MODES.SATURATION & Double = js.native
  
  /**
    * The pixels are inverted, multiplied, and inverted again. A lighter picture is the result (opposite of multiply)
    * @default 3
    */
  @js.native
  sealed trait SCREEN
    extends StObject
       with BLEND_MODES
  /* 3 */ val SCREEN: typings.pixiConstants.mod.BLEND_MODES.SCREEN & Double = js.native
  
  /**
    * @default 19
    */
  @js.native
  sealed trait SCREEN_NPM
    extends StObject
       with BLEND_MODES
  /* 19 */ val SCREEN_NPM: typings.pixiConstants.mod.BLEND_MODES.SCREEN_NPM & Double = js.native
  
  /**
    * A softer version of hard-light. Pure black or white does not result in pure black or white.
    *
    * Canvas Renderer only.
    * @default 10
    */
  @js.native
  sealed trait SOFT_LIGHT
    extends StObject
       with BLEND_MODES
  /* 10 */ val SOFT_LIGHT: typings.pixiConstants.mod.BLEND_MODES.SOFT_LIGHT & Double = js.native
  
  /**
    * The new shape is only drawn where it overlaps the existing canvas content.
    * @default 23
    */
  @js.native
  sealed trait SRC_ATOP
    extends StObject
       with BLEND_MODES
  /* 23 */ val SRC_ATOP: typings.pixiConstants.mod.BLEND_MODES.SRC_ATOP & Double = js.native
  
  /**
    * The new shape is drawn only where both the new shape and the destination canvas overlap.
    * Everything else is made transparent.
    * @default 21
    */
  @js.native
  sealed trait SRC_IN
    extends StObject
       with BLEND_MODES
  /* 21 */ val SRC_IN: typings.pixiConstants.mod.BLEND_MODES.SRC_IN & Double = js.native
  
  /**
    * The new shape is drawn where it doesn't overlap the existing canvas content.
    * @default 22
    */
  @js.native
  sealed trait SRC_OUT
    extends StObject
       with BLEND_MODES
  /* 22 */ val SRC_OUT: typings.pixiConstants.mod.BLEND_MODES.SRC_OUT & Double = js.native
  
  /**
    * Draws new shapes on top of the existing canvas content.
    * @default 0
    */
  @js.native
  sealed trait SRC_OVER
    extends StObject
       with BLEND_MODES
  /* 0 */ val SRC_OVER: typings.pixiConstants.mod.BLEND_MODES.SRC_OVER & Double = js.native
  
  /**
    * @default 28
    */
  @js.native
  sealed trait SUBTRACT
    extends StObject
       with BLEND_MODES
  /* 28 */ val SUBTRACT: typings.pixiConstants.mod.BLEND_MODES.SUBTRACT & Double = js.native
  
  /**
    * Shapes are made transparent where both overlap and drawn normal everywhere else.
    * @default 29
    */
  @js.native
  sealed trait XOR
    extends StObject
       with BLEND_MODES
  /* 29 */ val XOR: typings.pixiConstants.mod.BLEND_MODES.XOR & Double = js.native
}
