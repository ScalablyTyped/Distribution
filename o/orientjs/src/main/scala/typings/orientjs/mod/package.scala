package typings.orientjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BinaryRecord = typings.orientjs.mod.ORecord with typings.node.Buffer
  type ODocument = typings.orientjs.mod.ORecord
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.orientjs.mod.ORawExpression
    - typings.orientjs.mod.OSqlFunction
  */
  type OSqlExpression = typings.orientjs.mod._OSqlExpression | java.lang.String
  type Version = scala.Double | java.lang.String
}
