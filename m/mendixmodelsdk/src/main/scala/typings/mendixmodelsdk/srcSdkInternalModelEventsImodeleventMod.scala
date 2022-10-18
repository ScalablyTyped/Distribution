package typings.mendixmodelsdk

import typings.mendixmodelsdk.mendixmodelsdkStrings.deltas
import typings.mendixmodelsdk.mendixmodelsdkStrings.fileChanges
import typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.Delta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalModelEventsImodeleventMod {
  
  trait IDeltaEvent
    extends StObject
       with IModelEvent {
    
    var deltas: js.Array[Delta]
    
    var id: Double
    
    var `type`: deltas
  }
  object IDeltaEvent {
    
    inline def apply(deltas: js.Array[Delta], id: Double): IDeltaEvent = {
      val __obj = js.Dynamic.literal(deltas = deltas.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("deltas")
      __obj.asInstanceOf[IDeltaEvent]
    }
    
    extension [Self <: IDeltaEvent](x: Self) {
      
      inline def setDeltas(value: js.Array[Delta]): Self = StObject.set(x, "deltas", value.asInstanceOf[js.Any])
      
      inline def setDeltasVarargs(value: Delta*): Self = StObject.set(x, "deltas", js.Array(value*))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: deltas): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFileEvent
    extends StObject
       with IModelEvent {
    
    var files: js.Array[String]
    
    var id: Double
    
    var `type`: fileChanges
  }
  object IFileEvent {
    
    inline def apply(files: js.Array[String], id: Double): IFileEvent = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("fileChanges")
      __obj.asInstanceOf[IFileEvent]
    }
    
    extension [Self <: IFileEvent](x: Self) {
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: fileChanges): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mendixmodelsdk.srcSdkInternalModelEventsImodeleventMod.IFileEvent
    - typings.mendixmodelsdk.srcSdkInternalModelEventsImodeleventMod.IDeltaEvent
  */
  trait IModelEvent extends StObject
  object IModelEvent {
    
    inline def IDeltaEvent(deltas: js.Array[Delta], id: Double): typings.mendixmodelsdk.srcSdkInternalModelEventsImodeleventMod.IDeltaEvent = {
      val __obj = js.Dynamic.literal(deltas = deltas.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("deltas")
      __obj.asInstanceOf[typings.mendixmodelsdk.srcSdkInternalModelEventsImodeleventMod.IDeltaEvent]
    }
    
    inline def IFileEvent(files: js.Array[String], id: Double): typings.mendixmodelsdk.srcSdkInternalModelEventsImodeleventMod.IFileEvent = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("fileChanges")
      __obj.asInstanceOf[typings.mendixmodelsdk.srcSdkInternalModelEventsImodeleventMod.IFileEvent]
    }
  }
}
