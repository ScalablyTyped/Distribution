package typings.memfs.volumeLocalstorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memfs/lib/volume-localstorage", "ObjectStore")
@js.native
class ObjectStore protected () extends js.Object {
  def this(obj: js.Any) = this()
  var obj: js.Object = js.native
  def getItem(key: String): js.Any = js.native
  def removeItem(key: String): Unit = js.native
  def setItem(key: String, json: js.Any): Unit = js.native
}

