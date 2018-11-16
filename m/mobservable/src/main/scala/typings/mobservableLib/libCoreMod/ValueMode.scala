package typings
package mobservableLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueMode extends js.Object

@JSImport("mobservable/lib/core", "ValueMode")
@js.native
object ValueMode extends js.Object {
  @js.native
  sealed trait Flat
    extends mobservableLib.libCoreMod.ValueMode
  
  @js.native
  sealed trait Recursive
    extends mobservableLib.libCoreMod.ValueMode
  
  @js.native
  sealed trait Reference
    extends mobservableLib.libCoreMod.ValueMode
  
  @js.native
  sealed trait Structure
    extends mobservableLib.libCoreMod.ValueMode
  
  /* 3 */ val Flat: Flat with scala.Double = js.native
  /* 0 */ val Recursive: Recursive with scala.Double = js.native
  /* 1 */ val Reference: Reference with scala.Double = js.native
  /* 2 */ val Structure: Structure with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mobservableLib.libCoreMod.ValueMode with scala.Double] = js.native
}

