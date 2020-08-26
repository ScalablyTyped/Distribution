package typings.nivoAxes

import typings.nivoAxes.mod.Orient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nivoAxesStrings {
  @js.native
  sealed trait bottom extends Orient
  
  @js.native
  sealed trait end extends js.Object
  
  @js.native
  sealed trait left extends Orient
  
  @js.native
  sealed trait middle extends js.Object
  
  @js.native
  sealed trait right extends Orient
  
  @js.native
  sealed trait start extends js.Object
  
  @js.native
  sealed trait top extends Orient
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}

