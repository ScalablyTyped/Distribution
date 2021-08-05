package typings.once

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("once", JSImport.Namespace)
  @js.native
  val ^ : Once = js.native
  
  trait FnProps[R] extends StObject {
    
    var called: Boolean
    
    var value: js.UndefOr[R] = js.undefined
  }
  object FnProps {
    
    inline def apply[R](called: Boolean): FnProps[R] = {
      val __obj = js.Dynamic.literal(called = called.asInstanceOf[js.Any])
      __obj.asInstanceOf[FnProps[R]]
    }
    
    extension [Self <: FnProps[?], R](x: Self & FnProps[R]) {
      
      inline def setCalled(value: Boolean): Self = StObject.set(x, "called", value.asInstanceOf[js.Any])
      
      inline def setValue(value: R): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Once
    extends StObject
       with OnceFn {
    
    def proto(): Unit = js.native
    
    def strict[R](f: js.Function0[R]): js.Function0[R] & FnProps[R] = js.native
    def strict[R](f: js.Function1[/* repeated */ js.Any, R]): (js.Function1[/* repeated */ js.Any, R]) & FnProps[R] = js.native
    def strict[T1, T2, R](f: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): (js.Function2[/* t1 */ T1, /* t2 */ T2, R]) & FnProps[R] = js.native
    def strict[T1, T2, T3, R](f: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): (js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]) & FnProps[R] = js.native
    def strict[T1, T2, T3, T4, R](f: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): (js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]) & FnProps[R] = js.native
    def strict[T1, T2, T3, T4, T5, R](f: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]): (js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]) & FnProps[R] = js.native
    def strict[T1, T2, T3, T4, T5, T6, R](f: js.Function6[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, /* t6 */ T6, R]): (js.Function6[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, /* t6 */ T6, R]) & FnProps[R] = js.native
    def strict[T1, T2, T3, T4, T5, T6, T7, R](
      f: js.Function7[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, /* t6 */ T6, /* t7 */ T7, R]
    ): (js.Function7[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, /* t6 */ T6, /* t7 */ T7, R]) & FnProps[R] = js.native
    def strict[T1, T2, T3, T4, T5, T6, T7, T8, R](
      f: js.Function8[
          /* t1 */ T1, 
          /* t2 */ T2, 
          /* t3 */ T3, 
          /* t4 */ T4, 
          /* t5 */ T5, 
          /* t6 */ T6, 
          /* t7 */ T7, 
          /* t8 */ T8, 
          R
        ]
    ): (js.Function8[
        /* t1 */ T1, 
        /* t2 */ T2, 
        /* t3 */ T3, 
        /* t4 */ T4, 
        /* t5 */ T5, 
        /* t6 */ T6, 
        /* t7 */ T7, 
        /* t8 */ T8, 
        R
      ]) & FnProps[R] = js.native
    def strict[T1, T2, T3, T4, T5, T6, T7, T8, T9, R](
      f: js.Function9[
          /* t1 */ T1, 
          /* t2 */ T2, 
          /* t3 */ T3, 
          /* t4 */ T4, 
          /* t5 */ T5, 
          /* t6 */ T6, 
          /* t7 */ T7, 
          /* t8 */ T8, 
          /* t9 */ T9, 
          R
        ]
    ): (js.Function9[
        /* t1 */ T1, 
        /* t2 */ T2, 
        /* t3 */ T3, 
        /* t4 */ T4, 
        /* t5 */ T5, 
        /* t6 */ T6, 
        /* t7 */ T7, 
        /* t8 */ T8, 
        /* t9 */ T9, 
        R
      ]) & FnProps[R] = js.native
    def strict[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R](
      f: js.Function10[
          /* t1 */ T1, 
          /* t2 */ T2, 
          /* t3 */ T3, 
          /* t4 */ T4, 
          /* t5 */ T5, 
          /* t6 */ T6, 
          /* t7 */ T7, 
          /* t8 */ T8, 
          /* t9 */ T9, 
          /* t10 */ T10, 
          R
        ]
    ): (js.Function10[
        /* t1 */ T1, 
        /* t2 */ T2, 
        /* t3 */ T3, 
        /* t4 */ T4, 
        /* t5 */ T5, 
        /* t6 */ T6, 
        /* t7 */ T7, 
        /* t8 */ T8, 
        /* t9 */ T9, 
        /* t10 */ T10, 
        R
      ]) & FnProps[R] = js.native
    @JSName("strict")
    var strict_Original: OnceFn = js.native
    @JSName("strict")
    def strict_T1R[T1, R](f: js.Function1[/* t1 */ T1, R]): (js.Function1[/* t1 */ T1, R]) & FnProps[R] = js.native
  }
  
  @js.native
  trait OnceFn extends StObject {
    
    def apply[R](f: js.Function0[R]): js.Function0[R] & FnProps[R] = js.native
    def apply[R](f: js.Function1[/* repeated */ js.Any, R]): (js.Function1[/* repeated */ js.Any, R]) & FnProps[R] = js.native
    def apply[T1, T2, R](f: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): (js.Function2[/* t1 */ T1, /* t2 */ T2, R]) & FnProps[R] = js.native
    def apply[T1, T2, T3, R](f: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): (js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]) & FnProps[R] = js.native
    def apply[T1, T2, T3, T4, R](f: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): (js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]) & FnProps[R] = js.native
    def apply[T1, T2, T3, T4, T5, R](f: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]): (js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]) & FnProps[R] = js.native
    def apply[T1, T2, T3, T4, T5, T6, R](f: js.Function6[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, /* t6 */ T6, R]): (js.Function6[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, /* t6 */ T6, R]) & FnProps[R] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, R](
      f: js.Function7[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, /* t6 */ T6, /* t7 */ T7, R]
    ): (js.Function7[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, /* t6 */ T6, /* t7 */ T7, R]) & FnProps[R] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, R](
      f: js.Function8[
          /* t1 */ T1, 
          /* t2 */ T2, 
          /* t3 */ T3, 
          /* t4 */ T4, 
          /* t5 */ T5, 
          /* t6 */ T6, 
          /* t7 */ T7, 
          /* t8 */ T8, 
          R
        ]
    ): (js.Function8[
        /* t1 */ T1, 
        /* t2 */ T2, 
        /* t3 */ T3, 
        /* t4 */ T4, 
        /* t5 */ T5, 
        /* t6 */ T6, 
        /* t7 */ T7, 
        /* t8 */ T8, 
        R
      ]) & FnProps[R] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, R](
      f: js.Function9[
          /* t1 */ T1, 
          /* t2 */ T2, 
          /* t3 */ T3, 
          /* t4 */ T4, 
          /* t5 */ T5, 
          /* t6 */ T6, 
          /* t7 */ T7, 
          /* t8 */ T8, 
          /* t9 */ T9, 
          R
        ]
    ): (js.Function9[
        /* t1 */ T1, 
        /* t2 */ T2, 
        /* t3 */ T3, 
        /* t4 */ T4, 
        /* t5 */ T5, 
        /* t6 */ T6, 
        /* t7 */ T7, 
        /* t8 */ T8, 
        /* t9 */ T9, 
        R
      ]) & FnProps[R] = js.native
    def apply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, R](
      f: js.Function10[
          /* t1 */ T1, 
          /* t2 */ T2, 
          /* t3 */ T3, 
          /* t4 */ T4, 
          /* t5 */ T5, 
          /* t6 */ T6, 
          /* t7 */ T7, 
          /* t8 */ T8, 
          /* t9 */ T9, 
          /* t10 */ T10, 
          R
        ]
    ): (js.Function10[
        /* t1 */ T1, 
        /* t2 */ T2, 
        /* t3 */ T3, 
        /* t4 */ T4, 
        /* t5 */ T5, 
        /* t6 */ T6, 
        /* t7 */ T7, 
        /* t8 */ T8, 
        /* t9 */ T9, 
        /* t10 */ T10, 
        R
      ]) & FnProps[R] = js.native
  }
  
  type _To = Once
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Once = ^
  
  object global {
    
    @js.native
    trait Function extends StObject {
      
      // tslint:disable-next-line ban-types
      def once(): Function & FnProps[js.Any] = js.native
    }
  }
}
