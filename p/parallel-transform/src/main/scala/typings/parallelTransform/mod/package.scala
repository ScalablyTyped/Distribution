package typings.parallelTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type OnTransform = js.Function2[
    /* chunk */ js.Any, 
    /* callback */ typings.node.streamMod.TransformCallback, 
    scala.Unit
  ]
}
