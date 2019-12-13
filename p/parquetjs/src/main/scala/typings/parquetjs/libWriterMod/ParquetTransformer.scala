package typings.parquetjs.libWriterMod

import typings.node.streamMod.Transform
import typings.parquetjs.libRowDotInterfaceMod.RowInterface
import typings.parquetjs.libSchemaMod.ParquetSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/writer", "ParquetTransformer")
@js.native
class ParquetTransformer protected () extends Transform {
  def this(schema: ParquetSchema) = this()
  def this(schema: ParquetSchema, opts: String) = this()
  def this(schema: ParquetSchema, opts: ParquetWriterOpts) = this()
  var writer: ParquetWriter = js.native
  def _flush(callback: js.Function0[Unit]): Unit = js.native
  def _transform(row: RowInterface, encoding: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def _transform(row: RowInterface, encoding: String, callback: js.Function0[Unit]): Unit = js.native
  def _transform(row: RowInterface, encoding: Null, callback: js.Function0[Unit]): Unit = js.native
}

