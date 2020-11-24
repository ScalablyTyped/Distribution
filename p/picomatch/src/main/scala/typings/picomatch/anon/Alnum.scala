package typings.picomatch.anon

import typings.picomatch.picomatchStrings.SpaceBackslasht
import typings.picomatch.picomatchStrings.SpaceBackslashtBackslashrBackslashnBackslashvBackslashf
import typings.picomatch.picomatchStrings.`0-9`
import typings.picomatch.picomatchStrings.`A-Fa-f0-9`
import typings.picomatch.picomatchStrings.`A-Z`
import typings.picomatch.picomatchStrings.`A-Za-z0-9_`
import typings.picomatch.picomatchStrings.`Backslash-ExclamationmarkQuotationmarkNumbersign$PercentsignAmpersandApostropheLeftparenthesisRightparenthesisBackslashAsteriskPlussignCommaDotSlashColonSemicolonLessthansignEqualssignGreaterthansignQuestionmark@[Backslash]^_GraveaccentLeftcurlybracketVerticallineRightcurlybracketTilde`
import typings.picomatch.picomatchStrings.`Backslashx00-Backslashx1FBackslashx7F`
import typings.picomatch.picomatchStrings.`Backslashx00-Backslashx7F`
import typings.picomatch.picomatchStrings.`Backslashx20-Backslashx7E `
import typings.picomatch.picomatchStrings.`Backslashx21-Backslashx7E`
import typings.picomatch.picomatchStrings.`a-zA-Z0-9`
import typings.picomatch.picomatchStrings.`a-zA-Z`
import typings.picomatch.picomatchStrings.`a-z_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alnum extends js.Object {
  
  var alnum: `a-zA-Z0-9` = js.native
  
  var alpha: `a-zA-Z` = js.native
  
  var ascii: `Backslashx00-Backslashx7F` = js.native
  
  var blank: SpaceBackslasht = js.native
  
  var cntrl: `Backslashx00-Backslashx1FBackslashx7F` = js.native
  
  var digit: `0-9` = js.native
  
  var graph: `Backslashx21-Backslashx7E` = js.native
  
  var lower: `a-z_` = js.native
  
  var print: `Backslashx20-Backslashx7E ` = js.native
  
  var punct: `Backslash-ExclamationmarkQuotationmarkNumbersign$PercentsignAmpersandApostropheLeftparenthesisRightparenthesisBackslashAsteriskPlussignCommaDotSlashColonSemicolonLessthansignEqualssignGreaterthansignQuestionmark@[Backslash]^_GraveaccentLeftcurlybracketVerticallineRightcurlybracketTilde` = js.native
  
  var space: SpaceBackslashtBackslashrBackslashnBackslashvBackslashf = js.native
  
  var upper: `A-Z` = js.native
  
  var word: `A-Za-z0-9_` = js.native
  
  var xdigit: `A-Fa-f0-9` = js.native
}
object Alnum {
  
  @scala.inline
  def apply(
    alnum: `a-zA-Z0-9`,
    alpha: `a-zA-Z`,
    ascii: `Backslashx00-Backslashx7F`,
    blank: SpaceBackslasht,
    cntrl: `Backslashx00-Backslashx1FBackslashx7F`,
    digit: `0-9`,
    graph: `Backslashx21-Backslashx7E`,
    lower: `a-z_`,
    print: `Backslashx20-Backslashx7E `,
    punct: `Backslash-ExclamationmarkQuotationmarkNumbersign$PercentsignAmpersandApostropheLeftparenthesisRightparenthesisBackslashAsteriskPlussignCommaDotSlashColonSemicolonLessthansignEqualssignGreaterthansignQuestionmark@[Backslash]^_GraveaccentLeftcurlybracketVerticallineRightcurlybracketTilde`,
    space: SpaceBackslashtBackslashrBackslashnBackslashvBackslashf,
    upper: `A-Z`,
    word: `A-Za-z0-9_`,
    xdigit: `A-Fa-f0-9`
  ): Alnum = {
    val __obj = js.Dynamic.literal(alnum = alnum.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], ascii = ascii.asInstanceOf[js.Any], blank = blank.asInstanceOf[js.Any], cntrl = cntrl.asInstanceOf[js.Any], digit = digit.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], lower = lower.asInstanceOf[js.Any], print = print.asInstanceOf[js.Any], punct = punct.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], upper = upper.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any], xdigit = xdigit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alnum]
  }
  
  @scala.inline
  implicit class AlnumOps[Self <: Alnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlnum(value: `a-zA-Z0-9`): Self = this.set("alnum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlpha(value: `a-zA-Z`): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscii(value: `Backslashx00-Backslashx7F`): Self = this.set("ascii", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlank(value: SpaceBackslasht): Self = this.set("blank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCntrl(value: `Backslashx00-Backslashx1FBackslashx7F`): Self = this.set("cntrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigit(value: `0-9`): Self = this.set("digit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraph(value: `Backslashx21-Backslashx7E`): Self = this.set("graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLower(value: `a-z_`): Self = this.set("lower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrint(value: `Backslashx20-Backslashx7E `): Self = this.set("print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPunct(
      value: `Backslash-ExclamationmarkQuotationmarkNumbersign$PercentsignAmpersandApostropheLeftparenthesisRightparenthesisBackslashAsteriskPlussignCommaDotSlashColonSemicolonLessthansignEqualssignGreaterthansignQuestionmark@[Backslash]^_GraveaccentLeftcurlybracketVerticallineRightcurlybracketTilde`
    ): Self = this.set("punct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpace(value: SpaceBackslashtBackslashrBackslashnBackslashvBackslashf): Self = this.set("space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpper(value: `A-Z`): Self = this.set("upper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWord(value: `A-Za-z0-9_`): Self = this.set("word", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXdigit(value: `A-Fa-f0-9`): Self = this.set("xdigit", value.asInstanceOf[js.Any])
  }
}
