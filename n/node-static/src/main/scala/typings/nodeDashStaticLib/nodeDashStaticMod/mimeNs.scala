package typings
package nodeDashStaticLib.nodeDashStaticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-static", "mime")
@js.native
object mimeNs extends js.Object {
  def define(mimes: mimeLib.mimeMod.TypeMap): scala.Unit = js.native
  def define(mimes: mimeLib.mimeMod.TypeMap, force: scala.Boolean): scala.Unit = js.native
  def getExtension(mime: java.lang.String): java.lang.String | scala.Null = js.native
  def getType(path: java.lang.String): java.lang.String | scala.Null = js.native
}

