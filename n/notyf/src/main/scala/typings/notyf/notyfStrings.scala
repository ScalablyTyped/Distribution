package typings.notyf

import typings.notyf.notyfOptionsMod.NotyfHorizontalPosition
import typings.notyf.notyfOptionsMod.NotyfVerticalPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object notyfStrings {
  @js.native
  sealed trait DeepPartial extends js.Object
  
  @js.native
  sealed trait bottom extends NotyfVerticalPosition
  
  @js.native
  sealed trait center
    extends NotyfHorizontalPosition
       with NotyfVerticalPosition
  
  @js.native
  sealed trait left extends NotyfHorizontalPosition
  
  @js.native
  sealed trait right extends NotyfHorizontalPosition
  
  @js.native
  sealed trait top extends NotyfVerticalPosition
  
  @scala.inline
  def DeepPartial: DeepPartial = "DeepPartial".asInstanceOf[DeepPartial]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
}

