package typings.meteor.anon

import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPromise extends StObject {
  
  /**
    * Get the stored promise library, or resolves passed in
    * @deprecated Setting a custom promise library is deprecated the next major version will use the global Promise constructor only.
    */
  /* static member */
  def get(): PromiseConstructor | Null = js.native
  
  /**
    * Sets the promise library
    * @deprecated Setting a custom promise library is deprecated the next major version will use the global Promise constructor only.
    */
  /* static member */
  def set(): Unit = js.native
  def set(lib: PromiseConstructor): Unit = js.native
  
  /**
    * Validates the passed in promise library
    * @deprecated Setting a custom promise library is deprecated the next major version will use the global Promise constructor only.
    */
  /* static member */
  def validate(lib: Any): /* is std.PromiseConstructor */ Boolean = js.native
}
