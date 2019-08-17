package typings.numeric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object numericStrings {
  @js.native
  sealed trait L extends js.Object
  
  @js.native
  sealed trait periodic extends js.Object
  
  @scala.inline
  def L: L = "L".asInstanceOf[L]
  @scala.inline
  def periodic: periodic = "periodic".asInstanceOf[periodic]
}

