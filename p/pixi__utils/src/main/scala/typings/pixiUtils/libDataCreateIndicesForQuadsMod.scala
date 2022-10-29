package typings.pixiUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataCreateIndicesForQuadsMod {
  
  @JSImport("@pixi/utils/lib/data/createIndicesForQuads", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createIndicesForQuads(size: Double): js.typedarray.Uint16Array | js.typedarray.Uint32Array = ^.asInstanceOf[js.Dynamic].applyDynamic("createIndicesForQuads")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint16Array | js.typedarray.Uint32Array]
  inline def createIndicesForQuads(size: Double, outBuffer: js.typedarray.Uint16Array): js.typedarray.Uint16Array | js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("createIndicesForQuads")(size.asInstanceOf[js.Any], outBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array | js.typedarray.Uint32Array]
  inline def createIndicesForQuads(size: Double, outBuffer: js.typedarray.Uint32Array): js.typedarray.Uint16Array | js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("createIndicesForQuads")(size.asInstanceOf[js.Any], outBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array | js.typedarray.Uint32Array]
}
