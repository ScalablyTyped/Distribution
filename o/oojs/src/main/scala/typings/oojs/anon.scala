package typings.oojs

import typings.oojs.OO.GetProp
import typings.oojs.OO.NodesOf
import typings.oojs.OO.NonPlainObject
import typings.oojs.OO.ValidKey
import typings.oojs.OO.ValueOf
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Done[T, K /* <: js.Array[ValidKey] */] extends StObject {
    
    var done: GetProp[
        T, 
        /* import warning: importer.ImportType#apply Failed type conversion: K[0] */ js.Any
      ]
    
    var recur: /* import warning: importer.ImportType#apply Failed type conversion: K extends [oojs.OO.ConstrainedInference<oojs.OO.ValidKey, infer FirstKey>, ...oojs.OO.ConstrainedInference<std.Array<oojs.OO.ValidKey>, infer RestKeys>] ? oojs.OO.RecursivelyGet<oojs.OO.GetProp<T, FirstKey>, RestKeys> : never */ js.Any
  }
  object Done {
    
    inline def apply[T, K /* <: js.Array[ValidKey] */](
      done: GetProp[
          T, 
          /* import warning: importer.ImportType#apply Failed type conversion: K[0] */ js.Any
        ],
      recur: /* import warning: importer.ImportType#apply Failed type conversion: K extends [oojs.OO.ConstrainedInference<oojs.OO.ValidKey, infer FirstKey>, ...oojs.OO.ConstrainedInference<std.Array<oojs.OO.ValidKey>, infer RestKeys>] ? oojs.OO.RecursivelyGet<oojs.OO.GetProp<T, FirstKey>, RestKeys> : never */ js.Any
    ): Done[T, K] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], recur = recur.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done[T, K]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Done[?, ?], T, K /* <: js.Array[ValidKey] */] (val x: Self & (Done[T, K])) extends AnyVal {
      
      inline def setDone(
        value: GetProp[
              T, 
              /* import warning: importer.ImportType#apply Failed type conversion: K[0] */ js.Any
            ]
      ): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setRecur(
        value: /* import warning: importer.ImportType#apply Failed type conversion: K extends [oojs.OO.ConstrainedInference<oojs.OO.ValidKey, infer FirstKey>, ...oojs.OO.ConstrainedInference<std.Array<oojs.OO.ValidKey>, infer RestKeys>] ? oojs.OO.RecursivelyGet<oojs.OO.GetProp<T, FirstKey>, RestKeys> : never */ js.Any
      ): Self = StObject.set(x, "recur", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Record<keyof oojs.OO.RegistryEventMap, any>> */
  trait PartialRecordkeyofRegistr extends StObject {
    
    var register: js.UndefOr[Any] = js.undefined
    
    var unregister: js.UndefOr[Any] = js.undefined
  }
  object PartialRecordkeyofRegistr {
    
    inline def apply(): PartialRecordkeyofRegistr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRecordkeyofRegistr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRecordkeyofRegistr] (val x: Self) extends AnyVal {
      
      inline def setRegister(value: Any): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
      
      inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
      
      inline def setUnregister(value: Any): Self = StObject.set(x, "unregister", value.asInstanceOf[js.Any])
      
      inline def setUnregisterUndefined: Self = StObject.set(x, "unregister", js.undefined)
    }
  }
  
  trait Recur[T, D /* <: Double */] extends StObject {
    
    var done: T
    
    var recur: T | ValueOf[T] | (NodesOf[
        Exclude[ValueOf[T], NonPlainObject], 
        /* import warning: importer.ImportType#apply Failed type conversion: [-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20][D] */ js.Any
      ])
  }
  object Recur {
    
    inline def apply[T, D /* <: Double */](
      done: T,
      recur: T | ValueOf[T] | (NodesOf[
          Exclude[ValueOf[T], NonPlainObject], 
          /* import warning: importer.ImportType#apply Failed type conversion: [-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20][D] */ js.Any
        ])
    ): Recur[T, D] = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], recur = recur.asInstanceOf[js.Any])
      __obj.asInstanceOf[Recur[T, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Recur[?, ?], T, D /* <: Double */] (val x: Self & (Recur[T, D])) extends AnyVal {
      
      inline def setDone(value: T): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setRecur(
        value: T | ValueOf[T] | (NodesOf[
              Exclude[ValueOf[T], NonPlainObject], 
              /* import warning: importer.ImportType#apply Failed type conversion: [-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20][D] */ js.Any
            ])
      ): Self = StObject.set(x, "recur", value.asInstanceOf[js.Any])
    }
  }
  
  trait Static extends StObject {
    
    var static: Name
  }
  object Static {
    
    inline def apply(static: Name): Static = {
      val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any])
      __obj.asInstanceOf[Static]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Static] (val x: Self) extends AnyVal {
      
      inline def setStatic(value: Name): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    }
  }
}
