package typings.phaser.global.spine

import typings.phaser.spine.Map
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("spine.SharedAssetManager")
@js.native
class SharedAssetManager ()
  extends StObject
     with typings.phaser.spine.SharedAssetManager {
  def this(pathPrefix: String) = this()
  
  /* private */ /* CompleteClass */
  var clientAssets: js.Any = js.native
  
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /* private */ /* CompleteClass */
  var errors: js.Any = js.native
  
  /* CompleteClass */
  override def get(clientId: String, path: String): js.Any = js.native
  
  /* CompleteClass */
  override def getErrors(): Map[String] = js.native
  
  /* CompleteClass */
  override def hasErrors(): Boolean = js.native
  
  /* CompleteClass */
  override def isLoadingComplete(clientId: String): Boolean = js.native
  
  /* CompleteClass */
  override def loadJson(clientId: String, path: String): Unit = js.native
  
  /* CompleteClass */
  override def loadText(clientId: String, path: String): Unit = js.native
  
  /* CompleteClass */
  override def loadTexture(clientId: String, textureLoader: js.Function1[/* image */ HTMLImageElement, js.Any], path: String): Unit = js.native
  
  /* private */ /* CompleteClass */
  var pathPrefix: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var queueAsset: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var queuedAssets: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var rawAssets: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var updateClientAssets: js.Any = js.native
}
