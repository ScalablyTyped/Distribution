package typings.nodeDashJsonDashDb.distLibJsonDBConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-json-db/dist/lib/JsonDBConfig", "Config")
@js.native
class Config protected () extends JsonDBConfig {
  def this(filename: String) = this()
  def this(filename: String, saveOnPush: Boolean) = this()
  def this(filename: String, saveOnPush: Boolean, humanReadable: Boolean) = this()
  def this(filename: String, saveOnPush: Boolean, humanReadable: Boolean, separator: String) = this()
  /* CompleteClass */
  override var filename: String = js.native
  /* CompleteClass */
  override var humanReadable: Boolean = js.native
  /* CompleteClass */
  override var saveOnPush: Boolean = js.native
  /* CompleteClass */
  override var separator: String = js.native
}

