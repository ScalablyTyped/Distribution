package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 'Properties' object passed into the WL.download method.
  */
@js.native
trait IDownloadProperties extends js.Object {
  /**
    * The path to the file to download. For information on specifying paths
    * for REST objects, see REST reference.
    * http://msdn.microsoft.com/en-us/library/live/hh243648.aspx
    */
  var path: String = js.native
}

object IDownloadProperties {
  @scala.inline
  def apply(path: String): IDownloadProperties = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDownloadProperties]
  }
  @scala.inline
  implicit class IDownloadPropertiesOps[Self <: IDownloadProperties] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

