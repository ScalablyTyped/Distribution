package typings.optimism

import typings.optimism.libDepMod.EntryMethodName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dirty[TKey] extends StObject {
    
    def dirty(key: TKey): Unit = js.native
    def dirty(key: TKey, entryMethodName: EntryMethodName): Unit = js.native
  }
  
  trait DirtyKey[TKeyArgs /* <: js.Array[Any] */, TCacheKey, TResult, TArgs /* <: js.Array[Any] */] extends StObject {
    
    def dirty(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TKeyArgs is not an array type */ args: TKeyArgs
    ): Unit
    
    def dirtyKey(key: TCacheKey): Unit
    
    def forget(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TKeyArgs is not an array type */ args: TKeyArgs
    ): Boolean
    
    def forgetKey(key: TCacheKey): Boolean
    
    def getKey(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): TCacheKey
    
    def makeCacheKey(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TKeyArgs is not an array type */ args: TKeyArgs
    ): TCacheKey
    
    def peek(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TKeyArgs is not an array type */ args: TKeyArgs
    ): js.UndefOr[TResult]
    
    def peekKey(key: TCacheKey): js.UndefOr[TResult]
    
    val size: Double
  }
  object DirtyKey {
    
    inline def apply[TKeyArgs /* <: js.Array[Any] */, TCacheKey, TResult, TArgs /* <: js.Array[Any] */](
      dirty: TKeyArgs => Unit,
      dirtyKey: TCacheKey => Unit,
      forget: TKeyArgs => Boolean,
      forgetKey: TCacheKey => Boolean,
      getKey: TArgs => TCacheKey,
      makeCacheKey: TKeyArgs => TCacheKey,
      peek: TKeyArgs => js.UndefOr[TResult],
      peekKey: TCacheKey => js.UndefOr[TResult],
      size: Double
    ): DirtyKey[TKeyArgs, TCacheKey, TResult, TArgs] = {
      val __obj = js.Dynamic.literal(dirty = js.Any.fromFunction1(dirty), dirtyKey = js.Any.fromFunction1(dirtyKey), forget = js.Any.fromFunction1(forget), forgetKey = js.Any.fromFunction1(forgetKey), getKey = js.Any.fromFunction1(getKey), makeCacheKey = js.Any.fromFunction1(makeCacheKey), peek = js.Any.fromFunction1(peek), peekKey = js.Any.fromFunction1(peekKey), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirtyKey[TKeyArgs, TCacheKey, TResult, TArgs]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirtyKey[?, ?, ?, ?], TKeyArgs /* <: js.Array[Any] */, TCacheKey, TResult, TArgs /* <: js.Array[Any] */] (val x: Self & (DirtyKey[TKeyArgs, TCacheKey, TResult, TArgs])) extends AnyVal {
      
      inline def setDirty(value: TKeyArgs => Unit): Self = StObject.set(x, "dirty", js.Any.fromFunction1(value))
      
      inline def setDirtyKey(value: TCacheKey => Unit): Self = StObject.set(x, "dirtyKey", js.Any.fromFunction1(value))
      
      inline def setForget(value: TKeyArgs => Boolean): Self = StObject.set(x, "forget", js.Any.fromFunction1(value))
      
      inline def setForgetKey(value: TCacheKey => Boolean): Self = StObject.set(x, "forgetKey", js.Any.fromFunction1(value))
      
      inline def setGetKey(value: TArgs => TCacheKey): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
      
      inline def setMakeCacheKey(value: TKeyArgs => TCacheKey): Self = StObject.set(x, "makeCacheKey", js.Any.fromFunction1(value))
      
      inline def setPeek(value: TKeyArgs => js.UndefOr[TResult]): Self = StObject.set(x, "peek", js.Any.fromFunction1(value))
      
      inline def setPeekKey(value: TCacheKey => js.UndefOr[TResult]): Self = StObject.set(x, "peekKey", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dispose extends StObject {
    
    var dispose: Boolean
    
    var forget: Boolean
    
    var setDirty: Boolean
  }
  object Dispose {
    
    inline def apply(dispose: Boolean, forget: Boolean, setDirty: Boolean): Dispose = {
      val __obj = js.Dynamic.literal(dispose = dispose.asInstanceOf[js.Any], forget = forget.asInstanceOf[js.Any], setDirty = setDirty.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dispose]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dispose] (val x: Self) extends AnyVal {
      
      inline def setDispose(value: Boolean): Self = StObject.set(x, "dispose", value.asInstanceOf[js.Any])
      
      inline def setForget(value: Boolean): Self = StObject.set(x, "forget", value.asInstanceOf[js.Any])
      
      inline def setSetDirty(value: Boolean): Self = StObject.set(x, "setDirty", value.asInstanceOf[js.Any])
    }
  }
  
  trait Subscribe[TKey] extends StObject {
    
    var subscribe: /* import warning: importer.ImportType#apply Failed type conversion: optimism.optimism.OptimisticWrapOptions<[TKey], [TKey], any>['subscribe'] */ js.Any
  }
  object Subscribe {
    
    inline def apply[TKey](
      subscribe: /* import warning: importer.ImportType#apply Failed type conversion: optimism.optimism.OptimisticWrapOptions<[TKey], [TKey], any>['subscribe'] */ js.Any
    ): Subscribe[TKey] = {
      val __obj = js.Dynamic.literal(subscribe = subscribe.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscribe[TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Subscribe[?], TKey] (val x: Self & Subscribe[TKey]) extends AnyVal {
      
      inline def setSubscribe(
        value: /* import warning: importer.ImportType#apply Failed type conversion: optimism.optimism.OptimisticWrapOptions<[TKey], [TKey], any>['subscribe'] */ js.Any
      ): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    }
  }
}
