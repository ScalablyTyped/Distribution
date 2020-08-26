package typings.monk

import typings.monk.mod.DropResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object monkBooleans {
  @js.native
  sealed trait `false` extends js.Object
  
  @js.native
  sealed trait `true` extends DropResult
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

