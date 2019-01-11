package typings
package pgDashTypesLib.pgDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-types", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getTypeParser(oid: scala.Double, format: java.lang.String): pgDashTypesLib.pgDashTypesMod.TypeParser = js.native
  def setTypeParser(oid: scala.Double, format: java.lang.String, parseFn: pgDashTypesLib.pgDashTypesMod.TypeParser): scala.Unit = js.native
  def setTypeParser(oid: scala.Double, parseFn: pgDashTypesLib.pgDashTypesMod.TypeParser): scala.Unit = js.native
}

