package typings.mergeDeep

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(target: js.Any, sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  /** Recursively merge values in a javascript object. */
  @scala.inline
  def apply[T, U](orig: T, objects: U): T & U = (^.asInstanceOf[js.Dynamic].apply(orig.asInstanceOf[js.Any], objects.asInstanceOf[js.Any])).asInstanceOf[T & U]
  @scala.inline
  def apply[T, U, V](orig: T, objects1: U, objects2: V): T & U & V = (^.asInstanceOf[js.Dynamic].apply(orig.asInstanceOf[js.Any], objects1.asInstanceOf[js.Any], objects2.asInstanceOf[js.Any])).asInstanceOf[T & U & V]
  @scala.inline
  def apply[T, U, V, W](orig: T, objects1: U, objects2: V, objects3: W): T & U & V & W = (^.asInstanceOf[js.Dynamic].apply(orig.asInstanceOf[js.Any], objects1.asInstanceOf[js.Any], objects2.asInstanceOf[js.Any], objects3.asInstanceOf[js.Any])).asInstanceOf[T & U & V & W]
  @scala.inline
  def apply[T, U, V, W, X](orig: T, objects1: U, objects2: V, objects3: W, objects4: X): T & U & V & W & X = (^.asInstanceOf[js.Dynamic].apply(orig.asInstanceOf[js.Any], objects1.asInstanceOf[js.Any], objects2.asInstanceOf[js.Any], objects3.asInstanceOf[js.Any], objects4.asInstanceOf[js.Any])).asInstanceOf[T & U & V & W & X]
  
  @JSImport("merge-deep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
