package typings.parquetjs.parquetMod

import typings.parquetjs.libRowBufferDotInterfaceMod.RowBufferInterface
import typings.parquetjs.libRowDotInterfaceMod.RowInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/parquet", "ParquetShredder")
@js.native
object ParquetShredderNs extends js.Object {
  def materializeRecords(schema: typings.parquetjs.libSchemaMod.ParquetSchema, buffer: RowBufferInterface): Unit = js.native
  def shredRecord(
    schema: typings.parquetjs.libSchemaMod.ParquetSchema,
    record: RowInterface,
    buffer: RowBufferInterface
  ): Unit = js.native
}

