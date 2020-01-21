package typings.ol.helperMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShaderType extends js.Object

@JSImport("ol/webgl/Helper", "ShaderType")
@js.native
object ShaderType extends js.Object {
  @js.native
  sealed trait FRAGMENT_SHADER extends ShaderType
  
  @js.native
  sealed trait VERTEX_SHADER extends ShaderType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ShaderType with Double] = js.native
  /* 35632 */ @js.native
  object FRAGMENT_SHADER extends TopLevel[FRAGMENT_SHADER with Double]
  
  /* 35633 */ @js.native
  object VERTEX_SHADER extends TopLevel[VERTEX_SHADER with Double]
  
}

