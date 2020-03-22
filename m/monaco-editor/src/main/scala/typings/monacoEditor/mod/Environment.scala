package typings.monacoEditor.mod

import typings.std.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Environment extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var getWorker: js.UndefOr[js.Function2[/* workerId */ String, /* label */ String, Worker]] = js.undefined
  var getWorkerUrl: js.UndefOr[js.Function2[/* workerId */ String, /* label */ String, String]] = js.undefined
}

object Environment {
  @scala.inline
  def apply(
    baseUrl: String = null,
    getWorker: (/* workerId */ String, /* label */ String) => Worker = null,
    getWorkerUrl: (/* workerId */ String, /* label */ String) => String = null
  ): Environment = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (getWorker != null) __obj.updateDynamic("getWorker")(js.Any.fromFunction2(getWorker))
    if (getWorkerUrl != null) __obj.updateDynamic("getWorkerUrl")(js.Any.fromFunction2(getWorkerUrl))
    __obj.asInstanceOf[Environment]
  }
}

