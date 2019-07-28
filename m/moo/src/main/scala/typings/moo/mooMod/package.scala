package typings.moo

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mooMod {
  type Rules = StringDictionary[RegExp | String | (js.Array[Rule | String]) | Rule]
  type TypeMapper = js.Function1[/* x */ String, String]
}
