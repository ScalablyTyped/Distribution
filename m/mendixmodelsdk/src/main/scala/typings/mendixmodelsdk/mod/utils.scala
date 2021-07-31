package typings.mendixmodelsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  @JSImport("mendixmodelsdk", "utils")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assertNotNull[T](value: T, propertyName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNotNull")(value.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def assertNotNull[T](value: T, propertyName: String, listy: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assertNotNull")(value.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], listy.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Combines the given `parts` and returns them as an URL, avoiding duplicate slashes.
    */
  @scala.inline
  def combineUrl(parts: String*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("combineUrl")(parts.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Flattens an array of arrays of items of type `T`, returning a single array
    * that consists of the concatenation of the original arrays.
    */
  @scala.inline
  def flatten[T](array: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  @scala.inline
  def isBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowser")().asInstanceOf[Boolean]
  
  @scala.inline
  def isObject(data: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Generates a random UUID to set the ID of an element or unit to.
    * There is no intrinsic ID collision detection/avoidance mechanism but it's good enough in practice.
    */
  @scala.inline
  def randomUuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUuid")().asInstanceOf[String]
  
  @scala.inline
  def removeFromArray[T](list: js.Array[T], item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeFromArray")(list.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def shallowEquals(first: js.Array[js.Any], second: js.Array[js.Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowEquals")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
