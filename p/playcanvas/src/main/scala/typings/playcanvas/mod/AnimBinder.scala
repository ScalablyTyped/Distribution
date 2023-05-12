package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is used by {@link AnimEvaluator} to resolve unique animation target path strings
  * into instances of {@link AnimTarget}.
  *
  * @ignore
  */
@JSImport("playcanvas", "AnimBinder")
@js.native
open class AnimBinder () extends StObject {
  
  /**
    * Resolve the provided target path and return an instance of {@link AnimTarget} which will
    * handle setting the value, or return null if no such target exists.
    *
    * @param {string} path - The animation curve path to resolve.
    * @returns {import('../evaluator/anim-target.js').AnimTarget|null} - Returns the target
    * instance on success and null otherwise.
    */
  def resolve(path: String): AnimTarget | Null = js.native
  
  /**
    * Called when the {@link AnimEvaluator} no longer has a curve driving the given key.
    *
    * @param {string} path - The animation curve path which is no longer driven.
    */
  def unresolve(path: String): Unit = js.native
  
  /**
    * Called by {@link AnimEvaluator} once a frame after animation updates are done.
    *
    * @param {number} deltaTime - Amount of time that passed in the current update.
    */
  def update(deltaTime: Double): Unit = js.native
}
object AnimBinder {
  
  @JSImport("playcanvas", "AnimBinder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a locator array into its string version.
    *
    * @param {string|string[]} entityPath - The entity location in the scene defined as an array or
    * string path.
    * @param {string} component - The component of the entity the property is located under.
    * @param {string|string[]} propertyPath - The property location in the entity defined as an array
    * or string path.
    * @returns {string} The locator encoded as a string.
    * @example
    * // returns 'spotLight/light/color.r'
    * encode(['spotLight'], 'light', ['color', 'r']);
    */
  /* static member */
  inline def encode(entityPath: String, component: String, propertyPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(entityPath.asInstanceOf[js.Any], component.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(entityPath: String, component: String, propertyPath: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(entityPath.asInstanceOf[js.Any], component.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(entityPath: js.Array[String], component: String, propertyPath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(entityPath.asInstanceOf[js.Any], component.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def encode(entityPath: js.Array[String], component: String, propertyPath: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(entityPath.asInstanceOf[js.Any], component.asInstanceOf[js.Any], propertyPath.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def joinPath(pathSegments: Any, character: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("joinPath")(pathSegments.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* static member */
  inline def splitPath(path: Any, character: Any): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitPath")(path.asInstanceOf[js.Any], character.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
