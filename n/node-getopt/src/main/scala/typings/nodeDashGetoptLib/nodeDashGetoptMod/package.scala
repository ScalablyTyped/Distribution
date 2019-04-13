package typings
package nodeDashGetoptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashGetoptMod {
  type ErrorFunc = js.Function1[/* exception */ stdLib.Error, scala.Unit]
  type EventCallback = js.Function2[/* args */ js.Array[java.lang.String], /* options */ OptionMap, scala.Unit]
  type OptionConfigurationArray = org.scalablytyped.runtime.NumberDictionary[js.Array[java.lang.String]]
  type OptionMap = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String] | scala.Boolean]
}
