package typings.nanomsg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nanomsgStrings {
  @js.native
  sealed trait binary extends js.Object
  
  @js.native
  sealed trait text extends js.Object
  
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def text: text = "text".asInstanceOf[text]
}

