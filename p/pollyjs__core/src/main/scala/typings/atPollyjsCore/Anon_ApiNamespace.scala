package typings.atPollyjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiNamespace extends js.Object {
  var apiNamespace: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
}

object Anon_ApiNamespace {
  @scala.inline
  def apply(apiNamespace: String = null, host: String = null): Anon_ApiNamespace = {
    val __obj = js.Dynamic.literal()
    if (apiNamespace != null) __obj.updateDynamic("apiNamespace")(apiNamespace)
    if (host != null) __obj.updateDynamic("host")(host)
    __obj.asInstanceOf[Anon_ApiNamespace]
  }
}

