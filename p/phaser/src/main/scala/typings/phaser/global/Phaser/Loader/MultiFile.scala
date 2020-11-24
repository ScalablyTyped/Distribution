package typings.phaser.global.Phaser.Loader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A MultiFile is a special kind of parent that contains two, or more, Files as children and looks after
  * the loading and processing of them all. It is commonly extended and used as a base class for file types such as AtlasJSON or BitmapFont.
  * 
  * You shouldn't create an instance of a MultiFile directly, but should extend it with your own class, setting a custom type and processing methods.
  */
@JSGlobal("Phaser.Loader.MultiFile")
@js.native
class MultiFile protected ()
  extends typings.phaser.Phaser.Loader.MultiFile {
  /**
    * 
    * @param loader The Loader that is going to load this File.
    * @param type The file type string for sorting within the Loader.
    * @param key The key of the file within the loader.
    * @param files An array of Files that make-up this MultiFile.
    */
  def this(
    loader: typings.phaser.Phaser.Loader.LoaderPlugin,
    `type`: String,
    key: String,
    files: js.Array[typings.phaser.Phaser.Loader.File]
  ) = this()
}
