package typings
package postmanDashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: java.lang.String
  var path: stdLib.RegExp
  var protocols: js.Array[java.lang.String]
}

object Anon_Host {
  @scala.inline
  def apply(host: java.lang.String, path: stdLib.RegExp, protocols: js.Array[java.lang.String]): Anon_Host = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("protocols")(protocols)
    __obj.asInstanceOf[Anon_Host]
  }
}

