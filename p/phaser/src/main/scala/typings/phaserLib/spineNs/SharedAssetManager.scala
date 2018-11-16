package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.SharedAssetManager")
@js.native
class SharedAssetManager () extends Disposable {
  def this(pathPrefix: java.lang.String) = this()
  var clientAssets: js.Any = js.native
  var errors: js.Any = js.native
  var pathPrefix: js.Any = js.native
  var queuedAssets: js.Any = js.native
  var rawAssets: js.Any = js.native
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  def get(clientId: java.lang.String, path: java.lang.String): js.Any = js.native
  def getErrors(): Map[java.lang.String] = js.native
  def hasErrors(): scala.Boolean = js.native
  def isLoadingComplete(clientId: java.lang.String): scala.Boolean = js.native
  def loadJson(clientId: java.lang.String, path: java.lang.String): scala.Unit = js.native
  def loadText(clientId: java.lang.String, path: java.lang.String): scala.Unit = js.native
  def loadTexture(
    clientId: java.lang.String,
    textureLoader: js.Function1[/* image */ stdLib.HTMLImageElement, _],
    path: java.lang.String
  ): scala.Unit = js.native
  /* private */ def queueAsset(clientId: js.Any, textureLoader: js.Any, path: js.Any): js.Any = js.native
  /* private */ def updateClientAssets(clientAssets: js.Any): js.Any = js.native
}

