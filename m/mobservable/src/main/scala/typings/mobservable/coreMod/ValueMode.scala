package typings.mobservable.coreMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueMode with Double] = js.native
  /* 3 */ @js.native
  object Flat extends TopLevel[Flat with Double]
  
  /* 0 */ @js.native
  object Recursive extends TopLevel[Recursive with Double]
  
  /* 1 */ @js.native
  object Reference extends TopLevel[Reference with Double]
  
  /* 2 */ @js.native
  object Structure extends TopLevel[Structure with Double]
  
}

