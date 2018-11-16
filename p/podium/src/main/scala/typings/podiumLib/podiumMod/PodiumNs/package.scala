package typings
package podiumLib.podiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PodiumNs {
  type Criteria = java.lang.String | CriteriaObject
  type Events = java.lang.String | EventOptionsObject | podiumLib.podiumMod.Podium
  type Listener = js.Function3[
    /* data */ js.Any, 
    /* tags */ js.UndefOr[Tags], 
    /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
}
