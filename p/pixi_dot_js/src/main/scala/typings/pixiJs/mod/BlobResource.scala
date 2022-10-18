package typings.pixiJs.mod

import typings.pixiCompressedTextures.mod.IBlobOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("pixi.js", "BlobResource")
@js.native
open class BlobResource protected ()
  extends typings.pixiCompressedTextures.mod.BlobResource {
  /**
    * @param {string} source - the URL of the texture file
    * @param {PIXI.IBlobOptions} options
    * @param {boolean}[options.autoLoad] - whether to fetch the data immediately;
    *  you can fetch it later via {@link BlobResource#load}
    * @param {boolean}[options.width] - the width in pixels.
    * @param {boolean}[options.height] - the height in pixels.
    */
  def this(source: String) = this()
  def this(source: js.typedarray.Float32Array) = this()
  def this(source: js.typedarray.Uint32Array) = this()
  def this(source: js.typedarray.Uint8Array) = this()
  def this(source: String, options: IBlobOptions) = this()
  def this(source: js.typedarray.Float32Array, options: IBlobOptions) = this()
  def this(source: js.typedarray.Uint32Array, options: IBlobOptions) = this()
  def this(source: js.typedarray.Uint8Array, options: IBlobOptions) = this()
}
