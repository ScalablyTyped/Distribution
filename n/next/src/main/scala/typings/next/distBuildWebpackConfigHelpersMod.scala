package typings.next

import typings.lodash.mod.CurriedFunction2
import typings.next.distCompiledWebpackWebpackMod.webpack.Configuration
import typings.next.distCompiledWebpackWebpackMod.webpack.WebpackPluginInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackConfigHelpersMod {
  
  @JSImport("next/dist/build/webpack/config/helpers", "loader")
  @js.native
  val loader: CurriedFunction2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.RuleSetRule */ Any, 
    Configuration, 
    Configuration
  ] = js.native
  
  @JSImport("next/dist/build/webpack/config/helpers", "plugin")
  @js.native
  val plugin: CurriedFunction2[WebpackPluginInstance, Configuration, Configuration] = js.native
  
  @JSImport("next/dist/build/webpack/config/helpers", "unshiftLoader")
  @js.native
  val unshiftLoader: CurriedFunction2[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.RuleSetRule */ Any, 
    Configuration, 
    Configuration
  ] = js.native
}
