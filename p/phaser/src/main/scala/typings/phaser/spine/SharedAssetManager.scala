package typings.phaser.spine

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedAssetManager extends Disposable {
  var clientAssets: js.Any
  var errors: js.Any
  var pathPrefix: js.Any
  var queueAsset: js.Any
  var queuedAssets: js.Any
  var rawAssets: js.Any
  var updateClientAssets: js.Any
  def get(clientId: String, path: String): js.Any
  def getErrors(): Map[String]
  def hasErrors(): Boolean
  def isLoadingComplete(clientId: String): Boolean
  def loadJson(clientId: String, path: String): Unit
  def loadText(clientId: String, path: String): Unit
  def loadTexture(clientId: String, textureLoader: js.Function1[/* image */ HTMLImageElement, _], path: String): Unit
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
}

