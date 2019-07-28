package typings.pngDashAsync.pngDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EFilterType extends js.Object

@JSImport("png-async", "EFilterType")
@js.native
object EFilterType extends js.Object {
  @js.native
  sealed trait Auto extends EFilterType
  
  @js.native
  sealed trait Average extends EFilterType
  
  @js.native
  sealed trait None extends EFilterType
  
  @js.native
  sealed trait Paeth extends EFilterType
  
  @js.native
  sealed trait Sub extends EFilterType
  
  @js.native
  sealed trait Up extends EFilterType
  
  /* -1 */ val Auto: typings.pngDashAsync.pngDashAsyncMod.EFilterType.Auto with Double = js.native
  /* 3 */ val Average: typings.pngDashAsync.pngDashAsyncMod.EFilterType.Average with Double = js.native
  /* 0 */ val None: typings.pngDashAsync.pngDashAsyncMod.EFilterType.None with Double = js.native
  /* 4 */ val Paeth: typings.pngDashAsync.pngDashAsyncMod.EFilterType.Paeth with Double = js.native
  /* 1 */ val Sub: typings.pngDashAsync.pngDashAsyncMod.EFilterType.Sub with Double = js.native
  /* 2 */ val Up: typings.pngDashAsync.pngDashAsyncMod.EFilterType.Up with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EFilterType with Double] = js.native
}

