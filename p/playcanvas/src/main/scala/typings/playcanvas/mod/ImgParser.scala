package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../texture.js').TextureParser} TextureParser */
/**
  * Parser for browser-supported image formats.
  *
  * @implements {TextureParser}
  * @ignore
  */
@js.native
trait ImgParser extends TextureParser {
  
  def _loadImage(url: Any, originalUrl: Any, crossOrigin: Any, callback: Any): Unit = js.native
  
  def _loadImageBitmap(url: Any, originalUrl: Any, crossOrigin: Any, callback: Any): Unit = js.native
  
  def _loadImageBitmapFromData(data: Any, callback: Any): Unit = js.native
  
  var crossOrigin: String = js.native
  
  var device: Any = js.native
  
  def load(url: Any, callback: Any, asset: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any, device: Any): Texture = js.native
}
