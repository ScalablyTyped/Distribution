package typings.nookies

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.next.distSharedLibUtilsMod.NextApiRequest
import typings.next.distSharedLibUtilsMod.NextApiResponse
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<next.next.NextPageContext, 'req'> */
  trait PickNextPageContextreq extends StObject {
    
    var req: js.UndefOr[IncomingMessage] = js.undefined
  }
  object PickNextPageContextreq {
    
    inline def apply(): PickNextPageContextreq = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickNextPageContextreq]
    }
    
    extension [Self <: PickNextPageContextreq](x: Self) {
      
      inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    }
  }
  
  /* Inlined std.Pick<next.next.NextPageContext, 'res'> */
  trait PickNextPageContextres extends StObject {
    
    var res: js.UndefOr[ServerResponse[IncomingMessage]] = js.undefined
  }
  object PickNextPageContextres {
    
    inline def apply(): PickNextPageContextres = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickNextPageContextres]
    }
    
    extension [Self <: PickNextPageContextres](x: Self) {
      
      inline def setRes(value: ServerResponse[IncomingMessage]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      inline def setResUndefined: Self = StObject.set(x, "res", js.undefined)
    }
  }
  
  trait Req extends StObject {
    
    var req: NextApiRequest
  }
  object Req {
    
    inline def apply(req: NextApiRequest): Req = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[Req]
    }
    
    extension [Self <: Req](x: Self) {
      
      inline def setReq(value: NextApiRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReqRequest extends StObject {
    
    var req: Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]
  }
  object ReqRequest {
    
    inline def apply(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): ReqRequest = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReqRequest]
    }
    
    extension [Self <: ReqRequest](x: Self) {
      
      inline def setReq(
        value: Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]
      ): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  trait Res extends StObject {
    
    var res: NextApiResponse[Any]
  }
  object Res {
    
    inline def apply(res: NextApiResponse[Any]): Res = {
      val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[Res]
    }
    
    extension [Self <: Res](x: Self) {
      
      inline def setRes(value: NextApiResponse[Any]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResResponse extends StObject {
    
    var res: Response_[Any, Record[String, Any]]
  }
  object ResResponse {
    
    inline def apply(res: Response_[Any, Record[String, Any]]): ResResponse = {
      val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResResponse]
    }
    
    extension [Self <: ResResponse](x: Self) {
      
      inline def setRes(value: Response_[Any, Record[String, Any]]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
}
