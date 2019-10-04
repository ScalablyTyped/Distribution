package typings.pgDashPromise.typescriptPgDashSubsetMod

import typings.node.eventsMod.EventEmitter
import typings.pgDashPromise.pgDashPromiseStrings.drain
import typings.pgDashPromise.pgDashPromiseStrings.error
import typings.pgDashPromise.pgDashPromiseStrings.notice
import typings.pgDashPromise.pgDashPromiseStrings.notification
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClient extends EventEmitter {
  var activeQuery: Query = js.native
  var binary: Boolean = js.native
  var connectionParameters: IConnectionParameters = js.native
  var database: String = js.native
  var encoding: String = js.native
  var host: String = js.native
  var password: DynamicPassword = js.native
  var port: Double = js.native
  var processID: Double = js.native
  // properties below are not available within Native Bindings:
  var queryQueue: js.Array[Query] = js.native
  var readyForQuery: Boolean = js.native
  var secretKey: Double = js.native
  var ssl: Boolean | ISSLConfig = js.native
  var user: String = js.native
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_notice(event: notice, listener: js.Function1[/* message */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_notification(event: notification, listener: js.Function1[/* message */ js.Any, Unit]): this.type = js.native
  def query(config: js.Any): js.Promise[IResult] = js.native
  def query(config: js.Any, callback: js.Function2[/* err */ Error, /* result */ IResult, Unit]): js.UndefOr[scala.Nothing] = js.native
  def query(config: js.Any, values: js.Array[_]): js.Promise[IResult] = js.native
  def query(
    config: js.Any,
    values: js.Array[_],
    callback: js.Function2[/* err */ Error, /* result */ IResult, Unit]
  ): js.UndefOr[scala.Nothing] = js.native
}

