package typings.parquetjs.libReaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.nodeDashInt64.nodeDashInt64Mod.^
import typings.parquetjs.libMetadataDotInterfaceMod.MetadataInterface
import typings.parquetjs.libSchemaMod.ParquetSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/reader", "ParquetReader")
@js.native
class ParquetReader protected () extends js.Object {
  def this(metadata: MetadataInterface, envelopeReader: ParquetEnvelopeReader) = this()
  var envelopeReader: ParquetEnvelopeReader = js.native
  var metadata: MetadataInterface = js.native
  var schema: ParquetSchema = js.native
  def close(): js.Promise[Unit] = js.native
  def getCursor(): ParquetCursor = js.native
  def getCursor(columnList: js.Array[js.Array[String] | String]): ParquetCursor = js.native
  def getMetadata(): StringDictionary[String] = js.native
  def getRowCount(): ^ = js.native
  def getSchema(): ParquetSchema = js.native
}

/* static members */
@JSImport("parquetjs/lib/reader", "ParquetReader")
@js.native
object ParquetReader extends js.Object {
  def openFile(filePath: String): js.Promise[ParquetReader] = js.native
}

