package typings.minappEnv.WXNS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGetFileInfoParam extends IAPIParam[IGetFileInfoSuccessResult] {
  var digestAlgorithm: js.UndefOr[String] = js.native
  var filePath: String = js.native
}

object IGetFileInfoParam {
  @scala.inline
  def apply(filePath: String): IGetFileInfoParam = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetFileInfoParam]
  }
  @scala.inline
  implicit class IGetFileInfoParamOps[Self <: IGetFileInfoParam] (val x: Self) extends AnyVal {
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
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setDigestAlgorithm(value: String): Self = this.set("digestAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigestAlgorithm: Self = this.set("digestAlgorithm", js.undefined)
  }
  
}

