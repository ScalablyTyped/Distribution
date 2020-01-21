package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object replMod {
  type REPLCommandAction = js.ThisFunction1[/* this */ typings.node.replMod.REPLServer, /* text */ java.lang.String, scala.Unit]
  type REPLEval = js.ThisFunction4[
    /* this */ typings.node.replMod.REPLServer, 
    /* evalCmd */ java.lang.String, 
    /* context */ typings.node.vmMod.Context, 
    /* file */ java.lang.String, 
    /* cb */ js.Function2[/* err */ typings.std.Error | scala.Null, /* result */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type REPLWriter = js.ThisFunction1[/* this */ typings.node.replMod.REPLServer, /* obj */ js.Any, java.lang.String]
}
