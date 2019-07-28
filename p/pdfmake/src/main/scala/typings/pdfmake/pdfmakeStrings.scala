package typings.pdfmake

import typings.pdfmake.buildPdfmakeMod._Alignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pdfmakeStrings {
  @js.native
  sealed trait after extends js.Object
  
  @js.native
  sealed trait before extends js.Object
  
  @js.native
  sealed trait center extends _Alignment
  
  @js.native
  sealed trait justify extends _Alignment
  
  @js.native
  sealed trait left extends _Alignment
  
  @js.native
  sealed trait right extends _Alignment
  
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  @scala.inline
  def before: before = "before".asInstanceOf[before]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def justify: justify = "justify".asInstanceOf[justify]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
}

