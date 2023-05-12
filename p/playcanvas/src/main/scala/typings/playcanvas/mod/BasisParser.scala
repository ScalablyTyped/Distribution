package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../handlers/texture.js').TextureParser} TextureParser */
/**
  * Parser for basis files.
  *
  * @implements {TextureParser}
  * @ignore
  */
@js.native
trait BasisParser extends TextureParser {
  
  var device: Any = js.native
  
  def load(url: Any, callback: Any, asset: Any): Unit = js.native
  
  var maxRetries: Double = js.native
  
  def open(url: Any, data: Any, device: Any): Texture = js.native
  def open(url: Any, data: Any, device: Any, textureOptions: js.Object): Texture = js.native
}
