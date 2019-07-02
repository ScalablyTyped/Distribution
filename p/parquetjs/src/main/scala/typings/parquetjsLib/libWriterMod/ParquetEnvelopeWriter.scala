package typings
package parquetjsLib.libWriterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/writer", "ParquetEnvelopeWriter")
@js.native
class ParquetEnvelopeWriter protected () extends js.Object {
  def this(schema: parquetjsLib.libSchemaMod.ParquetSchema, writeFn: js.Function1[/* buf */ nodeLib.Buffer, js.Promise[scala.Unit]], closeFn: js.Function0[js.Promise[scala.Unit]], fileOffset: scala.Double) = this()
  def this(schema: parquetjsLib.libSchemaMod.ParquetSchema, writeFn: js.Function1[/* buf */ nodeLib.Buffer, js.Promise[scala.Unit]], closeFn: js.Function0[js.Promise[scala.Unit]], fileOffset: scala.Double, opts: java.lang.String) = this()
  def this(schema: parquetjsLib.libSchemaMod.ParquetSchema, writeFn: js.Function1[/* buf */ nodeLib.Buffer, js.Promise[scala.Unit]], closeFn: js.Function0[js.Promise[scala.Unit]], fileOffset: scala.Double, opts: parquetjsLib.Anon_AutoClose) = this()
  var offset: scala.Double = js.native
  var pageSize: scala.Double = js.native
  var rowCount: scala.Double = js.native
  var rowGroups: js.Array[parquetjsLib.Anon_Columns] = js.native
  var schema: parquetjsLib.libSchemaMod.ParquetSchema = js.native
  var useDataPageV2: scala.Boolean = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def setPageSize(cnt: scala.Double): scala.Unit = js.native
  def write(buf: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
  def writeFooter(userMetadata: org.scalablytyped.runtime.StringDictionary[java.lang.String]): js.Promise[scala.Unit] = js.native
  def writeHeader(): js.Promise[scala.Unit] = js.native
  def writeRowGroup(records: parquetjsLib.libRowBufferDotInterfaceMod.RowBufferInterface): js.Promise[scala.Unit] = js.native
  def writeSection(buf: nodeLib.Buffer): js.Promise[scala.Unit] = js.native
}

/* static members */
@JSImport("parquetjs/lib/writer", "ParquetEnvelopeWriter")
@js.native
object ParquetEnvelopeWriter extends js.Object {
  def openStream(schema: parquetjsLib.libSchemaMod.ParquetSchema, outputStream: nodeLib.fsMod.WriteStream): js.Promise[parquetjsLib.libWriterMod.ParquetEnvelopeWriter] = js.native
  def openStream(
    schema: parquetjsLib.libSchemaMod.ParquetSchema,
    outputStream: nodeLib.fsMod.WriteStream,
    opts: java.lang.String
  ): js.Promise[parquetjsLib.libWriterMod.ParquetEnvelopeWriter] = js.native
  def openStream(
    schema: parquetjsLib.libSchemaMod.ParquetSchema,
    outputStream: nodeLib.fsMod.WriteStream,
    opts: parquetjsLib.Anon_AutoClose
  ): js.Promise[parquetjsLib.libWriterMod.ParquetEnvelopeWriter] = js.native
}

