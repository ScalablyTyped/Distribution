package typings.mobservable.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueMode extends js.Object

@JSImport("mobservable/lib/core", "ValueMode")
@js.native
object ValueMode extends js.Object {
  @js.native
  sealed trait Flat extends ValueMode
  
  @js.native
  sealed trait Recursive extends ValueMode
  
  @js.native
  sealed trait Reference extends ValueMode
  
  @js.native
  sealed trait Structure extends ValueMode
  
  /* 3 */ val Flat: typings.mobservable.libCoreMod.ValueMode.Flat with Double = js.native
  /* 0 */ val Recursive: typings.mobservable.libCoreMod.ValueMode.Recursive with Double = js.native
  /* 1 */ val Reference: typings.mobservable.libCoreMod.ValueMode.Reference with Double = js.native
  /* 2 */ val Structure: typings.mobservable.libCoreMod.ValueMode.Structure with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueMode with Double] = js.native
}

