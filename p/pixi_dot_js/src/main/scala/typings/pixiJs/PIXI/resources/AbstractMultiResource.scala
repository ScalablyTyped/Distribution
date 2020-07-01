package typings.pixiJs.PIXI.resources

import typings.pixiJs.PIXI.BaseTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource that can manage several resource (items) inside.
  * All resources need to have the same pixel size.
  * Parent class for CubeResource and ArrayResource
  *
  * @class
  * @extends PIXI.resources.Resource
  * @memberof PIXI.resources
  * @param {object} [options] Options to for Resource constructor
  * @param {number} [options.width] - Width of the resource
  * @param {number} [options.height] - Height of the resource
  */
@js.native
trait AbstractMultiResource extends Resource {
  /**
    * Bound baseTexture, there can only be one
    * @member {PIXI.BaseTexture} PIXI.resources.AbstractMultiResource#baseTexture
    */
  var baseTexture: BaseTexture = js.native
  /**
    * Dirty IDs for each part
    * @member {Array<number>} PIXI.resources.AbstractMultiResource#itemDirtyIds
    * @readonly
    */
  val itemDirtyIds: js.Array[Double] = js.native
  /**
    * Collection of partial baseTextures that correspond to resources
    * @member {Array<PIXI.BaseTexture>} PIXI.resources.AbstractMultiResource#items
    * @readonly
    */
  val items: js.Array[BaseTexture] = js.native
  /**
    * Number of elements in array
    *
    * @member {number} PIXI.resources.AbstractMultiResource#length
    * @readonly
    */
  val length: Double = js.native
  /**
    * Set a resource by ID
    *
    * @param {PIXI.resources.Resource} resource
    * @param {number} index - Zero-based index of resource to set
    * @return {PIXI.resources.ArrayResource} Instance for chaining
    */
  def addResourceAt(resource: Resource, index: Double): ArrayResource = js.native
  /**
    * used from ArrayResource and CubeResource constructors
    * @param {Array<*>} resources - Can be resources, image elements, canvas, etc. ,
    *  length should be same as constructor length
    * @param {object} [options] - detect options for resources
    * @protected
    */
  /* protected */ def initFromArray(resources: js.Array[_]): Unit = js.native
  /* protected */ def initFromArray(resources: js.Array[_], options: js.Any): Unit = js.native
}

