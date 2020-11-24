package typings.mobxStateTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object unionMod {
  
  type CustomCSProcessor[T] = (typings.std.Exclude[T, typings.mobxStateTree.snapshotProcessorMod.NotCustomized]) | typings.mobxStateTree.snapshotProcessorMod.NotCustomized
  
  type ITypeDispatcher = js.Function1[/* snapshot */ js.Any, typings.mobxStateTree.typeMod.IAnyType]
  
  type ITypeUnion[C, S, T] = typings.mobxStateTree.typeMod.IType[
    typings.mobxStateTree.unionMod.CustomCSProcessor[C], 
    typings.mobxStateTree.unionMod.CustomCSProcessor[S], 
    T
  ]
}
