package typings.nutPipe

import typings.awsLambda.handlerMod.Context
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyEventV2
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyStructuredResultV2
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends nut-pipe.nut-pipe.AsyncBasicHandler<infer TContext, infer TResult> ? (context : TContext, next : nut-pipe.nut-pipe.AsyncBasicHandler<TContext, TResult>): std.Promise<TResult> : never
    }}}
    */
  @js.native
  trait AsyncBasicMiddleware[T /* <: AsyncBasicHandler[Any, Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends nut-pipe.nut-pipe.AsyncBasicHandler<infer TContext, infer TResult> ? (context : TContext, services : std.Record<string, any>, next : nut-pipe.nut-pipe.AsyncBasicHandler<TContext, TResult>): std.Promise<TResult | std.Error> : never
    }}}
    */
  @js.native
  trait AsyncBasicMiddlewareWithServices[T /* <: AsyncBasicHandler[Any, Any] */] extends StObject
  
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends nut-pipe.nut-pipe.AsyncLambdaHandler<infer TEvent, infer TContext, infer TResult> ? (event : TEvent, context : TContext, next : T): std.Promise<TResult | std.Error> : never
    }}}
    */
  @js.native
  trait AsyncLambdaMiddleware[T /* <: AsyncLambdaHandler[APIGatewayProxyEventV2, Context, APIGatewayProxyStructuredResultV2] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends nut-pipe.nut-pipe.AsyncLambdaHandler<infer TEvent, infer TContext, infer TResult> ? (event : TEvent, context : TContext, services : std.Record<string, any>, next : T): std.Promise<TResult | std.Error> : never
    }}}
    */
  @js.native
  trait AsyncLambdaMiddlewareWithServices[T /* <: AsyncLambdaHandler[APIGatewayProxyEventV2, Context, APIGatewayProxyStructuredResultV2] */] extends StObject
  
  type AsyncMiddleware[T] = (AsyncBasicMiddleware[AsyncBasicHandler[Any, Any]]) | (AsyncBasicMiddlewareWithServices[AsyncBasicHandler[Any, Any]]) | (AsyncLambdaMiddleware[
    AsyncLambdaHandler[APIGatewayProxyEventV2, Context, APIGatewayProxyStructuredResultV2]
  ]) | (AsyncLambdaMiddlewareWithServices[
    AsyncLambdaHandler[APIGatewayProxyEventV2, Context, APIGatewayProxyStructuredResultV2]
  ]) | T
}
