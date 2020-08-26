package typings.phaser.Phaser.Loader

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A MultiFile is a special kind of parent that contains two, or more, Files as children and looks after
  * the loading and processing of them all. It is commonly extended and used as a base class for file types such as AtlasJSON or BitmapFont.
  * 
  * You shouldn't create an instance of a MultiFile directly, but should extend it with your own class, setting a custom type and processing methods.
  */
@js.native
trait MultiFile extends js.Object {
  /**
    * A reference to the Loaders baseURL at the time this MultiFile was created.
    * Used to populate child-files.
    */
  var baseURL: String = js.native
  /**
    * The completion status of this MultiFile.
    */
  var complete: Boolean = js.native
  /**
    * A storage container for transient data that the loading files need.
    */
  var config: js.Any = js.native
  /**
    * The number of files that failed to load.
    */
  var failed: integer = js.native
  /**
    * Array of files that make up this MultiFile.
    */
  var files: js.Array[File] = js.native
  /**
    * Unique cache key (unique within its file type)
    */
  var key: String = js.native
  /**
    * A reference to the Loader that is going to load this file.
    */
  var loader: LoaderPlugin = js.native
  /**
    * A reference to the Loaders path at the time this MultiFile was created.
    * Used to populate child-files.
    */
  var path: String = js.native
  /**
    * The number of files to load.
    */
  var pending: integer = js.native
  /**
    * A reference to the Loaders prefix at the time this MultiFile was created.
    * Used to populate child-files.
    */
  var prefix: String = js.native
  /**
    * The file type string for sorting within the Loader.
    */
  var `type`: String = js.native
  /**
    * Adds another child to this MultiFile, increases the pending count and resets the completion status.
    * @param files The File to add to this MultiFile.
    */
  def addToMultiFile(files: File): MultiFile = js.native
  /**
    * Checks if this MultiFile is ready to process its children or not.
    */
  def isReadyToProcess(): Boolean = js.native
  /**
    * Called by each File when it finishes loading.
    * @param file The File that has completed processing.
    */
  def onFileComplete(file: File): Unit = js.native
  /**
    * Called by each File that fails to load.
    * @param file The File that has failed to load.
    */
  def onFileFailed(file: File): Unit = js.native
}

object MultiFile {
  @scala.inline
  def apply(
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
  ): MultiFile = {
    val __obj = js.Dynamic.literal(addToMultiFile = js.Any.fromFunction1(addToMultiFile), baseURL = baseURL.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], isReadyToProcess = js.Any.fromFunction0(isReadyToProcess), key = key.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], onFileComplete = js.Any.fromFunction1(onFileComplete), onFileFailed = js.Any.fromFunction1(onFileFailed), path = path.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFile]
  }
  @scala.inline
  implicit class MultiFileOps[Self <: MultiFile] (val x: Self) extends AnyVal {
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
    def setAddToMultiFile(value: File => MultiFile): Self = this.set("addToMultiFile", js.Any.fromFunction1(value))
    @scala.inline
    def setBaseURL(value: String): Self = this.set("baseURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: js.Any): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailed(value: integer): Self = this.set("failed", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilesVarargs(value: File*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[File]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsReadyToProcess(value: () => Boolean): Self = this.set("isReadyToProcess", js.Any.fromFunction0(value))
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoader(value: LoaderPlugin): Self = this.set("loader", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnFileComplete(value: File => Unit): Self = this.set("onFileComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setOnFileFailed(value: File => Unit): Self = this.set("onFileFailed", js.Any.fromFunction1(value))
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPending(value: integer): Self = this.set("pending", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

