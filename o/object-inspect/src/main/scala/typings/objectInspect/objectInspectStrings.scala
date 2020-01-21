package typings.objectInspect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object objectInspectStrings {
  @js.native
  sealed trait double extends js.Object
  
  @js.native
  sealed trait single extends js.Object
  
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  @scala.inline
  def single: single = "single".asInstanceOf[single]
}

