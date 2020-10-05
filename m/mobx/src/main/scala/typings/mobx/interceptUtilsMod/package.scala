package typings.mobx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interceptUtilsMod {
  type IInterceptor[T] = js.Function1[/* change */ T, T | scala.Null]
}
