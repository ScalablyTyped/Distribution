package typings.mockDashKnex.mockDashKnexMod

import typings.mockDashKnex.mockDashKnexStrings.query
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracker extends EventEmitter {
  /**
    * Enables query tracking mock on mocked knex client
    */
  def install(): Unit = js.native
  /**
    * Add event listener for 'query' event. It gets esecuted for each query that should end up in database.
    * Instead of this callback gets executed and its up to you to assert queries and mock database responses.
    *
    * @param callback A function that gets executed on 'query' event.
    */
  @JSName("on")
  def on_query(event: query, callback: js.Function2[/* query */ QueryDetails, /* step */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_query(event: query, callback: js.Function2[/* query */ QueryDetails, /* step */ Double, Unit]): this.type = js.native
  /**
    * Disables query tracking mock on mocked knex client. Also resets 'step' counter.
    */
  def uninstall(): Unit = js.native
}

