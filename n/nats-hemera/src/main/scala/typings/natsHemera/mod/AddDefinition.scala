package typings.natsHemera.mod

import typings.natsHemera.anon.MaxMessages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddDefinition extends js.Object {
  var action: js.Function = js.native
  var pattern: ServerPattern = js.native
  var schema: js.Object = js.native
  var sid: Double = js.native
  var transport: MaxMessages = js.native
  def end(action: js.Function1[/* request */ ServerPattern, js.Promise[_]]): Unit = js.native
  def end(action: js.Function2[/* request */ ServerPattern, /* cb */ NodeCallback, Unit]): Unit = js.native
  def use(
    handler: js.Array[
      (js.Function2[/* request */ Request, /* response */ Response, js.Promise[Unit]]) | (js.Function3[/* request */ Request, /* response */ Response, /* next */ NodeCallback, Unit])
    ]
  ): AddDefinition = js.native
  // promise
  def use(handler: js.Function2[/* request */ Request, /* response */ Response, js.Promise[Unit]]): AddDefinition = js.native
  // callback
  def use(
    handler: js.Function3[/* request */ Request, /* response */ Response, /* next */ NodeCallback, Unit]
  ): AddDefinition = js.native
}

