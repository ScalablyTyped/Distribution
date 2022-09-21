package typings.nutPipe

import typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEventV2
import typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyStructuredResultV2
import typings.awsLambda.handlerMod.Context
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nut-pipe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildPipeline(functions: js.Array[AsyncMiddleware[Any]]): AsyncHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPipeline")(functions.asInstanceOf[js.Any]).asInstanceOf[AsyncHandler]
  inline def buildPipeline(functions: js.Array[AsyncMiddleware[Any]], services: Unit, index: Double): AsyncHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPipeline")(functions.asInstanceOf[js.Any], services.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[AsyncHandler]
  inline def buildPipeline(functions: js.Array[AsyncMiddleware[Any]], services: Record[String, Any]): AsyncHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPipeline")(functions.asInstanceOf[js.Any], services.asInstanceOf[js.Any])).asInstanceOf[AsyncHandler]
  inline def buildPipeline(functions: js.Array[AsyncMiddleware[Any]], services: Record[String, Any], index: Double): AsyncHandler = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPipeline")(functions.asInstanceOf[js.Any], services.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[AsyncHandler]
  
  type AsyncBasicHandler[TContext, TResult] = js.Function1[/* context */ TContext, js.Promise[TResult | js.Error]]
  
  type AsyncBasicMiddleware[T /* <: AsyncBasicHandler[Any, Any] */] = js.Function2[/* context */ Any, /* next */ AsyncBasicHandler[Any, Any], js.Promise[Any]]
  
  type AsyncBasicMiddlewareWithServices[T /* <: AsyncBasicHandler[Any, Any] */] = js.Function3[
    /* context */ Any, 
    /* services */ Record[String, Any], 
    /* next */ AsyncBasicHandler[Any, Any], 
    js.Promise[Any | js.Error]
  ]
  
  @js.native
  trait AsyncHandler
    extends AsyncBasicHandler[Any, Any]
       with AsyncLambdaHandler[APIGatewayProxyEventV2, Context, APIGatewayProxyStructuredResultV2] {
    
    /* InferMemberOverrides */
    override def apply(arg1: Any): js.Promise[Any | js.Error] = js.native
    /* InferMemberOverrides */
    override def apply(arg1: APIGatewayProxyEventV2, arg2: Context): js.Promise[APIGatewayProxyStructuredResultV2 | js.Error] = js.native
  }
  
  type AsyncLambdaHandler[TEvent, TContext, TResult] = js.Function2[/* event */ TEvent, /* context */ TContext, js.Promise[TResult | js.Error]]
  
  type AsyncLambdaMiddleware[T /* <: AsyncLambdaHandler[APIGatewayProxyEventV2, Context, APIGatewayProxyStructuredResultV2] */] = js.Function3[/* event */ Any, /* context */ Any, /* next */ T, js.Promise[Any | js.Error]]
  
  type AsyncLambdaMiddlewareWithServices[T /* <: AsyncLambdaHandler[APIGatewayProxyEventV2, Context, APIGatewayProxyStructuredResultV2] */] = js.Function4[
    /* event */ Any, 
    /* context */ Any, 
    /* services */ Record[String, Any], 
    /* next */ T, 
    js.Promise[Any | js.Error]
  ]
  
  type AsyncMiddleware[T] = (AsyncBasicMiddleware[AsyncBasicHandler[Any, Any]]) | (AsyncBasicMiddlewareWithServices[AsyncBasicHandler[Any, Any]]) | (AsyncLambdaMiddleware[
    AsyncLambdaHandler[APIGatewayProxyEventV2, Context, APIGatewayProxyStructuredResultV2]
  ]) | (AsyncLambdaMiddlewareWithServices[
    AsyncLambdaHandler[APIGatewayProxyEventV2, Context, APIGatewayProxyStructuredResultV2]
  ]) | T
}
