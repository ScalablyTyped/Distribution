package typings.nodeSlack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ResponseCallback = js.Function2[/* err */ js.Any, /* query */ typings.nodeSlack.mod.Query, js.Any]
  
  type SendCallback = js.Function2[/* err */ js.Any, /* body */ js.Any, js.Any]
}
