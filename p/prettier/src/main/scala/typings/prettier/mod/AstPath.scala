package typings.prettier.mod

import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prettier", "AstPath")
@js.native
open class AstPath[T] protected () extends StObject {
  def this(value: T) = this()
  
  // For each of the tree walk functions (call, each, and map) this provides 5
  // strict type signatures, along with a fallback at the end if you end up
  // calling more than 5 properties deep. This helps a lot with typing because
  // for the majority of cases you're calling fewer than 5 properties, so the
  // tree walk functions have a clearer understanding of what you're doing.
  //
  // Note that resolving these types is somewhat complicated, and it wasn't
  // even supported until TypeScript 4.2 (before it would just say that the
  // type instantiation was excessively deep and possibly infinite).
  def call[U](callback: CallCallback[T, U]): U = js.native
  def call[U](
    callback: CallCallback[Any, U],
    prop1: String,
    prop2: String,
    prop3: String,
    prop4: String,
    props: String*
  ): U = js.native
  def call[U](
    callback: CallCallback[Any, U],
    prop1: js.Symbol,
    prop2: js.Symbol,
    prop3: js.Symbol,
    prop4: js.Symbol,
    props: js.Symbol*
  ): U = js.native
  def call[U](
    callback: CallCallback[Any, U],
    prop1: Double,
    prop2: Double,
    prop3: Double,
    prop4: Double,
    props: Double*
  ): U = js.native
  def call[U, P1 /* <: CallProperties[T] */](callback: CallCallback[IndexValue[T, P1], U], prop1: P1): U = js.native
  def call[U, P1 /* <: /* keyof T */ String */, P2 /* <: CallProperties[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any
  ] */](callback: CallCallback[IndexValue[IndexValue[T, P1], P2], U], prop1: P1, prop2: P2): U = js.native
  def call[U, P1 /* <: /* keyof T */ String */, P2 /* <: CallProperties[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any
  ] */, P3 /* <: CallProperties[
    IndexValue[
      /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any, 
      P2
    ]
  ] */](
    callback: CallCallback[IndexValue[IndexValue[IndexValue[T, P1], P2], P3], U],
    prop1: P1,
    prop2: P2,
    prop3: P3
  ): U = js.native
  def call[U, P1 /* <: /* keyof T */ String */, P2 /* <: CallProperties[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any
  ] */, P3 /* <: CallProperties[
    IndexValue[
      /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any, 
      P2
    ]
  ] */, P4 /* <: CallProperties[
    IndexValue[
      IndexValue[
        /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any, 
        P2
      ], 
      P3
    ]
  ] */](
    callback: CallCallback[IndexValue[IndexValue[IndexValue[IndexValue[T, P1], P2], P3], P4], U],
    prop1: P1,
    prop2: P2,
    prop3: P3,
    prop4: P4
  ): U = js.native
  
  def callParent[U](callback: js.Function1[/* path */ this.type, U]): U = js.native
  def callParent[U](callback: js.Function1[/* path */ this.type, U], count: Double): U = js.native
  
  def each(callback: EachCallback[T]): Unit = js.native
  def each(
    callback: EachCallback[js.Array[Any]],
    prop1: PropertyKey,
    prop2: PropertyKey,
    prop3: PropertyKey,
    prop4: PropertyKey,
    props: PropertyKey*
  ): Unit = js.native
  def each[P1 /* <: IterProperties[T] */](callback: EachCallback[IndexValue[T, P1]], prop1: P1): Unit = js.native
  def each[P1 /* <: /* keyof T */ String */, P2 /* <: IterProperties[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any
  ] */](callback: EachCallback[IndexValue[IndexValue[T, P1], P2]], prop1: P1, prop2: P2): Unit = js.native
  def each[P1 /* <: /* keyof T */ String */, P2 /* <: IterProperties[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any
  ] */, P3 /* <: IterProperties[
    IndexValue[
      /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any, 
      P2
    ]
  ] */](
    callback: EachCallback[IndexValue[IndexValue[IndexValue[T, P1], P2], P3]],
    prop1: P1,
    prop2: P2,
    prop3: P3
  ): Unit = js.native
  def each[P1 /* <: /* keyof T */ String */, P2 /* <: IterProperties[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any
  ] */, P3 /* <: IterProperties[
    IndexValue[
      /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any, 
      P2
    ]
  ] */, P4 /* <: IterProperties[
    IndexValue[
      IndexValue[
        /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any, 
        P2
      ], 
      P3
    ]
  ] */](
    callback: EachCallback[IndexValue[IndexValue[IndexValue[IndexValue[T, P1], P2], P3], P4]],
    prop1: P1,
    prop2: P2,
    prop3: P3,
    prop4: P4
  ): Unit = js.native
  
  def getName(): PropertyKey | Null = js.native
  
  def getNode(): T | Null = js.native
  def getNode(count: Double): T | Null = js.native
  
  def getParentNode(): T | Null = js.native
  def getParentNode(count: Double): T | Null = js.native
  
  def getValue(): T = js.native
  
  def map[U](callback: MapCallback[T, U]): js.Array[U] = js.native
  def map[U](
    callback: MapCallback[js.Array[Any], U],
    prop1: PropertyKey,
    prop2: PropertyKey,
    prop3: PropertyKey,
    prop4: PropertyKey,
    props: PropertyKey*
  ): js.Array[U] = js.native
  def map[U, P1 /* <: IterProperties[T] */](callback: MapCallback[IndexValue[T, P1], U], prop1: P1): js.Array[U] = js.native
  def map[U, P1 /* <: /* keyof T */ String */, P2 /* <: IterProperties[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any
  ] */](callback: MapCallback[IndexValue[IndexValue[T, P1], P2], U], prop1: P1, prop2: P2): js.Array[U] = js.native
  def map[U, P1 /* <: /* keyof T */ String */, P2 /* <: IterProperties[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any
  ] */, P3 /* <: IterProperties[
    IndexValue[
      /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any, 
      P2
    ]
  ] */](
    callback: MapCallback[IndexValue[IndexValue[IndexValue[T, P1], P2], P3], U],
    prop1: P1,
    prop2: P2,
    prop3: P3
  ): js.Array[U] = js.native
  def map[U, P1 /* <: /* keyof T */ String */, P2 /* <: IterProperties[
    /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any
  ] */, P3 /* <: IterProperties[
    IndexValue[
      /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any, 
      P2
    ]
  ] */, P4 /* <: IterProperties[
    IndexValue[
      IndexValue[
        /* import warning: importer.ImportType#apply Failed type conversion: T[P1] */ js.Any, 
        P2
      ], 
      P3
    ]
  ] */](
    callback: MapCallback[IndexValue[IndexValue[IndexValue[IndexValue[T, P1], P2], P3], P4], U],
    prop1: P1,
    prop2: P2,
    prop3: P3,
    prop4: P4
  ): js.Array[U] = js.native
  
  def `match`(
    predicates: (js.Function3[/* node */ Any, /* name */ String | Null, /* number */ Double | Null, Boolean])*
  ): Boolean = js.native
  
  var stack: js.Array[T] = js.native
}
