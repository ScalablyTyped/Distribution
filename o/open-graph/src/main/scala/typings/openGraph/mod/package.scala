package typings.openGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DataCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* data */ js.UndefOr[typings.openGraph.mod.Data], 
    scala.Unit
  ]
  
  type RequestCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* data */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
