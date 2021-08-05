package typings.preloadjs

import typings.createjsLib.createjs.EventDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createjs {
  
  @js.native
  trait AbstractLoader
    extends StObject
       with EventDispatcher {
    
    // methods
    def cancel(): Unit = js.native
    
    var canceled: Boolean = js.native
    
    def destroy(): Unit = js.native
    
    def getItem(): js.Object = js.native
    def getItem(value: String): js.Object = js.native
    
    def getLoadedItems(): js.Array[js.Object] = js.native
    
    def getResult(): js.Object = js.native
    def getResult(value: js.Any): js.Object = js.native
    def getResult(value: js.Any, rawResult: Boolean): js.Object = js.native
    def getResult(value: Unit, rawResult: Boolean): js.Object = js.native
    
    def getTag(): js.Object = js.native
    
    def load(): Unit = js.native
    
    var loaded: Boolean = js.native
    
    var progress: Double = js.native
    
    def resultFormatter(): js.Any = js.native
    
    def setTag(tag: js.Object): Unit = js.native
    
    var `type`: String = js.native
  }
  
  trait AbstractMediaLoader extends StObject
  
  trait AbstractRequest extends StObject {
    
    def cancel(): Unit
    
    def destroy(): Unit
    
    def load(): Unit
  }
  object AbstractRequest {
    
    inline def apply(cancel: () => Unit, destroy: () => Unit, load: () => Unit): AbstractRequest = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), destroy = js.Any.fromFunction0(destroy), load = js.Any.fromFunction0(load))
      __obj.asInstanceOf[AbstractRequest]
    }
    
    extension [Self <: AbstractRequest](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setLoad(value: () => Unit): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    }
  }
  
  type BinaryLoader = AbstractLoader
  
  @js.native
  trait CSSLoader
    extends StObject
       with AbstractLoader {
    
    // methods
    def canLoadItem(item: js.Object): Boolean = js.native
  }
  
  trait ErrorEvent extends StObject {
    
    // properties
    var data: js.Object
    
    var message: String
    
    var title: String
  }
  object ErrorEvent {
    
    inline def apply(data: js.Object, message: String, title: String): ErrorEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorEvent]
    }
    
    extension [Self <: ErrorEvent](x: Self) {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type ImageLoader = AbstractLoader
  
  type JSONLoader = AbstractLoader
  
  type JSONPLoader = AbstractLoader
  
  type JavaScriptLoader = AbstractLoader
  
  trait LoadItem extends StObject {
    
    // properties
    var callback: String
    
    var crossOrigin: Boolean
    
    var data: js.Object
    
    var headers: js.Object
    
    var id: String
    
    var loadTimeout: Double
    
    var maintainOrder: Boolean
    
    var method: String
    
    var mimeType: String
    
    def set(props: js.Object): LoadItem
    
    var src: String
    
    var `type`: String
    
    var values: js.Object
    
    var withCredentials: Boolean
  }
  object LoadItem {
    
    inline def apply(
      callback: String,
      crossOrigin: Boolean,
      data: js.Object,
      headers: js.Object,
      id: String,
      loadTimeout: Double,
      maintainOrder: Boolean,
      method: String,
      mimeType: String,
      set: js.Object => LoadItem,
      src: String,
      `type`: String,
      values: js.Object,
      withCredentials: Boolean
    ): LoadItem = {
      val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], crossOrigin = crossOrigin.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loadTimeout = loadTimeout.asInstanceOf[js.Any], maintainOrder = maintainOrder.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), src = src.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadItem]
    }
    
    extension [Self <: LoadItem](x: Self) {
      
      inline def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCrossOrigin(value: Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLoadTimeout(value: Double): Self = StObject.set(x, "loadTimeout", value.asInstanceOf[js.Any])
      
      inline def setMaintainOrder(value: Boolean): Self = StObject.set(x, "maintainOrder", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setSet(value: js.Object => LoadItem): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoadQueue
    extends StObject
       with AbstractLoader {
    
    // methods
    def close(): Unit = js.native
    
    def getItems(loaded: Boolean): js.Array[js.Object] = js.native
    
    def installPlugin(plugin: js.Any): Unit = js.native
    
    def loadFile(file: String): Unit = js.native
    def loadFile(file: String, loadNow: Boolean): Unit = js.native
    def loadFile(file: String, loadNow: Boolean, basePath: String): Unit = js.native
    def loadFile(file: String, loadNow: Unit, basePath: String): Unit = js.native
    def loadFile(file: js.Object): Unit = js.native
    def loadFile(file: js.Object, loadNow: Boolean): Unit = js.native
    def loadFile(file: js.Object, loadNow: Boolean, basePath: String): Unit = js.native
    def loadFile(file: js.Object, loadNow: Unit, basePath: String): Unit = js.native
    
    def loadManifest(manifest: String): Unit = js.native
    def loadManifest(manifest: String, loadNow: Boolean): Unit = js.native
    def loadManifest(manifest: String, loadNow: Boolean, basePath: String): Unit = js.native
    def loadManifest(manifest: String, loadNow: Unit, basePath: String): Unit = js.native
    def loadManifest(manifest: js.Array[js.Any]): Unit = js.native
    def loadManifest(manifest: js.Array[js.Any], loadNow: Boolean): Unit = js.native
    def loadManifest(manifest: js.Array[js.Any], loadNow: Boolean, basePath: String): Unit = js.native
    def loadManifest(manifest: js.Array[js.Any], loadNow: Unit, basePath: String): Unit = js.native
    def loadManifest(manifest: js.Object): Unit = js.native
    def loadManifest(manifest: js.Object, loadNow: Boolean): Unit = js.native
    def loadManifest(manifest: js.Object, loadNow: Boolean, basePath: String): Unit = js.native
    def loadManifest(manifest: js.Object, loadNow: Unit, basePath: String): Unit = js.native
    
    // properties
    var maintainScriptOrder: Boolean = js.native
    
    var next: LoadQueue = js.native
    
    def registerLoader(loader: AbstractLoader): Unit = js.native
    
    def remove(idsOrUrls: String): Unit = js.native
    def remove(idsOrUrls: js.Array[js.Any]): Unit = js.native
    
    def removeAll(): Unit = js.native
    
    def reset(): Unit = js.native
    
    def setMaxConnections(value: Double): Unit = js.native
    
    def setPaused(value: Boolean): Unit = js.native
    
    def setPreferXHR(value: Boolean): Boolean = js.native
    
    /**
      * @deprecated - use 'preferXHR' property instead (or setUseXHR())
      */
    def setUseXHR(value: Boolean): Unit = js.native
    
    var stopOnError: Boolean = js.native
    
    def unregisterLoader(loader: AbstractLoader): Unit = js.native
  }
  
  type ManifestLoader = AbstractLoader
  
  trait MediaTagRequest extends StObject
  
  trait PreloadJS extends StObject
  
  trait ProgressEvent extends StObject {
    
    // properties
    var loaded: Double
    
    var progress: Double
    
    var total: Double
  }
  object ProgressEvent {
    
    inline def apply(loaded: Double, progress: Double, total: Double): ProgressEvent = {
      val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressEvent]
    }
    
    extension [Self <: ProgressEvent](x: Self) {
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestUtils extends StObject
  
  type SVGLoader = AbstractLoader
  
  type SoundLoader = AbstractLoader
  
  type SpriteSheetLoader = AbstractLoader
  
  trait TagRequest extends StObject
  
  type TextLoader = AbstractLoader
  
  type VideoLoader = AbstractLoader
  
  @js.native
  trait XHRRequest
    extends StObject
       with AbstractLoader {
    
    // methods
    def getAllResponseHeaders(): String = js.native
    
    def getResponseHeader(header: String): String = js.native
  }
  
  type XMLLoader = AbstractLoader
}
