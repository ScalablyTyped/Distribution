package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingTrue extends js.Object {
  var encoding: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var withFileTypes: nodeLib.nodeLibNumbers.`true`
}

object Anon_EncodingTrue {
  @scala.inline
  def apply(withFileTypes: nodeLib.nodeLibNumbers.`true`, encoding: java.lang.String = null): Anon_EncodingTrue = {
    val __obj = js.Dynamic.literal(withFileTypes = withFileTypes)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[Anon_EncodingTrue]
  }
}

