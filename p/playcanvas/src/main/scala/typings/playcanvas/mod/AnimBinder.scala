package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../evaluator/anim-target.js').AnimTarget} AnimTarget */
/**
  * This interface is used by {@link AnimEvaluator} to resolve unique animation target path strings
  * into instances of {@link AnimTarget}.
  *
  * @ignore
  */
trait AnimBinder extends StObject {
  
  /**
    * Resolve the provided target path and return an instance of {@link AnimTarget} which will
    * handle setting the value, or return null if no such target exists.
    *
    * @param {string} path - The animation curve path to resolve.
    * @returns {AnimTarget|null} - Returns the target instance on success and null otherwise.
    */
  def resolve(path: String): AnimTarget | Null
  
  /**
    * Called when the {@link AnimEvaluator} no longer has a curve driving the given key.
    *
    * @param {string} path - The animation curve path which is no longer driven.
    */
  def unresolve(path: String): Unit
  
  /**
    * Called by {@link AnimEvaluator} once a frame after animation updates are done.
    *
    * @param {number} deltaTime - Amount of time that passed in the current update.
    */
  def update(deltaTime: Double): Unit
}
object AnimBinder {
  
  inline def apply(resolve: String => AnimTarget | Null, unresolve: String => Unit, update: Double => Unit): AnimBinder = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve), unresolve = js.Any.fromFunction1(unresolve), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AnimBinder]
  }
  
  extension [Self <: AnimBinder](x: Self) {
    
    inline def setResolve(value: String => AnimTarget | Null): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    
    inline def setUnresolve(value: String => Unit): Self = StObject.set(x, "unresolve", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
