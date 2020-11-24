package typings.nodeZookeeperClient.mod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends js.Object {
  
  def check(path: String): this.type = js.native
  def check(path: String, version: Double): this.type = js.native
  
  def commit(callback: js.Function2[/* error */ Error | Exception, /* results */ js.Any, Unit]): Unit = js.native
  
  def create(
    path: String,
    dataOrAclsOrmode1: js.UndefOr[Buffer | js.Array[ACL] | Double],
    dataOrAclsOrmode2: js.UndefOr[Buffer | js.Array[ACL] | Double],
    dataOrAclsOrmode3: js.UndefOr[Buffer | js.Array[ACL] | Double]
  ): this.type = js.native
  
  def remove(path: String): this.type = js.native
  def remove(path: String, version: Double): this.type = js.native
  
  def setData(path: String): this.type = js.native
  def setData(path: String, data: Null, version: Double): this.type = js.native
  def setData(path: String, data: Buffer): this.type = js.native
  def setData(path: String, data: Buffer, version: Double): this.type = js.native
}
