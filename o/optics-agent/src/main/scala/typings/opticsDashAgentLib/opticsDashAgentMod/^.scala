package typings
package opticsDashAgentLib.opticsDashAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("optics-agent", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def configureAgent(options: Options): Agent = js.native
  def context(req: expressLib.expressMod.Request): js.Any = js.native
  def instrumentHapiServer(server: hapiLib.hapiMod.Server): scala.Unit = js.native
  def instrumentSchema(schema: graphqlLib.graphqlMod.GraphQLSchema): scala.Unit = js.native
  def koaMiddleware(): js.Function2[
    /* context */ koaLib.koaMod.Context, 
    /* next */ js.Function0[js.Promise[_]], 
    scala.Unit
  ] = js.native
  def middleware(): js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    /* next */ js.UndefOr[js.Any], 
    scala.Unit
  ] = js.native
}

