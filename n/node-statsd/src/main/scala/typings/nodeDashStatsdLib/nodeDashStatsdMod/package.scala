package typings
package nodeDashStatsdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashStatsdMod {
  type Callback = js.Function2[
    /* error */ js.UndefOr[nodeLib.Error], 
    /* bytes */ js.UndefOr[nodeLib.Buffer], 
    scala.Unit
  ]
}
