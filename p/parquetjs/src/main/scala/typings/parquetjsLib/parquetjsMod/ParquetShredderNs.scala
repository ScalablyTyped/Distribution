package typings
package parquetjsLib.parquetjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs", "ParquetShredder")
@js.native
object ParquetShredderNs extends js.Object {
  def materializeRecords(
    schema: parquetjsLib.libSchemaMod.ParquetSchema,
    buffer: parquetjsLib.libRowBufferDotInterfaceMod.RowBufferInterface
  ): scala.Unit = js.native
  def shredRecord(
    schema: parquetjsLib.libSchemaMod.ParquetSchema,
    record: parquetjsLib.libRowDotInterfaceMod.RowInterface,
    buffer: parquetjsLib.libRowBufferDotInterfaceMod.RowBufferInterface
  ): scala.Unit = js.native
}

