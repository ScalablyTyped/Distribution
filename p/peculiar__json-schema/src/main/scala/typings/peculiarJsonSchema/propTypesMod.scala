package typings.peculiarJsonSchema

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/prop_types", JSImport.Namespace)
@js.native
object propTypesMod extends js.Object {
  @js.native
  sealed trait JsonPropTypes extends js.Object
  
  @js.native
  object JsonPropTypes extends js.Object {
    @js.native
    sealed trait Any extends JsonPropTypes
    
    @js.native
    sealed trait Boolean extends JsonPropTypes
    
    @js.native
    sealed trait Number extends JsonPropTypes
    
    @js.native
    sealed trait String extends JsonPropTypes
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[JsonPropTypes with Double] = js.native
    /* 0 */ @js.native
    object Any extends TopLevel[Any with Double]
    
    /* 1 */ @js.native
    object Boolean extends TopLevel[Boolean with Double]
    
    /* 2 */ @js.native
    object Number extends TopLevel[Number with Double]
    
    /* 3 */ @js.native
    object String extends TopLevel[String with Double]
    
  }
  
}

