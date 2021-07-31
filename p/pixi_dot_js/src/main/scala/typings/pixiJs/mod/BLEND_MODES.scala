package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Various blend modes supported by PIXI.
  *
  * IMPORTANT - The WebGL renderer only supports the NORMAL, ADD, MULTIPLY and SCREEN blend modes.
  * Anything else will silently act like NORMAL.
  *
  * @memberof PIXI
  * @name BLEND_MODES
  * @enum {number}
  * @property {number} NORMAL
  * @property {number} ADD
  * @property {number} MULTIPLY
  * @property {number} SCREEN
  * @property {number} OVERLAY
  * @property {number} DARKEN
  * @property {number} LIGHTEN
  * @property {number} COLOR_DODGE
  * @property {number} COLOR_BURN
  * @property {number} HARD_LIGHT
  * @property {number} SOFT_LIGHT
  * @property {number} DIFFERENCE
  * @property {number} EXCLUSION
  * @property {number} HUE
  * @property {number} SATURATION
  * @property {number} COLOR
  * @property {number} LUMINOSITY
  * @property {number} NORMAL_NPM
  * @property {number} ADD_NPM
  * @property {number} SCREEN_NPM
  * @property {number} NONE
  * @property {number} SRC_IN
  * @property {number} SRC_OUT
  * @property {number} SRC_ATOP
  * @property {number} DST_OVER
  * @property {number} DST_IN
  * @property {number} DST_OUT
  * @property {number} DST_ATOP
  * @property {number} SUBTRACT
  * @property {number} SRC_OVER
  * @property {number} ERASE
  * @property {number} XOR
  */
@JSImport("pixi.js", "BLEND_MODES")
@js.native
object BLEND_MODES extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.pixiJs.PIXI.BLEND_MODES & Double] = js.native
  
  /* 1 */ val ADD: typings.pixiJs.PIXI.BLEND_MODES.ADD & Double = js.native
  
  /* 18 */ val ADD_NPM: typings.pixiJs.PIXI.BLEND_MODES.ADD_NPM & Double = js.native
  
  /* 15 */ val COLOR: typings.pixiJs.PIXI.BLEND_MODES.COLOR & Double = js.native
  
  /* 8 */ val COLOR_BURN: typings.pixiJs.PIXI.BLEND_MODES.COLOR_BURN & Double = js.native
  
  /* 7 */ val COLOR_DODGE: typings.pixiJs.PIXI.BLEND_MODES.COLOR_DODGE & Double = js.native
  
  /* 5 */ val DARKEN: typings.pixiJs.PIXI.BLEND_MODES.DARKEN & Double = js.native
  
  /* 11 */ val DIFFERENCE: typings.pixiJs.PIXI.BLEND_MODES.DIFFERENCE & Double = js.native
  
  /* 27 */ val DST_ATOP: typings.pixiJs.PIXI.BLEND_MODES.DST_ATOP & Double = js.native
  
  /* 25 */ val DST_IN: typings.pixiJs.PIXI.BLEND_MODES.DST_IN & Double = js.native
  
  /* 26 */ val DST_OUT: typings.pixiJs.PIXI.BLEND_MODES.DST_OUT & Double = js.native
  
  /* 24 */ val DST_OVER: typings.pixiJs.PIXI.BLEND_MODES.DST_OVER & Double = js.native
  
  /* 30 */ val ERASE: typings.pixiJs.PIXI.BLEND_MODES.ERASE & Double = js.native
  
  /* 12 */ val EXCLUSION: typings.pixiJs.PIXI.BLEND_MODES.EXCLUSION & Double = js.native
  
  /* 9 */ val HARD_LIGHT: typings.pixiJs.PIXI.BLEND_MODES.HARD_LIGHT & Double = js.native
  
  /* 13 */ val HUE: typings.pixiJs.PIXI.BLEND_MODES.HUE & Double = js.native
  
  /* 6 */ val LIGHTEN: typings.pixiJs.PIXI.BLEND_MODES.LIGHTEN & Double = js.native
  
  /* 16 */ val LUMINOSITY: typings.pixiJs.PIXI.BLEND_MODES.LUMINOSITY & Double = js.native
  
  /* 2 */ val MULTIPLY: typings.pixiJs.PIXI.BLEND_MODES.MULTIPLY & Double = js.native
  
  /* 20 */ val NONE: typings.pixiJs.PIXI.BLEND_MODES.NONE & Double = js.native
  
  /* 0 */ val NORMAL: typings.pixiJs.PIXI.BLEND_MODES.NORMAL & Double = js.native
  
  /* 17 */ val NORMAL_NPM: typings.pixiJs.PIXI.BLEND_MODES.NORMAL_NPM & Double = js.native
  
  /* 4 */ val OVERLAY: typings.pixiJs.PIXI.BLEND_MODES.OVERLAY & Double = js.native
  
  /* 14 */ val SATURATION: typings.pixiJs.PIXI.BLEND_MODES.SATURATION & Double = js.native
  
  /* 3 */ val SCREEN: typings.pixiJs.PIXI.BLEND_MODES.SCREEN & Double = js.native
  
  /* 19 */ val SCREEN_NPM: typings.pixiJs.PIXI.BLEND_MODES.SCREEN_NPM & Double = js.native
  
  /* 10 */ val SOFT_LIGHT: typings.pixiJs.PIXI.BLEND_MODES.SOFT_LIGHT & Double = js.native
  
  /* 23 */ val SRC_ATOP: typings.pixiJs.PIXI.BLEND_MODES.SRC_ATOP & Double = js.native
  
  /* 21 */ val SRC_IN: typings.pixiJs.PIXI.BLEND_MODES.SRC_IN & Double = js.native
  
  /* 22 */ val SRC_OUT: typings.pixiJs.PIXI.BLEND_MODES.SRC_OUT & Double = js.native
  
  /* 29 */ val SRC_OVER: typings.pixiJs.PIXI.BLEND_MODES.SRC_OVER & Double = js.native
  
  /* 28 */ val SUBTRACT: typings.pixiJs.PIXI.BLEND_MODES.SUBTRACT & Double = js.native
  
  /* 31 */ val XOR: typings.pixiJs.PIXI.BLEND_MODES.XOR & Double = js.native
}
