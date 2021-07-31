package typings.optimism

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dirty[TKey] extends StObject {
    
    def dirty(key: TKey): Unit
  }
  object Dirty {
    
    @scala.inline
    def apply[TKey](dirty: TKey => Unit): Dirty[TKey] = {
      val __obj = js.Dynamic.literal(dirty = js.Any.fromFunction1(dirty))
      __obj.asInstanceOf[Dirty[TKey]]
    }
    
    @scala.inline
    implicit class DirtyMutableBuilder[Self <: Dirty[?], TKey] (val x: Self & Dirty[TKey]) extends AnyVal {
      
      @scala.inline
      def setDirty(value: TKey => Unit): Self = StObject.set(x, "dirty", js.Any.fromFunction1(value))
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
    
    @scala.inline
    def apply[TKeyArgs /* <: js.Array[js.Any] */, TResult](dirty: TKeyArgs => Unit, forget: TKeyArgs => Boolean, peek: TKeyArgs => js.UndefOr[TResult]): Forget[TKeyArgs, TResult] = {
      val __obj = js.Dynamic.literal(dirty = js.Any.fromFunction1(dirty), forget = js.Any.fromFunction1(forget), peek = js.Any.fromFunction1(peek))
      __obj.asInstanceOf[Forget[TKeyArgs, TResult]]
    }
    
    @scala.inline
    implicit class ForgetMutableBuilder[Self <: Forget[?, ?], TKeyArgs /* <: js.Array[js.Any] */, TResult] (val x: Self & (Forget[TKeyArgs, TResult])) extends AnyVal {
      
      @scala.inline
      def setDirty(value: TKeyArgs => Unit): Self = StObject.set(x, "dirty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForget(value: TKeyArgs => Boolean): Self = StObject.set(x, "forget", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPeek(value: TKeyArgs => js.UndefOr[TResult]): Self = StObject.set(x, "peek", js.Any.fromFunction1(value))
    }
  }
  
  trait Subscribe[TKey] extends StObject {
    
    var subscribe: /* import warning: importer.ImportType#apply Failed type conversion: optimism.optimism.OptimisticWrapOptions<[TKey], [TKey]>['subscribe'] */ js.Any
  }
  object Subscribe {
    
    @scala.inline
    def apply[TKey](
      subscribe: /* import warning: importer.ImportType#apply Failed type conversion: optimism.optimism.OptimisticWrapOptions<[TKey], [TKey]>['subscribe'] */ js.Any
    ): Subscribe[TKey] = {
      val __obj = js.Dynamic.literal(subscribe = subscribe.asInstanceOf[js.Any])
      __obj.asInstanceOf[Subscribe[TKey]]
    }
    
    @scala.inline
    implicit class SubscribeMutableBuilder[Self <: Subscribe[?], TKey] (val x: Self & Subscribe[TKey]) extends AnyVal {
      
      @scala.inline
      def setSubscribe(
        value: /* import warning: importer.ImportType#apply Failed type conversion: optimism.optimism.OptimisticWrapOptions<[TKey], [TKey]>['subscribe'] */ js.Any
      ): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    }
  }
}
