package typings.ol.webglHelperMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DefaultUniform extends js.Object

@JSImport("ol/webgl/Helper", "DefaultUniform")
@js.native
object DefaultUniform extends js.Object {
  @js.native
  sealed trait OFFSET_ROTATION_MATRIX extends DefaultUniform
  
  @js.native
  sealed trait OFFSET_SCALE_MATRIX extends DefaultUniform
  
  @js.native
  sealed trait PROJECTION_MATRIX extends DefaultUniform
  
  @js.native
  sealed trait RESOLUTION extends DefaultUniform
  
  @js.native
  sealed trait TIME extends DefaultUniform
  
  @js.native
  sealed trait ZOOM extends DefaultUniform
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DefaultUniform with String] = js.native
  /* "u_offsetRotateMatrix" */ @js.native
  object OFFSET_ROTATION_MATRIX extends TopLevel[OFFSET_ROTATION_MATRIX with String]
  
  /* "u_offsetScaleMatrix" */ @js.native
  object OFFSET_SCALE_MATRIX extends TopLevel[OFFSET_SCALE_MATRIX with String]
  
  /* "u_projectionMatrix" */ @js.native
  object PROJECTION_MATRIX extends TopLevel[PROJECTION_MATRIX with String]
  
  /* "u_resolution" */ @js.native
  object RESOLUTION extends TopLevel[RESOLUTION with String]
  
  /* "u_time" */ @js.native
  object TIME extends TopLevel[TIME with String]
  
  /* "u_zoom" */ @js.native
  object ZOOM extends TopLevel[ZOOM with String]
  
}

