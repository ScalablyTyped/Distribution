package typings
package maxmindLib.libMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind/lib/metadata", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isLegacyFormat(db: nodeLib.Buffer): scala.Boolean = js.native
  def parseMetadata(db: nodeLib.Buffer): Metadata = js.native
}

