package typings.parquetjs

import typings.node.Buffer
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteStream
import typings.parquetjs.metadataInterfaceMod.MetadataInterface
import typings.parquetjs.rowBufferInterfaceMod.RowBufferInterface
import typings.parquetjs.rowInterfaceMod.RowInterface
import typings.parquetjs.schemaInterfaceMod.SchemaInterface
import typings.parquetjs.writerMod.ParquetWriterOpts
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/parquet", JSImport.Namespace)
@js.native
object parquetMod extends js.Object {
  @js.native
  class ParquetEnvelopeReader protected ()
    extends typings.parquetjs.readerMod.ParquetEnvelopeReader {
    def this(
      readFn: js.Function3[
            /* fd */ Double, 
            /* position */ Double, 
            /* length */ Double, 
            js.Promise[Buffer | Error]
          ],
      closeFn: js.Function1[/* fd */ Double, js.Promise[Error]],
      fileSize: Double
    ) = this()
  }
  
  @js.native
  class ParquetEnvelopeWriter protected ()
    extends typings.parquetjs.writerMod.ParquetEnvelopeWriter {
    def this(
      schema: typings.parquetjs.schemaMod.ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double
    ) = this()
    def this(
      schema: typings.parquetjs.schemaMod.ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double,
      opts: String
    ) = this()
    def this(
      schema: typings.parquetjs.schemaMod.ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double,
      opts: ParquetWriterOpts
    ) = this()
  }
  
  @js.native
  class ParquetReader protected ()
    extends typings.parquetjs.readerMod.ParquetReader {
    def this(metadata: MetadataInterface, envelopeReader: typings.parquetjs.readerMod.ParquetEnvelopeReader) = this()
  }
  
  @js.native
  class ParquetSchema protected ()
    extends typings.parquetjs.schemaMod.ParquetSchema {
    def this(schema: SchemaInterface) = this()
  }
  
  @js.native
  class ParquetTransformer protected ()
    extends typings.parquetjs.writerMod.ParquetTransformer {
    def this(schema: typings.parquetjs.schemaMod.ParquetSchema) = this()
    def this(schema: typings.parquetjs.schemaMod.ParquetSchema, opts: String) = this()
    def this(schema: typings.parquetjs.schemaMod.ParquetSchema, opts: ParquetWriterOpts) = this()
  }
  
  @js.native
  class ParquetWriter protected ()
    extends typings.parquetjs.writerMod.ParquetWriter {
    def this(
      schema: typings.parquetjs.schemaMod.ParquetSchema,
      envelopeWriter: typings.parquetjs.writerMod.ParquetEnvelopeWriter
    ) = this()
    def this(
      schema: typings.parquetjs.schemaMod.ParquetSchema,
      envelopeWriter: typings.parquetjs.writerMod.ParquetEnvelopeWriter,
      opts: String
    ) = this()
    def this(
      schema: typings.parquetjs.schemaMod.ParquetSchema,
      envelopeWriter: typings.parquetjs.writerMod.ParquetEnvelopeWriter,
      opts: ParquetWriterOpts
    ) = this()
  }
  
  /* static members */
  @js.native
  object ParquetEnvelopeReader extends js.Object {
    def openFile(filePath: String): typings.parquetjs.readerMod.ParquetReader = js.native
  }
  
  /* static members */
  @js.native
  object ParquetEnvelopeWriter extends js.Object {
    def openStream(schema: typings.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typings.parquetjs.writerMod.ParquetEnvelopeWriter] = js.native
    def openStream(schema: typings.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[typings.parquetjs.writerMod.ParquetEnvelopeWriter] = js.native
    def openStream(
      schema: typings.parquetjs.schemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typings.parquetjs.writerMod.ParquetEnvelopeWriter] = js.native
  }
  
  /* static members */
  @js.native
  object ParquetReader extends js.Object {
    def openFile(filePath: String): js.Promise[typings.parquetjs.readerMod.ParquetReader] = js.native
  }
  
  @js.native
  object ParquetShredder extends js.Object {
    def materializeRecords(schema: typings.parquetjs.schemaMod.ParquetSchema, buffer: RowBufferInterface): Unit = js.native
    def shredRecord(
      schema: typings.parquetjs.schemaMod.ParquetSchema,
      record: RowInterface,
      buffer: RowBufferInterface
    ): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ParquetWriter extends js.Object {
    def openFile(schema: typings.parquetjs.schemaMod.ParquetSchema, path: PathLike): js.Promise[typings.parquetjs.writerMod.ParquetWriter] = js.native
    def openFile(schema: typings.parquetjs.schemaMod.ParquetSchema, path: PathLike, opts: String): js.Promise[typings.parquetjs.writerMod.ParquetWriter] = js.native
    def openFile(schema: typings.parquetjs.schemaMod.ParquetSchema, path: PathLike, opts: ParquetWriterOpts): js.Promise[typings.parquetjs.writerMod.ParquetWriter] = js.native
    def openStream(schema: typings.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typings.parquetjs.writerMod.ParquetWriter] = js.native
    def openStream(schema: typings.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[typings.parquetjs.writerMod.ParquetWriter] = js.native
    def openStream(
      schema: typings.parquetjs.schemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typings.parquetjs.writerMod.ParquetWriter] = js.native
  }
  
}

