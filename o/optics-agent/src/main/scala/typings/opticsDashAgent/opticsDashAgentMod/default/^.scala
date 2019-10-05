package typings.opticsDashAgent.opticsDashAgentMod.default

import org.scalablytyped.runtime.Instantiable1
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.graphql.graphqlMod.GraphQLSchema
import typings.hapi.hapiMod.Server
import typings.koa.koaMod.Context
import typings.opticsDashAgent.opticsDashAgentMod.Agent
import typings.opticsDashAgent.opticsDashAgentMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("optics-agent", JSImport.Default)
@js.native
object ^ extends js.Object {
  var Agent: Instantiable1[/* options */ Options, typings.opticsDashAgent.opticsDashAgentMod.Agent] = js.native
  @JSName("configureAgent")
  var configureAgent_Original: js.Function1[/* options */ Options, Agent] = js.native
  @JSName("context")
  var context_Original: js.Function1[/* req */ Request, _] = js.native
  @JSName("instrumentHapiServer")
  var instrumentHapiServer_Original: js.Function1[/* server */ Server, Unit] = js.native
  @JSName("instrumentSchema")
  var instrumentSchema_Original: js.Function1[/* schema */ GraphQLSchema, Unit] = js.native
  @JSName("koaMiddleware")
  var koaMiddleware_Original: js.Function0[
    js.Function2[/* context */ Context, /* next */ js.Function0[js.Promise[_]], Unit]
  ] = js.native
  @JSName("middleware")
  var middleware_Original: js.Function0[
    js.Function3[/* req */ Request, /* res */ Response, /* next */ js.UndefOr[_], Unit]
  ] = js.native
  def configureAgent(options: Options): Agent = js.native
  def context(req: Request): js.Any = js.native
  def instrumentHapiServer(server: Server): Unit = js.native
  def instrumentSchema(schema: GraphQLSchema): Unit = js.native
  def koaMiddleware(): js.Function2[/* context */ Context, /* next */ js.Function0[js.Promise[_]], Unit] = js.native
  def middleware(): js.Function3[/* req */ Request, /* res */ Response, /* next */ js.UndefOr[js.Any], Unit] = js.native
}

