package typings.preloadjs

import typings.createjsLib.createjs.EventDispatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createjs {
  
  @js.native
  trait AbstractLoader extends EventDispatcher {
    
    // methods
    def cancel(): Unit = js.native
    
    var canceled: Boolean = js.native
    
    def destroy(): Unit = js.native
    
    def getItem(): js.Object = js.native
    def getItem(value: String): js.Object = js.native
    
    def getLoadedItems(): js.Array[js.Object] = js.native
    
    def getResult(): js.Object = js.native
    def getResult(value: js.UndefOr[scala.Nothing], rawResult: Boolean): js.Object = js.native
    def getResult(value: js.Any): js.Object = js.native
    def getResult(value: js.Any, rawResult: Boolean): js.Object = js.native
    
    def getTag(): js.Object = js.native
    
    def load(): Unit = js.native
    
    var loaded: Boolean = js.native
    
    var progress: Double = js.native
    
    def resultFormatter(): js.Any = js.native
    
    def setTag(tag: js.Object): Unit = js.native
    
    var `type`: String = js.native
  }
  
  @js.native
  trait AbstractMediaLoader extends StObject
  
  @js.native
  trait AbstractRequest extends StObject {
    
    def cancel(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def load(): Unit = js.native
  }
  object AbstractRequest {
    
    @scala.inline
    def apply(cancel: () => Unit, destroy: () => Unit, load: () => Unit): AbstractRequest = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), destroy = js.Any.fromFunction0(destroy), load = js.Any.fromFunction0(load))
      __obj.asInstanceOf[AbstractRequest]
    }
    
    @scala.inline
    implicit class AbstractRequestMutableBuilder[Self <: AbstractRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoad(value: () => Unit): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    }
  }
  
  type BinaryLoader = AbstractLoader
  
  @js.native
  trait CSSLoader extends AbstractLoader {
    
    // methods
    def canLoadItem(item: js.Object): Boolean = js.native
  }
  
  @js.native
  trait ErrorEvent extends StObject {
    
    // properties
    var data: js.Object = js.native
    
    var message: String = js.native
    
    var title: String = js.native
  }
  object ErrorEvent {
    
    @scala.inline
    def apply(data: js.Object, message: String, title: String): ErrorEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorEvent]
    }
    
    @scala.inline
    implicit class ErrorEventMutableBuilder[Self <: ErrorEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type ImageLoader = AbstractLoader
  
  type JSONLoader = AbstractLoader
  
  type JSONPLoader = AbstractLoader
  
  type JavaScriptLoader = AbstractLoader
  
  @js.native
  trait LoadItem extends StObject {
    
    // properties
    var callback: String = js.native
    
    var crossOrigin: Boolean = js.native
    
    var data: js.Object = js.native
    
    var headers: js.Object = js.native
    
    var id: String = js.native
    
    var loadTimeout: Double = js.native
    
    var maintainOrder: Boolean = js.native
    
    var method: String = js.native
    
    var mimeType: String = js.native
    
    def set(props: js.Object): LoadItem = js.native
    
    var src: String = js.native
    
    var `type`: String = js.native
    
    var values: js.Object = js.native
    
    var withCredentials: Boolean = js.native
  }
  object LoadItem {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class LoadItemMutableBuilder[Self <: LoadItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOrigin(value: Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadTimeout(value: Double): Self = StObject.set(x, "loadTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainOrder(value: Boolean): Self = StObject.set(x, "maintainOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: js.Object => LoadItem): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoadQueue extends AbstractLoader {
    
    // methods
    def close(): Unit = js.native
    
    def getItems(loaded: Boolean): js.Array[js.Object] = js.native
    
    def installPlugin(plugin: js.Any): Unit = js.native
    
    def loadFile(file: String): Unit = js.native
    def loadFile(file: String, loadNow: js.UndefOr[scala.Nothing], basePath: String): Unit = js.native
    def loadFile(file: String, loadNow: Boolean): Unit = js.native
    def loadFile(file: String, loadNow: Boolean, basePath: String): Unit = js.native
    def loadFile(file: js.Object): Unit = js.native
    def loadFile(file: js.Object, loadNow: js.UndefOr[scala.Nothing], basePath: String): Unit = js.native
    def loadFile(file: js.Object, loadNow: Boolean): Unit = js.native
    def loadFile(file: js.Object, loadNow: Boolean, basePath: String): Unit = js.native
    
    def loadManifest(manifest: String): Unit = js.native
    def loadManifest(manifest: String, loadNow: js.UndefOr[scala.Nothing], basePath: String): Unit = js.native
    def loadManifest(manifest: String, loadNow: Boolean): Unit = js.native
    def loadManifest(manifest: String, loadNow: Boolean, basePath: String): Unit = js.native
    def loadManifest(manifest: js.Array[_]): Unit = js.native
    def loadManifest(manifest: js.Array[_], loadNow: js.UndefOr[scala.Nothing], basePath: String): Unit = js.native
    def loadManifest(manifest: js.Array[_], loadNow: Boolean): Unit = js.native
    def loadManifest(manifest: js.Array[_], loadNow: Boolean, basePath: String): Unit = js.native
    def loadManifest(manifest: js.Object): Unit = js.native
    def loadManifest(manifest: js.Object, loadNow: js.UndefOr[scala.Nothing], basePath: String): Unit = js.native
    def loadManifest(manifest: js.Object, loadNow: Boolean): Unit = js.native
    def loadManifest(manifest: js.Object, loadNow: Boolean, basePath: String): Unit = js.native
    
    // properties
    var maintainScriptOrder: Boolean = js.native
    
    var next: LoadQueue = js.native
    
    def registerLoader(loader: AbstractLoader): Unit = js.native
    
    def remove(idsOrUrls: String): Unit = js.native
    def remove(idsOrUrls: js.Array[_]): Unit = js.native
    
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
  
  @js.native
  trait MediaTagRequest extends StObject
  
  @js.native
  trait PreloadJS extends StObject
  
  @js.native
  trait ProgressEvent extends StObject {
    
    // properties
    var loaded: Double = js.native
    
    var progress: Double = js.native
    
    var total: Double = js.native
  }
  object ProgressEvent {
    
    @scala.inline
    def apply(loaded: Double, progress: Double, total: Double): ProgressEvent = {
      val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressEvent]
    }
    
    @scala.inline
    implicit class ProgressEventMutableBuilder[Self <: ProgressEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestUtils extends StObject
  
  type SVGLoader = AbstractLoader
  
  type SoundLoader = AbstractLoader
  
  type SpriteSheetLoader = AbstractLoader
  
  @js.native
  trait TagRequest extends StObject
  
  type TextLoader = AbstractLoader
  
  type VideoLoader = AbstractLoader
  
  @js.native
  trait XHRRequest extends AbstractLoader {
    
    // methods
    def getAllResponseHeaders(): String = js.native
    
    def getResponseHeader(header: String): String = js.native
  }
  
  type XMLLoader = AbstractLoader
}
