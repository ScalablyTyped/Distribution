package typings.phaser.Phaser.Loader.FileTypes

import typings.phaser.Phaser.Loader.File
import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Loader.MultiFile
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpineFile extends MultiFile {
  def addToCache(): js.Any = js.native
}

object SpineFile {
  @scala.inline
  def apply(
    addToCache: () => js.Any,
    addToMultiFile: File => MultiFile,
    baseURL: String,
    complete: Boolean,
    config: js.Any,
    failed: integer,
    files: js.Array[File],
    isReadyToProcess: () => Boolean,
    key: String,
    loader: LoaderPlugin,
    onFileComplete: File => Unit,
    onFileFailed: File => Unit,
    path: String,
    pending: integer,
    prefix: String,
    `type`: String
  ): SpineFile = {
    val __obj = js.Dynamic.literal(addToCache = js.Any.fromFunction0(addToCache), addToMultiFile = js.Any.fromFunction1(addToMultiFile), baseURL = baseURL.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], isReadyToProcess = js.Any.fromFunction0(isReadyToProcess), key = key.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], onFileComplete = js.Any.fromFunction1(onFileComplete), onFileFailed = js.Any.fromFunction1(onFileFailed), path = path.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpineFile]
  }
  @scala.inline
  implicit class SpineFileOps[Self <: SpineFile] (val x: Self) extends AnyVal {
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
    def setAddToCache(value: () => js.Any): Self = this.set("addToCache", js.Any.fromFunction0(value))
  }
  
}

