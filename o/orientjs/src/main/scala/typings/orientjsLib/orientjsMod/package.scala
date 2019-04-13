package typings
package orientjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object orientjsMod {
  type BinaryRecord = Record with nodeLib.Buffer
  type ODocument = Record
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - RawExpression
    - SqlFunction
  */
  type SqlExpression = _SqlExpression | java.lang.String
  type Version = scala.Double | java.lang.String
}
