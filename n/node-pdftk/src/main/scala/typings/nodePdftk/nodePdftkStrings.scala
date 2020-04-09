package typings.nodePdftk

import typings.nodePdftk.mod.Permission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodePdftkStrings {
  @js.native
  sealed trait AllFeatures extends Permission
  
  @js.native
  sealed trait Assembly extends Permission
  
  @js.native
  sealed trait CopyContents extends Permission
  
  @js.native
  sealed trait DegradedPrintin extends Permission
  
  @js.native
  sealed trait FillIn extends Permission
  
  @js.native
  sealed trait ModifyAnnotations extends Permission
  
  @js.native
  sealed trait ModifyContents extends Permission
  
  @js.native
  sealed trait Printing extends Permission
  
  @js.native
  sealed trait ScreenReaders extends Permission
  
  @scala.inline
  def AllFeatures: AllFeatures = "AllFeatures".asInstanceOf[AllFeatures]
  @scala.inline
  def Assembly: Assembly = "Assembly".asInstanceOf[Assembly]
  @scala.inline
  def CopyContents: CopyContents = "CopyContents".asInstanceOf[CopyContents]
  @scala.inline
  def DegradedPrintin: DegradedPrintin = "DegradedPrintin".asInstanceOf[DegradedPrintin]
  @scala.inline
  def FillIn: FillIn = "FillIn".asInstanceOf[FillIn]
  @scala.inline
  def ModifyAnnotations: ModifyAnnotations = "ModifyAnnotations".asInstanceOf[ModifyAnnotations]
  @scala.inline
  def ModifyContents: ModifyContents = "ModifyContents".asInstanceOf[ModifyContents]
  @scala.inline
  def Printing: Printing = "Printing".asInstanceOf[Printing]
  @scala.inline
  def ScreenReaders: ScreenReaders = "ScreenReaders".asInstanceOf[ScreenReaders]
}

