package typings.parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object parseStrings {
  @js.native
  sealed trait Object extends js.Object
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait create extends js.Object
  
  @js.native
  sealed trait delete extends js.Object
  
  @js.native
  sealed trait enter extends js.Object
  
  @js.native
  sealed trait leave extends js.Object
  
  @js.native
  sealed trait open extends js.Object
  
  @js.native
  sealed trait update extends js.Object
  
  @scala.inline
  def Object: Object = "Object".asInstanceOf[Object]
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def enter: enter = "enter".asInstanceOf[enter]
  @scala.inline
  def leave: leave = "leave".asInstanceOf[leave]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
}

