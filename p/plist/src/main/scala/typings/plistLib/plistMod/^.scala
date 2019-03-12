package typings
package plistLib.plistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plist", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def build(obj: PlistValue): java.lang.String = js.native
  def build(obj: PlistValue, opts: PlistBuildOptions): java.lang.String = js.native
  def parse(xml: java.lang.String): PlistValue = js.native
}

