package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  sealed trait ADD
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait ADD_NPM
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait COLOR
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait COLOR_BURN
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait COLOR_DODGE
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait DARKEN
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait DIFFERENCE
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait DST_ATOP
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait DST_IN
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait DST_OUT
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait DST_OVER
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait ERASE
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait EXCLUSION
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait HARD_LIGHT
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait HUE
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait LIGHTEN
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait LUMINOSITY
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait MULTIPLY
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait NONE
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait NORMAL_NPM
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait OVERLAY
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait SATURATION
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait SCREEN
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait SCREEN_NPM
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait SOFT_LIGHT
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait SRC_ATOP
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait SRC_IN
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait SRC_OUT
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait SRC_OVER
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait SUBTRACT
    extends StObject
       with BLEND_MODES
  
  @js.native
  sealed trait XOR
    extends StObject
       with BLEND_MODES
}
