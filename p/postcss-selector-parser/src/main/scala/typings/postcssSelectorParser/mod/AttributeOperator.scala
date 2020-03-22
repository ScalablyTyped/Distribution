package typings.postcssSelectorParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.postcssSelectorParser.postcssSelectorParserStrings.Equalssign
  - typings.postcssSelectorParser.postcssSelectorParserStrings.TildeEqualssign
  - typings.postcssSelectorParser.postcssSelectorParserStrings.VerticallineEqualssign
  - typings.postcssSelectorParser.postcssSelectorParserStrings.`^Equalssign`
  - typings.postcssSelectorParser.postcssSelectorParserStrings.$Equalssign
  - typings.postcssSelectorParser.postcssSelectorParserStrings.AsteriskEqualssign
*/
trait AttributeOperator extends js.Object

object AttributeOperator {
  @scala.inline
  def $Equalssign: typings.postcssSelectorParser.postcssSelectorParserStrings.$Equalssign = this.cast("$=")
  @scala.inline
  def AsteriskEqualssign: typings.postcssSelectorParser.postcssSelectorParserStrings.AsteriskEqualssign = this.cast("*=")
  @scala.inline
  def Equalssign: typings.postcssSelectorParser.postcssSelectorParserStrings.Equalssign = this.cast("=")
  @scala.inline
  def TildeEqualssign: typings.postcssSelectorParser.postcssSelectorParserStrings.TildeEqualssign = this.cast("~=")
  @scala.inline
  def VerticallineEqualssign: typings.postcssSelectorParser.postcssSelectorParserStrings.VerticallineEqualssign = this.cast("|=")
  @scala.inline
  def `^Equalssign`: typings.postcssSelectorParser.postcssSelectorParserStrings.`^Equalssign` = this.cast("^=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

