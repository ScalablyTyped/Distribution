package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object replMod {
  import typings.node.Error
  import typings.node.vmMod.Context

  type REPLCommandAction = js.ThisFunction1[/* this */ REPLServer, /* text */ java.lang.String, Unit]
  type REPLEval = js.ThisFunction4[
    /* this */ REPLServer, 
    /* evalCmd */ java.lang.String, 
    /* context */ Context, 
    /* file */ java.lang.String, 
    /* cb */ js.Function2[/* err */ Error | Null, /* result */ js.Any, Unit], 
    Unit
  ]
  type REPLWriter = js.ThisFunction1[/* this */ REPLServer, /* obj */ js.Any, java.lang.String]
}
