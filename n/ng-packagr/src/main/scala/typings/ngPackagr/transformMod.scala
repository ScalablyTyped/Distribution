package typings.ngPackagr

import typings.ngPackagr.buildGraphMod.BuildGraph
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformMod {
  
  @JSImport("ng-packagr/lib/graph/transform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def transformFromPromise(transformFn: PromiseBasedTransform): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("transformFromPromise")(transformFn.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  type PromiseBasedTransform = js.Function1[/* graph */ BuildGraph, (js.Promise[BuildGraph | Unit]) | BuildGraph | Unit]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MonoTypeOperatorFunction<BuildGraph> * / any */ @js.native
  trait Transform extends StObject {
    
    def apply(
      source$: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<BuildGraph> */ Any
    ): Any = js.native
  }
}
