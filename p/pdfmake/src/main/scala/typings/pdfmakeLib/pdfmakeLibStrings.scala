package typings
package pdfmakeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pdfmakeLibStrings {
  @js.native
  sealed trait after extends js.Object
  
  @js.native
  sealed trait before extends js.Object
  
  @js.native
  sealed trait center
    extends pdfmakeLib.buildPdfmakeMod._Alignment
  
  @js.native
  sealed trait justify
    extends pdfmakeLib.buildPdfmakeMod._Alignment
  
  @js.native
  sealed trait left
    extends pdfmakeLib.buildPdfmakeMod._Alignment
  
  @js.native
  sealed trait right
    extends pdfmakeLib.buildPdfmakeMod._Alignment
  
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

