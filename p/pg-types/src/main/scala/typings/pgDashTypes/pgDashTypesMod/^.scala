package typings.pgDashTypes.pgDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-types", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getTypeParser(oid: Double, format: String): TypeParser = js.native
  def setTypeParser(oid: Double, format: String, parseFn: TypeParser): Unit = js.native
  def setTypeParser(oid: Double, parseFn: TypeParser): Unit = js.native
}

