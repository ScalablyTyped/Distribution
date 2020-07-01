package typings.mongoose

import typings.mongoose.mod.HasJustId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mongooseBooleans {
  @js.native
  sealed trait `false`
    extends HasJustId[js.Any]
  
  @js.native
  sealed trait `true`
    extends HasJustId[js.Any]
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

