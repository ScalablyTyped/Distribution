package typings.msportalfxMock

import typings.express.mod.Request_
import typings.msportalfxMock.libSrcMockFxMod.MockFx.Request
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcMockFxTargetsArmHelpersMod {
  
  @JSImport("msportalfx-mock/lib/src/MockFx/targets/ARM/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("msportalfx-mock/lib/src/MockFx/targets/ARM/helpers", "deploymentRegex")
  @js.native
  val deploymentRegex: js.RegExp = js.native
  
  inline def isDeploymentRequest(
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDeploymentRequest")(req.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def updateDeploymentNames(
    requests: js.Array[Request],
    req: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ],
    seenDeployments: js.Array[String]
  ): js.Tuple2[js.Array[Request], js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateDeploymentNames")(requests.asInstanceOf[js.Any], req.asInstanceOf[js.Any], seenDeployments.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Request], js.Array[String]]]
}
