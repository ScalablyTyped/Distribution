package typings.monk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object monkStrings {
  @js.native
  sealed trait closed extends js.Object
  
  @js.native
  sealed trait `ns not found` extends js.Object
  
  @js.native
  sealed trait open extends js.Object
  
  @js.native
  sealed trait opening extends js.Object
  
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def `ns not found`: `ns not found` = "ns not found".asInstanceOf[`ns not found`]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def opening: opening = "opening".asInstanceOf[opening]
}

