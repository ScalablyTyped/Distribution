package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatasetDeltaInspectorMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dataset/DeltaInspector", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DeltaInspector
  @JSImport("@nginstack/engine/lib/dataset/DeltaInspector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DBKey = typings.nginstackEngine.libDbkeyDbkeyMod.^
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  @js.native
  trait DeltaInspector extends StObject {
    
    def getCurrentRecord(key: Double): Any = js.native
    def getCurrentRecord(key: DBKey): Any = js.native
    
    def getDeletedRecords(): RecordIterator = js.native
    
    def getInsertedRecords(): RecordIterator = js.native
    
    def getOriginalRecord(key: Double): Any = js.native
    def getOriginalRecord(key: DBKey): Any = js.native
    
    def getUpdatedRecords(): RecordIterator = js.native
  }
  
  type RecordIterator = typings.nginstackEngine.libDatasetRecordIteratorMod.^
}
