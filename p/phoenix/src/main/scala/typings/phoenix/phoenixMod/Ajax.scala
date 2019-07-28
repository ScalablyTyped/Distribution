package typings.phoenix.phoenixMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phoenix", "Ajax")
@js.native
class Ajax () extends js.Object

/* static members */
@JSImport("phoenix", "Ajax")
@js.native
object Ajax extends js.Object {
  var states: StringDictionary[Double] = js.native
  def appendParams(url: String, params: js.Any): String = js.native
  def parseJSON(resp: String): JSON = js.native
  def request(method: String, endPoint: String, accept: String, body: js.Any): Unit = js.native
  def request(method: String, endPoint: String, accept: String, body: js.Any, timeout: Double): Unit = js.native
  def request(method: String, endPoint: String, accept: String, body: js.Any, timeout: Double, ontimeout: js.Any): Unit = js.native
  def request(
    method: String,
    endPoint: String,
    accept: String,
    body: js.Any,
    timeout: Double,
    ontimeout: js.Any,
    callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def serialize(obj: js.Any, parentKey: String): String = js.native
  def xdomainRequest(req: js.Any, method: String, endPoint: String, body: js.Any): Unit = js.native
  def xdomainRequest(req: js.Any, method: String, endPoint: String, body: js.Any, timeout: Double): Unit = js.native
  def xdomainRequest(req: js.Any, method: String, endPoint: String, body: js.Any, timeout: Double, ontimeout: js.Any): Unit = js.native
  def xdomainRequest(
    req: js.Any,
    method: String,
    endPoint: String,
    body: js.Any,
    timeout: Double,
    ontimeout: js.Any,
    callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def xhrRequest(req: js.Any, method: String, endPoint: String, accept: String, body: js.Any): Unit = js.native
  def xhrRequest(req: js.Any, method: String, endPoint: String, accept: String, body: js.Any, timeout: Double): Unit = js.native
  def xhrRequest(
    req: js.Any,
    method: String,
    endPoint: String,
    accept: String,
    body: js.Any,
    timeout: Double,
    ontimeout: js.Any
  ): Unit = js.native
  def xhrRequest(
    req: js.Any,
    method: String,
    endPoint: String,
    accept: String,
    body: js.Any,
    timeout: Double,
    ontimeout: js.Any,
    callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
}

