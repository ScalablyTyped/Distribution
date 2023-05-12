package typings.metroConfig.srcConfigTypesMod

import typings.metroConfig.anon.Code
import typings.metroConfig.anon.Path
import typings.metroConfig.anon.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializerConfigT extends StObject {
  
  def createModuleIdFactory(): js.Function1[/* path */ String, Double] = js.native
  
  var customSerializer: (js.Function4[
    /* entryPoint */ String, 
    /* preModules */ js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ Any
    ], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReadOnlyGraph */ /* graph */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SerializerOptions */ /* options */ Any, 
    js.Promise[String | Code]
  ]) | Null = js.native
  
  def experimentalSerializerHook(
    graph: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReadOnlyGraph */ Any,
    delta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DeltaResult */ Any
  ): Any = js.native
  
  def getModulesRunBeforeMainModule(entryFilePath: String): js.Array[String] = js.native
  
  def getPolyfills(options: Platform): js.Array[String] = js.native
  
  def getRunModuleStatement(moduleId: String): String = js.native
  def getRunModuleStatement(moduleId: Double): String = js.native
  
  def isThirdPartyModule(module: Path): Boolean = js.native
  
  var polyfillModuleNames: js.Array[String] = js.native
  
  def processModuleFilter(
    modules: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Module */ Any
  ): Boolean = js.native
}
