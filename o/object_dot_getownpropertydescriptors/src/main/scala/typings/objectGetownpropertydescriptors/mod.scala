package typings.objectGetownpropertydescriptors

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.objectGetownpropertydescriptors.objectGetownpropertydescriptorsStrings.^
import typings.std.PropertyDescriptor
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns an object containing all own property descriptors of an object
    * @param o Object that contains the properties and methods. This can be an object that you created or an existing Document Object Model (DOM) object.
    */
  @JSImport("object.getownpropertydescriptors", JSImport.Namespace)
  @js.native
  def apply[T](o: T): ^ with TopLevel[T] with StringDictionary[PropertyDescriptor] = js.native
  
  @JSImport("object.getownpropertydescriptors", "getPolyfill")
  @js.native
  def getPolyfill(): ReturnType[
    js.Function0[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof getOwnPropertyDescriptors */ js.Any
    ]
  ] = js.native
  
  @JSImport("object.getownpropertydescriptors", "implementation")
  @js.native
  def implementation[T](o: T): typings.objectGetownpropertydescriptors.objectGetownpropertydescriptorsStrings.apply with TopLevel[T] with StringDictionary[PropertyDescriptor] = js.native
  
  @JSImport("object.getownpropertydescriptors", "shim")
  @js.native
  def shim(): ReturnType[
    js.Function0[
      ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: typeof getPolyfill */ js.Any
      ]
    ]
  ] = js.native
}
