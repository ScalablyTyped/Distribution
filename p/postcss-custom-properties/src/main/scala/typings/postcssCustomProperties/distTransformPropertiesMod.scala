package typings.postcssCustomProperties

import typings.postcss.mod.Declaration
import typings.postcssCustomProperties.anon.Preserve
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformPropertiesMod {
  
  @JSImport("postcss-custom-properties/dist/transform-properties", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    decl: Declaration,
    customProperties: Map[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify valueParser.ParsedValue */ Any
    ],
    opts: Preserve
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(decl.asInstanceOf[js.Any], customProperties.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
