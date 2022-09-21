package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class that implements reference counting for objects.
  *
  * @ignore
  */
@js.native
trait RefCountedObject extends StObject {
  
  /**
    * @type {number}
    * @private
    */
  /* private */ var _refCount: Any = js.native
  
  /**
    * Decrements the reference counter.
    */
  def decRefCount(): Unit = js.native
  
  /**
    * Increments the reference counter.
    */
  def incRefCount(): Unit = js.native
  
  /**
    * The current reference count.
    *
    * @type {number}
    */
  def refCount: Double = js.native
}
