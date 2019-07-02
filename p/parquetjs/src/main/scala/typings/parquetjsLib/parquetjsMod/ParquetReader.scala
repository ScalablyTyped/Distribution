package typings
package parquetjsLib.parquetjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs", "ParquetReader")
@js.native
class ParquetReader protected ()
  extends parquetjsLib.libReaderMod.ParquetReader {
  def this(metadata: parquetjsLib.libMetadataDotInterfaceMod.MetadataInterface, envelopeReader: parquetjsLib.libReaderMod.ParquetEnvelopeReader) = this()
}

/* static members */
@JSImport("parquetjs", "ParquetReader")
@js.native
object ParquetReader extends js.Object {
  def openFile(filePath: java.lang.String): js.Promise[parquetjsLib.libReaderMod.ParquetReader] = js.native
}

