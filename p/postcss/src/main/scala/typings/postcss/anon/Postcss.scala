package typings.postcss.anon

import typings.postcss.libProcessorMod.default
import typings.postcss.mod.TransformCallback
import typings.postcss.mod._AcceptedPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Postcss
  extends StObject
     with _AcceptedPlugin {
  
  var postcss: TransformCallback | default
}
object Postcss {
  
  inline def apply(postcss: TransformCallback | default): Postcss = {
    val __obj = js.Dynamic.literal(postcss = postcss.asInstanceOf[js.Any])
    __obj.asInstanceOf[Postcss]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Postcss] (val x: Self) extends AnyVal {
    
    inline def setPostcss(value: TransformCallback | default): Self = StObject.set(x, "postcss", value.asInstanceOf[js.Any])
    
    inline def setPostcssFunction2(
      value: (/* root */ typings.postcss.libRootMod.default, /* result */ typings.postcss.libResultMod.default) => js.Promise[Unit] | Unit
    ): Self = StObject.set(x, "postcss", js.Any.fromFunction2(value))
  }
}
