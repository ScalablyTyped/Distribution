package typings.popoto

import typings.popoto.anon.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runnerMod {
  
  object Runner {
    
    @JSImport("popoto/runner", "Runner")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("popoto/runner", "Runner.DRIVER")
    @js.native
    def DRIVER: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Driver */ Any = js.native
    inline def DRIVER_=(
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Driver */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DRIVER")(x.asInstanceOf[js.Any])
    
    inline def createSession(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createSession")().asInstanceOf[Any]
    
    inline def run(statements: js.Array[Parameters]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(statements.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def toObject(
      results: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Result */ Any
        ]
    ): js.Array[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(results.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Any]]]
  }
}
