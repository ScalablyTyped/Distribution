package typings.parquetjs.libWriterMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.fsMod.WriteStream
import typings.parquetjs.Anon_AutoClose
import typings.parquetjs.Anon_Columns
import typings.parquetjs.libRowBufferDotInterfaceMod.RowBufferInterface
import typings.parquetjs.libSchemaMod.ParquetSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/writer", "ParquetEnvelopeWriter")
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

/* static members */
@JSImport("parquetjs/lib/writer", "ParquetEnvelopeWriter")
@js.native
object ParquetEnvelopeWriter extends js.Object {
  def openStream(schema: ParquetSchema, outputStream: WriteStream): js.Promise[ParquetEnvelopeWriter] = js.native
  def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[ParquetEnvelopeWriter] = js.native
  def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: Anon_AutoClose): js.Promise[ParquetEnvelopeWriter] = js.native
}

