package typings.orientjs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object orientjsMod {
  type BinaryRecord = Record with Buffer
  type ODocument = Record
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.orientjs.orientjsMod.RawExpression
    - typings.orientjs.orientjsMod.SqlFunction
  */
  type SqlExpression = _SqlExpression | String
  type Version = Double | String
}
