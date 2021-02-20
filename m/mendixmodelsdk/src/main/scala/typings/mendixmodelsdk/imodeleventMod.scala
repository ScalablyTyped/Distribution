package typings.mendixmodelsdk

import typings.mendixmodelsdk.deltasDeltasMod.Delta
import typings.mendixmodelsdk.mendixmodelsdkStrings.deltas
import typings.mendixmodelsdk.mendixmodelsdkStrings.fileChanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imodeleventMod {
  
  @js.native
  trait IDeltaEvent extends IModelEvent {
    
    var deltas: js.Array[Delta] = js.native
    
    var id: Double = js.native
    
    var `type`: deltas = js.native
  }
  object IDeltaEvent {
    
    @scala.inline
    def apply(deltas: js.Array[Delta], id: Double, `type`: deltas): IDeltaEvent = {
      val __obj = js.Dynamic.literal(deltas = deltas.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDeltaEvent]
    }
    
    @scala.inline
    implicit class IDeltaEventMutableBuilder[Self <: IDeltaEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeltas(value: js.Array[Delta]): Self = StObject.set(x, "deltas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltasVarargs(value: Delta*): Self = StObject.set(x, "deltas", js.Array(value :_*))
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: deltas): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IFileEvent extends IModelEvent {
    
    var files: js.Array[String] = js.native
    
    var id: Double = js.native
    
    var `type`: fileChanges = js.native
  }
  object IFileEvent {
    
    @scala.inline
    def apply(files: js.Array[String], id: Double, `type`: fileChanges): IFileEvent = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileEvent]
    }
    
    @scala.inline
    implicit class IFileEventMutableBuilder[Self <: IFileEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: fileChanges): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mendixmodelsdk.imodeleventMod.IFileEvent
    - typings.mendixmodelsdk.imodeleventMod.IDeltaEvent
  */
  trait IModelEvent extends StObject
  object IModelEvent {
    
    @scala.inline
    def IDeltaEvent(deltas: js.Array[Delta], id: Double, `type`: deltas): typings.mendixmodelsdk.imodeleventMod.IDeltaEvent = {
      val __obj = js.Dynamic.literal(deltas = deltas.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mendixmodelsdk.imodeleventMod.IDeltaEvent]
    }
    
    @scala.inline
    def IFileEvent(files: js.Array[String], id: Double, `type`: fileChanges): typings.mendixmodelsdk.imodeleventMod.IFileEvent = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mendixmodelsdk.imodeleventMod.IFileEvent]
    }
  }
}
