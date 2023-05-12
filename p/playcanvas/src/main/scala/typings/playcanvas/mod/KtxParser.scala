package typings.playcanvas.mod

import typings.playcanvas.anon.Cubemap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Texture parser for ktx files.
  *
  * @implements {TextureParser}
  * @ignore
  */
@js.native
trait KtxParser extends TextureParser {
  
  def load(url: Any, callback: Any, asset: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any, device: Any): Texture = js.native
  def open(url: Any, data: Any, device: Any, textureOptions: js.Object): Texture = js.native
  
  def parse(data: Any): Cubemap = js.native
}
