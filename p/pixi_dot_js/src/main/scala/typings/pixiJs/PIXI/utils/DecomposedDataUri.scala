package typings.pixiJs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @memberof PIXI.utils
  * @interface DecomposedDataUri
  */
trait DecomposedDataUri extends js.Object {
  /**
    * @memberof PIXI.utils.DecomposedDataUri#
    * @member {string} charset
    */
  var charset: String
  /**
    * The actual data
    * @memberof PIXI.utils.DecomposedDataUri#
    * @member {string} data
    */
  var data: String
  /**
    * Data encoding, eg. `base64`
    * @memberof PIXI.utils.DecomposedDataUri#
    * @member {string} encoding
    */
  var encoding: String
  /**
    * type, eg. `image`
    * @memberof PIXI.utils.DecomposedDataUri#
    * @member {string} mediaType
    */
  var mediaType: String
  /**
    * Sub type, eg. `png`
    * @memberof PIXI.utils.DecomposedDataUri#
    * @member {string} subType
    */
  var subType: String
}

object DecomposedDataUri {
  @scala.inline
  def apply(charset: String, data: String, encoding: String, mediaType: String, subType: String): DecomposedDataUri = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DecomposedDataUri]
  }
}

