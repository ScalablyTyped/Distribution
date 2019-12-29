package typings.parse.parseMod._Global_.Parse

import typings.node.eventsMod.EventEmitter
import typings.parse.parseStrings.close
import typings.parse.parseStrings.create
import typings.parse.parseStrings.delete
import typings.parse.parseStrings.enter
import typings.parse.parseStrings.leave
import typings.parse.parseStrings.open
import typings.parse.parseStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a LiveQuery Subscription.
  *
  * @see https://docs.parseplatform.org/js/guide/#live-queries
  * @see NodeJS.EventEmitter
  *
  * Events list
  * ---
  * `open` - when you call `query.subscribe()`, we send a subscribe request to
  * the LiveQuery server, when we get the confirmation from the LiveQuery server,
  * this event will be emitted. When the client loses WebSocket connection to the
  * LiveQuery server, we will try to auto reconnect the LiveQuery server. If we
  * reconnect the LiveQuery server and successfully resubscribe the ParseQuery,
  * you'll also get this event.
  *
  * ```
  * subscription.on('open', () => {});
  * ```
  * ---
  * `create` - when a new ParseObject is created and it fulfills the ParseQuery you subscribe,
  * you'll get this event. The object is the ParseObject which is created.
  *
  * ```
  * subscription.on('create', (object: Parse.Object) => {});
  * ```
  * ---
  * `update` event - when an existing ParseObject which fulfills the ParseQuery you subscribe
  * is updated (The ParseObject fulfills the ParseQuery before and after changes),
  * you'll get this event. The object is the ParseObject which is updated.
  * Its content is the latest value of the ParseObject.
  *
  * ```
  * subscription.on('update', (object: Parse.Object) => {});
  * ```
  * ---
  * `enter` event - when an existing ParseObject's old value doesn't fulfill the ParseQuery
  * but its new value fulfills the ParseQuery, you'll get this event. The object is the
  * ParseObject which enters the ParseQuery. Its content is the latest value of the ParseObject.
  *
  * ```
  * subscription.on('enter', (object: Parse.Object) => {});
  * ```
  * ---
  * `update` event - when an existing ParseObject's old value fulfills the ParseQuery but its new value
  * doesn't fulfill the ParseQuery, you'll get this event. The object is the ParseObject
  * which leaves the ParseQuery. Its content is the latest value of the ParseObject.
  *
  * ```
  * subscription.on('leave', (object: Parse.Object) => {});
  * ```
  * ---
  * `delete` event - when an existing ParseObject which fulfills the ParseQuery is deleted, you'll
  * get this event. The object is the ParseObject which is deleted.
  *
  * ```
  * subscription.on('delete', (object: Parse.Object) => {});
  * ```
  * ---
  * `close` event - when the client loses the WebSocket connection to the LiveQuery
  * server and we stop receiving events, you'll get this event.
  *
  * ```
  * subscription.on('close', () => {});
  * ```
  */
@JSGlobal("Parse.LiveQuerySubscription")
@js.native
class LiveQuerySubscription protected () extends EventEmitter {
  /**
    * Creates an instance of LiveQuerySubscription.
    *
    * @param id
    * @param query
    * @param [sessionToken]
    */
  def this(id: String, query: String) = this()
  def this(id: String, query: String, sessionToken: String) = this()
  @JSName("on")
  def on_close(event: close, listener: js.Function1[/* object */ Object[Attributes], Unit]): this.type = js.native
  @JSName("on")
  def on_create(event: create, listener: js.Function1[/* object */ Object[Attributes], Unit]): this.type = js.native
  @JSName("on")
  def on_delete(event: delete, listener: js.Function1[/* object */ Object[Attributes], Unit]): this.type = js.native
  @JSName("on")
  def on_enter(event: enter, listener: js.Function1[/* object */ Object[Attributes], Unit]): this.type = js.native
  @JSName("on")
  def on_leave(event: leave, listener: js.Function1[/* object */ Object[Attributes], Unit]): this.type = js.native
  @JSName("on")
  def on_open(event: open, listener: js.Function1[/* object */ Object[Attributes], Unit]): this.type = js.native
  @JSName("on")
  def on_update(event: update, listener: js.Function1[/* object */ Object[Attributes], Unit]): this.type = js.native
  /**
    * Closes the subscription.
    *
    */
  def unsubscribe(): Unit = js.native
}

