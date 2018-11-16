package typings
package nodeDashGcmLib.nodeDashGcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-gcm", "Sender")
@js.native
class Sender protected () extends js.Object {
  def this(key: java.lang.String) = this()
  def this(key: java.lang.String, options: ISenderOptions) = this()
  var key: java.lang.String = js.native
  var options: ISenderOptions = js.native
  def send(
    message: Message,
    registrationIds: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, scala.Unit]
  ): scala.Unit = js.native
  def send(
    message: Message,
    registrationIds: java.lang.String,
    options: ISenderSendOptions,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, scala.Unit]
  ): scala.Unit = js.native
  def send(
    message: Message,
    registrationIds: java.lang.String,
    retries: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, scala.Unit]
  ): scala.Unit = js.native
  def send(
    message: Message,
    registrationIds: js.Array[java.lang.String],
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, scala.Unit]
  ): scala.Unit = js.native
  def send(
    message: Message,
    registrationIds: js.Array[java.lang.String],
    options: ISenderSendOptions,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, scala.Unit]
  ): scala.Unit = js.native
  def send(
    message: Message,
    registrationIds: js.Array[java.lang.String],
    retries: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, scala.Unit]
  ): scala.Unit = js.native
  def send(
    message: Message,
    registrationIds: IRecipient,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, scala.Unit]
  ): scala.Unit = js.native
  def send(
    message: Message,
    registrationIds: IRecipient,
    options: ISenderSendOptions,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, scala.Unit]
  ): scala.Unit = js.native
  def send(
    message: Message,
    registrationIds: IRecipient,
    retries: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, scala.Unit]
  ): scala.Unit = js.native
  def sendNoRetry(
    message: Message,
    registrationIds: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, scala.Unit]
  ): scala.Unit = js.native
  def sendNoRetry(
    message: Message,
    registrationIds: js.Array[java.lang.String],
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, scala.Unit]
  ): scala.Unit = js.native
  def sendNoRetry(
    message: Message,
    registrationIds: IRecipient,
    callback: js.Function2[/* err */ js.Any, /* resJson */ IResponseBody, scala.Unit]
  ): scala.Unit = js.native
}

