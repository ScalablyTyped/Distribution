package typings.parquetjs.parquetjsMod

import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteStream
import typings.parquetjs.Anon_AutoClose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs", "ParquetWriter")
@js.native
class ParquetWriter protected ()
  extends typings.parquetjs.libWriterMod.ParquetWriter {
  def this(
    schema: typings.parquetjs.libSchemaMod.ParquetSchema,
    envelopeWriter: typings.parquetjs.libWriterMod.ParquetEnvelopeWriter
  ) = this()
  def this(
    schema: typings.parquetjs.libSchemaMod.ParquetSchema,
    envelopeWriter: typings.parquetjs.libWriterMod.ParquetEnvelopeWriter,
    opts: String
  ) = this()
  def this(
    schema: typings.parquetjs.libSchemaMod.ParquetSchema,
    envelopeWriter: typings.parquetjs.libWriterMod.ParquetEnvelopeWriter,
    opts: Anon_AutoClose
  ) = this()
}

/* static members */
@JSImport("parquetjs", "ParquetWriter")
@js.native
object ParquetWriter extends js.Object {
  def openFile(schema: typings.parquetjs.libSchemaMod.ParquetSchema, path: PathLike): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = js.native
  def openFile(schema: typings.parquetjs.libSchemaMod.ParquetSchema, path: PathLike, opts: String): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = js.native
  def openFile(schema: typings.parquetjs.libSchemaMod.ParquetSchema, path: PathLike, opts: Anon_AutoClose): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = js.native
  def openStream(schema: typings.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = js.native
  def openStream(schema: typings.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = js.native
  def openStream(
    schema: typings.parquetjs.libSchemaMod.ParquetSchema,
    outputStream: WriteStream,
    opts: Anon_AutoClose
  ): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = js.native
}

