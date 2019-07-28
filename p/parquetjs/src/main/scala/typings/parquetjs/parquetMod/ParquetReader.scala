package typings.parquetjs.parquetMod

import typings.parquetjs.libMetadataDotInterfaceMod.MetadataInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/parquet", "ParquetReader")
@js.native
class ParquetReader protected ()
  extends typings.parquetjs.libReaderMod.ParquetReader {
  def this(metadata: MetadataInterface, envelopeReader: typings.parquetjs.libReaderMod.ParquetEnvelopeReader) = this()
}

/* static members */
@JSImport("parquetjs/parquet", "ParquetReader")
@js.native
object ParquetReader extends js.Object {
  def openFile(filePath: String): js.Promise[typings.parquetjs.libReaderMod.ParquetReader] = js.native
}

