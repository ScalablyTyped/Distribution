package typings.nDashReadlines.nDashReadlinesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var newLineCharacter: js.UndefOr[String] = js.undefined
  var readChunk: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(newLineCharacter: String = null, readChunk: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (newLineCharacter != null) __obj.updateDynamic("newLineCharacter")(newLineCharacter.asInstanceOf[js.Any])
    if (readChunk != null) __obj.updateDynamic("readChunk")(readChunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

