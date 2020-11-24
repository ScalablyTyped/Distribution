package typings.parse5

import typings.parse5.mod.DocumentMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parse5Strings {
  
  @scala.inline
  def Numbersigncomment: Numbersigncomment = "#comment".asInstanceOf[Numbersigncomment]
  
  @scala.inline
  def Numbersigndocument: Numbersigndocument = "#document".asInstanceOf[Numbersigndocument]
  
  @scala.inline
  def `Numbersigndocument-fragment`: `Numbersigndocument-fragment` = "#document-fragment".asInstanceOf[`Numbersigndocument-fragment`]
  
  @scala.inline
  def NumbersigndocumentType: NumbersigndocumentType = "#documentType".asInstanceOf[NumbersigndocumentType]
  
  @scala.inline
  def Numbersigntext: Numbersigntext = "#text".asInstanceOf[Numbersigntext]
  
  @scala.inline
  def `limited-quirks`: `limited-quirks` = "limited-quirks".asInstanceOf[`limited-quirks`]
  
  @scala.inline
  def `no-quirks`: `no-quirks` = "no-quirks".asInstanceOf[`no-quirks`]
  
  @scala.inline
  def quirks: quirks = "quirks".asInstanceOf[quirks]
  
  @js.native
  sealed trait Numbersigncomment extends js.Object
  
  @js.native
  sealed trait Numbersigndocument extends js.Object
  
  @js.native
  sealed trait `Numbersigndocument-fragment` extends js.Object
  
  @js.native
  sealed trait NumbersigndocumentType extends js.Object
  
  @js.native
  sealed trait Numbersigntext extends js.Object
  
  @js.native
  sealed trait `limited-quirks` extends DocumentMode
  
  @js.native
  sealed trait `no-quirks` extends DocumentMode
  
  @js.native
  sealed trait quirks extends DocumentMode
}
