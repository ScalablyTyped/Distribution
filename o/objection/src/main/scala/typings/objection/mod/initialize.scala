package typings.objection.mod

import org.scalablytyped.runtime.TopLevel
import typings.knex.mod.Knex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait initialize extends js.Object {
  def apply(knex: Knex[_, js.Array[_]], modelClasses: js.Array[AnyModelConstructor]): js.Promise[Unit] = js.native
  def apply(modelClasses: js.Array[AnyModelConstructor]): js.Promise[Unit] = js.native
}

@JSImport("objection", "initialize")
@js.native
object initialize extends TopLevel[initialize]

