package typings.mobservable.coreMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueType extends js.Object
@JSImport("mobservable/lib/core", "ValueType")
@js.native
object ValueType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueType with Double] = js.native
  
  @js.native
  sealed trait Array extends ValueType
  /* 3 */ @js.native
  object Array extends TopLevel[Array with Double]
  
  @js.native
  sealed trait ComplexFunction extends ValueType
  /* 5 */ @js.native
  object ComplexFunction extends TopLevel[ComplexFunction with Double]
  
  @js.native
  sealed trait ComplexObject extends ValueType
  /* 2 */ @js.native
  object ComplexObject extends TopLevel[ComplexObject with Double]
  
  @js.native
  sealed trait PlainObject extends ValueType
  /* 1 */ @js.native
  object PlainObject extends TopLevel[PlainObject with Double]
  
  @js.native
  sealed trait Reference extends ValueType
  /* 0 */ @js.native
  object Reference extends TopLevel[Reference with Double]
  
  @js.native
  sealed trait ViewFunction extends ValueType
  /* 4 */ @js.native
  object ViewFunction extends TopLevel[ViewFunction with Double]
}
