package typings.objectFitImages.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkipTest extends js.Object {
  
  var skipTest: js.UndefOr[Boolean] = js.native
  
  var watchMQ: js.UndefOr[Boolean] = js.native
}
object SkipTest {
  
  @scala.inline
  def apply(): SkipTest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipTest]
  }
  
  @scala.inline
  implicit class SkipTestOps[Self <: SkipTest] (val x: Self) extends AnyVal {
    
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
    def setSkipTest(value: Boolean): Self = this.set("skipTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipTest: Self = this.set("skipTest", js.undefined)
    
    @scala.inline
    def setWatchMQ(value: Boolean): Self = this.set("watchMQ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchMQ: Self = this.set("watchMQ", js.undefined)
  }
}
