package typings.parquetjs

import typings.node.Buffer
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteStream
import typings.parquetjs.libMetadataDotInterfaceMod.MetadataInterface
import typings.parquetjs.libRowBufferDotInterfaceMod.RowBufferInterface
import typings.parquetjs.libRowDotInterfaceMod.RowInterface
import typings.parquetjs.libSchemaDotInterfaceMod.SchemaInterface
import typings.parquetjs.libWriterMod.ParquetWriterOpts
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs", JSImport.Namespace)
@js.native
object parquetjsMod extends js.Object {
  @js.native
  class ParquetEnvelopeReader protected ()
    extends typings.parquetjs.libReaderMod.ParquetEnvelopeReader {
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
      opts: ParquetWriterOpts
    ) = this()
  }
  
  @js.native
  class ParquetReader protected ()
    extends typings.parquetjs.libReaderMod.ParquetReader {
    def this(metadata: MetadataInterface, envelopeReader: typings.parquetjs.libReaderMod.ParquetEnvelopeReader) = this()
  }
  
  @js.native
  class ParquetSchema protected ()
    extends typings.parquetjs.libSchemaMod.ParquetSchema {
    def this(schema: SchemaInterface) = this()
  }
  
  @js.native
  class ParquetTransformer protected ()
    extends typings.parquetjs.libWriterMod.ParquetTransformer {
    def this(schema: typings.parquetjs.libSchemaMod.ParquetSchema) = this()
    def this(schema: typings.parquetjs.libSchemaMod.ParquetSchema, opts: String) = this()
    def this(schema: typings.parquetjs.libSchemaMod.ParquetSchema, opts: ParquetWriterOpts) = this()
  }
  
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
      opts: ParquetWriterOpts
    ) = this()
  }
  
  /* static members */
  @js.native
  object ParquetEnvelopeReader extends js.Object {
    def openFile(filePath: String): typings.parquetjs.libReaderMod.ParquetReader = js.native
  }
  
  /* static members */
  @js.native
  object ParquetEnvelopeWriter extends js.Object {
    def openStream(schema: typings.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typings.parquetjs.libWriterMod.ParquetEnvelopeWriter] = js.native
    def openStream(schema: typings.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[typings.parquetjs.libWriterMod.ParquetEnvelopeWriter] = js.native
    def openStream(
      schema: typings.parquetjs.libSchemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typings.parquetjs.libWriterMod.ParquetEnvelopeWriter] = js.native
  }
  
  /* static members */
  @js.native
  object ParquetReader extends js.Object {
    def openFile(filePath: String): js.Promise[typings.parquetjs.libReaderMod.ParquetReader] = js.native
  }
  
  @js.native
  object ParquetShredder extends js.Object {
    def materializeRecords(schema: typings.parquetjs.libSchemaMod.ParquetSchema, buffer: RowBufferInterface): Unit = js.native
    def shredRecord(
      schema: typings.parquetjs.libSchemaMod.ParquetSchema,
      record: RowInterface,
      buffer: RowBufferInterface
    ): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ParquetWriter extends js.Object {
    def openFile(schema: typings.parquetjs.libSchemaMod.ParquetSchema, path: PathLike): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = js.native
    def openFile(schema: typings.parquetjs.libSchemaMod.ParquetSchema, path: PathLike, opts: String): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = js.native
    def openFile(schema: typings.parquetjs.libSchemaMod.ParquetSchema, path: PathLike, opts: ParquetWriterOpts): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = js.native
    def openStream(schema: typings.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = js.native
    def openStream(schema: typings.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = js.native
    def openStream(
      schema: typings.parquetjs.libSchemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = js.native
  }
  
}

