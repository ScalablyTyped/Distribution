package typings.objectKeysMapping.mod

import typings.objectKeysMapping.anon.Camelcase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("object-keys-mapping", "Operator")
@js.native
class Operator () extends js.Object {
  def this(opts: Camelcase) = this()
  
  def map(origin: js.Array[js.Object]): js.Array[js.Object] = js.native
  def map(origin: js.Object): js.Object = js.native
  
  def mapArray(origin: js.Array[js.Object]): js.Array[js.Object] = js.native
  
  def mapField(path: String): String = js.native
  
  def mapObject(origin: js.Object, path: String): js.Object = js.native
}
