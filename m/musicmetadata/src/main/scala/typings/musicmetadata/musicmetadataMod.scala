package typings.musicmetadata

import typings.musicmetadata.MM.Metadata
import typings.musicmetadata.MM.Options
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("musicmetadata", JSImport.Namespace)
@js.native
object musicmetadataMod extends js.Object {
  def apply(readStream: Readable, callback: js.Function2[/* err */ Error, /* metadata */ Metadata, Unit]): EventEmitter = js.native
  def apply(
    readStream: Readable,
    options: Options,
    callback: js.Function2[/* err */ Error, /* metadata */ Metadata, Unit]
  ): EventEmitter = js.native
}

