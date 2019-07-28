package typings.plist.plistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plist", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def build(obj: PlistValue): String = js.native
  def build(obj: PlistValue, opts: PlistBuildOptions): String = js.native
  def parse(xml: String): PlistValue = js.native
}

