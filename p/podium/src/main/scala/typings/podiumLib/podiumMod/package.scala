package typings
package podiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object podiumMod {
  type Criteria = java.lang.String | CriteriaObject
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - EventOptionsObject
    - Podium
  */
  type Events = _Events | java.lang.String
  type Listener = js.Function3[
    /* data */ js.Any, 
    /* tags */ js.UndefOr[Tags], 
    /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
  type Tags = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
}
