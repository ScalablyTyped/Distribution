package typings.nodePgMigrate.pgLiteralMod

import typings.nodePgMigrate.generalTypesMod._Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/operations/PgLiteral", JSImport.Default)
@js.native
class default protected ()
  extends PgLiteral
     with _Value {
  def this(value: String) = this()
}
/* static members */
@JSImport("node-pg-migrate/dist/operations/PgLiteral", JSImport.Default)
@js.native
object default extends js.Object {
  
  def create(str: String): PgLiteral = js.native
}
