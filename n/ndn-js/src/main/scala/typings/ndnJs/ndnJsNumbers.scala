package typings.ndnJs

import typings.ndnJs.nameMod.CompareResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ndnJsNumbers {
  @js.native
  sealed trait `-1` extends CompareResult
  
  @js.native
  sealed trait `0` extends CompareResult
  
  @js.native
  sealed trait `1` extends CompareResult
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
}

