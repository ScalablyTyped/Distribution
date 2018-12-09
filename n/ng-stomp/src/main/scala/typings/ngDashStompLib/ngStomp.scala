package typings
package ngDashStompLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ngStomp extends js.Object {
  var debug: js.Any = js.native
  var off: js.Any = js.native
  var sock: js.Any = js.native
  var stomp: js.Any = js.native
  def connect(endpoint: java.lang.String): angularLib.angularMod.angularNs.IHttpPromise[_] = js.native
  def connect(endpoint: java.lang.String, headers: ngDashStompLib.ngStompNs.Headers): angularLib.angularMod.angularNs.IHttpPromise[_] = js.native
  def disconnect(callback: js.Function0[scala.Unit]): angularLib.angularMod.angularNs.IHttpPromise[_] = js.native
  def send(destination: java.lang.String, body: js.Any, headers: ngDashStompLib.ngStompNs.Headers): js.Any = js.native
  def setDebug(callback: angularLib.angularMod.Global.Function): scala.Unit = js.native
  def subscribe(
    destination: java.lang.String,
    callback: js.Function3[
      /* payload */ java.lang.String, 
      /* headers */ ngDashStompLib.ngStompNs.Headers, 
      /* res */ angularLib.angularMod.Global.Function, 
      scala.Unit
    ]
  ): js.Any = js.native
  def subscribe(
    destination: java.lang.String,
    callback: js.Function3[
      /* payload */ java.lang.String, 
      /* headers */ ngDashStompLib.ngStompNs.Headers, 
      /* res */ angularLib.angularMod.Global.Function, 
      scala.Unit
    ],
    headers: ngDashStompLib.ngStompNs.Headers
  ): js.Any = js.native
  def subscribe(
    destination: java.lang.String,
    callback: js.Function3[
      /* payload */ java.lang.String, 
      /* headers */ ngDashStompLib.ngStompNs.Headers, 
      /* res */ angularLib.angularMod.Global.Function, 
      scala.Unit
    ],
    headers: ngDashStompLib.ngStompNs.Headers,
    scope: js.Any
  ): js.Any = js.native
  def unsubscribe(): js.Any = js.native
}

