package typings.podium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Criteria = java.lang.String | typings.podium.mod.CriteriaObject
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.podium.mod.EventOptionsObject
    - typings.podium.mod.Podium
  */
  type Events = typings.podium.mod._Events | java.lang.String
  type Listener = js.Function3[
    /* data */ js.Any, 
    /* tags */ js.UndefOr[typings.podium.mod.Tags], 
    /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
  type Tags = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
