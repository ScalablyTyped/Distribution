package typings.nrwlDevkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExecutorsReadTargetOptionsMod {
  
  @JSImport("@nrwl/devkit/src/executors/read-target-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readTargetOptions[T](
    hasProjectTargetConfiguration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Target */ Any,
    context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ExecutorContext */ Any
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("readTargetOptions")(hasProjectTargetConfiguration.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
}
