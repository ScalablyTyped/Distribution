package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg", "types")
@js.native
object types extends js.Object {
  val arrayParserNs: pgLib.TypeofarrayParser = js.native
  def getTypeParser(oid: scala.Double, format: java.lang.String): pgDashTypesLib.pgDashTypesMod.TypeParser = js.native
  def setTypeParser(oid: scala.Double, format: java.lang.String, parseFn: pgDashTypesLib.pgDashTypesMod.TypeParser): scala.Unit = js.native
  def setTypeParser(oid: scala.Double, parseFn: pgDashTypesLib.pgDashTypesMod.TypeParser): scala.Unit = js.native
}

