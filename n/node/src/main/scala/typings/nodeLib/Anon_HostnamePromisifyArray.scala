package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HostnamePromisifyArray extends js.Object {
  def `__promisify__`(hostname: java.lang.String): js.Promise[js.Array[java.lang.String]]
}

object Anon_HostnamePromisifyArray {
  @scala.inline
  def apply(`__promisify__`: js.Function1[java.lang.String, js.Promise[js.Array[java.lang.String]]]): Anon_HostnamePromisifyArray = {
    val __obj = js.Dynamic.literal(`__promisify__` = `__promisify__`)
  
    __obj.asInstanceOf[Anon_HostnamePromisifyArray]
  }
}

