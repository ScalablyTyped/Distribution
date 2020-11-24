package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object pouchdbCore {
  
  type Fetch = js.Function2[
    /* url */ java.lang.String | typings.std.Request, 
    /* opts */ js.UndefOr[typings.std.RequestInit], 
    js.Promise[typings.std.Response]
  ]
}
