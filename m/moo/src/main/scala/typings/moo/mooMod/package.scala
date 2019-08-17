package typings.moo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mooMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.RegExp

  type Rules = StringDictionary[RegExp | String | (js.Array[Rule | String]) | Rule]
  type TypeMapper = js.Function1[/* x */ String, String]
}
