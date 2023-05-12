package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface is used by {@link AnimEvaluator} to resolve unique animation target path strings
  * into instances of {@link AnimTarget}.
  *
  * @ignore
  */
@JSGlobal("pc.AnimBinder")
@js.native
open class AnimBinder ()
  extends typings.playcanvas.mod.AnimBinder
object AnimBinder {
  
  @JSGlobal("pc.AnimBinder")
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
