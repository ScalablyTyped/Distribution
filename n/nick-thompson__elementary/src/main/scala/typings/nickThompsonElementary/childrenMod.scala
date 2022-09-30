package typings.nickThompsonElementary

import typings.nickThompsonElementary.nickThompsonElementaryInts.`0`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`1`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`2`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`3`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`4`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`5`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`6`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`7`
import typings.nickThompsonElementary.nickThompsonElementaryInts.`8`
import typings.nickThompsonElementary.nodeMod.Node
import typings.nickThompsonElementary.typesMod.CompositeNodeType
import typings.nickThompsonElementary.typesMod.NativeNodeType
import typings.nickThompsonElementary.typesMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object childrenMod {
  
  type Child = Node | Double
  
  type Children = ChildrenArray
  
  type ChildrenArray = SizedChildrenArray[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`]
  
  type ChildrenArraySize[A /* <: js.Array[Any] */] = (/* import warning: importer.ImportType#apply Failed type conversion: A['length'] */ js.Any) & ChildrenArraySizeRange
  
  /* Rewritten from type alias, can be one of: 
    - typings.nickThompsonElementary.nickThompsonElementaryInts.`0`
    - typings.nickThompsonElementary.nickThompsonElementaryInts.`1`
    - typings.nickThompsonElementary.nickThompsonElementaryInts.`2`
    - typings.nickThompsonElementary.nickThompsonElementaryInts.`3`
    - typings.nickThompsonElementary.nickThompsonElementaryInts.`4`
    - typings.nickThompsonElementary.nickThompsonElementaryInts.`5`
    - typings.nickThompsonElementary.nickThompsonElementaryInts.`6`
    - typings.nickThompsonElementary.nickThompsonElementaryInts.`7`
    - typings.nickThompsonElementary.nickThompsonElementaryInts.`8`
  */
  trait ChildrenArraySizeRange extends StObject
  object ChildrenArraySizeRange {
    
    inline def `0`: typings.nickThompsonElementary.nickThompsonElementaryInts.`0` = 0.asInstanceOf[typings.nickThompsonElementary.nickThompsonElementaryInts.`0`]
    
    inline def `1`: typings.nickThompsonElementary.nickThompsonElementaryInts.`1` = 1.asInstanceOf[typings.nickThompsonElementary.nickThompsonElementaryInts.`1`]
    
    inline def `2`: typings.nickThompsonElementary.nickThompsonElementaryInts.`2` = 2.asInstanceOf[typings.nickThompsonElementary.nickThompsonElementaryInts.`2`]
    
    inline def `3`: typings.nickThompsonElementary.nickThompsonElementaryInts.`3` = 3.asInstanceOf[typings.nickThompsonElementary.nickThompsonElementaryInts.`3`]
    
    inline def `4`: typings.nickThompsonElementary.nickThompsonElementaryInts.`4` = 4.asInstanceOf[typings.nickThompsonElementary.nickThompsonElementaryInts.`4`]
    
    inline def `5`: typings.nickThompsonElementary.nickThompsonElementaryInts.`5` = 5.asInstanceOf[typings.nickThompsonElementary.nickThompsonElementaryInts.`5`]
    
    inline def `6`: typings.nickThompsonElementary.nickThompsonElementaryInts.`6` = 6.asInstanceOf[typings.nickThompsonElementary.nickThompsonElementaryInts.`6`]
    
    inline def `7`: typings.nickThompsonElementary.nickThompsonElementaryInts.`7` = 7.asInstanceOf[typings.nickThompsonElementary.nickThompsonElementaryInts.`7`]
    
    inline def `8`: typings.nickThompsonElementary.nickThompsonElementaryInts.`8` = 8.asInstanceOf[typings.nickThompsonElementary.nickThompsonElementaryInts.`8`]
  }
  
  type CompositeNodeChildren[T /* <: CompositeNodeType */] = (SizedChildrenArray[
    ChildrenArraySize[
      Any | (/* import warning: importer.ImportType#apply c repeated non-array type: any */ js.Array[Any])
    ]
  ]) | js.Array[Any]
  
  type NativeNodeChildren[T /* <: NativeNodeType */] = /* import warning: importer.ImportType#apply Failed type conversion: @nick-thompson/elementary.anon.keyininSizedChildrenArray[T] */ js.Any
  
  type NodeChildren[T /* <: NodeType */] = CompositeNodeChildren[T] | NativeNodeChildren[T] | Children
  
  type SizedChildrenArray[Size /* <: ChildrenArraySizeRange */] = (js.Array[Child | scala.Nothing]) | (js.Tuple8[Child, Child, Child, Child, Child, Child, Child, Child]) | (js.Tuple7[Child, Child, Child, Child, Child, Child, Child]) | (js.Tuple6[Child, Child, Child, Child, Child, Child]) | (js.Tuple5[Child, Child, Child, Child, Child]) | (js.Tuple4[Child, Child, Child, Child]) | (js.Tuple3[Child, Child, Child]) | (js.Tuple2[Child, Child])
  
  type VariadicChildrenArray = SizedChildrenArray[`1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`]
}
