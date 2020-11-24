package typings.pixiJs.mod.resources

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Collection of installed resource types, class must extend {@link PIXI.resources.Resource}.
  * @example
  * class CustomResource extends PIXI.resources.Resource {
  *   // MUST have source, options constructor signature
  *   // for auto-detected resources to be created.
  *   constructor(source, options) {
  *     super();
  *   }
  *   upload(renderer, baseTexture, glTexture) {
  *     // upload with GL
  *     return true;
  *   }
  *   // used to auto-detect resource
  *   static test(source, extension) {
  *     return extension === 'xyz'|| source instanceof SomeClass;
  *   }
  * }
  * // Install the new resource type
  * PIXI.resources.INSTALLED.push(CustomResource);
  *
  * @name PIXI.resources.INSTALLED
  * @type {Array<*>}
  * @static
  * @readonly
  */
@JSImport("pixi.js", "resources.INSTALLED")
@js.native
object INSTALLED
  extends TopLevel[js.Array[js.Any]]
