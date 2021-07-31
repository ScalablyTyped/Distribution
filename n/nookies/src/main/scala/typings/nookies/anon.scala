package typings.nookies

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.next.libUtilsMod.NextApiRequest
import typings.next.libUtilsMod.NextApiResponse
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<next.next.NextPageContext, 'req'> */
  trait PickNextPageContextreq extends StObject {
    
    var req: js.UndefOr[IncomingMessage] = js.undefined
  }
  object PickNextPageContextreq {
    
    @scala.inline
    def apply(): PickNextPageContextreq = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickNextPageContextreq]
    }
    
    @scala.inline
    implicit class PickNextPageContextreqMutableBuilder[Self <: PickNextPageContextreq] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqUndefined: Self = StObject.set(x, "req", js.undefined)
    }
  }
  
  /* Inlined std.Pick<next.next.NextPageContext, 'res'> */
  trait PickNextPageContextres extends StObject {
    
    var res: js.UndefOr[ServerResponse] = js.undefined
  }
  object PickNextPageContextres {
    
    @scala.inline
    def apply(): PickNextPageContextres = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickNextPageContextres]
    }
    
    @scala.inline
    implicit class PickNextPageContextresMutableBuilder[Self <: PickNextPageContextres] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRes(value: ServerResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResUndefined: Self = StObject.set(x, "res", js.undefined)
    }
  }
  
  trait Req extends StObject {
    
    var req: NextApiRequest
  }
  object Req {
    
    @scala.inline
    def apply(req: NextApiRequest): Req = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[Req]
    }
    
    @scala.inline
    implicit class ReqMutableBuilder[Self <: Req] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReq(value: NextApiRequest): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReqRequest extends StObject {
    
    var req: Request_[ParamsDictionary, js.Any, js.Any, Query]
  }
  object ReqRequest {
    
    @scala.inline
    def apply(req: Request_[ParamsDictionary, js.Any, js.Any, Query]): ReqRequest = {
      val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReqRequest]
    }
    
    @scala.inline
    implicit class ReqRequestMutableBuilder[Self <: ReqRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReq(value: Request_[ParamsDictionary, js.Any, js.Any, Query]): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  trait Res extends StObject {
    
    var res: NextApiResponse[js.Any]
  }
  object Res {
    
    @scala.inline
    def apply(res: NextApiResponse[js.Any]): Res = {
      val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[Res]
    }
    
    @scala.inline
    implicit class ResMutableBuilder[Self <: Res] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRes(value: NextApiResponse[js.Any]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResResponse extends StObject {
    
    var res: Response_[js.Any]
  }
  object ResResponse {
    
    @scala.inline
    def apply(res: Response_[js.Any]): ResResponse = {
      val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResResponse]
    }
    
    @scala.inline
    implicit class ResResponseMutableBuilder[Self <: ResResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRes(value: Response_[js.Any]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
}
