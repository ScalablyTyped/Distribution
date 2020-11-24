package typings.phaser.spine

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedAssetManager extends Disposable {
  
  var clientAssets: js.Any = js.native
  
  var errors: js.Any = js.native
  
  def get(clientId: String, path: String): js.Any = js.native
  
  def getErrors(): Map[String] = js.native
  
  def hasErrors(): Boolean = js.native
  
  def isLoadingComplete(clientId: String): Boolean = js.native
  
  def loadJson(clientId: String, path: String): Unit = js.native
  
  def loadText(clientId: String, path: String): Unit = js.native
  
  def loadTexture(clientId: String, textureLoader: js.Function1[/* image */ HTMLImageElement, _], path: String): Unit = js.native
  
  var pathPrefix: js.Any = js.native
  
  var queueAsset: js.Any = js.native
  
  var queuedAssets: js.Any = js.native
  
  var rawAssets: js.Any = js.native
  
  var updateClientAssets: js.Any = js.native
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
    loadTexture: (String, js.Function1[/* image */ HTMLImageElement, _], String) => Unit,
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
  implicit class SharedAssetManagerOps[Self <: SharedAssetManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientAssets(value: js.Any): Self = this.set("clientAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrors(value: js.Any): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: (String, String) => js.Any): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetErrors(value: () => Map[String]): Self = this.set("getErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasErrors(value: () => Boolean): Self = this.set("hasErrors", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLoadingComplete(value: String => Boolean): Self = this.set("isLoadingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadJson(value: (String, String) => Unit): Self = this.set("loadJson", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadText(value: (String, String) => Unit): Self = this.set("loadText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLoadTexture(value: (String, js.Function1[/* image */ HTMLImageElement, _], String) => Unit): Self = this.set("loadTexture", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPathPrefix(value: js.Any): Self = this.set("pathPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueAsset(value: js.Any): Self = this.set("queueAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuedAssets(value: js.Any): Self = this.set("queuedAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawAssets(value: js.Any): Self = this.set("rawAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateClientAssets(value: js.Any): Self = this.set("updateClientAssets", value.asInstanceOf[js.Any])
  }
}
