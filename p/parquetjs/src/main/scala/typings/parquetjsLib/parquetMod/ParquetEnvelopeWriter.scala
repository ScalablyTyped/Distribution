package typings
package parquetjsLib.parquetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/parquet", "ParquetEnvelopeWriter")
@js.native
class ParquetEnvelopeWriter protected ()
  extends parquetjsLib.libWriterMod.ParquetEnvelopeWriter {
  def this(schema: parquetjsLib.libSchemaMod.ParquetSchema, writeFn: js.Function1[/* buf */ nodeLib.Buffer, js.Promise[scala.Unit]], closeFn: js.Function0[js.Promise[scala.Unit]], fileOffset: scala.Double) = this()
  def this(schema: parquetjsLib.libSchemaMod.ParquetSchema, writeFn: js.Function1[/* buf */ nodeLib.Buffer, js.Promise[scala.Unit]], closeFn: js.Function0[js.Promise[scala.Unit]], fileOffset: scala.Double, opts: java.lang.String) = this()
  def this(schema: parquetjsLib.libSchemaMod.ParquetSchema, writeFn: js.Function1[/* buf */ nodeLib.Buffer, js.Promise[scala.Unit]], closeFn: js.Function0[js.Promise[scala.Unit]], fileOffset: scala.Double, opts: parquetjsLib.Anon_AutoClose) = this()
}

/* static members */
@JSImport("parquetjs/parquet", "ParquetEnvelopeWriter")
@js.native
object ParquetEnvelopeWriter extends js.Object {
  def openStream(schema: parquetjsLib.libSchemaMod.ParquetSchema, outputStream: nodeLib.fsMod.WriteStream): js.Promise[parquetjsLib.libWriterMod.ParquetEnvelopeWriter] = js.native
  def openStream(
    schema: parquetjsLib.libSchemaMod.ParquetSchema,
    outputStream: nodeLib.fsMod.WriteStream,
    opts: java.lang.String
  ): js.Promise[parquetjsLib.libWriterMod.ParquetEnvelopeWriter] = js.native
  def openStream(
    schema: parquetjsLib.libSchemaMod.ParquetSchema,
    outputStream: nodeLib.fsMod.WriteStream,
    opts: parquetjsLib.Anon_AutoClose
  ): js.Promise[parquetjsLib.libWriterMod.ParquetEnvelopeWriter] = js.native
}

