package typings
package parquetjsLib.libReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/reader", "ParquetEnvelopeReader")
@js.native
class ParquetEnvelopeReader protected () extends js.Object {
  def this(readFn: js.Function3[
      /* fd */ scala.Double, 
      /* position */ scala.Double, 
      /* length */ scala.Double, 
      js.Promise[nodeLib.Buffer | stdLib.Error]
    ], closeFn: js.Function1[/* fd */ scala.Double, js.Promise[stdLib.Error]], fileSize: scala.Double) = this()
  var fileSize: scala.Double = js.native
  def close(fd: scala.Double): js.Promise[stdLib.Error] = js.native
  def read(fd: scala.Double, position: scala.Double, length: scala.Double): js.Promise[nodeLib.Buffer | stdLib.Error] = js.native
  def readColumnChunk(schema: parquetjsLib.libSchemaMod.ParquetSchema, colChunk: js.Object): scala.Unit = js.native
  def readFooter(): parquetjsLib.libMetadataDotInterfaceMod.MetadataInterface = js.native
  def readHeader(): scala.Nothing = js.native
  def readRowGroup(
    schema: parquetjsLib.libSchemaMod.ParquetSchema,
    rowGroup: parquetjsLib.libMetadataDotInterfaceMod.MetadataRowGroupsInterface,
    columnList: js.Array[js.Array[java.lang.String] | java.lang.String]
  ): parquetjsLib.libRowBufferDotInterfaceMod.RowBufferInterface = js.native
}

/* static members */
@JSImport("parquetjs/lib/reader", "ParquetEnvelopeReader")
@js.native
object ParquetEnvelopeReader extends js.Object {
  def openFile(filePath: java.lang.String): parquetjsLib.libReaderMod.ParquetReader = js.native
}

