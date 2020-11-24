package typings.objtools.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("objtools", "syncObject")
@js.native
object syncObject extends js.Object {
  
  def apply(toObj: Record[String, _], fromObj: Record[String, _]): Record[String, _] = js.native
  def apply(toObj: Record[String, _], fromObj: Record[String, _], options: SyncObjectOptions): Record[String, _] = js.native
}
