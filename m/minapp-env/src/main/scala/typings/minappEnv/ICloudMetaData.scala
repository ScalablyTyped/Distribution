package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICloudMetaData extends js.Object {
  var session_id: java.lang.String
}

object ICloudMetaData {
  @scala.inline
  def apply(session_id: java.lang.String): ICloudMetaData = {
    val __obj = js.Dynamic.literal(session_id = session_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICloudMetaData]
  }
}

