package typings.postcssCustomProperties

import typings.postcssCustomProperties.optionsMod.ImportOptions
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCustomPropertiesFromImportsMod {
  
  @JSImport("postcss-custom-properties/dist/lib/get-custom-properties-from-imports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(sources: js.Array[ImportOptions]): js.Promise[
    Map[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify valuesParser.ParsedValue */ Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(sources.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    Map[
      String, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify valuesParser.ParsedValue */ Any
    ]
  ]]
}
