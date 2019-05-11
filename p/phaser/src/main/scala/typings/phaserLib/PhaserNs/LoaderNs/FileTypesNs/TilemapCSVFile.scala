package typings
package phaserLib.PhaserNs.LoaderNs.FileTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Tilemap CSV File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#tilemapCSV method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#tilemapCSV.
  */
@JSGlobal("Phaser.Loader.FileTypes.TilemapCSVFile")
@js.native
class TilemapCSVFile protected ()
  extends phaserLib.PhaserNs.LoaderNs.File {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.csv`, i.e. if `key` was "alien" then the URL will be "alien.csv".
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.TilemapCSVFileConfig) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.TilemapCSVFileConfig, url: java.lang.String) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: java.lang.String, url: java.lang.String, xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
  def this(loader: phaserLib.PhaserNs.LoaderNs.LoaderPlugin, key: phaserLib.PhaserNs.TypesNs.LoaderNs.FileTypesNs.TilemapCSVFileConfig, url: java.lang.String, xhrSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject) = this()
}

