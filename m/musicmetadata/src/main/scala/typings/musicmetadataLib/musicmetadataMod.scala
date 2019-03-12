package typings
package musicmetadataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("musicmetadata", JSImport.Namespace)
@js.native
object musicmetadataMod extends js.Object {
  def apply(
    readStream: nodeLib.streamMod.Readable,
    callback: js.Function2[/* err */ stdLib.Error, /* metadata */ musicmetadataLib.MMNs.Metadata, scala.Unit]
  ): nodeLib.eventsMod.EventEmitter = js.native
  def apply(
    readStream: nodeLib.streamMod.Readable,
    options: musicmetadataLib.MMNs.Options,
    callback: js.Function2[/* err */ stdLib.Error, /* metadata */ musicmetadataLib.MMNs.Metadata, scala.Unit]
  ): nodeLib.eventsMod.EventEmitter = js.native
}

