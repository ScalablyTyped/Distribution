package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../texture.js').TextureParser} TextureParser */
/**
  * Legacy texture parser for dds files.
  *
  * @implements {TextureParser}
  * @ignore
  */
@js.native
trait DdsParser extends TextureParser {
  
  def load(url: Any, callback: Any, asset: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any, device: Any): Texture = js.native
}
