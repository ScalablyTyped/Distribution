package typings.optimism

import typings.optimism.depMod.Dep_
import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("optimism/lib/entry", JSImport.Namespace)
@js.native
object entryMod extends js.Object {
  
  @js.native
  class Entry[TArgs /* <: js.Array[_] */, TValue] protected () extends js.Object {
    def this(fn: js.Function1[/* args */ TArgs, TValue]) = this()
    
    val childValues: Map[AnyEntry, Value[_]] = js.native
    
    def dependOn(dep: Dep_[_]): Unit = js.native
    
    var deps: js.Any = js.native
    
    var dirty: Boolean = js.native
    
    var dirtyChildren: Set[AnyEntry] | Null = js.native
    
    def dispose(): Unit = js.native
    
    def fn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): TValue = js.native
    
    def forgetDeps(): Unit = js.native
    
    val parents: Set[AnyEntry] = js.native
    
    def peek(): js.UndefOr[TValue] = js.native
    
    def recompute(args: TArgs): TValue = js.native
    
    var recomputing: Boolean = js.native
    
    def setDirty(): Unit = js.native
    
    var subscribe: js.UndefOr[js.Function1[/* args */ TArgs, Unit | js.Function0[_]]] = js.native
    
    var unsubscribe: js.UndefOr[Unit | js.Function0[_]] = js.native
    
    val value: Value[TValue] = js.native
  }
  /* static members */
  @js.native
  object Entry extends js.Object {
    
    var count: Double = js.native
  }
  
  type AnyEntry = Entry[js.Any, js.Any]
  
  type Value[T] = (js.Array[js.Any | T]) | (js.Tuple2[Unit, js.Any])
}
