package typings
package parquetjsLib.libWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/writer", "ParquetTransformer")
@js.native
class ParquetTransformer protected ()
  extends nodeLib.streamMod.Transform {
  def this(schema: parquetjsLib.libSchemaMod.ParquetSchema) = this()
  def this(schema: parquetjsLib.libSchemaMod.ParquetSchema, opts: java.lang.String) = this()
  def this(schema: parquetjsLib.libSchemaMod.ParquetSchema, opts: parquetjsLib.Anon_AutoClose) = this()
  var writer: ParquetWriter = js.native
  def _flush(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def _transform(
    row: parquetjsLib.libRowDotInterfaceMod.RowInterface,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def _transform(
    row: parquetjsLib.libRowDotInterfaceMod.RowInterface,
    encoding: java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def _transform(
    row: parquetjsLib.libRowDotInterfaceMod.RowInterface,
    encoding: scala.Null,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

