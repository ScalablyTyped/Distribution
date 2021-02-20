package typings.mendixmodelsdk

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  object utils {
    
    @JSImport("mendixmodelsdk/dist/sdk/utils", "utils.assertNotNull")
    @js.native
    def assertNotNull[T](value: T, propertyName: String): Unit = js.native
    @JSImport("mendixmodelsdk/dist/sdk/utils", "utils.assertNotNull")
    @js.native
    def assertNotNull[T](value: T, propertyName: String, listy: Boolean): Unit = js.native
    
    /**
      * Combines the given `parts` and returns them as an URL, avoiding duplicate slashes.
      */
    @JSImport("mendixmodelsdk/dist/sdk/utils", "utils.combineUrl")
    @js.native
    def combineUrl(parts: String*): String = js.native
    
    /**
      * Flattens an array of arrays of items of type `T`, returning a single array
      * that consists of the concatenation of the original arrays.
      */
    @JSImport("mendixmodelsdk/dist/sdk/utils", "utils.flatten")
    @js.native
    def flatten[T](array: js.Array[js.Array[T]]): js.Array[T] = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/utils", "utils.isBrowser")
    @js.native
    def isBrowser(): Boolean = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/utils", "utils.isObject")
    @js.native
    def isObject(data: js.Any): Boolean = js.native
    
    /**
      * Generates a random UUID to set the ID of an element or unit to.
      * There is no intrinsic ID collision detection/avoidance mechanism but it's good enough in practice.
      */
    @JSImport("mendixmodelsdk/dist/sdk/utils", "utils.randomUuid")
    @js.native
    def randomUuid(): String = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/utils", "utils.removeFromArray")
    @js.native
    def removeFromArray[T](list: js.Array[T], item: T): Unit = js.native
    
    @JSImport("mendixmodelsdk/dist/sdk/utils", "utils.shallowEquals")
    @js.native
    def shallowEquals(first: js.Array[_], second: js.Array[_]): Boolean = js.native
    
    type IMap[T] = StringDictionary[T]
  }
}
