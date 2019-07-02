package typings
package parquetjsLib.parquetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/parquet", "ParquetWriter")
@js.native
class ParquetWriter protected ()
  extends parquetjsLib.libWriterMod.ParquetWriter {
  def this(schema: parquetjsLib.libSchemaMod.ParquetSchema, envelopeWriter: parquetjsLib.libWriterMod.ParquetEnvelopeWriter) = this()
  def this(schema: parquetjsLib.libSchemaMod.ParquetSchema, envelopeWriter: parquetjsLib.libWriterMod.ParquetEnvelopeWriter, opts: java.lang.String) = this()
  def this(schema: parquetjsLib.libSchemaMod.ParquetSchema, envelopeWriter: parquetjsLib.libWriterMod.ParquetEnvelopeWriter, opts: parquetjsLib.Anon_AutoClose) = this()
}

/* static members */
@JSImport("parquetjs/parquet", "ParquetWriter")
@js.native
object ParquetWriter extends js.Object {
  def openFile(schema: parquetjsLib.libSchemaMod.ParquetSchema, path: nodeLib.fsMod.PathLike): js.Promise[parquetjsLib.libWriterMod.ParquetWriter] = js.native
  def openFile(
    schema: parquetjsLib.libSchemaMod.ParquetSchema,
    path: nodeLib.fsMod.PathLike,
    opts: java.lang.String
  ): js.Promise[parquetjsLib.libWriterMod.ParquetWriter] = js.native
  def openFile(
    schema: parquetjsLib.libSchemaMod.ParquetSchema,
    path: nodeLib.fsMod.PathLike,
    opts: parquetjsLib.Anon_AutoClose
  ): js.Promise[parquetjsLib.libWriterMod.ParquetWriter] = js.native
  def openStream(schema: parquetjsLib.libSchemaMod.ParquetSchema, outputStream: nodeLib.fsMod.WriteStream): js.Promise[parquetjsLib.libWriterMod.ParquetWriter] = js.native
  def openStream(
    schema: parquetjsLib.libSchemaMod.ParquetSchema,
    outputStream: nodeLib.fsMod.WriteStream,
    opts: java.lang.String
  ): js.Promise[parquetjsLib.libWriterMod.ParquetWriter] = js.native
  def openStream(
    schema: parquetjsLib.libSchemaMod.ParquetSchema,
    outputStream: nodeLib.fsMod.WriteStream,
    opts: parquetjsLib.Anon_AutoClose
  ): js.Promise[parquetjsLib.libWriterMod.ParquetWriter] = js.native
}

