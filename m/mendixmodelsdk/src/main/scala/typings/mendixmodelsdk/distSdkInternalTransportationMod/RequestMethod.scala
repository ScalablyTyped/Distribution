package typings.mendixmodelsdk.distSdkInternalTransportationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mendixmodelsdk.mendixmodelsdkStrings.get
  - typings.mendixmodelsdk.mendixmodelsdkStrings.put
  - typings.mendixmodelsdk.mendixmodelsdkStrings.post
  - typings.mendixmodelsdk.mendixmodelsdkStrings.delete
*/
trait RequestMethod extends js.Object

object RequestMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typings.mendixmodelsdk.mendixmodelsdkStrings.delete = this.cast("delete")
  @scala.inline
  def get: typings.mendixmodelsdk.mendixmodelsdkStrings.get = this.cast("get")
  @scala.inline
  def post: typings.mendixmodelsdk.mendixmodelsdkStrings.post = this.cast("post")
  @scala.inline
  def put: typings.mendixmodelsdk.mendixmodelsdkStrings.put = this.cast("put")
}

