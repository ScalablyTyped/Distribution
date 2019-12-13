package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nextMod {
  import typings.next.distNextDashServerLibUtilsMod.NextComponentType
  import typings.next.distNextDashServerLibUtilsMod.NextPageContext

  type NextPage[P, IP] = NextComponentType[NextPageContext, IP, P]
}
