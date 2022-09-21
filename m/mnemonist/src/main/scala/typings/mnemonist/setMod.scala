package typings.mnemonist

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setMod {
  
  @JSImport("mnemonist/set", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def add[T](a: Set[T], b: Set[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def difference[T](a: Set[T], b: Set[T]): Set[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("difference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Set[T]]
  
  inline def disjunct[T](a: Set[T], b: Set[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disjunct")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def intersect[T](a: Set[T], b: Set[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def intersection[T](set: Set[T]*): Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(set.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Set[T]]
  
  inline def intersectionSize[T](a: Set[T], b: Set[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectionSize")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isSubset[T](a: Set[T], b: Set[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSubset")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSuperset[T](a: Set[T], b: Set[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSuperset")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def jaccard[T](a: Set[T], b: Set[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("jaccard")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def overlap[T](a: Set[T], b: Set[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("overlap")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def subtract[T](a: Set[T], b: Set[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def symmetricDifference[T](a: Set[T], b: Set[T]): Set[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("symmetricDifference")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Set[T]]
  
  inline def union[T](set: Set[T]*): Set[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(set.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Set[T]]
  
  inline def unionSize[T](a: Set[T], b: Set[T]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unionSize")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
