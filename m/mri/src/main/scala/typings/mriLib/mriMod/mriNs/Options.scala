package typings
package mriLib.mriMod.mriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Additional aliases for specific flags */
  var alias: js.UndefOr[DictionaryObject[ArrayOrString]] = js.undefined
  /** A flag or array of flags whose values are boolean */
  var boolean: js.UndefOr[ArrayOrString] = js.undefined
  /** Default values for flags */
  var default: js.UndefOr[DictionaryObject[_]] = js.undefined
  var string: js.UndefOr[ArrayOrString] = js.undefined
  var unknown: js.UndefOr[js.Function1[/* flag */ java.lang.String, scala.Unit]] = js.undefined
}

