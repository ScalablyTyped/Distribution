package typings
package opticsDashAgentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Agent extends js.Object {
  var Agent: org.scalablytyped.runtime.Instantiable1[
    /* options */ opticsDashAgentLib.opticsDashAgentMod.Options, 
    opticsDashAgentLib.opticsDashAgentMod.Agent
  ] = js.native
  @JSName("configureAgent")
  var configureAgent_Original: js.Function1[
    /* options */ opticsDashAgentLib.opticsDashAgentMod.Options, 
    opticsDashAgentLib.opticsDashAgentMod.Agent
  ] = js.native
  @JSName("context")
  var context_Original: js.Function1[/* req */ expressLib.expressMod.eNs.Request, _] = js.native
  @JSName("instrumentHapiServer")
  var instrumentHapiServer_Original: js.Function1[/* server */ hapiLib.hapiMod.Server, scala.Unit] = js.native
  @JSName("instrumentSchema")
  var instrumentSchema_Original: js.Function1[/* schema */ graphqlLib.graphqlMod.GraphQLSchema, scala.Unit] = js.native
  @JSName("koaMiddleware")
  var koaMiddleware_Original: js.Function0[
    js.Function2[
      /* context */ koaLib.koaMod.ApplicationNs.Context, 
      /* next */ js.Function0[js.Promise[_]], 
      scala.Unit
    ]
  ] = js.native
  @JSName("middleware")
  var middleware_Original: js.Function0[
    js.Function3[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      /* next */ js.UndefOr[_], 
      scala.Unit
    ]
  ] = js.native
  def configureAgent(options: opticsDashAgentLib.opticsDashAgentMod.Options): opticsDashAgentLib.opticsDashAgentMod.Agent = js.native
  def context(req: expressLib.expressMod.eNs.Request): js.Any = js.native
  def instrumentHapiServer(server: hapiLib.hapiMod.Server): scala.Unit = js.native
  def instrumentSchema(schema: graphqlLib.graphqlMod.GraphQLSchema): scala.Unit = js.native
  def koaMiddleware(): js.Function2[
    /* context */ koaLib.koaMod.ApplicationNs.Context, 
    /* next */ js.Function0[js.Promise[_]], 
    scala.Unit
  ] = js.native
  def middleware(): js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    /* next */ js.UndefOr[js.Any], 
    scala.Unit
  ] = js.native
}

