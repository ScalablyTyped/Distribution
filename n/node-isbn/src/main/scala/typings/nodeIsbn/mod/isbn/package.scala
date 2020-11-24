package typings.nodeIsbn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object isbn {
  
  type ResolveCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* book */ typings.nodeIsbn.mod.isbn.Book, 
    scala.Unit
  ]
}
