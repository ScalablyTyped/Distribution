package typings.optimism

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dirty[TKey] extends StObject {
    
    def dirty(key: TKey): Unit = js.native
  }
  object Dirty {
    
    @scala.inline
    def apply[TKey](dirty: TKey => Unit): Dirty[TKey] = {
      val __obj = js.Dynamic.literal(dirty = js.Any.fromFunction1(dirty))
      __obj.asInstanceOf[Dirty[TKey]]
    }
    
    @scala.inline
    implicit class DirtyMutableBuilder[Self <: Dirty[_], TKey] (val x: Self with Dirty[TKey]) extends AnyVal {
      
      @scala.inline
      def setDirty(value: TKey => Unit): Self = StObject.set(x, "dirty", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Forget[TKeyArgs /* <: js.Array[_] */, TResult] extends StObject {
    
    def dirty(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TKeyArgs is not an array type */ args: TKeyArgs
    ): Unit = js.native
    
    def forget(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TKeyArgs is not an array type */ args: TKeyArgs
    ): Boolean = js.native
    
    def peek(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TKeyArgs is not an array type */ args: TKeyArgs
    ): js.UndefOr[TResult] = js.native
  }
  object Forget {
    
    @scala.inline
    def apply[TKeyArgs /* <: js.Array[_] */, TResult](dirty: TKeyArgs => Unit, forget: TKeyArgs => Boolean, peek: TKeyArgs => js.UndefOr[TResult]): Forget[TKeyArgs, TResult] = {
      val __obj = js.Dynamic.literal(dirty = js.Any.fromFunction1(dirty), forget = js.Any.fromFunction1(forget), peek = js.Any.fromFunction1(peek))
      __obj.asInstanceOf[Forget[TKeyArgs, TResult]]
    }
    
    @scala.inline
    implicit class ForgetMutableBuilder[Self <: Forget[_, _], TKeyArgs /* <: js.Array[_] */, TResult] (val x: Self with (Forget[TKeyArgs, TResult])) extends AnyVal {
      
      @scala.inline
      def setDirty(value: TKeyArgs => Unit): Self = StObject.set(x, "dirty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForget(value: TKeyArgs => Boolean): Self = StObject.set(x, "forget", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPeek(value: TKeyArgs => js.UndefOr[TResult]): Self = StObject.set(x, "peek", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Subscribe[TKey] extends StObject {
    
    var subscribe: /* import warning: importer.ImportType#apply Failed type conversion: optimism.optimism.OptimisticWrapOptions<[TKey], [TKey]>['subscribe'] */ js.Any = js.native
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
    implicit class SubscribeMutableBuilder[Self <: Subscribe[_], TKey] (val x: Self with Subscribe[TKey]) extends AnyVal {
      
      @scala.inline
      def setSubscribe(
        value: /* import warning: importer.ImportType#apply Failed type conversion: optimism.optimism.OptimisticWrapOptions<[TKey], [TKey]>['subscribe'] */ js.Any
      ): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    }
  }
}
