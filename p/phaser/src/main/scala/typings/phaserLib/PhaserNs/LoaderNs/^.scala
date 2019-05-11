package typings
package phaserLib.PhaserNs.LoaderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Loader")
@js.native
object ^ extends js.Object {
  /**
    * File has finished processing.
    */
  var FILE_COMPLETE: phaserLib.integer = js.native
  /**
    * File has been destroyed
    */
  var FILE_DESTROYED: phaserLib.integer = js.native
  /**
    * The File has errored somehow during processing.
    */
  var FILE_ERRORED: phaserLib.integer = js.native
  /**
    * File failed to load
    */
  var FILE_FAILED: phaserLib.integer = js.native
  /**
    * File has loaded successfully, awaiting processing
    */
  var FILE_LOADED: phaserLib.integer = js.native
  /**
    * File has been started to load by the loader (onLoad called)
    */
  var FILE_LOADING: phaserLib.integer = js.native
  /**
    * File is in the load queue but not yet started
    */
  var FILE_PENDING: phaserLib.integer = js.native
  /**
    * File was populated from local data and doesn't need an HTTP request
    */
  var FILE_POPULATED: phaserLib.integer = js.native
  /**
    * File is being processed (onProcess callback)
    */
  var FILE_PROCESSING: phaserLib.integer = js.native
  /**
    * The Loader has completed loading and processing.
    */
  var LOADER_COMPLETE: phaserLib.integer = js.native
  /**
    * The Loader has been destroyed.
    */
  var LOADER_DESTROYED: phaserLib.integer = js.native
  /**
    * The Loader is idle.
    */
  var LOADER_IDLE: phaserLib.integer = js.native
  /**
    * The Loader is actively loading.
    */
  var LOADER_LOADING: phaserLib.integer = js.native
  /**
    * The Loader is processing files is has loaded.
    */
  var LOADER_PROCESSING: phaserLib.integer = js.native
  /**
    * The Loader is shutting down.
    */
  var LOADER_SHUTDOWN: phaserLib.integer = js.native
  /**
    * Given a File and a baseURL value this returns the URL the File will use to download from.
    * @param file The File object.
    * @param baseURL A default base URL.
    */
  def GetURL(file: File, baseURL: java.lang.String): java.lang.String = js.native
  /**
    * Takes two XHRSettings Objects and creates a new XHRSettings object from them.
    * 
    * The new object is seeded by the values given in the global settings, but any setting in
    * the local object overrides the global ones.
    * @param global The global XHRSettings object.
    * @param local The local XHRSettings object.
    */
  def MergeXHRSettings(
    global: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject,
    local: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject
  ): phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = js.native
  /**
    * Creates a new XMLHttpRequest (xhr) object based on the given File and XHRSettings
    * and starts the download of it. It uses the Files own XHRSettings and merges them
    * with the global XHRSettings object to set the xhr values before download.
    * @param file The File to download.
    * @param globalXHRSettings The global XHRSettings object.
    */
  def XHRLoader(file: File, globalXHRSettings: phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject): stdLib.XMLHttpRequest = js.native
  /**
    * Creates an XHRSettings Object with default values.
    * @param responseType The responseType, such as 'text'. Default ''.
    * @param async Should the XHR request use async or not? Default true.
    * @param user Optional username for the XHR request. Default ''.
    * @param password Optional password for the XHR request. Default ''.
    * @param timeout Optional XHR timeout value. Default 0.
    */
  def XHRSettings(): phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = js.native
  def XHRSettings(responseType: stdLib.XMLHttpRequestResponseType): phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = js.native
  def XHRSettings(responseType: stdLib.XMLHttpRequestResponseType, async: scala.Boolean): phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = js.native
  def XHRSettings(responseType: stdLib.XMLHttpRequestResponseType, async: scala.Boolean, user: java.lang.String): phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = js.native
  def XHRSettings(
    responseType: stdLib.XMLHttpRequestResponseType,
    async: scala.Boolean,
    user: java.lang.String,
    password: java.lang.String
  ): phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = js.native
  def XHRSettings(
    responseType: stdLib.XMLHttpRequestResponseType,
    async: scala.Boolean,
    user: java.lang.String,
    password: java.lang.String,
    timeout: phaserLib.integer
  ): phaserLib.PhaserNs.TypesNs.LoaderNs.XHRSettingsObject = js.native
}

