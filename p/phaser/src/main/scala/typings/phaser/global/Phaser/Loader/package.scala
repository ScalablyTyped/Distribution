package typings.phaser.global.Phaser.Loader

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.phaser.global.Phaser.Loader.^
import typings.std.XMLHttpRequest
import typings.std.XMLHttpRequestResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * File has finished processing.
  */
inline def FILE_COMPLETE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILE_COMPLETE").asInstanceOf[Double]
inline def FILE_COMPLETE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_COMPLETE")(x.asInstanceOf[js.Any])

/**
  * File has been destroyed.
  */
inline def FILE_DESTROYED: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILE_DESTROYED").asInstanceOf[Double]
inline def FILE_DESTROYED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_DESTROYED")(x.asInstanceOf[js.Any])

/**
  * The File has errored somehow during processing.
  */
inline def FILE_ERRORED: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILE_ERRORED").asInstanceOf[Double]
inline def FILE_ERRORED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_ERRORED")(x.asInstanceOf[js.Any])

/**
  * File failed to load.
  */
inline def FILE_FAILED: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILE_FAILED").asInstanceOf[Double]
inline def FILE_FAILED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_FAILED")(x.asInstanceOf[js.Any])

/**
  * File has loaded successfully, awaiting processing.
  */
inline def FILE_LOADED: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILE_LOADED").asInstanceOf[Double]
inline def FILE_LOADED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_LOADED")(x.asInstanceOf[js.Any])

/**
  * File has been started to load by the loader (onLoad called)
  */
inline def FILE_LOADING: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILE_LOADING").asInstanceOf[Double]
inline def FILE_LOADING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_LOADING")(x.asInstanceOf[js.Any])

/**
  * File is in the load queue but not yet started.
  */
inline def FILE_PENDING: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILE_PENDING").asInstanceOf[Double]
inline def FILE_PENDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_PENDING")(x.asInstanceOf[js.Any])

/**
  * File is pending being destroyed.
  */
inline def FILE_PENDING_DESTROY: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILE_PENDING_DESTROY").asInstanceOf[Double]
inline def FILE_PENDING_DESTROY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_PENDING_DESTROY")(x.asInstanceOf[js.Any])

/**
  * File was populated from local data and doesn't need an HTTP request.
  */
inline def FILE_POPULATED: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILE_POPULATED").asInstanceOf[Double]
inline def FILE_POPULATED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_POPULATED")(x.asInstanceOf[js.Any])

/**
  * File is being processed (onProcess callback)
  */
inline def FILE_PROCESSING: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("FILE_PROCESSING").asInstanceOf[Double]
inline def FILE_PROCESSING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_PROCESSING")(x.asInstanceOf[js.Any])

/**
  * Given a File and a baseURL value this returns the URL the File will use to download from.
  * @param file The File object.
  * @param baseURL A default base URL.
  */
inline def GetURL(file: typings.phaser.Phaser.Loader.File, baseURL: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("GetURL")(file.asInstanceOf[js.Any], baseURL.asInstanceOf[js.Any])).asInstanceOf[String]

/**
  * The Loader has completed loading and processing.
  */
inline def LOADER_COMPLETE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LOADER_COMPLETE").asInstanceOf[Double]
inline def LOADER_COMPLETE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADER_COMPLETE")(x.asInstanceOf[js.Any])

/**
  * The Loader has been destroyed.
  */
inline def LOADER_DESTROYED: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LOADER_DESTROYED").asInstanceOf[Double]
inline def LOADER_DESTROYED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADER_DESTROYED")(x.asInstanceOf[js.Any])

/**
  * The Loader is idle.
  */
inline def LOADER_IDLE: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LOADER_IDLE").asInstanceOf[Double]
inline def LOADER_IDLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADER_IDLE")(x.asInstanceOf[js.Any])

/**
  * The Loader is actively loading.
  */
inline def LOADER_LOADING: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LOADER_LOADING").asInstanceOf[Double]
inline def LOADER_LOADING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADER_LOADING")(x.asInstanceOf[js.Any])

/**
  * The Loader is processing files is has loaded.
  */
inline def LOADER_PROCESSING: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LOADER_PROCESSING").asInstanceOf[Double]
inline def LOADER_PROCESSING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADER_PROCESSING")(x.asInstanceOf[js.Any])

/**
  * The Loader is shutting down.
  */
inline def LOADER_SHUTDOWN: Double = ^.asInstanceOf[js.Dynamic].selectDynamic("LOADER_SHUTDOWN").asInstanceOf[Double]
inline def LOADER_SHUTDOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOADER_SHUTDOWN")(x.asInstanceOf[js.Any])

/**
  * Takes two XHRSettings Objects and creates a new XHRSettings object from them.
  * 
  * The new object is seeded by the values given in the global settings, but any setting in
  * the local object overrides the global ones.
  * @param global The global XHRSettings object.
  * @param local The local XHRSettings object.
  */
inline def MergeXHRSettings(global: XHRSettingsObject, local: XHRSettingsObject): XHRSettingsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeXHRSettings")(global.asInstanceOf[js.Any], local.asInstanceOf[js.Any])).asInstanceOf[XHRSettingsObject]

/**
  * Creates a new XMLHttpRequest (xhr) object based on the given File and XHRSettings
  * and starts the download of it. It uses the Files own XHRSettings and merges them
  * with the global XHRSettings object to set the xhr values before download.
  * @param file The File to download.
  * @param globalXHRSettings The global XHRSettings object.
  */
inline def XHRLoader(file: typings.phaser.Phaser.Loader.File, globalXHRSettings: XHRSettingsObject): XMLHttpRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("XHRLoader")(file.asInstanceOf[js.Any], globalXHRSettings.asInstanceOf[js.Any])).asInstanceOf[XMLHttpRequest]

/**
  * Creates an XHRSettings Object with default values.
  * @param responseType The responseType, such as 'text'. Default ''.
  * @param async Should the XHR request use async or not? Default true.
  * @param user Optional username for the XHR request. Default ''.
  * @param password Optional password for the XHR request. Default ''.
  * @param timeout Optional XHR timeout value. Default 0.
  * @param withCredentials Optional XHR withCredentials value. Default false.
  */
inline def XHRSettings(
  responseType: js.UndefOr[XMLHttpRequestResponseType],
  async: js.UndefOr[Boolean],
  user: js.UndefOr[String],
  password: js.UndefOr[String],
  timeout: js.UndefOr[Double],
  withCredentials: js.UndefOr[Boolean]
): XHRSettingsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("XHRSettings")(responseType.asInstanceOf[js.Any], async.asInstanceOf[js.Any], user.asInstanceOf[js.Any], password.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any], withCredentials.asInstanceOf[js.Any])).asInstanceOf[XHRSettingsObject]
