package typings.phaser.spine

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedAssetManager
  extends StObject
     with Disposable {
  
  /* private */ var clientAssets: Any
  
  /* private */ var errors: Any
  
  def get(clientId: String, path: String): Any
  
  def getErrors(): Map[String]
  
  def hasErrors(): Boolean
  
  def isLoadingComplete(clientId: String): Boolean
  
  def loadJson(clientId: String, path: String): Unit
  
  def loadText(clientId: String, path: String): Unit
  
  def loadTexture(clientId: String, textureLoader: js.Function1[/* image */ HTMLImageElement, Any], path: String): Unit
  
  /* private */ var pathPrefix: Any
  
  /* private */ var queueAsset: Any
  
  /* private */ var queuedAssets: Any
  
  /* private */ var rawAssets: Any
  
  /* private */ var updateClientAssets: Any
}
object SharedAssetManager {
  
  inline def apply(
    clientAssets: Any,
    dispose: () => Unit,
    errors: Any,
    get: (String, String) => Any,
    getErrors: () => Map[String],
    hasErrors: () => Boolean,
    isLoadingComplete: String => Boolean,
    loadJson: (String, String) => Unit,
    loadText: (String, String) => Unit,
    loadTexture: (String, js.Function1[/* image */ HTMLImageElement, Any], String) => Unit,
    pathPrefix: Any,
    queueAsset: Any,
    queuedAssets: Any,
    rawAssets: Any,
    updateClientAssets: Any
  ): SharedAssetManager = {
    val __obj = js.Dynamic.literal(clientAssets = clientAssets.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), errors = errors.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), getErrors = js.Any.fromFunction0(getErrors), hasErrors = js.Any.fromFunction0(hasErrors), isLoadingComplete = js.Any.fromFunction1(isLoadingComplete), loadJson = js.Any.fromFunction2(loadJson), loadText = js.Any.fromFunction2(loadText), loadTexture = js.Any.fromFunction3(loadTexture), pathPrefix = pathPrefix.asInstanceOf[js.Any], queueAsset = queueAsset.asInstanceOf[js.Any], queuedAssets = queuedAssets.asInstanceOf[js.Any], rawAssets = rawAssets.asInstanceOf[js.Any], updateClientAssets = updateClientAssets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedAssetManager]
  }
  
  extension [Self <: SharedAssetManager](x: Self) {
    
    inline def setClientAssets(value: Any): Self = StObject.set(x, "clientAssets", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setGet(value: (String, String) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setGetErrors(value: () => Map[String]): Self = StObject.set(x, "getErrors", js.Any.fromFunction0(value))
    
    inline def setHasErrors(value: () => Boolean): Self = StObject.set(x, "hasErrors", js.Any.fromFunction0(value))
    
    inline def setIsLoadingComplete(value: String => Boolean): Self = StObject.set(x, "isLoadingComplete", js.Any.fromFunction1(value))
    
    inline def setLoadJson(value: (String, String) => Unit): Self = StObject.set(x, "loadJson", js.Any.fromFunction2(value))
    
    inline def setLoadText(value: (String, String) => Unit): Self = StObject.set(x, "loadText", js.Any.fromFunction2(value))
    
    inline def setLoadTexture(value: (String, js.Function1[/* image */ HTMLImageElement, Any], String) => Unit): Self = StObject.set(x, "loadTexture", js.Any.fromFunction3(value))
    
    inline def setPathPrefix(value: Any): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
    
    inline def setQueueAsset(value: Any): Self = StObject.set(x, "queueAsset", value.asInstanceOf[js.Any])
    
    inline def setQueuedAssets(value: Any): Self = StObject.set(x, "queuedAssets", value.asInstanceOf[js.Any])
    
    inline def setRawAssets(value: Any): Self = StObject.set(x, "rawAssets", value.asInstanceOf[js.Any])
    
    inline def setUpdateClientAssets(value: Any): Self = StObject.set(x, "updateClientAssets", value.asInstanceOf[js.Any])
  }
}
