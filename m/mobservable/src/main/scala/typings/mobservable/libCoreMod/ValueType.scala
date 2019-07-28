package typings.mobservable.libCoreMod

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
  
  /* 3 */ val Array: typings.mobservable.libCoreMod.ValueType.Array with Double = js.native
  /* 5 */ val ComplexFunction: typings.mobservable.libCoreMod.ValueType.ComplexFunction with Double = js.native
  /* 2 */ val ComplexObject: typings.mobservable.libCoreMod.ValueType.ComplexObject with Double = js.native
  /* 1 */ val PlainObject: typings.mobservable.libCoreMod.ValueType.PlainObject with Double = js.native
  /* 0 */ val Reference: typings.mobservable.libCoreMod.ValueType.Reference with Double = js.native
  /* 4 */ val ViewFunction: typings.mobservable.libCoreMod.ValueType.ViewFunction with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueType with Double] = js.native
}

