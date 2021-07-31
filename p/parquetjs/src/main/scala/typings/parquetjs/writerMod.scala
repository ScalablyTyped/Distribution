package typings.parquetjs

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteStream
import typings.node.streamMod.Transform
import typings.parquetjs.anon.Columns
import typings.parquetjs.rowBufferInterfaceMod.RowBufferInterface
import typings.parquetjs.rowInterfaceMod.RowInterface
import typings.parquetjs.schemaMod.ParquetSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writerMod {
  
  @JSImport("parquetjs/lib/writer", "ParquetEnvelopeWriter")
  @js.native
  class ParquetEnvelopeWriter protected () extends StObject {
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
      opts: ParquetWriterOpts
    ) = this()
    
    def close(): js.Promise[Unit] = js.native
    
    var offset: Double = js.native
    
    var pageSize: Double = js.native
    
    var rowCount: Double = js.native
    
    var rowGroups: js.Array[Columns] = js.native
    
    var schema: ParquetSchema = js.native
    
    def setPageSize(cnt: Double): Unit = js.native
    
    var useDataPageV2: Boolean = js.native
    
    def write(buf: Buffer): js.Promise[Unit] = js.native
    
    def writeFooter(userMetadata: StringDictionary[String]): js.Promise[Unit] = js.native
    
    def writeHeader(): js.Promise[Unit] = js.native
    
    def writeRowGroup(records: RowBufferInterface): js.Promise[Unit] = js.native
    
    def writeSection(buf: Buffer): js.Promise[Unit] = js.native
  }
  /* static members */
  object ParquetEnvelopeWriter {
    
    @JSImport("parquetjs/lib/writer", "ParquetEnvelopeWriter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def openStream(schema: ParquetSchema, outputStream: WriteStream): js.Promise[ParquetEnvelopeWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParquetEnvelopeWriter]]
    @scala.inline
    def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[ParquetEnvelopeWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParquetEnvelopeWriter]]
    @scala.inline
    def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: ParquetWriterOpts): js.Promise[ParquetEnvelopeWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParquetEnvelopeWriter]]
  }
  
  @JSImport("parquetjs/lib/writer", "ParquetTransformer")
  @js.native
  class ParquetTransformer protected () extends Transform {
    def this(schema: ParquetSchema) = this()
    def this(schema: ParquetSchema, opts: String) = this()
    def this(schema: ParquetSchema, opts: ParquetWriterOpts) = this()
    
    def _flush(callback: js.Function0[Unit]): Unit = js.native
    
    def _transform(row: RowInterface, encoding: String, callback: js.Function0[Unit]): Unit = js.native
    def _transform(row: RowInterface, encoding: Null, callback: js.Function0[Unit]): Unit = js.native
    def _transform(row: RowInterface, encoding: Unit, callback: js.Function0[Unit]): Unit = js.native
    
    var writer: ParquetWriter = js.native
  }
  
  @JSImport("parquetjs/lib/writer", "ParquetWriter")
  @js.native
  class ParquetWriter protected () extends StObject {
    def this(schema: ParquetSchema, envelopeWriter: ParquetEnvelopeWriter) = this()
    def this(schema: ParquetSchema, envelopeWriter: ParquetEnvelopeWriter, opts: String) = this()
    def this(schema: ParquetSchema, envelopeWriter: ParquetEnvelopeWriter, opts: ParquetWriterOpts) = this()
    
    def appendRow(row: RowInterface): js.Promise[Unit] = js.native
    
    def close(): js.Promise[Unit] = js.native
    def close(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
    
    var closed: Boolean = js.native
    
    var envelopeWriter: ParquetEnvelopeWriter = js.native
    
    var rowBuffer: RowBufferInterface = js.native
    
    var rowGroupSize: Double = js.native
    
    var schema: ParquetSchema = js.native
    
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
    
    var userMetadata: StringDictionary[String] = js.native
  }
  /* static members */
  object ParquetWriter {
    
    @JSImport("parquetjs/lib/writer", "ParquetWriter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def openFile(schema: ParquetSchema, path: PathLike): js.Promise[ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParquetWriter]]
    @scala.inline
    def openFile(schema: ParquetSchema, path: PathLike, opts: String): js.Promise[ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParquetWriter]]
    @scala.inline
    def openFile(schema: ParquetSchema, path: PathLike, opts: ParquetWriterOpts): js.Promise[ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParquetWriter]]
    
    @scala.inline
    def openStream(schema: ParquetSchema, outputStream: WriteStream): js.Promise[ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParquetWriter]]
    @scala.inline
    def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParquetWriter]]
    @scala.inline
    def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: ParquetWriterOpts): js.Promise[ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ParquetWriter]]
  }
  
  trait ParquetWriterOpts extends StObject {
    
    var autoClose: js.UndefOr[Boolean] = js.undefined
    
    var bitWidth: js.UndefOr[Double] = js.undefined
    
    var disableEnvelope: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var fd: js.UndefOr[Double] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var rowGroupSize: js.UndefOr[Double] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
    
    var useDataPageV2: js.UndefOr[Boolean] = js.undefined
  }
  object ParquetWriterOpts {
    
    @scala.inline
    def apply(): ParquetWriterOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParquetWriterOpts]
    }
    
    @scala.inline
    implicit class ParquetWriterOptsMutableBuilder[Self <: ParquetWriterOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      @scala.inline
      def setBitWidth(value: Double): Self = StObject.set(x, "bitWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBitWidthUndefined: Self = StObject.set(x, "bitWidth", js.undefined)
      
      @scala.inline
      def setDisableEnvelope(value: Boolean): Self = StObject.set(x, "disableEnvelope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEnvelopeUndefined: Self = StObject.set(x, "disableEnvelope", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
      
      @scala.inline
      def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setRowGroupSize(value: Double): Self = StObject.set(x, "rowGroupSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowGroupSizeUndefined: Self = StObject.set(x, "rowGroupSize", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setUseDataPageV2(value: Boolean): Self = StObject.set(x, "useDataPageV2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDataPageV2Undefined: Self = StObject.set(x, "useDataPageV2", js.undefined)
    }
  }
}
