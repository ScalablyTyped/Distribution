package typings.nodelibFsWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object settingsMod {
  
  type DeepFilterFunction = typings.nodelibFsWalk.settingsMod.FilterFunction[typings.nodelibFsWalk.typesMod.Entry]
  
  type EntryFilterFunction = typings.nodelibFsWalk.settingsMod.FilterFunction[typings.nodelibFsWalk.typesMod.Entry]
  
  type ErrorFilterFunction = typings.nodelibFsWalk.settingsMod.FilterFunction[typings.nodelibFsWalk.typesMod.Errno]
  
  type FilterFunction[T] = js.Function1[/* value */ T, scala.Boolean]
}
