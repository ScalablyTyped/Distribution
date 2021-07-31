package typings.phaser.spine

import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedAssetManager
  extends StObject
     with Disposable {
  
  var clientAssets: js.Any
  
  var errors: js.Any
  
  def get(clientId: String, path: String): js.Any
  
  def getErrors(): Map[String]
  
  def hasErrors(): Boolean
  
  def isLoadingComplete(clientId: String): Boolean
  
  def loadJson(clientId: String, path: String): Unit
  
  def loadText(clientId: String, path: String): Unit
  
  def loadTexture(clientId: String, textureLoader: js.Function1[/* image */ HTMLImageElement, js.Any], path: String): Unit
  
  var pathPrefix: js.Any
  
  var queueAsset: js.Any
  
  var queuedAssets: js.Any
  
  var rawAssets: js.Any
  
  var updateClientAssets: js.Any
}
object SharedAssetManager {
  
  @scala.inline
  def apply(
    clientAssets: js.Any,
    dispose: () => Unit,
    errors: js.Any,
    get: (String, String) => js.Any,
    getErrors: () => Map[String],
    hasErrors: () => Boolean,
    isLoadingComplete: String => Boolean,
    loadJson: (String, String) => Unit,
    loadText: (String, String) => Unit,
    loadTexture: (String, js.Function1[/* image */ HTMLImageElement, js.Any], String) => Unit,
    pathPrefix: js.Any,
    queueAsset: js.Any,
    queuedAssets: js.Any,
    rawAssets: js.Any,
    updateClientAssets: js.Any
  ): SharedAssetManager = {
    val __obj = js.Dynamic.literal(clientAssets = clientAssets.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), errors = errors.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), getErrors = js.Any.fromFunction0(getErrors), hasErrors = js.Any.fromFunction0(hasErrors), isLoadingComplete = js.Any.fromFunction1(isLoadingComplete), loadJson = js.Any.fromFunction2(loadJson), loadText = js.Any.fromFunction2(loadText), loadTexture = js.Any.fromFunction3(loadTexture), pathPrefix = pathPrefix.asInstanceOf[js.Any], queueAsset = queueAsset.asInstanceOf[js.Any], queuedAssets = queuedAssets.asInstanceOf[js.Any], rawAssets = rawAssets.asInstanceOf[js.Any], updateClientAssets = updateClientAssets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedAssetManager]
  }
  
  @scala.inline
  implicit class SharedAssetManagerMutableBuilder[Self <: SharedAssetManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientAssets(value: js.Any): Self = StObject.set(x, "clientAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: js.Any): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: (String, String) => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetErrors(value: () => Map[String]): Self = StObject.set(x, "getErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasErrors(value: () => Boolean): Self = StObject.set(x, "hasErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLoadingComplete(value: String => Boolean): Self = StObject.set(x, "isLoadingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadJson(value: (String, String) => Unit): Self = StObject.set(x, "loadJson", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadText(value: (String, String) => Unit): Self = StObject.set(x, "loadText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadTexture(value: (String, js.Function1[/* image */ HTMLImageElement, js.Any], String) => Unit): Self = StObject.set(x, "loadTexture", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPathPrefix(value: js.Any): Self = StObject.set(x, "pathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueAsset(value: js.Any): Self = StObject.set(x, "queueAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuedAssets(value: js.Any): Self = StObject.set(x, "queuedAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawAssets(value: js.Any): Self = StObject.set(x, "rawAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateClientAssets(value: js.Any): Self = StObject.set(x, "updateClientAssets", value.asInstanceOf[js.Any])
  }
}
