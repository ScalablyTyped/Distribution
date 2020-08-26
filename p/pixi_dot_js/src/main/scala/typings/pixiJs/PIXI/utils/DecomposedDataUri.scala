package typings.pixiJs.PIXI.utils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @memberof PIXI.utils
  * @interface DecomposedDataUri
  */
@js.native
trait DecomposedDataUri extends js.Object {
  /**
    * @memberof PIXI.utils.DecomposedDataUri#
    * @member {string} charset
    */
  var charset: String = js.native
  /**
    * The actual data
    * @memberof PIXI.utils.DecomposedDataUri#
    * @member {string} data
    */
  var data: String = js.native
  /**
    * Data encoding, eg. `base64`
    * @memberof PIXI.utils.DecomposedDataUri#
    * @member {string} encoding
    */
  var encoding: String = js.native
  /**
    * type, eg. `image`
    * @memberof PIXI.utils.DecomposedDataUri#
    * @member {string} mediaType
    */
  var mediaType: String = js.native
  /**
    * Sub type, eg. `png`
    * @memberof PIXI.utils.DecomposedDataUri#
    * @member {string} subType
    */
  var subType: String = js.native
}

object DecomposedDataUri {
  @scala.inline
  def apply(charset: String, data: String, encoding: String, mediaType: String, subType: String): DecomposedDataUri = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], subType = subType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecomposedDataUri]
  }
  @scala.inline
  implicit class DecomposedDataUriOps[Self <: DecomposedDataUri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: String): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubType(value: String): Self = this.set("subType", value.asInstanceOf[js.Any])
  }
  
}

