package typings.mongodb.mod

import typings.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Global promise store allowing user-provided promises
  * @deprecated Setting a custom promise library is deprecated the next major version will use the global Promise constructor only.
  * @public
  */
@JSImport("mongodb", "Promise")
@js.native
open class Promise ()
  extends StObject
     with Promise2
object Promise {
  
  @JSImport("mongodb", "Promise")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get the stored promise library, or resolves passed in
    * @deprecated Setting a custom promise library is deprecated the next major version will use the global Promise constructor only.
    */
  /* static member */
  inline def get(): PromiseConstructor | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[PromiseConstructor | Null]
  
  /**
    * Sets the promise library
    * @deprecated Setting a custom promise library is deprecated the next major version will use the global Promise constructor only.
    */
  /* static member */
  inline def set(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")().asInstanceOf[Unit]
  inline def set(lib: PromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(lib.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Validates the passed in promise library
    * @deprecated Setting a custom promise library is deprecated the next major version will use the global Promise constructor only.
    */
  /* static member */
  inline def validate(lib: Any): /* is std.PromiseConstructor */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(lib.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseConstructor */ Boolean]
}
