package typings
package phoenixLib.phoenixMod

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
  var states: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  def appendParams(url: java.lang.String, params: js.Any): java.lang.String = js.native
  def parseJSON(resp: java.lang.String): stdLib.JSON = js.native
  def request(method: java.lang.String, endPoint: java.lang.String, accept: java.lang.String, body: js.Any): scala.Unit = js.native
  def request(
    method: java.lang.String,
    endPoint: java.lang.String,
    accept: java.lang.String,
    body: js.Any,
    timeout: scala.Double
  ): scala.Unit = js.native
  def request(
    method: java.lang.String,
    endPoint: java.lang.String,
    accept: java.lang.String,
    body: js.Any,
    timeout: scala.Double,
    ontimeout: js.Any
  ): scala.Unit = js.native
  def request(
    method: java.lang.String,
    endPoint: java.lang.String,
    accept: java.lang.String,
    body: js.Any,
    timeout: scala.Double,
    ontimeout: js.Any,
    callback: js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def serialize(obj: js.Any, parentKey: java.lang.String): java.lang.String = js.native
  def xdomainRequest(req: js.Any, method: java.lang.String, endPoint: java.lang.String, body: js.Any): scala.Unit = js.native
  def xdomainRequest(
    req: js.Any,
    method: java.lang.String,
    endPoint: java.lang.String,
    body: js.Any,
    timeout: scala.Double
  ): scala.Unit = js.native
  def xdomainRequest(
    req: js.Any,
    method: java.lang.String,
    endPoint: java.lang.String,
    body: js.Any,
    timeout: scala.Double,
    ontimeout: js.Any
  ): scala.Unit = js.native
  def xdomainRequest(
    req: js.Any,
    method: java.lang.String,
    endPoint: java.lang.String,
    body: js.Any,
    timeout: scala.Double,
    ontimeout: js.Any,
    callback: js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def xhrRequest(
    req: js.Any,
    method: java.lang.String,
    endPoint: java.lang.String,
    accept: java.lang.String,
    body: js.Any
  ): scala.Unit = js.native
  def xhrRequest(
    req: js.Any,
    method: java.lang.String,
    endPoint: java.lang.String,
    accept: java.lang.String,
    body: js.Any,
    timeout: scala.Double
  ): scala.Unit = js.native
  def xhrRequest(
    req: js.Any,
    method: java.lang.String,
    endPoint: java.lang.String,
    accept: java.lang.String,
    body: js.Any,
    timeout: scala.Double,
    ontimeout: js.Any
  ): scala.Unit = js.native
  def xhrRequest(
    req: js.Any,
    method: java.lang.String,
    endPoint: java.lang.String,
    accept: java.lang.String,
    body: js.Any,
    timeout: scala.Double,
    ontimeout: js.Any,
    callback: js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
}

