package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
///////////////////////////////UTILS//////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
trait DecomposedDataUri extends js.Object {
  var data: js.Any
  var encoding: String
  var mediaType: String
  var subType: String
}

object DecomposedDataUri {
  @scala.inline
  def apply(data: js.Any, encoding: String, mediaType: String, subType: String): DecomposedDataUri = {
    val __obj = js.Dynamic.literal(data = data, encoding = encoding, mediaType = mediaType, subType = subType)
  
    __obj.asInstanceOf[DecomposedDataUri]
  }
}

