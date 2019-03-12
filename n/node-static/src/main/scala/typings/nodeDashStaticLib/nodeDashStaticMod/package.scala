package typings
package nodeDashStaticLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashStaticMod {
  type Callback = js.Function1[/* e */ stdLib.Error, scala.Unit]
  type Finish = js.Function2[/* status */ scala.Double, /* headers */ js.UndefOr[Headers], scala.Unit]
}
