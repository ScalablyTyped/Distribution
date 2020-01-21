package typings.pgTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-types", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def getTypeParser(oid: Double, format: String): TypeParser = js.native
  def setTypeParser(oid: Double, format: String, parseFn: TypeParser): Unit = js.native
  def setTypeParser(oid: Double, parseFn: TypeParser): Unit = js.native
  @js.native
  object arrayParser extends js.Object {
    def create(source: js.Any, transform: TypeParser): AnonParse = js.native
  }
  
  type TypeParser = js.Function1[/* value */ js.Any, js.Any]
}

