package typings.monacoEditor.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object worker {
  
  @js.native
  trait IMirrorModel extends StObject {
    
    def getValue(): String = js.native
    
    val uri: Uri = js.native
    
    val version: Double = js.native
  }
  object IMirrorModel {
    
    @scala.inline
    def apply(getValue: () => String, uri: Uri, version: Double): IMirrorModel = {
      val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction0(getValue), uri = uri.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMirrorModel]
    }
    
    @scala.inline
    implicit class IMirrorModelMutableBuilder[Self <: IMirrorModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetValue(value: () => String): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IWorkerContext[H] extends StObject {
    
    /**
      * Get all available mirror models in this worker.
      */
    def getMirrorModels(): js.Array[IMirrorModel] = js.native
    
    /**
      * A proxy to the main thread host object.
      */
    var host: H = js.native
  }
  object IWorkerContext {
    
    @scala.inline
    def apply[H](getMirrorModels: () => js.Array[IMirrorModel], host: H): IWorkerContext[H] = {
      val __obj = js.Dynamic.literal(getMirrorModels = js.Any.fromFunction0(getMirrorModels), host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWorkerContext[H]]
    }
    
    @scala.inline
    implicit class IWorkerContextMutableBuilder[Self <: IWorkerContext[_], H] (val x: Self with IWorkerContext[H]) extends AnyVal {
      
      @scala.inline
      def setGetMirrorModels(value: () => js.Array[IMirrorModel]): Self = StObject.set(x, "getMirrorModels", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHost(value: H): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    }
  }
}
