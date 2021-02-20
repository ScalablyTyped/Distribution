package typings.nestedProperty

import typings.nestedProperty.anon.Own
import typings.nestedProperty.anon.ValidPath
import typings.std.Error
import typings.std.ErrorConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nested-property", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("nested-property", "ObjectPrototypeMutationError")
  @js.native
  class ObjectPrototypeMutationError () extends Error {
    def this(message: String) = this()
  }
  @JSImport("nested-property", "ObjectPrototypeMutationError")
  @js.native
  def ObjectPrototypeMutationError(): Error = js.native
  @JSImport("nested-property", "ObjectPrototypeMutationError")
  @js.native
  def ObjectPrototypeMutationError(message: String): Error = js.native
  @JSImport("nested-property", "ObjectPrototypeMutationError")
  @js.native
  def ObjectPrototypeMutationError_Fmod: ErrorConstructor = js.native
  
  @scala.inline
  def ObjectPrototypeMutationError_Fmod_=(x: ErrorConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectPrototypeMutationError")(x.asInstanceOf[js.Any])
  
  @JSImport("nested-property", "get")
  @js.native
  def get(`object`: js.Any, property: String): js.Any = js.native
  
  @JSImport("nested-property", "has")
  @js.native
  def has(`object`: js.Any, property: String): Boolean = js.native
  @JSImport("nested-property", "has")
  @js.native
  def has(`object`: js.Any, property: String, options: Own): Boolean = js.native
  
  @JSImport("nested-property", "isInNestedProperty")
  @js.native
  def isInNestedProperty(`object`: js.Any, property: String, objectInPath: js.Any): Boolean = js.native
  @JSImport("nested-property", "isInNestedProperty")
  @js.native
  def isInNestedProperty(`object`: js.Any, property: String, objectInPath: js.Any, options: ValidPath): Boolean = js.native
  
  @JSImport("nested-property", "set")
  @js.native
  def set(`object`: js.Any, property: String, value: js.Any): js.Any = js.native
}
