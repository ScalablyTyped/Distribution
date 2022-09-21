package typings.phaser.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Loader.File
import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Loader.MultiFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Audio Sprite File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#audioSprite method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#audioSprite.
  */
trait AudioSpriteFile
  extends StObject
     with MultiFile {
  
  /**
    * Adds this file to its target cache upon successful loading and processing.
    */
  def addToCache(): Unit
}
object AudioSpriteFile {
  
  inline def apply(
    addToCache: () => Unit,
    addToMultiFile: File => MultiFile,
    baseURL: String,
    complete: Boolean,
    config: Any,
    failed: Double,
    files: js.Array[File],
    isReadyToProcess: () => Boolean,
    key: String,
    loader: LoaderPlugin,
    onFileComplete: File => Unit,
    onFileFailed: File => Unit,
    path: String,
    pending: Double,
    prefix: String,
    `type`: String
  ): AudioSpriteFile = {
    val __obj = js.Dynamic.literal(addToCache = js.Any.fromFunction0(addToCache), addToMultiFile = js.Any.fromFunction1(addToMultiFile), baseURL = baseURL.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], isReadyToProcess = js.Any.fromFunction0(isReadyToProcess), key = key.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], onFileComplete = js.Any.fromFunction1(onFileComplete), onFileFailed = js.Any.fromFunction1(onFileFailed), path = path.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioSpriteFile]
  }
  
  extension [Self <: AudioSpriteFile](x: Self) {
    
    inline def setAddToCache(value: () => Unit): Self = StObject.set(x, "addToCache", js.Any.fromFunction0(value))
  }
}
