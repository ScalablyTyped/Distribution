package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object worker {
  
  trait IMirrorModel
    extends StObject
       with IMirrorTextModel {
    
    def getValue(): String
    
    val uri: Uri
  }
  object IMirrorModel {
    
    inline def apply(getValue: () => String, uri: Uri, version: Double): IMirrorModel = {
      val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMirrorModel]
    }
    
    extension [Self <: IMirrorModel](x: Self) {
      
      inline def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMirrorTextModel extends StObject {
    
    val version: Double
  }
  object IMirrorTextModel {
    
    inline def apply(version: Double): IMirrorTextModel = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMirrorTextModel]
    }
    
    extension [Self <: IMirrorTextModel](x: Self) {
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait IWorkerContext[H] extends StObject {
    
    /**
      * Get all available mirror models in this worker.
      */
    def getMirrorModels(): js.Array[IMirrorModel]
    
    /**
      * A proxy to the main thread host object.
      */
    var host: H
  }
  object IWorkerContext {
    
    inline def apply[H](getMirrorModels: () => js.Array[IMirrorModel], host: H): IWorkerContext[H] = {
      val __obj = js.Dynamic.literal(getMirrorModels = js.Any.fromFunction0(getMirrorModels), host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWorkerContext[H]]
    }
    
    extension [Self <: IWorkerContext[?], H](x: Self & IWorkerContext[H]) {
      
      inline def setGetMirrorModels(value: () => js.Array[IMirrorModel]): Self = StObject.set(x, "getMirrorModels", js.Any.fromFunction0(value))
      
      inline def setHost(value: H): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    }
  }
}
