package typings.polished.libTypesColorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContrastScores extends js.Object {
  var AA: Boolean
  var AAA: Boolean
  var AAALarge: Boolean
  var AALarge: Boolean
}

object ContrastScores {
  @scala.inline
  def apply(AA: Boolean, AAA: Boolean, AAALarge: Boolean, AALarge: Boolean): ContrastScores = {
    val __obj = js.Dynamic.literal(AA = AA, AAA = AAA, AAALarge = AAALarge, AALarge = AALarge)
  
    __obj.asInstanceOf[ContrastScores]
  }
}

