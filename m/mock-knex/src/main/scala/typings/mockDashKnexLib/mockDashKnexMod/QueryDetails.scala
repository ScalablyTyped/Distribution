package typings
package mockDashKnexLib.mockDashKnexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryDetails
  extends knexLib.knexMod.Sql {
  var transacting: scala.Boolean = js.native
  def reject(error: java.lang.String): scala.Unit = js.native
  /**
    * Function that needs to be called to mock database query result for knex.
    *
    * @param error The Error, string or instance of Error, which represents why the result was rejected
    */
  def reject(error: stdLib.Error): scala.Unit = js.native
  /**
    * Function that needs to be called to mock database query result for knex.
    *
    * @param values An array of mock data to be returned by database. For Bookshelf this is mostly array of objects. Knex could return any type of data.
    */
  def response(values: js.Any): scala.Unit = js.native
  def response(values: js.Any, options: QueryDetailsResponseOption): scala.Unit = js.native
}

