package typings.parquetjs.writerMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.fsMod.PathLike
import typings.node.fsMod.WriteStream
import typings.parquetjs.rowBufferInterfaceMod.RowBufferInterface
import typings.parquetjs.rowInterfaceMod.RowInterface
import typings.parquetjs.schemaMod.ParquetSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parquetjs/lib/writer", "ParquetWriter")
@js.native
class ParquetWriter protected () extends js.Object {
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
@JSImport("parquetjs/lib/writer", "ParquetWriter")
@js.native
object ParquetWriter extends js.Object {
  
  def openFile(schema: ParquetSchema, path: PathLike): js.Promise[ParquetWriter] = js.native
  def openFile(schema: ParquetSchema, path: PathLike, opts: String): js.Promise[ParquetWriter] = js.native
  def openFile(schema: ParquetSchema, path: PathLike, opts: ParquetWriterOpts): js.Promise[ParquetWriter] = js.native
  
  def openStream(schema: ParquetSchema, outputStream: WriteStream): js.Promise[ParquetWriter] = js.native
  def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[ParquetWriter] = js.native
  def openStream(schema: ParquetSchema, outputStream: WriteStream, opts: ParquetWriterOpts): js.Promise[ParquetWriter] = js.native
}
