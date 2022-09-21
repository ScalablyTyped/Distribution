package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the resource of a Bundle Asset, which contains an index that maps URLs to blob URLs.
  *
  * @ignore
  */
@JSImport("playcanvas", "Bundle")
@js.native
open class Bundle protected () extends StObject {
  /**
    * Create a new Bundle instance.
    *
    * @param {object[]} files - An array of objects that have a name field and contain a
    * getBlobUrl() function.
    */
  def this(files: js.Array[js.Object]) = this()
  
  /**
    * Destroys the bundle and frees up blob URLs.
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns a blob URL for the specified URL.
    *
    * @param {string} url - The original file URL. Make sure you have called decodeURIComponent on
    * the URL first.
    * @returns {string} A blob URL.
    */
  def getBlobUrl(url: String): String = js.native
  
  /**
    * Returns true if the specified URL exists in the loaded bundle.
    *
    * @param {string} url - The original file URL. Make sure you have called decodeURIComponent on
    * the URL first.
    * @returns {boolean} True of false.
    */
  def hasBlobUrl(url: String): Boolean = js.native
}
