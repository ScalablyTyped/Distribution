package typings.optimism

import typings.optimism.libDepMod.Dep_
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEntryMod {
  
  @JSImport("optimism/lib/entry", "Entry")
  @js.native
  open class Entry[TArgs /* <: js.Array[Any] */, TValue] protected () extends StObject {
    def this(fn: js.Function1[/* args */ TArgs, TValue]) = this()
    
    val childValues: Map[AnyEntry, Value[Any]] = js.native
    
    def dependOn(dep: Dep_[Any]): Unit = js.native
    
    /* private */ var deps: Any = js.native
    
    var dirty: Boolean = js.native
    
    var dirtyChildren: Set[AnyEntry] | Null = js.native
    
    def dispose(): Unit = js.native
    
    def fn(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): TValue = js.native
    
    def forget(): Unit = js.native
    
    def forgetDeps(): Unit = js.native
    
    val parents: Set[AnyEntry] = js.native
    
    def peek(): js.UndefOr[TValue] = js.native
    
    def recompute(args: TArgs): TValue = js.native
    
    var recomputing: Boolean = js.native
    
    def setDirty(): Unit = js.native
    
    var subscribe: js.UndefOr[js.Function1[/* args */ TArgs, Unit | js.Function0[Any]]] = js.native
    
    var unsubscribe: js.UndefOr[Unit | js.Function0[Any]] = js.native
    
    val value: Value[TValue] = js.native
  }
  /* static members */
  object Entry {
    
    @JSImport("optimism/lib/entry", "Entry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("optimism/lib/entry", "Entry.count")
    @js.native
    def count: Double = js.native
    inline def count_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
  }
  
  type AnyEntry = Entry[Any, Any]
  
  type Value[T] = (js.Array[Any | T]) | (js.Tuple2[Unit, Any])
}
