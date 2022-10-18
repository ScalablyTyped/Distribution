package typings.pixiCore.mod

import typings.pixiMath.mod.ISize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@pixi/core", "AbstractMultiResource")
@js.native
open class AbstractMultiResource protected () extends Resource {
  /**
    * @param length
    * @param options - Options to for Resource constructor
    * @param {number} [options.width] - Width of the resource
    * @param {number} [options.height] - Height of the resource
    */
  def this(length: Double) = this()
  def this(length: Double, options: ISize) = this()
  
  /**
    * Promise when loading.
    * @default null
    */
  /* private */ var _load: Any = js.native
  
  /**
    * Set a baseTexture by ID
    * @param baseTexture
    * @param index - Zero-based index of resource to set
    * @returns - Instance for chaining
    */
  def addBaseTextureAt(baseTexture: BaseTexture[Resource, IAutoDetectOptions], index: Double): this.type = js.native
  
  /**
    * Set a resource by ID
    * @param resource
    * @param index - Zero-based index of resource to set
    * @returns - Instance for chaining
    */
  def addResourceAt(resource: Resource, index: Double): this.type = js.native
  
  /** Bound baseTexture, there can only be one. */
  var baseTexture: BaseTexture[Resource, IAutoDetectOptions] = js.native
  
  /**
    * Used from ArrayResource and CubeResource constructors.
    * @param resources - Can be resources, image elements, canvas, etc. ,
    *  length should be same as constructor length
    * @param options - Detect options for resources
    */
  /* protected */ def initFromArray(resources: js.Array[Any]): Unit = js.native
  /* protected */ def initFromArray(resources: js.Array[Any], options: IAutoDetectOptions): Unit = js.native
  
  /**
    * Dirty IDs for each part.
    * @readonly
    */
  var itemDirtyIds: js.Array[Double] = js.native
  
  /**
    * Collection of partial baseTextures that correspond to resources.
    * @readonly
    */
  var items: js.Array[BaseTexture[Resource, IAutoDetectOptions]] = js.native
  
  /** Number of elements in array. */
  val length: Double = js.native
}
