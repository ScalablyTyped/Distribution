package typings.ol.helperMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DefaultUniform extends js.Object
@JSImport("ol/webgl/Helper", "DefaultUniform")
@js.native
object DefaultUniform extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DefaultUniform with String] = js.native
  
  @js.native
  sealed trait OFFSET_ROTATION_MATRIX extends DefaultUniform
  /* "u_offsetRotateMatrix" */ @js.native
  object OFFSET_ROTATION_MATRIX extends TopLevel[OFFSET_ROTATION_MATRIX with String]
  
  @js.native
  sealed trait OFFSET_SCALE_MATRIX extends DefaultUniform
  /* "u_offsetScaleMatrix" */ @js.native
  object OFFSET_SCALE_MATRIX extends TopLevel[OFFSET_SCALE_MATRIX with String]
  
  @js.native
  sealed trait PROJECTION_MATRIX extends DefaultUniform
  /* "u_projectionMatrix" */ @js.native
  object PROJECTION_MATRIX extends TopLevel[PROJECTION_MATRIX with String]
  
  @js.native
  sealed trait RESOLUTION extends DefaultUniform
  /* "u_resolution" */ @js.native
  object RESOLUTION extends TopLevel[RESOLUTION with String]
  
  @js.native
  sealed trait TIME extends DefaultUniform
  /* "u_time" */ @js.native
  object TIME extends TopLevel[TIME with String]
  
  @js.native
  sealed trait ZOOM extends DefaultUniform
  /* "u_zoom" */ @js.native
  object ZOOM extends TopLevel[ZOOM with String]
}
