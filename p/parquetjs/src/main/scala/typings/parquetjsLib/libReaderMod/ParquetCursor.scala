package typings
package parquetjsLib.libReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/reader", "ParquetCursor")
@js.native
class ParquetCursor protected () extends js.Object {
  def this(metadata: parquetjsLib.libMetadataDotInterfaceMod.MetadataInterface, envelopeReader: ParquetEnvelopeReader, schema: parquetjsLib.libSchemaMod.ParquetSchema, columnList: js.Array[js.Array[java.lang.String] | java.lang.String]) = this()
  var columnList: js.Array[js.Array[java.lang.String] | java.lang.String] = js.native
  var envelopeReader: ParquetEnvelopeReader = js.native
  var metadata: parquetjsLib.libMetadataDotInterfaceMod.MetadataInterface = js.native
  var rowGroup: js.Array[parquetjsLib.libRowDotInterfaceMod.RowInterface] = js.native
  var rowGroupIndex: scala.Double = js.native
  var schema: parquetjsLib.libSchemaMod.ParquetSchema = js.native
  def next(): js.Promise[parquetjsLib.libRowDotInterfaceMod.RowInterface] = js.native
  def rewind(): scala.Unit = js.native
}

