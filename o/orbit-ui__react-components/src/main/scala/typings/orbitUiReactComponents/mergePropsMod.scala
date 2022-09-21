package typings.orbitUiReactComponents

import org.scalablytyped.runtime.StringDictionary
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergePropsMod {
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/mergeProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@orbit-ui/react-components/dist/shared/src/mergeProps", "CompositeKeyWeakMap")
  @js.native
  open class CompositeKeyWeakMap[T] () extends StObject {
    
    def get(keys: js.Array[Any]): T = js.native
    
    def has(keys: js.Array[Any]): Boolean = js.native
    
    /* private */ var root: Any = js.native
    
    def set(keys: js.Array[Any], value: T): Unit = js.native
  }
  
  inline def mergeProps[T /* <: js.Array[Props] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): UnionToIntersection[TupleTypes[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeProps")(args.asInstanceOf[js.Any]).asInstanceOf[UnionToIntersection[TupleTypes[T]]]
  
  trait CompositeKeyWeakMapNode[T] extends StObject {
    
    var map: WeakMap[Any, Any]
    
    var value: js.UndefOr[T] = js.undefined
  }
  object CompositeKeyWeakMapNode {
    
    inline def apply[T](map: WeakMap[Any, Any]): CompositeKeyWeakMapNode[T] = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompositeKeyWeakMapNode[T]]
    }
    
    extension [Self <: CompositeKeyWeakMapNode[?], T](x: Self & CompositeKeyWeakMapNode[T]) {
      
      inline def setMap(value: WeakMap[Any, Any]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Props = StringDictionary[Any]
  
  type TupleTypes[T] = Any
  
  type UnionToIntersection[U] = Any
}
