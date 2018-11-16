package typings
package mobservableLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueType extends js.Object

@JSImport("mobservable/lib/core", "ValueType")
@js.native
object ValueType extends js.Object {
  @js.native
  sealed trait Array
    extends mobservableLib.libCoreMod.ValueType
  
  @js.native
  sealed trait ComplexFunction
    extends mobservableLib.libCoreMod.ValueType
  
  @js.native
  sealed trait ComplexObject
    extends mobservableLib.libCoreMod.ValueType
  
  @js.native
  sealed trait PlainObject
    extends mobservableLib.libCoreMod.ValueType
  
  @js.native
  sealed trait Reference
    extends mobservableLib.libCoreMod.ValueType
  
  @js.native
  sealed trait ViewFunction
    extends mobservableLib.libCoreMod.ValueType
  
  /* 3 */ val Array: Array with scala.Double = js.native
  /* 5 */ val ComplexFunction: ComplexFunction with scala.Double = js.native
  /* 2 */ val ComplexObject: ComplexObject with scala.Double = js.native
  /* 1 */ val PlainObject: PlainObject with scala.Double = js.native
  /* 0 */ val Reference: Reference with scala.Double = js.native
  /* 4 */ val ViewFunction: ViewFunction with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mobservableLib.libCoreMod.ValueType with scala.Double] = js.native
}

