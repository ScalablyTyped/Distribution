package typings
package mockDashKnexLib.mockDashKnexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracker
  extends eventsLib.eventsMod.EventEmitter {
  /**
       * Enables query tracking mock on mocked knex client
       */
  def install(): scala.Unit = js.native
  /**
       * Add event listener for 'query' event. It gets esecuted for each query that should end up in database.
       * Instead of this callback gets executed and its up to you to assert queries and mock database responses.
       *
       * @param callback A function that gets executed on 'query' event.
       */
  @JSName("on")
  def on_query(
    event: mockDashKnexLib.mockDashKnexLibStrings.query,
    callback: js.Function2[/* query */ QueryDetails, /* step */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_query(
    event: mockDashKnexLib.mockDashKnexLibStrings.query,
    callback: js.Function2[/* query */ QueryDetails, /* step */ scala.Double, scala.Unit]
  ): this.type = js.native
  /**
       * Disables query tracking mock on mocked knex client. Also resets 'step' counter.
       */
  def uninstall(): scala.Unit = js.native
}

