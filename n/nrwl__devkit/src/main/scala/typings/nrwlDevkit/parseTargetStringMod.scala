package typings.nrwlDevkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseTargetStringMod {
  
  @JSImport("@nrwl/devkit/src/executors/parse-target-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseTargetString(targetString: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTargetString")(targetString.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def targetToTargetString(
    hasProjectTargetConfiguration: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Target */ Any
  ): String = ^.asInstanceOf[js.Dynamic].applyDynamic("targetToTargetString")(hasProjectTargetConfiguration.asInstanceOf[js.Any]).asInstanceOf[String]
}
