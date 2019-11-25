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
    val __obj = js.Dynamic.literal(AA = AA.asInstanceOf[js.Any], AAA = AAA.asInstanceOf[js.Any], AAALarge = AAALarge.asInstanceOf[js.Any], AALarge = AALarge.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ContrastScores]
  }
}

