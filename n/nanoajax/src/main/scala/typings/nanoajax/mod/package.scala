package typings.nanoajax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function3[
    /* statusCode */ scala.Double, 
    /* response */ java.lang.String, 
    /* request */ typings.std.XMLHttpRequest, 
    js.Any
  ]
}
