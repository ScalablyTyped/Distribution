package typings
package parquetjsLib.libWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/writer", "ParquetWriter")
@js.native
class ParquetWriter protected () extends js.Object {
  def this(schema: parquetjsLib.libSchemaMod.ParquetSchema, envelopeWriter: ParquetEnvelopeWriter) = this()
  def this(schema: parquetjsLib.libSchemaMod.ParquetSchema, envelopeWriter: ParquetEnvelopeWriter, opts: java.lang.String) = this()
  def this(schema: parquetjsLib.libSchemaMod.ParquetSchema, envelopeWriter: ParquetEnvelopeWriter, opts: parquetjsLib.Anon_AutoClose) = this()
  var closed: scala.Boolean = js.native
  var envelopeWriter: ParquetEnvelopeWriter = js.native
  var rowBuffer: parquetjsLib.libRowBufferDotInterfaceMod.RowBufferInterface = js.native
  var rowGroupSize: scala.Double = js.native
  var schema: parquetjsLib.libSchemaMod.ParquetSchema = js.native
  var userMetadata: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def appendRow(row: parquetjsLib.libRowDotInterfaceMod.RowInterface): js.Promise[scala.Unit] = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def close(callback: js.Function0[scala.Unit]): js.Promise[scala.Unit] = js.native
  def setMetadata(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setMetadata(key: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  def setMetadata(key: java.lang.String, value: scala.Double): scala.Unit = js.native
  def setMetadata(key: scala.Boolean, value: java.lang.String): scala.Unit = js.native
  def setMetadata(key: scala.Boolean, value: scala.Boolean): scala.Unit = js.native
  def setMetadata(key: scala.Boolean, value: scala.Double): scala.Unit = js.native
  def setMetadata(key: scala.Double, value: java.lang.String): scala.Unit = js.native
  def setMetadata(key: scala.Double, value: scala.Boolean): scala.Unit = js.native
  def setMetadata(key: scala.Double, value: scala.Double): scala.Unit = js.native
  def setPageSize(cnt: scala.Double): scala.Unit = js.native
  def setRowGroupSize(cnt: scala.Double): scala.Unit = js.native
}

/* static members */
@JSImport("parquetjs/lib/writer", "ParquetWriter")
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

