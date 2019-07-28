package typings.atPhosphorDragdrop

import typings.atPhosphorDragdrop.atPhosphorDragdropMod.DropAction
import typings.atPhosphorDragdrop.atPhosphorDragdropMod.SupportedActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atPhosphorDragdropStrings {
  @js.native
  sealed trait all extends SupportedActions
  
  @js.native
  sealed trait copy extends DropAction
  
  @js.native
  sealed trait `copy-link` extends SupportedActions
  
  @js.native
  sealed trait `copy-move` extends SupportedActions
  
  @js.native
  sealed trait link extends DropAction
  
  @js.native
  sealed trait `link-move` extends SupportedActions
  
  @js.native
  sealed trait move extends DropAction
  
  @js.native
  sealed trait none extends DropAction
  
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

