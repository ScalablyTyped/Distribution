package typings.next

import typings.next.distCompiledWebpackWebpackMod.webpack.Compilation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackUtilsMod {
  
  @JSImport("next/dist/build/webpack/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def traverseModules_0(
    compilation: Compilation,
    callback: js.Function4[
      /* mod */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Chunk */ /* chunk */ Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof compilation.chunkGroups * / any[0] */ /* chunkGroup */ js.Any, 
      /* modId */ String | Double, 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverseModules")(compilation.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
