package typings.moize.anon

import typings.moize.mod.TransformKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformArgs[Transformer /* <: TransformKey */] extends StObject {
  
  var transformArgs: Transformer
}
object TransformArgs {
  
  inline def apply[Transformer /* <: TransformKey */](transformArgs: Transformer): TransformArgs[Transformer] = {
    val __obj = js.Dynamic.literal(transformArgs = transformArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformArgs[Transformer]]
  }
  
  extension [Self <: TransformArgs[?], Transformer /* <: TransformKey */](x: Self & TransformArgs[Transformer]) {
    
    inline def setTransformArgs(value: Transformer): Self = StObject.set(x, "transformArgs", value.asInstanceOf[js.Any])
  }
}
