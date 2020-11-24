package typings.mrmlncReaddirEnhanced

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function2[/* err */ typings.node.NodeJS.ErrnoException, /* result */ T, scala.Unit]
  
  type CallbackEntry = typings.mrmlncReaddirEnhanced.mod.Callback[js.Array[typings.mrmlncReaddirEnhanced.mod.Entry]]
  
  type CallbackString = typings.mrmlncReaddirEnhanced.mod.Callback[js.Array[java.lang.String]]
  
  type FilterFunction = js.Function1[/* stat */ typings.mrmlncReaddirEnhanced.mod.Entry, scala.Boolean]
}
