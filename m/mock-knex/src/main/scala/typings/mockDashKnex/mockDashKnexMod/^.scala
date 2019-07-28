package typings.mockDashKnex.mockDashKnexMod

import typings.knex.knexMod.Knex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-knex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getTracker(): Tracker = js.native
  def mock(knex: Knex[_, js.Array[_]]): Unit = js.native
  def unmock(knex: Knex[_, js.Array[_]]): Unit = js.native
}

