package typings.pixiJs.PIXI

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BLEND_MODES extends js.Object

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
@JSGlobal("PIXI.BLEND_MODES")
@js.native
object BLEND_MODES extends js.Object {
  @js.native
  sealed trait ADD extends BLEND_MODES
  
  @js.native
  sealed trait ADD_NPM extends BLEND_MODES
  
  @js.native
  sealed trait COLOR extends BLEND_MODES
  
  @js.native
  sealed trait COLOR_BURN extends BLEND_MODES
  
  @js.native
  sealed trait COLOR_DODGE extends BLEND_MODES
  
  @js.native
  sealed trait DARKEN extends BLEND_MODES
  
  @js.native
  sealed trait DIFFERENCE extends BLEND_MODES
  
  @js.native
  sealed trait DST_ATOP extends BLEND_MODES
  
  @js.native
  sealed trait DST_IN extends BLEND_MODES
  
  @js.native
  sealed trait DST_OUT extends BLEND_MODES
  
  @js.native
  sealed trait DST_OVER extends BLEND_MODES
  
  @js.native
  sealed trait ERASE extends BLEND_MODES
  
  @js.native
  sealed trait EXCLUSION extends BLEND_MODES
  
  @js.native
  sealed trait HARD_LIGHT extends BLEND_MODES
  
  @js.native
  sealed trait HUE extends BLEND_MODES
  
  @js.native
  sealed trait LIGHTEN extends BLEND_MODES
  
  @js.native
  sealed trait LUMINOSITY extends BLEND_MODES
  
  @js.native
  sealed trait MULTIPLY extends BLEND_MODES
  
  @js.native
  sealed trait NONE extends BLEND_MODES
  
  @js.native
  sealed trait NORMAL extends BLEND_MODES
  
  @js.native
  sealed trait NORMAL_NPM extends BLEND_MODES
  
  @js.native
  sealed trait OVERLAY extends BLEND_MODES
  
  @js.native
  sealed trait SATURATION extends BLEND_MODES
  
  @js.native
  sealed trait SCREEN extends BLEND_MODES
  
  @js.native
  sealed trait SCREEN_NPM extends BLEND_MODES
  
  @js.native
  sealed trait SOFT_LIGHT extends BLEND_MODES
  
  @js.native
  sealed trait SRC_ATOP extends BLEND_MODES
  
  @js.native
  sealed trait SRC_IN extends BLEND_MODES
  
  @js.native
  sealed trait SRC_OUT extends BLEND_MODES
  
  @js.native
  sealed trait SRC_OVER extends BLEND_MODES
  
  @js.native
  sealed trait SUBTRACT extends BLEND_MODES
  
  @js.native
  sealed trait XOR extends BLEND_MODES
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BLEND_MODES with Double] = js.native
  /* 1 */ @js.native
  object ADD extends TopLevel[ADD with Double]
  
  /* 18 */ @js.native
  object ADD_NPM extends TopLevel[ADD_NPM with Double]
  
  /* 15 */ @js.native
  object COLOR extends TopLevel[COLOR with Double]
  
  /* 8 */ @js.native
  object COLOR_BURN extends TopLevel[COLOR_BURN with Double]
  
  /* 7 */ @js.native
  object COLOR_DODGE extends TopLevel[COLOR_DODGE with Double]
  
  /* 5 */ @js.native
  object DARKEN extends TopLevel[DARKEN with Double]
  
  /* 11 */ @js.native
  object DIFFERENCE extends TopLevel[DIFFERENCE with Double]
  
  /* 27 */ @js.native
  object DST_ATOP extends TopLevel[DST_ATOP with Double]
  
  /* 25 */ @js.native
  object DST_IN extends TopLevel[DST_IN with Double]
  
  /* 26 */ @js.native
  object DST_OUT extends TopLevel[DST_OUT with Double]
  
  /* 24 */ @js.native
  object DST_OVER extends TopLevel[DST_OVER with Double]
  
  /* 30 */ @js.native
  object ERASE extends TopLevel[ERASE with Double]
  
  /* 12 */ @js.native
  object EXCLUSION extends TopLevel[EXCLUSION with Double]
  
  /* 9 */ @js.native
  object HARD_LIGHT extends TopLevel[HARD_LIGHT with Double]
  
  /* 13 */ @js.native
  object HUE extends TopLevel[HUE with Double]
  
  /* 6 */ @js.native
  object LIGHTEN extends TopLevel[LIGHTEN with Double]
  
  /* 16 */ @js.native
  object LUMINOSITY extends TopLevel[LUMINOSITY with Double]
  
  /* 2 */ @js.native
  object MULTIPLY extends TopLevel[MULTIPLY with Double]
  
  /* 20 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 0 */ @js.native
  object NORMAL extends TopLevel[NORMAL with Double]
  
  /* 17 */ @js.native
  object NORMAL_NPM extends TopLevel[NORMAL_NPM with Double]
  
  /* 4 */ @js.native
  object OVERLAY extends TopLevel[OVERLAY with Double]
  
  /* 14 */ @js.native
  object SATURATION extends TopLevel[SATURATION with Double]
  
  /* 3 */ @js.native
  object SCREEN extends TopLevel[SCREEN with Double]
  
  /* 19 */ @js.native
  object SCREEN_NPM extends TopLevel[SCREEN_NPM with Double]
  
  /* 10 */ @js.native
  object SOFT_LIGHT extends TopLevel[SOFT_LIGHT with Double]
  
  /* 23 */ @js.native
  object SRC_ATOP extends TopLevel[SRC_ATOP with Double]
  
  /* 21 */ @js.native
  object SRC_IN extends TopLevel[SRC_IN with Double]
  
  /* 22 */ @js.native
  object SRC_OUT extends TopLevel[SRC_OUT with Double]
  
  /* 29 */ @js.native
  object SRC_OVER extends TopLevel[SRC_OVER with Double]
  
  /* 28 */ @js.native
  object SUBTRACT extends TopLevel[SUBTRACT with Double]
  
  /* 31 */ @js.native
  object XOR extends TopLevel[XOR with Double]
  
}

