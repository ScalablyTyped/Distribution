package typings.nopt

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object noptMod {
  type CommandData = StringDictionary[String]
  type FlagTypeMap = StringDictionary[js.Object]
  type ShortFlags = StringDictionary[js.Array[String] | String]
  type TypeDefs = StringDictionary[TypeInfo]
}
