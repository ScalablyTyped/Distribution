package typings.pgPromise

import typings.pgPromise.mod.FormattingFilter
import typings.pgPromise.pgSubsetMod.ParserFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pgPromiseStrings {
  
  @js.native
  sealed trait ^ extends FormattingFilter
  @scala.inline
  def ^ : ^ = "^".asInstanceOf[^]
  
  @scala.inline
  def Colonalias: Colonalias = ":alias".asInstanceOf[Colonalias]
  
  @scala.inline
  def Coloncsv: Coloncsv = ":csv".asInstanceOf[Coloncsv]
  
  @scala.inline
  def Colonjson: Colonjson = ":json".asInstanceOf[Colonjson]
  
  @scala.inline
  def Colonlist: Colonlist = ":list".asInstanceOf[Colonlist]
  
  @scala.inline
  def Colonname: Colonname = ":name".asInstanceOf[Colonname]
  
  @scala.inline
  def Colonraw: Colonraw = ":raw".asInstanceOf[Colonraw]
  
  @scala.inline
  def Colonvalue: Colonvalue = ":value".asInstanceOf[Colonvalue]
  
  @scala.inline
  def Numbersign: Numbersign = "#".asInstanceOf[Numbersign]
  
  @scala.inline
  def Tilde: Tilde = "~".asInstanceOf[Tilde]
  
  @scala.inline
  def after: after = "after".asInstanceOf[after]
  
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait Colonalias extends FormattingFilter
  
  @js.native
  sealed trait Coloncsv extends FormattingFilter
  
  @js.native
  sealed trait Colonjson extends FormattingFilter
  
  @js.native
  sealed trait Colonlist extends FormattingFilter
  
  @js.native
  sealed trait Colonname extends FormattingFilter
  
  @js.native
  sealed trait Colonraw extends FormattingFilter
  
  @js.native
  sealed trait Colonvalue extends FormattingFilter
  
  @js.native
  sealed trait Numbersign extends FormattingFilter
  
  @js.native
  sealed trait Tilde extends FormattingFilter
  
  @js.native
  sealed trait after extends js.Object
  
  @js.native
  sealed trait array extends js.Object
  
  @js.native
  sealed trait binary extends ParserFormat
  
  @js.native
  sealed trait text extends ParserFormat
}
