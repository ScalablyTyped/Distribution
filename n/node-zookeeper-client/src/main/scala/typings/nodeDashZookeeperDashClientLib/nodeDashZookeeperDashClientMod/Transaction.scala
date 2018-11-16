package typings
package nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  def check(path: java.lang.String): this.type = js.native
  def check(path: java.lang.String, version: scala.Double): this.type = js.native
  def commit(callback: js.Function2[/* error */ nodeLib.Error | Exception, /* results */ js.Any, scala.Unit]): scala.Unit = js.native
  def create(path: java.lang.String): this.type = js.native
  def create(path: java.lang.String, dataOrAclsOrmode1: nodeLib.Buffer | js.Array[ACL] | scala.Double): this.type = js.native
  def create(
    path: java.lang.String,
    dataOrAclsOrmode1: nodeLib.Buffer | js.Array[ACL] | scala.Double,
    dataOrAclsOrmode2: nodeLib.Buffer | js.Array[ACL] | scala.Double
  ): this.type = js.native
  def create(
    path: java.lang.String,
    dataOrAclsOrmode1: nodeLib.Buffer | js.Array[ACL] | scala.Double,
    dataOrAclsOrmode2: nodeLib.Buffer | js.Array[ACL] | scala.Double,
    dataOrAclsOrmode3: nodeLib.Buffer | js.Array[ACL] | scala.Double
  ): this.type = js.native
  def remove(path: java.lang.String): this.type = js.native
  def remove(path: java.lang.String, version: scala.Double): this.type = js.native
  def setData(path: java.lang.String): this.type = js.native
  def setData(path: java.lang.String, data: nodeLib.Buffer): this.type = js.native
  def setData(path: java.lang.String, data: nodeLib.Buffer, version: scala.Double): this.type = js.native
  def setData(path: java.lang.String, data: scala.Null, version: scala.Double): this.type = js.native
}

