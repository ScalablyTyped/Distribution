package typings.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The `PaperScope` class represents the scope associated with a Paper
  *     context. When working with PaperScript, these scopes are automatically
  *     created for us, and through clever scoping the properties and methods of
  *     the active scope seem to become part of the global scope.
  * 
  * When working with normal JavaScript code, `PaperScope` objects need to be
  * manually created and handled.
  * 
  * Paper classes can only be accessed through `PaperScope` objects. Thus in
  * PaperScript they are global, while in JavaScript, they are available on the
  * global {@link paper} object. For JavaScript you can use {@link
  * PaperScope#install(scope) } to install the Paper classes and objects on the
  * global scope. Note that when working with more than one scope, this still
  * works for classes, but not for objects like {@link PaperScope#project}, since
  * they are not updated in the injected scope if scopes are switched.
  * 
  * The global {@link paper} object is simply a reference to the currently active
  * `PaperScope`.
  */
@JSGlobal("paper.PaperScope")
@js.native
/** 
  * Creates a PaperScope object.
  */
open class PaperScope ()
  extends StObject
     with typings.paper.paper.PaperScope
object PaperScope {
  
  @JSGlobal("paper.PaperScope")
  @js.native
  val ^ : js.Any = js.native
  
  /** 
    * Retrieves a PaperScope object with the given scope id.
    */
  /* static member */
  inline def get(id: Any): typings.paper.paper.PaperScope = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[typings.paper.paper.PaperScope]
}
