package typings.parquetjs

import typings.parquetjs.rowBufferInterfaceMod.RowBufferInterface
import typings.parquetjs.rowInterfaceMod.RowInterface
import typings.parquetjs.schemaMod.ParquetSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parquetjs/lib/shred", JSImport.Namespace)
@js.native
object shredMod extends js.Object {
  
  @js.native
  object shredder extends js.Object {
    
    def materializeRecords(schema: ParquetSchema, buffer: RowBufferInterface): Unit = js.native
    
    def shredRecord(schema: ParquetSchema, record: RowInterface, buffer: RowBufferInterface): Unit = js.native
  }
}
