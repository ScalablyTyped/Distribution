package typings.nodeDashGetopt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashGetoptMod {
  import org.scalablytyped.runtime.NumberDictionary
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type ErrorFunc = js.Function1[/* exception */ Error, Unit]
  type EventCallback = js.Function2[/* args */ js.Array[String], /* options */ OptionMap, Unit]
  type OptionConfigurationArray = NumberDictionary[js.Array[String]]
  type OptionMap = StringDictionary[String | js.Array[String] | Boolean]
}
