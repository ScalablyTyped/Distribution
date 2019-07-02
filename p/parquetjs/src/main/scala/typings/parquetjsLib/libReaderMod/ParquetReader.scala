package typings
package parquetjsLib.libReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/reader", "ParquetReader")
@js.native
class ParquetReader protected () extends js.Object {
  def this(metadata: parquetjsLib.libMetadataDotInterfaceMod.MetadataInterface, envelopeReader: ParquetEnvelopeReader) = this()
  var envelopeReader: ParquetEnvelopeReader = js.native
  var metadata: parquetjsLib.libMetadataDotInterfaceMod.MetadataInterface = js.native
  var schema: parquetjsLib.libSchemaMod.ParquetSchema = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def getCursor(): ParquetCursor = js.native
  def getCursor(columnList: js.Array[js.Array[java.lang.String] | java.lang.String]): ParquetCursor = js.native
  def getMetadata(): org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  def getRowCount(): nodeDashInt64Lib.nodeDashInt64Mod.^ = js.native
  def getSchema(): parquetjsLib.libSchemaMod.ParquetSchema = js.native
}

/* static members */
@JSImport("parquetjs/lib/reader", "ParquetReader")
@js.native
object ParquetReader extends js.Object {
  def openFile(filePath: java.lang.String): js.Promise[parquetjsLib.libReaderMod.ParquetReader] = js.native
}

