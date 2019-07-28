package typings.nodeDashGcm.nodeDashGcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-gcm", "Sender")
@js.native
class Sender protected () extends js.Object {
  def this(key: String) = this()
  def this(key: String, options: ISenderOptions) = this()
  var key: String = js.native
  var options: ISenderOptions = js.native
  def send(
    message: Message,
    registrationIds: String,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
  ): Unit = js.native
  def send(
    message: Message,
    registrationIds: String,
    options: ISenderSendOptions,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
  ): Unit = js.native
  def send(
    message: Message,
    registrationIds: String,
    retries: Double,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
  ): Unit = js.native
  def send(
    message: Message,
    registrationIds: js.Array[String],
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
  ): Unit = js.native
  def send(
    message: Message,
    registrationIds: js.Array[String],
    options: ISenderSendOptions,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
  ): Unit = js.native
  def send(
    message: Message,
    registrationIds: js.Array[String],
    retries: Double,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
  ): Unit = js.native
  def send(
    message: Message,
    registrationIds: IRecipient,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
  ): Unit = js.native
  def send(
    message: Message,
    registrationIds: IRecipient,
    options: ISenderSendOptions,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
  ): Unit = js.native
  def send(
    message: Message,
    registrationIds: IRecipient,
    retries: Double,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
  ): Unit = js.native
  def sendNoRetry(
    message: Message,
    registrationIds: String,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
  ): Unit = js.native
  def sendNoRetry(
    message: Message,
    registrationIds: js.Array[String],
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
  ): Unit = js.native
  def sendNoRetry(
    message: Message,
    registrationIds: IRecipient,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, Unit]
  ): Unit = js.native
}

