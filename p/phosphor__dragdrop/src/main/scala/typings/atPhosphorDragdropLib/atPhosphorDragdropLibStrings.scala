package typings
package atPhosphorDragdropLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atPhosphorDragdropLibStrings {
  @js.native
  sealed trait all
    extends atPhosphorDragdropLib.atPhosphorDragdropMod.SupportedActions
  
  @js.native
  sealed trait copy
    extends atPhosphorDragdropLib.atPhosphorDragdropMod.DropAction
  
  @js.native
  sealed trait `copy-link`
    extends atPhosphorDragdropLib.atPhosphorDragdropMod.SupportedActions
  
  @js.native
  sealed trait `copy-move`
    extends atPhosphorDragdropLib.atPhosphorDragdropMod.SupportedActions
  
  @js.native
  sealed trait link
    extends atPhosphorDragdropLib.atPhosphorDragdropMod.DropAction
  
  @js.native
  sealed trait `link-move`
    extends atPhosphorDragdropLib.atPhosphorDragdropMod.SupportedActions
  
  @js.native
  sealed trait move
    extends atPhosphorDragdropLib.atPhosphorDragdropMod.DropAction
  
  @js.native
  sealed trait none
    extends atPhosphorDragdropLib.atPhosphorDragdropMod.DropAction
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def copy: copy = "copy".asInstanceOf[copy]
  @scala.inline
  def `copy-link`: `copy-link` = "copy-link".asInstanceOf[`copy-link`]
  @scala.inline
  def `copy-move`: `copy-move` = "copy-move".asInstanceOf[`copy-move`]
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  @scala.inline
  def `link-move`: `link-move` = "link-move".asInstanceOf[`link-move`]
  @scala.inline
  def move: move = "move".asInstanceOf[move]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
}

