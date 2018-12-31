package typings
package mjmlLib.mjmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MJMLParsingOpts extends js.Object {
  var beautify: js.UndefOr[scala.Boolean] = js.undefined
  var filePath: js.UndefOr[java.lang.String] = js.undefined
  var fonts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var keepComments: js.UndefOr[scala.Boolean] = js.undefined
  var minify: js.UndefOr[scala.Boolean] = js.undefined
  var validationLevel: js.UndefOr[
    mjmlLib.mjmlLibStrings.strict | mjmlLib.mjmlLibStrings.soft | mjmlLib.mjmlLibStrings.skip
  ] = js.undefined
}

