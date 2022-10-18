package typings.next

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLibUtilsMod {
  
  @JSImport("next/dist/server/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNodeOptionsWithoutInspect(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeOptionsWithoutInspect")().asInstanceOf[String]
  
  inline def getPort(
    args: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify arg.Result<arg.Spec> */ Any
  ): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPort")(args.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def printAndExit(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("printAndExit")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def printAndExit(message: String, code: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printAndExit")(message.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
