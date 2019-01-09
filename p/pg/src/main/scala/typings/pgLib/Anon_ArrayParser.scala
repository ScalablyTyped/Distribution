package typings
package pgLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrayParser extends js.Object {
  val arrayParserNs: Anon_Create = js.native
  def getTypeParser(oid: scala.Double, format: java.lang.String): pgDashTypesLib.pgDashTypesMod.TypeParser = js.native
  def setTypeParser(oid: scala.Double, format: java.lang.String, parseFn: pgDashTypesLib.pgDashTypesMod.TypeParser): scala.Unit = js.native
  def setTypeParser(oid: scala.Double, parseFn: pgDashTypesLib.pgDashTypesMod.TypeParser): scala.Unit = js.native
}

