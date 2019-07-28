package typings.parquetjs.parquetjsMod

import typings.node.Buffer
import typings.node.fsMod.WriteStream
import typings.parquetjs.Anon_AutoClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs", "ParquetEnvelopeWriter")
@js.native
class ParquetEnvelopeWriter protected ()
  extends typings.parquetjs.libWriterMod.ParquetEnvelopeWriter {
  def this(
    schema: typings.parquetjs.libSchemaMod.ParquetSchema,
    writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
    closeFn: js.Function0[js.Promise[Unit]],
    fileOffset: Double
  ) = this()
  def this(
    schema: typings.parquetjs.libSchemaMod.ParquetSchema,
    writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
    closeFn: js.Function0[js.Promise[Unit]],
    fileOffset: Double,
    opts: String
  ) = this()
  def this(
    schema: typings.parquetjs.libSchemaMod.ParquetSchema,
    writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
    closeFn: js.Function0[js.Promise[Unit]],
    fileOffset: Double,
    opts: Anon_AutoClose
  ) = this()
}

/* static members */
@JSImport("parquetjs", "ParquetEnvelopeWriter")
@js.native
object ParquetEnvelopeWriter extends js.Object {
  def openStream(schema: typings.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typings.parquetjs.libWriterMod.ParquetEnvelopeWriter] = js.native
  def openStream(schema: typings.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[typings.parquetjs.libWriterMod.ParquetEnvelopeWriter] = js.native
  def openStream(
    schema: typings.parquetjs.libSchemaMod.ParquetSchema,
    outputStream: WriteStream,
    opts: Anon_AutoClose
  ): js.Promise[typings.parquetjs.libWriterMod.ParquetEnvelopeWriter] = js.native
}

