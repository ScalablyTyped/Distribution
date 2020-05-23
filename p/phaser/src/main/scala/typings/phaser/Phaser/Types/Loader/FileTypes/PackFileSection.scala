package typings.phaser.Phaser.Types.Loader.FileTypes

import typings.phaser.Phaser.Types.Loader.FileConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackFileSection extends js.Object {
  /**
    * A URL used to resolve paths in `files`. Example: 'http://labs.phaser.io/assets/'.
    */
  var baseURL: js.UndefOr[String] = js.undefined
  /**
    * The default {@link Phaser.Types.Loader.FileConfig} `type`.
    */
  var defaultType: js.UndefOr[String] = js.undefined
  /**
    * The files to load. See {@link Phaser.Types.Loader.FileTypes}.
    */
  var files: js.Array[FileConfig]
  /**
    * A URL path used to resolve relative paths in `files`. Example: 'images/sprites/'.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * An optional prefix that is automatically prepended to each file key.
    */
  var prefix: js.UndefOr[String] = js.undefined
}

object PackFileSection {
  @scala.inline
  def apply(
    files: js.Array[FileConfig],
    baseURL: String = null,
    defaultType: String = null,
    path: String = null,
    prefix: String = null
  ): PackFileSection = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL.asInstanceOf[js.Any])
    if (defaultType != null) __obj.updateDynamic("defaultType")(defaultType.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackFileSection]
  }
}

