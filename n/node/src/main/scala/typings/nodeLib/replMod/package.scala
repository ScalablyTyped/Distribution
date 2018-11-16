package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object replMod {
  type REPLCommandAction = js.ThisFunction1[/* this */ REPLServer, /* text */ java.lang.String, scala.Unit]
  type REPLEval = js.ThisFunction4[
    /* this */ REPLServer, 
    /* evalCmd */ java.lang.String, 
    /* context */ nodeLib.vmMod.Context, 
    /* file */ java.lang.String, 
    /* cb */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type REPLWriter = js.ThisFunction1[/* this */ REPLServer, /* obj */ js.Any, java.lang.String]
}
