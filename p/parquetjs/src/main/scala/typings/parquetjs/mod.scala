package typings.parquetjs

import typings.node.bufferMod.global.Buffer
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteStream
import typings.parquetjs.libMetadataDotinterfaceMod.MetadataInterface
import typings.parquetjs.libRowBufferDotinterfaceMod.RowBufferInterface
import typings.parquetjs.libRowDotinterfaceMod.RowInterface
import typings.parquetjs.libSchemaDotinterfaceMod.SchemaInterface
import typings.parquetjs.libWriterMod.ParquetWriterOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parquetjs", "ParquetEnvelopeReader")
  @js.native
  open class ParquetEnvelopeReader protected ()
    extends typings.parquetjs.libReaderMod.ParquetEnvelopeReader {
    def this(
      readFn: js.Function3[
            /* fd */ Double, 
            /* position */ Double, 
            /* length */ Double, 
            js.Promise[Buffer | js.Error]
          ],
      closeFn: js.Function1[/* fd */ Double, js.Promise[js.Error]],
      fileSize: Double
    ) = this()
  }
  /* static members */
  object ParquetEnvelopeReader {
    
    @JSImport("parquetjs", "ParquetEnvelopeReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def openFile(filePath: String): typings.parquetjs.libReaderMod.ParquetReader = ^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[typings.parquetjs.libReaderMod.ParquetReader]
  }
  
  @JSImport("parquetjs", "ParquetEnvelopeWriter")
  @js.native
  open class ParquetEnvelopeWriter protected ()
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
  /* static members */
  object ParquetEnvelopeWriter {
    
    @JSImport("parquetjs", "ParquetEnvelopeWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def openStream(schema: typings.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typings.parquetjs.libWriterMod.ParquetEnvelopeWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.libWriterMod.ParquetEnvelopeWriter]]
    inline def openStream(schema: typings.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[typings.parquetjs.libWriterMod.ParquetEnvelopeWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.libWriterMod.ParquetEnvelopeWriter]]
    inline def openStream(
      schema: typings.parquetjs.libSchemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typings.parquetjs.libWriterMod.ParquetEnvelopeWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.libWriterMod.ParquetEnvelopeWriter]]
  }
  
  @JSImport("parquetjs", "ParquetReader")
  @js.native
  open class ParquetReader protected ()
    extends typings.parquetjs.libReaderMod.ParquetReader {
    def this(metadata: MetadataInterface, envelopeReader: typings.parquetjs.libReaderMod.ParquetEnvelopeReader) = this()
  }
  /* static members */
  object ParquetReader {
    
    @JSImport("parquetjs", "ParquetReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def openFile(filePath: String): js.Promise[typings.parquetjs.libReaderMod.ParquetReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.parquetjs.libReaderMod.ParquetReader]]
  }
  
  @JSImport("parquetjs", "ParquetSchema")
  @js.native
  open class ParquetSchema protected ()
    extends typings.parquetjs.libSchemaMod.ParquetSchema {
    def this(schema: SchemaInterface) = this()
  }
  
  object ParquetShredder {
    
    @JSImport("parquetjs", "ParquetShredder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def materializeRecords(schema: typings.parquetjs.libSchemaMod.ParquetSchema, buffer: RowBufferInterface): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("materializeRecords")(schema.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def shredRecord(
      schema: typings.parquetjs.libSchemaMod.ParquetSchema,
      record: RowInterface,
      buffer: RowBufferInterface
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shredRecord")(schema.asInstanceOf[js.Any], record.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("parquetjs", "ParquetTransformer")
  @js.native
  open class ParquetTransformer protected ()
    extends typings.parquetjs.libWriterMod.ParquetTransformer {
    def this(schema: typings.parquetjs.libSchemaMod.ParquetSchema) = this()
    def this(schema: typings.parquetjs.libSchemaMod.ParquetSchema, opts: String) = this()
    def this(schema: typings.parquetjs.libSchemaMod.ParquetSchema, opts: ParquetWriterOpts) = this()
  }
  
  @JSImport("parquetjs", "ParquetWriter")
  @js.native
  open class ParquetWriter protected ()
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
  object ParquetWriter {
    
    @JSImport("parquetjs", "ParquetWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def openFile(schema: typings.parquetjs.libSchemaMod.ParquetSchema, path: PathLike): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.libWriterMod.ParquetWriter]]
    inline def openFile(schema: typings.parquetjs.libSchemaMod.ParquetSchema, path: PathLike, opts: String): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.libWriterMod.ParquetWriter]]
    inline def openFile(schema: typings.parquetjs.libSchemaMod.ParquetSchema, path: PathLike, opts: ParquetWriterOpts): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.libWriterMod.ParquetWriter]]
    
    inline def openStream(schema: typings.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.libWriterMod.ParquetWriter]]
    inline def openStream(schema: typings.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.libWriterMod.ParquetWriter]]
    inline def openStream(
      schema: typings.parquetjs.libSchemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typings.parquetjs.libWriterMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.parquetjs.libWriterMod.ParquetWriter]]
  }
}
