package typings.oibackoff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object oibackoffStrings {
  @js.native
  sealed trait exponential extends js.Object
  
  @js.native
  sealed trait fibonacci extends js.Object
  
  @js.native
  sealed trait incremental extends js.Object
  
  @scala.inline
  def exponential: exponential = "exponential".asInstanceOf[exponential]
  @scala.inline
  def fibonacci: fibonacci = "fibonacci".asInstanceOf[fibonacci]
  @scala.inline
  def incremental: incremental = "incremental".asInstanceOf[incremental]
}

