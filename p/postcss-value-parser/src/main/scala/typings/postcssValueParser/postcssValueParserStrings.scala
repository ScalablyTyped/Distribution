package typings.postcssValueParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object postcssValueParserStrings {
  @js.native
  sealed trait Apostrophe extends js.Object
  
  @js.native
  sealed trait Quotationmark extends js.Object
  
  @js.native
  sealed trait comment extends js.Object
  
  @js.native
  sealed trait div extends js.Object
  
  @js.native
  sealed trait function extends js.Object
  
  @js.native
  sealed trait space extends js.Object
  
  @js.native
  sealed trait string extends js.Object
  
  @js.native
  sealed trait `unicode-range` extends js.Object
  
  @js.native
  sealed trait word extends js.Object
  
  @scala.inline
  def Apostrophe: Apostrophe = "'".asInstanceOf[Apostrophe]
  @scala.inline
  def Quotationmark: Quotationmark = "\"".asInstanceOf[Quotationmark]
  @scala.inline
  def comment: comment = "comment".asInstanceOf[comment]
  @scala.inline
  def div: div = "div".asInstanceOf[div]
  @scala.inline
  def function: function = "function".asInstanceOf[function]
  @scala.inline
  def space: space = "space".asInstanceOf[space]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def `unicode-range`: `unicode-range` = "unicode-range".asInstanceOf[`unicode-range`]
  @scala.inline
  def word: word = "word".asInstanceOf[word]
}

