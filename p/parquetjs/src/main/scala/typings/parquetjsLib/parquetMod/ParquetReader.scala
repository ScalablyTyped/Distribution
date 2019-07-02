package typings
package parquetjsLib.parquetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/parquet", "ParquetReader")
@js.native
class ParquetReader protected ()
  extends parquetjsLib.libReaderMod.ParquetReader {
  def this(metadata: parquetjsLib.libMetadataDotInterfaceMod.MetadataInterface, envelopeReader: parquetjsLib.libReaderMod.ParquetEnvelopeReader) = this()
}

/* static members */
@JSImport("parquetjs/parquet", "ParquetReader")
@js.native
object ParquetReader extends js.Object {
  def openFile(filePath: java.lang.String): js.Promise[parquetjsLib.libReaderMod.ParquetReader] = js.native
}

