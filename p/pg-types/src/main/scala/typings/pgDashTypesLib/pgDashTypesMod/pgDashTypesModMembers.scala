package typings
package pgDashTypesLib.pgDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-types", JSImport.Namespace)
@js.native
object pgDashTypesModMembers extends js.Object {
  def getTypeParser(oid: scala.Double, format: java.lang.String): TypeParser = js.native
  def setTypeParser(oid: scala.Double, format: java.lang.String, parseFn: TypeParser): scala.Unit = js.native
  def setTypeParser(oid: scala.Double, parseFn: TypeParser): scala.Unit = js.native
}

