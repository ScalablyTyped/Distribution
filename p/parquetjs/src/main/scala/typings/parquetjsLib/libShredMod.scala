package typings
package parquetjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/shred", JSImport.Namespace)
@js.native
object libShredMod extends js.Object {
  @JSName("shredder")
  @js.native
  object shredderNs extends js.Object {
    def materializeRecords(
      schema: parquetjsLib.libSchemaMod.ParquetSchema,
      buffer: parquetjsLib.libRowBufferDotInterfaceMod.RowBufferInterface
    ): scala.Unit = js.native
    def shredRecord(
      schema: parquetjsLib.libSchemaMod.ParquetSchema,
      record: parquetjsLib.libRowDotInterfaceMod.RowInterface,
      buffer: parquetjsLib.libRowBufferDotInterfaceMod.RowBufferInterface
    ): scala.Unit = js.native
  }
  
}

