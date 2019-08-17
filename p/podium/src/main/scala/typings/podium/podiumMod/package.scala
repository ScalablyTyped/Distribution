package typings.podium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object podiumMod {
  import org.scalablytyped.runtime.StringDictionary

  type Criteria = String | CriteriaObject
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.podium.podiumMod.EventOptionsObject
    - typings.podium.podiumMod.Podium
  */
  type Events = _Events | String
  type Listener = js.Function3[
    /* data */ js.Any, 
    /* tags */ js.UndefOr[Tags], 
    /* callback */ js.UndefOr[js.Function0[Unit]], 
    Unit
  ]
  type Tags = StringDictionary[Boolean]
}
