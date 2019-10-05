package typings.parquetjs

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteStream
import typings.node.streamMod.Transform
import typings.parquetjs.libRowBufferDotInterfaceMod.RowBufferInterface
import typings.parquetjs.libRowDotInterfaceMod.RowInterface
import typings.parquetjs.libSchemaMod.ParquetSchema
import typings.parquetjs.libWriterMod.ParquetEnvelopeWriter
import typings.parquetjs.libWriterMod.ParquetWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/writer", JSImport.Namespace)
@js.native
object libWriterMod extends js.Object {
  @js.native
  class ParquetEnvelopeWriter protected () extends js.Object {
    def this(
      schema: ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double
    ) = this()
    def this(
      schema: ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double,
      opts: String
    ) = this()
    def this(
      schema: ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double,
      opts: Anon_AutoClose
    ) = this()
    var offset: Double = js.native
    var pageSize: Double = js.native
    var rowCount: Double = js.native
    var rowGroups: js.Array[Anon_Columns] = js.native
    var schema: ParquetSchema = js.native
    var useDataPageV2: Boolean = js.native
    def close(): js.Promise[Unit] = js.native
    def setPageSize(cnt: Double): Unit = js.native
    def write(buf: Buffer): js.Promise[Unit] = js.native
    def writeFooter(userMetadata: StringDictionary[String]): js.Promise[Unit] = js.native
    def writeHeader(): js.Promise[Unit] = js.native
    def writeRowGroup(records: RowBufferInterface): js.Promise[Unit] = js.native
    def writeSection(buf: Buffer): js.Promise[Unit] = js.native
  }
  
  @js.native
  class ParquetTransformer protected () extends Transform {
    def this(schema: ParquetSchema) = this()
    def this(schema: ParquetSchema, opts: String) = this()
    def this(schema: ParquetSchema, opts: Anon_AutoClose) = this()
    var writer: ParquetWriter = js.native
    def _flush(callback: js.Function0[Unit]): Unit = js.native
    def _transform(row: RowInterface, encoding: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
    def _transform(row: RowInterface, encoding: String, callback: js.Function0[Unit]): Unit = js.native
    def _transform(row: RowInterface, encoding: Null, callback: js.Function0[Unit]): Unit = js.native
  }
  
  @js.native
  class ParquetWriter protected () extends js.Object {
    def this(schema: ParquetSchema, envelopeWriter: ParquetEnvelopeWriter) = this()
    def this(schema: ParquetSchema, envelopeWriter: ParquetEnvelopeWriter, opts: String) = this()
    def this(schema: ParquetSchema, envelopeWriter: ParquetEnvelopeWriter, opts: Anon_AutoClose) = this()
    var closed: Boolean = js.native
    var envelopeWriter: ParquetEnvelopeWriter = js.native
    var rowBuffer: RowBufferInterface = js.native
    var rowGroupSize: Double = js.native
    var schema: ParquetSchema = js.native
    var userMetadata: StringDictionary[String] = js.native
    def appendRow(row: RowInterface): js.Promise[Unit] = js.native
    def close(): js.Promise[Unit] = js.native
    def close(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
    def setMetadata(key: String, value: String): Unit = js.native
    def setMetadata(key: String, value: Boolean): Unit = js.native
    def setMetadata(key: String, value: Double): Unit = js.native
    def setMetadata(key: Boolean, value: String): Unit = js.native
    def setMetadata(key: Boolean, value: Boolean): Unit = js.native
    def setMetadata(key: Boolean, value: Double): Unit = js.native
    def setMetadata(key: Double, value: String): Unit = js.native
    def setMetadata(key: Double, value: Boolean): Unit = js.native
    def setMetadata(key: Double, value: Double): Unit = js.native
    def setPageSize(cnt: Double): Unit = js.native
    def setRowGroupSize(cnt: Double): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ParquetEnvelopeWriter extends js.Object {
    def openStream(schema: ParquetSchema, outputStream: WriteStream): js.Promise[ParquetEnvelopeWriter] = js.native
    def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[ParquetEnvelopeWriter] = js.native
    def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: Anon_AutoClose): js.Promise[ParquetEnvelopeWriter] = js.native
  }
  
  /* static members */
  @js.native
  object ParquetWriter extends js.Object {
    def openFile(schema: ParquetSchema, path: PathLike): js.Promise[ParquetWriter] = js.native
    def openFile(schema: ParquetSchema, path: PathLike, opts: String): js.Promise[ParquetWriter] = js.native
    def openFile(schema: ParquetSchema, path: PathLike, opts: Anon_AutoClose): js.Promise[ParquetWriter] = js.native
    def openStream(schema: ParquetSchema, outputStream: WriteStream): js.Promise[ParquetWriter] = js.native
    def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[ParquetWriter] = js.native
    def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: Anon_AutoClose): js.Promise[ParquetWriter] = js.native
  }
  
}

