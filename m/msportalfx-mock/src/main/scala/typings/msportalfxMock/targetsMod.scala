package typings.msportalfxMock

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.msportalfxMock.mockFxMod.FullContext
import typings.msportalfxMock.mockFxMod.MockFx.Request
import typings.msportalfxMock.mockFxMod.MockFx.TargetDefinition
import typings.node.httpMod.IncomingMessage
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object targetsMod {
  
  @JSImport("msportalfx-mock/lib/src/MockFx/targets", "Target")
  @js.native
  open class Target protected () extends StObject {
    def this(definition: TargetDefinition, context: FullContext) = this()
    
    /* private */ var context: Any = js.native
    
    /* private */ var definition: Any = js.native
    
    def getDefinition(): TargetDefinition = js.native
    
    def handleProxyResponse(request: IncomingMessage, mockRequest: Request): js.Promise[Unit] = js.native
    
    def handleRequest(
      proxySend: js.Function2[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* res */ Response_[Any, Record[String, Any]], 
          Unit
        ],
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      next: NextFunction
    ): js.Promise[Unit | (Response_[Any, Record[String, Any]])] = js.native
    
    def loadRequests(): js.Promise[Unit] = js.native
    
    def onRegister(): js.Promise[Unit] = js.native
    
    def removeStage(stage: String): js.Promise[Unit] = js.native
    
    /* private */ var requests: Any = js.native
    
    def snapToStage(stage: String): js.Promise[Unit] = js.native
    
    def storeRequests(): js.Promise[Unit] = js.native
  }
}
