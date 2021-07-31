package typings.objectFromentries

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns an object created by key-value entries for properties and methods
    * @param entries An iterable object that contains key-value entries for properties and methods.
    */
  @scala.inline
  def apply(entries: Iterable[js.Array[js.Any]]): js.Any = ^.asInstanceOf[js.Dynamic].apply(entries.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("object.fromentries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
