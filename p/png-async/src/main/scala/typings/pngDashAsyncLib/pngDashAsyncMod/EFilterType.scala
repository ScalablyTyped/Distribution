package typings
package pngDashAsyncLib.pngDashAsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EFilterType extends js.Object

@JSImport("png-async", "EFilterType")
@js.native
object EFilterType extends js.Object {
  @js.native
  sealed trait Auto
    extends pngDashAsyncLib.pngDashAsyncMod.EFilterType
  
  @js.native
  sealed trait Average
    extends pngDashAsyncLib.pngDashAsyncMod.EFilterType
  
  @js.native
  sealed trait None
    extends pngDashAsyncLib.pngDashAsyncMod.EFilterType
  
  @js.native
  sealed trait Paeth
    extends pngDashAsyncLib.pngDashAsyncMod.EFilterType
  
  @js.native
  sealed trait Sub
    extends pngDashAsyncLib.pngDashAsyncMod.EFilterType
  
  @js.native
  sealed trait Up
    extends pngDashAsyncLib.pngDashAsyncMod.EFilterType
  
  /* -1 */ val Auto: Auto with scala.Double = js.native
  /* 3 */ val Average: Average with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 4 */ val Paeth: Paeth with scala.Double = js.native
  /* 1 */ val Sub: Sub with scala.Double = js.native
  /* 2 */ val Up: Up with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[pngDashAsyncLib.pngDashAsyncMod.EFilterType with scala.Double] = js.native
}

