package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object zlibMod {
  type CompressCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* result */ typings.node.Buffer, 
    scala.Unit
  ]
  type InputType = java.lang.String | typings.std.ArrayBuffer | typings.node.NodeJS.ArrayBufferView
}
