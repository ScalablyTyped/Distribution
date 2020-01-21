package typings.mobservable.coreMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueType extends js.Object

@JSImport("mobservable/lib/core", "ValueType")
@js.native
object ValueType extends js.Object {
  @js.native
  sealed trait Array extends ValueType
  
  @js.native
  sealed trait ComplexFunction extends ValueType
  
  @js.native
  sealed trait ComplexObject extends ValueType
  
  @js.native
  sealed trait PlainObject extends ValueType
  
  @js.native
  sealed trait Reference extends ValueType
  
  @js.native
  sealed trait ViewFunction extends ValueType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueType with Double] = js.native
  /* 3 */ @js.native
  object Array extends TopLevel[Array with Double]
  
  /* 5 */ @js.native
  object ComplexFunction extends TopLevel[ComplexFunction with Double]
  
  /* 2 */ @js.native
  object ComplexObject extends TopLevel[ComplexObject with Double]
  
  /* 1 */ @js.native
  object PlainObject extends TopLevel[PlainObject with Double]
  
  /* 0 */ @js.native
  object Reference extends TopLevel[Reference with Double]
  
  /* 4 */ @js.native
  object ViewFunction extends TopLevel[ViewFunction with Double]
  
}

