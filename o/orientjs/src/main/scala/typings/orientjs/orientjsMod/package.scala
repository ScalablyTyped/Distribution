package typings.orientjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object orientjsMod {
  import typings.node.Buffer

  type BinaryRecord = ORecord with Buffer
  type ODocument = ORecord
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.orientjs.orientjsMod.ORawExpression
    - typings.orientjs.orientjsMod.OSqlFunction
  */
  type OSqlExpression = _OSqlExpression | String
  type Version = Double | String
}
