package typings.pg.pgMod

import typings.pg.TypeofarrayParser
import typings.pgDashTypes.pgDashTypesMod.TypeParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg", "types")
@js.native
object types extends js.Object {
  val arrayParserNs: TypeofarrayParser = js.native
  def getTypeParser(oid: Double, format: String): TypeParser = js.native
  def setTypeParser(oid: Double, format: String, parseFn: TypeParser): Unit = js.native
  def setTypeParser(oid: Double, parseFn: TypeParser): Unit = js.native
}

