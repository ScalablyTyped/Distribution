package typings.nodePgMigrate.anon

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.tablesTypesMod.ConstraintOptions
import typings.nodePgMigrate.tablesTypesMod.CreateConstraintFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseCreateConstraintFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateConstraintFn = js.native
  def reverse(
    tableName: typings.nodePgMigrate.generalTypesMod.Name,
    constraintName: String,
    expression: (String | ConstraintOptions) with DropOptions
  ): String | js.Array[String] = js.native
  def reverse(
    tableName: typings.nodePgMigrate.generalTypesMod.Name,
    constraintName: Null,
    expression: (String | ConstraintOptions) with DropOptions
  ): String | js.Array[String] = js.native
}

