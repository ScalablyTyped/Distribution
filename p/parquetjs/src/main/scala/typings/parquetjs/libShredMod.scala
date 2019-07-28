package typings.parquetjs

import typings.parquetjs.libRowBufferDotInterfaceMod.RowBufferInterface
import typings.parquetjs.libRowDotInterfaceMod.RowInterface
import typings.parquetjs.libSchemaMod.ParquetSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/lib/shred", JSImport.Namespace)
@js.native
object libShredMod extends js.Object {
  @JSName("shredder")
  @js.native
  object shredderNs extends js.Object {
    def materializeRecords(schema: ParquetSchema, buffer: RowBufferInterface): Unit = js.native
    def shredRecord(schema: ParquetSchema, record: RowInterface, buffer: RowBufferInterface): Unit = js.native
  }
  
}

