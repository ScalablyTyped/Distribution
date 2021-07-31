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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parquetMod {
  
  @JSImport("parquetjs/parquet", "ParquetEnvelopeReader")
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
  /* static members */
  object ParquetEnvelopeReader {
    
    @JSImport("parquetjs/parquet", "ParquetEnvelopeReader")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def openFile(filePath: String): typings.parquetjs.readerMod.ParquetReader = ^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[typings.parquetjs.readerMod.ParquetReader]
  }
  
  @JSImport("parquetjs/parquet", "ParquetEnvelopeWriter")
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
  /* static members */
  object ParquetEnvelopeWriter {
    
    @JSImport("parquetjs/parquet", "ParquetEnvelopeWriter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def openStream(schema: typings.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typings.parquetjs.writerMod.ParquetEnvelopeWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.writerMod.ParquetEnvelopeWriter]]
    @scala.inline
    def openStream(schema: typings.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[typings.parquetjs.writerMod.ParquetEnvelopeWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.writerMod.ParquetEnvelopeWriter]]
    @scala.inline
    def openStream(
      schema: typings.parquetjs.schemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typings.parquetjs.writerMod.ParquetEnvelopeWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.writerMod.ParquetEnvelopeWriter]]
  }
  
  @JSImport("parquetjs/parquet", "ParquetReader")
  @js.native
  class ParquetReader protected ()
    extends typings.parquetjs.readerMod.ParquetReader {
    def this(metadata: MetadataInterface, envelopeReader: typings.parquetjs.readerMod.ParquetEnvelopeReader) = this()
  }
  /* static members */
  object ParquetReader {
    
    @JSImport("parquetjs/parquet", "ParquetReader")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def openFile(filePath: String): js.Promise[typings.parquetjs.readerMod.ParquetReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.parquetjs.readerMod.ParquetReader]]
  }
  
  @JSImport("parquetjs/parquet", "ParquetSchema")
  @js.native
  class ParquetSchema protected ()
    extends typings.parquetjs.schemaMod.ParquetSchema {
    def this(schema: SchemaInterface) = this()
  }
  
  object ParquetShredder {
    
    @JSImport("parquetjs/parquet", "ParquetShredder")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def materializeRecords(schema: typings.parquetjs.schemaMod.ParquetSchema, buffer: RowBufferInterface): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("materializeRecords")(schema.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def shredRecord(
      schema: typings.parquetjs.schemaMod.ParquetSchema,
      record: RowInterface,
      buffer: RowBufferInterface
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shredRecord")(schema.asInstanceOf[js.Any], record.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("parquetjs/parquet", "ParquetTransformer")
  @js.native
  class ParquetTransformer protected ()
    extends typings.parquetjs.writerMod.ParquetTransformer {
    def this(schema: typings.parquetjs.schemaMod.ParquetSchema) = this()
    def this(schema: typings.parquetjs.schemaMod.ParquetSchema, opts: String) = this()
    def this(schema: typings.parquetjs.schemaMod.ParquetSchema, opts: ParquetWriterOpts) = this()
  }
  
  @JSImport("parquetjs/parquet", "ParquetWriter")
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
  object ParquetWriter {
    
    @JSImport("parquetjs/parquet", "ParquetWriter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def openFile(schema: typings.parquetjs.schemaMod.ParquetSchema, path: PathLike): js.Promise[typings.parquetjs.writerMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.writerMod.ParquetWriter]]
    @scala.inline
    def openFile(schema: typings.parquetjs.schemaMod.ParquetSchema, path: PathLike, opts: String): js.Promise[typings.parquetjs.writerMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.writerMod.ParquetWriter]]
    @scala.inline
    def openFile(schema: typings.parquetjs.schemaMod.ParquetSchema, path: PathLike, opts: ParquetWriterOpts): js.Promise[typings.parquetjs.writerMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.writerMod.ParquetWriter]]
    
    @scala.inline
    def openStream(schema: typings.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typings.parquetjs.writerMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.writerMod.ParquetWriter]]
    @scala.inline
    def openStream(schema: typings.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[typings.parquetjs.writerMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.writerMod.ParquetWriter]]
    @scala.inline
    def openStream(
      schema: typings.parquetjs.schemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typings.parquetjs.writerMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.writerMod.ParquetWriter]]
  }
}
