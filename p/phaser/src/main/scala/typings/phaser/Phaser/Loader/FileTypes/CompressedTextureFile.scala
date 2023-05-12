package typings.phaser.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Loader.File
import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Loader.MultiFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Compressed Texture File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#texture method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#texture.
  */
trait CompressedTextureFile
  extends StObject
     with MultiFile {
  
  /**
    * Adds all of the multi-file entties to their target caches upon successful loading and processing.
    */
  def addMultiToCache(): Unit
  
  /**
    * Adds this file to its target cache upon successful loading and processing.
    */
  def addToCache(): Unit
}
object CompressedTextureFile {
  
  inline def apply(
    addMultiToCache: () => Unit,
    addToCache: () => Unit,
    addToMultiFile: File => MultiFile,
    baseURL: String,
    complete: Boolean,
    config: Any,
    destroy: () => Unit,
    failed: Double,
    files: js.Array[File],
    isReadyToProcess: () => Boolean,
    key: String,
    loader: LoaderPlugin,
    onFileComplete: File => Unit,
    onFileFailed: File => Unit,
    path: String,
    pending: Double,
    pendingDestroy: () => Unit,
    prefix: String,
    state: Double,
    `type`: String
  ): CompressedTextureFile = {
    val __obj = js.Dynamic.literal(addMultiToCache = js.Any.fromFunction0(addMultiToCache), addToCache = js.Any.fromFunction0(addToCache), addToMultiFile = js.Any.fromFunction1(addToMultiFile), baseURL = baseURL.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), failed = failed.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], isReadyToProcess = js.Any.fromFunction0(isReadyToProcess), key = key.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], onFileComplete = js.Any.fromFunction1(onFileComplete), onFileFailed = js.Any.fromFunction1(onFileFailed), path = path.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pendingDestroy = js.Any.fromFunction0(pendingDestroy), prefix = prefix.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressedTextureFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompressedTextureFile] (val x: Self) extends AnyVal {
    
    inline def setAddMultiToCache(value: () => Unit): Self = StObject.set(x, "addMultiToCache", js.Any.fromFunction0(value))
    
    inline def setAddToCache(value: () => Unit): Self = StObject.set(x, "addToCache", js.Any.fromFunction0(value))
  }
}
