package typings
package monkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object monkLibStrings {
  @js.native
  sealed trait closed extends js.Object
  
  @js.native
  sealed trait `ns not found` extends js.Object
  
  @js.native
  sealed trait open extends js.Object
  
  @js.native
  sealed trait opening extends js.Object
  
  def closed: closed = "closed".asInstanceOf[closed]
  def `ns not found`: `ns not found` = "ns not found".asInstanceOf[`ns not found`]
  def open: open = "open".asInstanceOf[open]
  def opening: opening = "opening".asInstanceOf[opening]
}

