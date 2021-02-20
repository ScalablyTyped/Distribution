package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BLEND_MODES extends StObject
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
object BLEND_MODES extends StObject {
  
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
}
