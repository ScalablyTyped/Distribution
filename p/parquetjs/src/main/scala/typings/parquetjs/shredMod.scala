package typings.parquetjs

import typings.parquetjs.rowBufferInterfaceMod.RowBufferInterface
import typings.parquetjs.rowInterfaceMod.RowInterface
import typings.parquetjs.schemaMod.ParquetSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shredMod {
  
  object shredder {
    
    @JSImport("parquetjs/lib/shred", "shredder.materializeRecords")
    @js.native
    def materializeRecords(schema: ParquetSchema, buffer: RowBufferInterface): Unit = js.native
    
    @JSImport("parquetjs/lib/shred", "shredder.shredRecord")
    @js.native
    def shredRecord(schema: ParquetSchema, record: RowInterface, buffer: RowBufferInterface): Unit = js.native
  }
}
