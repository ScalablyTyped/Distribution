package typings.ol.helperMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AttributeType extends js.Object
@JSImport("ol/webgl/Helper", "AttributeType")
@js.native
object AttributeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttributeType with Double] = js.native
  
  @js.native
  sealed trait FLOAT extends AttributeType
  /* 5126 */ @js.native
  object FLOAT extends TopLevel[FLOAT with Double]
  
  @js.native
  sealed trait UNSIGNED_BYTE extends AttributeType
  /* 5121 */ @js.native
  object UNSIGNED_BYTE extends TopLevel[UNSIGNED_BYTE with Double]
  
  @js.native
  sealed trait UNSIGNED_INT extends AttributeType
  /* 5125 */ @js.native
  object UNSIGNED_INT extends TopLevel[UNSIGNED_INT with Double]
  
  @js.native
  sealed trait UNSIGNED_SHORT extends AttributeType
  /* 5123 */ @js.native
  object UNSIGNED_SHORT extends TopLevel[UNSIGNED_SHORT with Double]
}
