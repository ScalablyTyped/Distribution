package typings.playcanvas.mod

import typings.playcanvas.anon.Levels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../texture.js').TextureParser} TextureParser */
/**
  * Texture parser for hdr files.
  *
  * @implements {TextureParser}
  * @ignore
  */
@js.native
trait HdrParser extends TextureParser {
  
  def _readPixels(readStream: Any, width: Any, height: Any, flipY: Any): js.typedarray.Uint8Array = js.native
  
  def _readPixelsFlat(readStream: Any, width: Any, height: Any): js.typedarray.Uint8Array = js.native
  
  def load(url: Any, callback: Any, asset: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any, device: Any): Texture = js.native
  
  def parse(data: Any): Levels = js.native
}
