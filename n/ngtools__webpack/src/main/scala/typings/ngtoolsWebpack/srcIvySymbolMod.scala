package typings.ngtoolsWebpack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcIvySymbolMod {
  
  @JSImport("@ngtools/webpack/src/ivy/symbol", "AngularPluginSymbol")
  @js.native
  val AngularPluginSymbol: js.Symbol = js.native
  
  @JSImport("@ngtools/webpack/src/ivy/symbol", "FileEmitterCollection")
  @js.native
  open class FileEmitterCollection () extends StObject {
    
    def emit(file: String): js.Promise[js.UndefOr[EmitFileResult]] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def register(): FileEmitterRegistration = js.native
  }
  
  @JSImport("@ngtools/webpack/src/ivy/symbol", "FileEmitterRegistration")
  @js.native
  open class FileEmitterRegistration () extends StObject {
    
    def emit(file: String): js.Promise[js.UndefOr[EmitFileResult]] = js.native
    
    /* private */ var `private`: Any = js.native
    
    def update(emitter: FileEmitter): Unit = js.native
  }
  
  trait EmitFileResult extends StObject {
    
    var content: js.UndefOr[String] = js.undefined
    
    var dependencies: js.Array[String]
    
    var hash: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var map: js.UndefOr[String] = js.undefined
  }
  object EmitFileResult {
    
    inline def apply(dependencies: js.Array[String]): EmitFileResult = {
      val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmitFileResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmitFileResult] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setHash(value: js.typedarray.Uint8Array): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
  
  type FileEmitter = js.Function1[/* file */ String, js.Promise[js.UndefOr[EmitFileResult]]]
}
