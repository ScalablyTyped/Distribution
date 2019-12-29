package typings.parquetjs

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.nodeDashInt64.nodeDashInt64Mod.^
import typings.parquetjs.libMetadataDotInterfaceMod.MetadataInterface
import typings.parquetjs.libMetadataDotInterfaceMod.MetadataRowGroupsInterface
import typings.parquetjs.libRowBufferDotInterfaceMod.RowBufferInterface
import typings.parquetjs.libRowDotInterfaceMod.RowInterface
import typings.parquetjs.libSchemaMod.ParquetSchema
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/reader", JSImport.Namespace)
@js.native
object libReaderMod extends js.Object {
  @js.native
  class ParquetCursor protected () extends js.Object {
    def this(
      metadata: MetadataInterface,
      envelopeReader: ParquetEnvelopeReader,
      schema: ParquetSchema,
      columnList: js.Array[js.Array[String] | String]
    ) = this()
    var columnList: js.Array[js.Array[String] | String] = js.native
    var envelopeReader: ParquetEnvelopeReader = js.native
    var metadata: MetadataInterface = js.native
    var rowGroup: js.Array[RowInterface] = js.native
    var rowGroupIndex: Double = js.native
    var schema: ParquetSchema = js.native
    def next(): js.Promise[RowInterface] = js.native
    def rewind(): Unit = js.native
  }
  
  @js.native
  class ParquetEnvelopeReader protected () extends js.Object {
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
    var fileSize: Double = js.native
    def close(fd: Double): js.Promise[Error] = js.native
    def read(fd: Double, position: Double, length: Double): js.Promise[Buffer | Error] = js.native
    def readColumnChunk(schema: ParquetSchema, colChunk: js.Object): Unit = js.native
    def readFooter(): MetadataInterface = js.native
    def readHeader(): scala.Nothing = js.native
    def readRowGroup(
      schema: ParquetSchema,
      rowGroup: MetadataRowGroupsInterface,
      columnList: js.Array[js.Array[String] | String]
    ): RowBufferInterface = js.native
  }
  
  @js.native
  class ParquetReader protected () extends js.Object {
    def this(metadata: MetadataInterface, envelopeReader: ParquetEnvelopeReader) = this()
    var envelopeReader: ParquetEnvelopeReader = js.native
    var metadata: MetadataInterface = js.native
    var schema: ParquetSchema = js.native
    def close(): js.Promise[Unit] = js.native
    def getCursor(): ParquetCursor = js.native
    def getCursor(columnList: js.Array[js.Array[String] | String]): ParquetCursor = js.native
    def getMetadata(): StringDictionary[String] = js.native
    def getRowCount(): ^ = js.native
    def getSchema(): ParquetSchema = js.native
  }
  
  /* static members */
  @js.native
  object ParquetEnvelopeReader extends js.Object {
    def openFile(filePath: String): ParquetReader = js.native
  }
  
  /* static members */
  @js.native
  object ParquetReader extends js.Object {
    def openFile(filePath: String): js.Promise[ParquetReader] = js.native
  }
  
}

