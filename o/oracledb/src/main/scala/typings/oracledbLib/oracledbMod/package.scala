package typings
package oracledbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oracledbMod {
  /**
    * Used with connection.execute() to associate values or JavaScript variables to a statement’s bind variables by name.
    *
    * @see https://oracle.github.io/node-oracledb/doc/api.html#executebindParams
    */
  type BindParametersObject = org.scalablytyped.runtime.StringDictionary[BindParameter | java.lang.String | scala.Double | scala.Null]
}
