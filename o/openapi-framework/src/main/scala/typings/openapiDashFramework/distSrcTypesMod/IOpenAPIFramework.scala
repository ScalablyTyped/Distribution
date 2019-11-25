package typings.openapiDashFramework.distSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOpenAPIFramework extends js.Object {
  var featureType: String
  var loggingPrefix: String
  var name: String
}

object IOpenAPIFramework {
  @scala.inline
  def apply(featureType: String, loggingPrefix: String, name: String): IOpenAPIFramework = {
    val __obj = js.Dynamic.literal(featureType = featureType.asInstanceOf[js.Any], loggingPrefix = loggingPrefix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOpenAPIFramework]
  }
}

