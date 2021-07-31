package typings.nodeSass.mod.types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("node-sass", "types.Error")
@js.native
class ErrorCls protected ()
  extends StObject
     with Error {
  /**
    * An error return value for async functions.
    * For synchronous functions, this can be returned or a standard error object can be thrown.
    */
  def this(message: java.lang.String) = this()
  
  /**
    * This property doesn't exist, but its presence forces the typescript
    * compiler to properly type check this type. Without it, it seems to
    * allow things that aren't types.Error to match it in case statements and
    * assignments.
    */
  /* CompleteClass */
  override val ___SASS_ERROR___ : js.Symbol = js.native
}
