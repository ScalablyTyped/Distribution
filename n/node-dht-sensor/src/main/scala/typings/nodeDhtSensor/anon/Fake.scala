package typings.nodeDhtSensor.anon

import typings.nodeDhtSensor.mod.SensorData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fake extends js.Object {
  
  var fake: SensorData = js.native
}
object Fake {
  
  @scala.inline
  def apply(fake: SensorData): Fake = {
    val __obj = js.Dynamic.literal(fake = fake.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fake]
  }
  
  @scala.inline
  implicit class FakeOps[Self <: Fake] (val x: Self) extends AnyVal {
    
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
    def setFake(value: SensorData): Self = this.set("fake", value.asInstanceOf[js.Any])
  }
}
