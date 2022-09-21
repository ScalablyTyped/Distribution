package typings.pixiCore.mod

import typings.std.WebGLUniformLocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/core", "IGLUniformData")
@js.native
open class IGLUniformData () extends StObject {
  
  var location: WebGLUniformLocation = js.native
  
  var value: Double | Boolean | js.typedarray.Float32Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.Array[Boolean] = js.native
}
