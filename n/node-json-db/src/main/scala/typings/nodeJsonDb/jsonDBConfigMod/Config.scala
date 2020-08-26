package typings.nodeJsonDb.jsonDBConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-json-db/dist/lib/JsonDBConfig", "Config")
@js.native
class Config protected () extends JsonDBConfig {
  def this(filename: String) = this()
  def this(filename: String, saveOnPush: Boolean) = this()
  def this(filename: String, saveOnPush: js.UndefOr[scala.Nothing], humanReadable: Boolean) = this()
  def this(filename: String, saveOnPush: Boolean, humanReadable: Boolean) = this()
  def this(
    filename: String,
    saveOnPush: js.UndefOr[scala.Nothing],
    humanReadable: js.UndefOr[scala.Nothing],
    separator: String
  ) = this()
  def this(filename: String, saveOnPush: js.UndefOr[scala.Nothing], humanReadable: Boolean, separator: String) = this()
  def this(filename: String, saveOnPush: Boolean, humanReadable: js.UndefOr[scala.Nothing], separator: String) = this()
  def this(filename: String, saveOnPush: Boolean, humanReadable: Boolean, separator: String) = this()
}

