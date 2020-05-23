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
import scala.scalajs.js.annotation._

trait Alnum extends js.Object {
  var alnum: `a-zA-Z0-9`
  var alpha: `a-zA-Z`
  var ascii: `Backslashx00-Backslashx7F`
  var blank: SpaceBackslasht
  var cntrl: `Backslashx00-Backslashx1FBackslashx7F`
  var digit: `0-9`
  var graph: `Backslashx21-Backslashx7E`
  var lower: `a-z_`
  var print: `Backslashx20-Backslashx7E `
  var punct: `Backslash-ExclamationmarkQuotationmarkNumbersign$PercentsignAmpersandApostropheLeftparenthesisRightparenthesisBackslashAsteriskPlussignCommaDotSlashColonSemicolonLessthansignEqualssignGreaterthansignQuestionmark@[Backslash]^_GraveaccentLeftcurlybracketVerticallineRightcurlybracketTilde`
  var space: SpaceBackslashtBackslashrBackslashnBackslashvBackslashf
  var upper: `A-Z`
  var word: `A-Za-z0-9_`
  var xdigit: `A-Fa-f0-9`
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
}

