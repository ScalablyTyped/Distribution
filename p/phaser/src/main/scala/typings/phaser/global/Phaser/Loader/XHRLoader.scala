package typings.phaser.global.Phaser.Loader

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Loader.XHRLoader")
@js.native
object XHRLoader extends js.Object {
  /**
    * Creates a new XMLHttpRequest (xhr) object based on the given File and XHRSettings
    * and starts the download of it. It uses the Files own XHRSettings and merges them
    * with the global XHRSettings object to set the xhr values before download.
    * @param file The File to download.
    * @param globalXHRSettings The global XHRSettings object.
    */
  def apply(file: typings.phaser.Phaser.Loader.File, globalXHRSettings: XHRSettingsObject): XMLHttpRequest = js.native
}

