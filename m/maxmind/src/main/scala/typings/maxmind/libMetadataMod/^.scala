package typings.maxmind.libMetadataMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind/lib/metadata", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def isLegacyFormat(db: Buffer): Boolean = js.native
  def parseMetadata(db: Buffer): Metadata = js.native
}

