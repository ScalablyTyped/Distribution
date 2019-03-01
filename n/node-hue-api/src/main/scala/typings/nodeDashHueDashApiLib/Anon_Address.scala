package typings
package nodeDashHueDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: java.lang.String
  var body: Anon_On
  var method: java.lang.String
}

object Anon_Address {
  @scala.inline
  def apply(address: java.lang.String, body: Anon_On, method: java.lang.String): Anon_Address = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[Anon_Address]
  }
}

