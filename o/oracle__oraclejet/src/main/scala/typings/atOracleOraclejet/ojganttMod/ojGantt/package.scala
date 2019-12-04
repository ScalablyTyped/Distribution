package typings.atOracleOraclejet.ojganttMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ojGantt {
  import typings.atOracleOraclejet.Anon_BaselineEnd
  import typings.atOracleOraclejet.Anon_MajorAxisScale
  import typings.std.CustomEvent

  type ojMove[K2, D2] = CustomEvent[Anon_BaselineEnd[K2, D2]]
  type ojViewportChange = CustomEvent[Anon_MajorAxisScale]
}
