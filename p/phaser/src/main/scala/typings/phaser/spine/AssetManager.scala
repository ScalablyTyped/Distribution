package typings.phaser.spine

import typings.std.HTMLImageElement
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetManager
  extends StObject
     with Disposable {
  
  /* private */ var assets: js.Any = js.native
  
  /* private */ var errors: js.Any = js.native
  
  def get(path: String): js.Any = js.native
  
  def getErrors(): Map[String] = js.native
  
  def getLoaded(): Double = js.native
  
  def getToLoad(): Double = js.native
  
  def hasErrors(): Boolean = js.native
  
  def isLoadingComplete(): Boolean = js.native
  
  def loadBinary(path: String): Unit = js.native
  def loadBinary(path: String, success: js.Function2[/* path */ String, /* binary */ Uint8Array, Unit]): Unit = js.native
  def loadBinary(
    path: String,
    success: js.Function2[/* path */ String, /* binary */ Uint8Array, Unit],
    error: js.Function2[/* path */ String, /* error */ String, Unit]
  ): Unit = js.native
  def loadBinary(path: String, success: Unit, error: js.Function2[/* path */ String, /* error */ String, Unit]): Unit = js.native
  
  def loadText(path: String): Unit = js.native
  def loadText(path: String, success: js.Function2[/* path */ String, /* text */ String, Unit]): Unit = js.native
  def loadText(
    path: String,
    success: js.Function2[/* path */ String, /* text */ String, Unit],
    error: js.Function2[/* path */ String, /* error */ String, Unit]
  ): Unit = js.native
  def loadText(path: String, success: Unit, error: js.Function2[/* path */ String, /* error */ String, Unit]): Unit = js.native
  
  def loadTexture(path: String): Unit = js.native
  def loadTexture(path: String, success: js.Function2[/* path */ String, /* image */ HTMLImageElement, Unit]): Unit = js.native
  def loadTexture(
    path: String,
    success: js.Function2[/* path */ String, /* image */ HTMLImageElement, Unit],
    error: js.Function2[/* path */ String, /* error */ String, Unit]
  ): Unit = js.native
  def loadTexture(path: String, success: Unit, error: js.Function2[/* path */ String, /* error */ String, Unit]): Unit = js.native
  
  def loadTextureAtlas(path: String): Unit = js.native
  def loadTextureAtlas(path: String, success: js.Function2[/* path */ String, /* atlas */ TextureAtlas, Unit]): Unit = js.native
  def loadTextureAtlas(
    path: String,
    success: js.Function2[/* path */ String, /* atlas */ TextureAtlas, Unit],
    error: js.Function2[/* path */ String, /* error */ String, Unit]
  ): Unit = js.native
  def loadTextureAtlas(path: String, success: Unit, error: js.Function2[/* path */ String, /* error */ String, Unit]): Unit = js.native
  
  def loadTextureData(path: String, data: String): Unit = js.native
  def loadTextureData(
    path: String,
    data: String,
    success: js.Function2[/* path */ String, /* image */ HTMLImageElement, Unit]
  ): Unit = js.native
  def loadTextureData(
    path: String,
    data: String,
    success: js.Function2[/* path */ String, /* image */ HTMLImageElement, Unit],
    error: js.Function2[/* path */ String, /* error */ String, Unit]
  ): Unit = js.native
  def loadTextureData(
    path: String,
    data: String,
    success: Unit,
    error: js.Function2[/* path */ String, /* error */ String, Unit]
  ): Unit = js.native
  
  /* private */ var loaded: js.Any = js.native
  
  /* private */ var pathPrefix: js.Any = js.native
  
  def remove(path: String): Unit = js.native
  
  def removeAll(): Unit = js.native
  
  /* private */ var textureLoader: js.Any = js.native
  
  /* private */ var toLoad: js.Any = js.native
}
