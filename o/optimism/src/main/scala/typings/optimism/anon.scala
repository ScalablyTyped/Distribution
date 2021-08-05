package typings.optimism

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dirty[TKey] extends StObject {
    
    def dirty(key: TKey): Unit
  }
  object Dirty {
    
    inline def apply[TKey](dirty: TKey => Unit): Dirty[TKey] = {
      val __obj = js.Dynamic.literal(dirty = js.Any.fromFunction1(dirty))
      __obj.asInstanceOf[Dirty[TKey]]
    }
    
    extension [Self <: Dirty[?], TKey](x: Self & Dirty[TKey]) {
      
      inline def setDirty(value: TKey => Unit): Self = StObject.set(x, "dirty", js.Any.fromFunction1(value))
    }
  }
  
  trait Forget[TKeyArgs /* <: js.Array[js.Any] */, TResult] extends StObject {
    
    def dirty(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TKeyArgs is not an array type */ args: TKeyArgs
    ): Unit
    
    def forget(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TKeyArgs is not an array type */ args: TKeyArgs
    ): Boolean
    
    def peek(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TKeyArgs is not an array type */ args: TKeyArgs
    ): js.UndefOr[TResult]
  }
  object Forget {
    
    inline def apply[TKeyArgs /* <: js.Array[js.Any] */, TResult](dirty: TKeyArgs => Unit, forget: TKeyArgs => Boolean, peek: TKeyArgs => js.UndefOr[TResult]): Forget[TKeyArgs, TResult] = {
      val __obj = js.Dynamic.literal(dirty = js.Any.fromFunction1(dirty), forget = js.Any.fromFunction1(forget), peek = js.Any.fromFunction1(peek))
      __obj.asInstanceOf[Forget[TKeyArgs, TResult]]
    }
    
    extension [Self <: Forget[?, ?], TKeyArgs /* <: js.Array[js.Any] */, TResult](x: Self & (Forget[TKeyArgs, TResult])) {
      
      inline def setDirty(value: TKeyArgs => Unit): Self = StObject.set(x, "dirty", js.Any.fromFunction1(value))
      
      inline def setForget(value: TKeyArgs => Boolean): Self = StObject.set(x, "forget", js.Any.fromFunction1(value))
      
      inline def setPeek(value: TKeyArgs => js.UndefOr[TResult]): Self = StObject.set(x, "peek", js.Any.fromFunction1(value))
    }
  }
  
  trait Subscribe[TKey] extends StObject {
    
    var subscribe: /* import warning: importer.ImportType#apply Failed type conversion: optimism.optimism.OptimisticWrapOptions<[TKey], [TKey]>['subscribe'] */ js.Any
  }
  object Subscribe {
    
    inline def apply[TKey](
      subscribe: /* import warning: importer.ImportType#apply Failed type conversion: optimism.optimism.OptimisticWrapOptions<[TKey], [TKey]>['subscribe'] */ js.Any
    ): Subscribe[TKey] = {
      val __obj = js.Dynamic.literal(subscribe = subscribe.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscribe[TKey]]
    }
    
    extension [Self <: Subscribe[?], TKey](x: Self & Subscribe[TKey]) {
      
      inline def setSubscribe(
        value: /* import warning: importer.ImportType#apply Failed type conversion: optimism.optimism.OptimisticWrapOptions<[TKey], [TKey]>['subscribe'] */ js.Any
      ): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    }
  }
}
