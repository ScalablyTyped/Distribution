package typings.parquetjs.libReaderMod

import typings.node.Buffer
import typings.parquetjs.libMetadataDotInterfaceMod.MetadataInterface
import typings.parquetjs.libMetadataDotInterfaceMod.MetadataRowGroupsInterface
import typings.parquetjs.libRowBufferDotInterfaceMod.RowBufferInterface
import typings.parquetjs.libSchemaMod.ParquetSchema
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/reader", "ParquetEnvelopeReader")
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

/* static members */
@JSImport("parquetjs/lib/reader", "ParquetEnvelopeReader")
@js.native
object ParquetEnvelopeReader extends js.Object {
  def openFile(filePath: String): ParquetReader = js.native
}

