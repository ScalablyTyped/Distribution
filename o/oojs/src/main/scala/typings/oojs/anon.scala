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
    
    extension [Self <: Done[?, ?], T, K /* <: js.Array[ValidKey] */](x: Self & (Done[T, K])) {
      
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
  
  trait Key extends StObject {
    
    var key: String
  }
  object Key {
    
    inline def apply(key: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
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
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
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
    
    extension [Self <: Recur[?, ?], T, D /* <: Double */](x: Self & (Recur[T, D])) {
      
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
    
    extension [Self <: Static](x: Self) {
      
      inline def setStatic(value: Name): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    }
  }
}
