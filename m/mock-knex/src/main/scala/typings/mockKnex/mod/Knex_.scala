package typings.mockKnex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Knex_ extends js.Object {
  var client: js.Any
}

object Knex_ {
  @scala.inline
  def apply(client: js.Any): Knex_ = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Knex_]
  }
}

