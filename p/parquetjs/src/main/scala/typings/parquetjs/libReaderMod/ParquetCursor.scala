package typings.parquetjs.libReaderMod

import typings.parquetjs.libMetadataDotInterfaceMod.MetadataInterface
import typings.parquetjs.libRowDotInterfaceMod.RowInterface
import typings.parquetjs.libSchemaMod.ParquetSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/reader", "ParquetCursor")
@js.native
class ParquetCursor protected () extends js.Object {
  def this(
    metadata: MetadataInterface,
    envelopeReader: ParquetEnvelopeReader,
    schema: ParquetSchema,
    columnList: js.Array[js.Array[String] | String]
  ) = this()
  var columnList: js.Array[js.Array[String] | String] = js.native
  var envelopeReader: ParquetEnvelopeReader = js.native
  var metadata: MetadataInterface = js.native
  var rowGroup: js.Array[RowInterface] = js.native
  var rowGroupIndex: Double = js.native
  var schema: ParquetSchema = js.native
  def next(): js.Promise[RowInterface] = js.native
  def rewind(): Unit = js.native
}

