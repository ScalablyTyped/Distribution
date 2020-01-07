package typings.ol.webglHelperMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttributeType extends js.Object

@JSImport("ol/webgl/Helper", "AttributeType")
@js.native
object AttributeType extends js.Object {
  @js.native
  sealed trait FLOAT extends AttributeType
  
  @js.native
  sealed trait UNSIGNED_BYTE extends AttributeType
  
  @js.native
  sealed trait UNSIGNED_INT extends AttributeType
  
  @js.native
  sealed trait UNSIGNED_SHORT extends AttributeType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttributeType with Double] = js.native
  /* 5126 */ @js.native
  object FLOAT extends TopLevel[FLOAT with Double]
  
  /* 5121 */ @js.native
  object UNSIGNED_BYTE extends TopLevel[UNSIGNED_BYTE with Double]
  
  /* 5125 */ @js.native
  object UNSIGNED_INT extends TopLevel[UNSIGNED_INT with Double]
  
  /* 5123 */ @js.native
  object UNSIGNED_SHORT extends TopLevel[UNSIGNED_SHORT with Double]
  
}

