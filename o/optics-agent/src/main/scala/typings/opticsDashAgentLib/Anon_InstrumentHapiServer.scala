package typings
package opticsDashAgentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InstrumentHapiServer extends js.Object {
  var Agent: org.scalablytyped.runtime.Instantiable1[
    /* options */ opticsDashAgentLib.opticsDashAgentMod.Options, 
    opticsDashAgentLib.opticsDashAgentMod.Agent
  ]
  var configureAgent: js.Function1[
    /* options */ opticsDashAgentLib.opticsDashAgentMod.Options, 
    opticsDashAgentLib.opticsDashAgentMod.Agent
  ]
  var context: js.Function1[/* req */ expressLib.expressMod.eNs.Request, _]
  var instrumentHapiServer: js.Function1[/* server */ hapiLib.hapiMod.Server, scala.Unit]
  var instrumentSchema: js.Function1[/* schema */ graphqlLib.graphqlMod.GraphQLSchema, scala.Unit]
  var koaMiddleware: js.Function0[
    js.Function2[
      /* context */ koaLib.koaMod.ApplicationNs.Context, 
      /* next */ js.Function0[js.Promise[_]], 
      scala.Unit
    ]
  ]
  var middleware: js.Function0[
    js.Function3[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* res */ expressLib.expressMod.eNs.Response, 
      /* next */ js.UndefOr[_], 
      scala.Unit
    ]
  ]
}

