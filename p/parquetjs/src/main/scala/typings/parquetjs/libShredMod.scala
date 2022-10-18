package typings.parquetjs

import typings.parquetjs.libRowBufferDotinterfaceMod.RowBufferInterface
import typings.parquetjs.libRowDotinterfaceMod.RowInterface
import typings.parquetjs.libSchemaMod.ParquetSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShredMod {
  
  object shredder {
    
    @JSImport("parquetjs/lib/shred", "shredder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def materializeRecords(schema: ParquetSchema, buffer: RowBufferInterface): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("materializeRecords")(schema.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def shredRecord(schema: ParquetSchema, record: RowInterface, buffer: RowBufferInterface): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shredRecord")(schema.asInstanceOf[js.Any], record.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
